/*     */ package net.mcreator.byg;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelSpider;
/*     */ import net.minecraft.client.renderer.entity.Render;
/*     */ import net.minecraft.client.renderer.entity.RenderLiving;
/*     */ import net.minecraft.client.renderer.entity.RenderManager;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityCreature;
/*     */ import net.minecraft.entity.EntityLiving;
/*     */ import net.minecraft.entity.EnumCreatureAttribute;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.entity.ai.EntityAIAttackMelee;
/*     */ import net.minecraft.entity.ai.EntityAIBase;
/*     */ import net.minecraft.entity.ai.EntityAILeapAtTarget;
/*     */ import net.minecraft.entity.ai.EntityAILookIdle;
/*     */ import net.minecraft.entity.ai.EntityAIRestrictSun;
/*     */ import net.minecraft.entity.ai.EntityAIWander;
/*     */ import net.minecraft.entity.monster.EntityMob;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.util.DamageSource;
/*     */ import net.minecraft.util.ResourceLocation;
/*     */ import net.minecraft.util.SoundEvent;
/*     */ import net.minecraft.util.registry.RegistryNamespaced;
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraft.world.biome.Biome;
/*     */ import net.minecraftforge.fml.client.registry.RenderingRegistry;
/*     */ import net.minecraftforge.fml.common.registry.EntityEntry;
/*     */ import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
/*     */ import net.minecraftforge.fml.relauncher.Side;
/*     */ import net.minecraftforge.fml.relauncher.SideOnly;
/*     */ 
/*     */ @Elementsbyg.ModElement.Tag
/*     */ public class MCreatorPetrifiedspider extends Elementsbyg.ModElement {
/*     */   public static final int ENTITYID = 52;
/*     */   
/*     */   public MCreatorPetrifiedspider(Elementsbyg instance) {
/*  41 */     super(instance, 536);
/*     */   }
/*     */   public static final int ENTITYID_RANGED = 53;
/*     */   
/*     */   public void initElements() {
/*  46 */     this.elements.entities.add(() -> EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation("byg", "petrifiedspider"), 52).name("petrifiedspider").tracker(64, 1, true).egg(-13489108, -9238263).build());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private Biome[] allbiomes(RegistryNamespaced<ResourceLocation, Biome> in) {
/*  52 */     Iterator<Biome> itr = in.iterator();
/*  53 */     ArrayList<Biome> ls = new ArrayList<>();
/*  54 */     while (itr.hasNext())
/*  55 */       ls.add(itr.next()); 
/*  56 */     return ls.<Biome>toArray(new Biome[ls.size()]);
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void preInit(FMLPreInitializationEvent event) {
/*  62 */     RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, renderManager -> new RenderLiving(renderManager, (ModelBase)new ModelSpider(), 0.5F)
/*     */         {
/*     */           protected ResourceLocation getEntityTexture(Entity entity) {
/*  65 */             return new ResourceLocation("byg:textures/petrified_spider.png");
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   public static class EntityCustom
/*     */     extends EntityMob {
/*     */     public EntityCustom(World world) {
/*  73 */       super(world);
/*  74 */       setSize(1.4F, 0.9F);
/*  75 */       this.experienceValue = 12;
/*  76 */       this.isImmuneToFire = false;
/*  77 */       setNoAI(false);
/*  78 */       enablePersistence();
/*  79 */       this.tasks.addTask(1, (EntityAIBase)new EntityAIWander((EntityCreature)this, 1.0D));
/*  80 */       this.tasks.addTask(2, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*  81 */       this.targetTasks.addTask(3, (EntityAIBase)new EntityAINearestAttackableTarget((EntityCreature)this, EntityPlayer.class, true, true));
/*  82 */       this.targetTasks.addTask(4, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, true, new Class[0]));
/*  83 */       this.tasks.addTask(5, (EntityAIBase)new EntityAIAttackMelee((EntityCreature)this, 1.2D, false));
/*  84 */       this.tasks.addTask(6, (EntityAIBase)new EntityAILeapAtTarget((EntityLiving)this, 0.8F));
/*  85 */       this.tasks.addTask(7, (EntityAIBase)new EntityAIRestrictSun((EntityCreature)this));
/*     */     }
/*     */ 
/*     */     
/*     */     public EnumCreatureAttribute getCreatureAttribute() {
/*  90 */       return EnumCreatureAttribute.ARTHROPOD;
/*     */     }
/*     */ 
/*     */     
/*     */     protected boolean canDespawn() {
/*  95 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     protected Item getDropItem() {
/* 100 */       return (new ItemStack(Items.STRING, 1)).getItem();
/*     */     }
/*     */ 
/*     */     
/*     */     public SoundEvent getAmbientSound() {
/* 105 */       return (SoundEvent)SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.spider.ambient"));
/*     */     }
/*     */ 
/*     */     
/*     */     public SoundEvent getHurtSound(DamageSource ds) {
/* 110 */       return (SoundEvent)SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.spider.hurt"));
/*     */     }
/*     */ 
/*     */     
/*     */     public SoundEvent getDeathSound() {
/* 115 */       return (SoundEvent)SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.spider.death"));
/*     */     }
/*     */ 
/*     */     
/*     */     protected float getSoundVolume() {
/* 120 */       return 1.0F;
/*     */     }
/*     */ 
/*     */     
/*     */     protected void applyEntityAttributes() {
/* 125 */       super.applyEntityAttributes();
/* 126 */       if (getEntityAttribute(SharedMonsterAttributes.ARMOR) != null)
/* 127 */         getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0.0D); 
/* 128 */       if (getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
/* 129 */         getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.2D); 
/* 130 */       if (getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
/* 131 */         getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(35.0D); 
/* 132 */       if (getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) != null)
/* 133 */         getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(6.0D); 
/*     */     }
/*     */     
/*     */     protected void dropRareDrop(int par1) {
/* 137 */       dropItem((new ItemStack(Items.FERMENTED_SPIDER_EYE, 1)).getItem(), 1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              H:\eclipse-workspace-19\BiomesYouGo1.7.1-deobf.jar!\net\mcreator\byg\MCreatorPetrifiedspider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */