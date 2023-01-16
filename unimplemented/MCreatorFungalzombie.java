/*     */ package net.mcreator.byg;
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
/*     */ import net.minecraft.entity.EntityLiving;
/*     */ import net.minecraft.entity.EnumCreatureAttribute;
/*     */ import net.minecraft.entity.EnumCreatureType;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.entity.ai.EntityAIAttackMelee;
/*     */ import net.minecraft.entity.ai.EntityAIAvoidEntity;
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
/*     */ import net.minecraft.world.World;
/*     */ import net.minecraft.world.biome.Biome;
/*     */ import net.minecraftforge.fml.client.registry.RenderingRegistry;
/*     */ import net.minecraftforge.fml.common.event.FMLInitializationEvent;
/*     */ import net.minecraftforge.fml.common.registry.EntityEntry;
/*     */ import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
/*     */ import net.minecraftforge.fml.relauncher.SideOnly;
/*     */ 
/*     */ @Elementsbyg.ModElement.Tag
/*     */ public class MCreatorFungalzombie extends Elementsbyg.ModElement {
/*     */   public static final int ENTITYID = 48;
/*     */   
/*     */   public MCreatorFungalzombie(Elementsbyg instance) {
/*  43 */     super(instance, 534);
/*     */   }
/*     */   public static final int ENTITYID_RANGED = 49;
/*     */   
/*     */   public void initElements() {
/*  48 */     this.elements.entities.add(() -> EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation("byg", "fungalzombie"), 48).name("fungalzombie").tracker(64, 1, true).egg(-10053376, -8578791).build());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void init(FMLInitializationEvent event) {
/*  54 */     Biome[] spawnBiomes = { (Biome)Biome.REGISTRY.getObject(new ResourceLocation("byg:bfungaljungle")) };
/*  55 */     EntityRegistry.addSpawn(EntityCustom.class, 20, 3, 4, EnumCreatureType.MONSTER, spawnBiomes);
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void preInit(FMLPreInitializationEvent event) {
/*  61 */     RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, renderManager -> {
/*     */           RenderBiped customRender = new RenderBiped(renderManager, (ModelBiped)new ModelZombie(), 0.5F) {
/*     */               protected ResourceLocation getEntityTexture(Entity entity) {
/*  64 */                 return new ResourceLocation("byg:textures/fungal_zombie.png");
/*     */               }
/*     */             };
/*     */           customRender.addLayer((LayerRenderer)new LayerBipedArmor((RenderLivingBase)customRender) {
/*     */                 protected void initArmor() {
/*  69 */                   this.modelLeggings = (ModelBase)new ModelZombie(0.5F, true);
/*  70 */                   this.modelArmor = (ModelBase)new ModelZombie(1.0F, true);
/*     */                 }
/*     */               });
/*     */           return (Render)customRender;
/*     */         });
/*     */   }
/*     */   
/*     */   public static class EntityCustom extends EntityMob {
/*     */     public EntityCustom(World world) {
/*  79 */       super(world);
/*  80 */       setSize(0.6F, 1.95F);
/*  81 */       this.experienceValue = 10;
/*  82 */       this.isImmuneToFire = false;
/*  83 */       setNoAI(false);
/*  84 */       this.tasks.addTask(1, (EntityAIBase)new EntityAIWander((EntityCreature)this, 1.0D));
/*  85 */       this.tasks.addTask(2, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*  86 */       this.targetTasks.addTask(3, (EntityAIBase)new EntityAINearestAttackableTarget((EntityCreature)this, EntityPlayer.class, true, true));
/*  87 */       this.targetTasks.addTask(4, (EntityAIBase)new EntityAIHurtByTarget((EntityCreature)this, true, new Class[0]));
/*  88 */       this.tasks.addTask(5, (EntityAIBase)new EntityAIAttackMelee((EntityCreature)this, 1.0D, true));
/*  89 */       this.tasks.addTask(6, (EntityAIBase)new EntityAIAvoidEntity((EntityCreature)this, EntityParrot.class, 6.0F, 1.0D, 1.2D));
/*  90 */       this.tasks.addTask(7, (EntityAIBase)new EntityAIRestrictSun((EntityCreature)this));
/*  91 */       this.tasks.addTask(8, (EntityAIBase)new EntityAIBreakDoor((EntityLiving)this));
/*     */     }
/*     */ 
/*     */     
/*     */     public EnumCreatureAttribute getCreatureAttribute() {
/*  96 */       return EnumCreatureAttribute.UNDEAD;
/*     */     }
/*     */ 
/*     */     
/*     */     protected Item getDropItem() {
/* 101 */       return (new ItemStack(Items.ROTTEN_FLESH, 1)).getItem();
/*     */     }
/*     */ 
/*     */     
/*     */     public SoundEvent getAmbientSound() {
/* 106 */       return (SoundEvent)SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.husk.ambient"));
/*     */     }
/*     */ 
/*     */     
/*     */     public SoundEvent getHurtSound(DamageSource ds) {
/* 111 */       return (SoundEvent)SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.zombie.hurt"));
/*     */     }
/*     */ 
/*     */     
/*     */     public SoundEvent getDeathSound() {
/* 116 */       return (SoundEvent)SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.husk.death"));
/*     */     }
/*     */ 
/*     */     
/*     */     protected float getSoundVolume() {
/* 121 */       return 1.0F;
/*     */     }
/*     */ 
/*     */     
/*     */     protected void applyEntityAttributes() {
/* 126 */       super.applyEntityAttributes();
/* 127 */       if (getEntityAttribute(SharedMonsterAttributes.ARMOR) != null)
/* 128 */         getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0.0D); 
/* 129 */       if (getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
/* 130 */         getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.2D); 
/* 131 */       if (getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
/* 132 */         getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(35.0D); 
/* 133 */       if (getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) != null)
/* 134 */         getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(6.0D); 
/*     */     }
/*     */     
/*     */     protected void dropRareDrop(int par1) {
/* 138 */       dropItem((new ItemStack(MCreatorGreenglowshroomitem.block, 1)).getItem(), 1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              H:\eclipse-workspace-19\BiomesYouGo1.7.1-deobf.jar!\net\mcreator\byg\MCreatorFungalzombie.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */