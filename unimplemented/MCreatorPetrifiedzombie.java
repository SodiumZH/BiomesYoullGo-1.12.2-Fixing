/*     */ package net.potionstudios.byg;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelBiped;
/*     */ import net.minecraft.client.model.ModelZombie;
/*     */ import net.minecraft.client.renderer.entity.Render;
/*     */ import net.minecraft.client.renderer.entity.RenderBiped;
/*     */ import net.minecraft.client.renderer.entity.RenderLivingBase;
/*     */ import net.minecraft.client.renderer.entity.RenderManager;
/*     */ import net.minecraft.client.renderer.entity.layers.LayerBipedArmor;
/*     */ import net.minecraft.client.renderer.entity.layers.LayerRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityCreature;
/*     */ import net.minecraft.entity.EnumCreatureAttribute;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.entity.ai.EntityAIAttackMelee;
/*     */ import net.minecraft.entity.ai.EntityAIBase;
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
/*     */ 
/*     */ @Elementsbyg.ModElement.Tag
/*     */ public class Petrifiedzombie extends Elementsbyg.ModElement {
/*     */   public static final int ENTITYID = 50;
/*     */   
/*     */   public Petrifiedzombie(Elementsbyg instance) {
/*  41 */     super(instance, 535);
/*     */   }
/*     */   public static final int ENTITYID_RANGED = 51;
/*     */   
/*     */   public void initElements() {
/*  46 */     this.elements.entities.add(() -> EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation("byg", "petrifiedzombie"), 50).name("petrifiedzombie").tracker(64, 1, true).egg(-11910076, -14728164).build());
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
/*  62 */     RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, renderManager -> {
/*     */           RenderBiped customRender = new RenderBiped(renderManager, (ModelBiped)new ModelZombie(), 0.5F) {
/*     */               protected ResourceLocation getEntityTexture(Entity entity) {
/*  65 */                 return new ResourceLocation("byg:textures/petrified_zombie.png");
/*     */               }
/*     */             };
/*     */           customRender.addLayer((LayerRenderer)new LayerBipedArmor((RenderLivingBase)customRender) {
/*     */                 protected void initArmor() {
/*  70 */                   this.modelLeggings = (ModelBase)new ModelZombie(0.5F, true);
/*  71 */                   this.modelArmor = (ModelBase)new ModelZombie(1.0F, true);
/*     */                 }
/*     */               });
/*     */           return (Render)customRender;
/*     */         });
/*     */   }
/*     */   
/*     */   public static class EntityCustom extends EntityMob {
/*     */     public EntityCustom(World world) {
/*  80 */       super(world);
/*  81 */       setSize(0.6F, 1.95F);
/*  82 */       this.experienceValue = 15;
/*  83 */       this.isImmuneToFire = false;
/*  84 */       setNoAI(false);
/*  85 */       enablePersistence();
/*  86 */       this.tasks.addTask(1, (EntityAIBase)new EntityAIWander((EntityCreature)this, 1.0D));
/*  87 */       this.tasks.addTask(2, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*  88 */       this.targetTasks.addTask(3, (EntityAIBase)new EntityAINearestAttackableTarget((EntityCreature)this, EntityPlayer.class, true, true));
/*  89 */       this.targetTasks.addTask(4, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, true, new Class[0]));
/*  90 */       this.tasks.addTask(5, (EntityAIBase)new EntityAIAttackMelee((EntityCreature)this, 1.0D, true));
/*  91 */       this.tasks.addTask(6, (EntityAIBase)new EntityAIRestrictSun((EntityCreature)this));
/*     */     }
/*     */ 
/*     */     
/*     */     public EnumCreatureAttribute getCreatureAttribute() {
/*  96 */       return EnumCreatureAttribute.UNDEAD;
/*     */     }
/*     */ 
/*     */     
/*     */     protected boolean canDespawn() {
/* 101 */       return false;
/*     */     }
/*     */ 
/*     */     
/*     */     protected Item getDropItem() {
/* 106 */       return (new ItemStack(Items.IRON_INGOT, 1)).getItem();
/*     */     }
/*     */ 
/*     */     
/*     */     public SoundEvent getAmbientSound() {
/* 111 */       return (SoundEvent)SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.husk.ambient"));
/*     */     }
/*     */ 
/*     */     
/*     */     public SoundEvent getHurtSound(DamageSource ds) {
/* 116 */       return (SoundEvent)SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.husk.hurt"));
/*     */     }
/*     */ 
/*     */     
/*     */     public SoundEvent getDeathSound() {
/* 121 */       return (SoundEvent)SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.husk.death"));
/*     */     }
/*     */ 
/*     */     
/*     */     protected float getSoundVolume() {
/* 126 */       return 1.0F;
/*     */     }
/*     */ 
/*     */     
/*     */     protected void applyEntityAttributes() {
/* 131 */       super.applyEntityAttributes();
/* 132 */       if (getEntityAttribute(SharedMonsterAttributes.ARMOR) != null)
/* 133 */         getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0.0D); 
/* 134 */       if (getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
/* 135 */         getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D); 
/* 136 */       if (getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
/* 137 */         getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(38.0D); 
/* 138 */       if (getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) != null)
/* 139 */         getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(8.0D); 
/*     */     }
/*     */     
/*     */     protected void dropRareDrop(int par1) {
/* 143 */       dropItem((new ItemStack(Items.SKULL, 1, 2)).getItem(), 1);
/*     */     }
/*     */   }
/*     */ }



