/*     */ package net.potionstudios.byg;
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.client.renderer.entity.Render;
/*     */ import net.minecraft.client.renderer.entity.RenderLiving;
/*     */ import net.minecraft.client.renderer.entity.RenderManager;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityCreature;
/*     */ import net.minecraft.entity.EntityLiving;
/*     */ import net.minecraft.entity.EnumCreatureAttribute;
/*     */ import net.minecraft.entity.EnumCreatureType;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.entity.ai.EntityAIBase;
/*     */ import net.minecraft.entity.ai.EntityAILeapAtTarget;
/*     */ import net.minecraft.entity.ai.EntityAILookIdle;
/*     */ import net.minecraft.entity.ai.EntityAIPanic;
/*     */ import net.minecraft.entity.ai.EntityAIWander;
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
/*     */ import net.minecraftforge.fml.relauncher.Side;
/*     */ import net.minecraftforge.fml.relauncher.SideOnly;
/*     */ 
/*     */ @Elementsbyg.ModElement.Tag
/*     */ public class Kiwibird extends Elementsbyg.ModElement {
/*     */   public static final int ENTITYID = 56;
/*     */   
/*     */   public Kiwibird(Elementsbyg instance) {
/*  38 */     super(instance, 680);
/*     */   }
/*     */   public static final int ENTITYID_RANGED = 57;
/*     */   
/*     */   public void initElements() {
/*  43 */     this.elements.entities.add(() -> EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation("byg", "kiwibird"), 56).name("kiwibird").tracker(64, 1, true).egg(-13624819, -2172876).build());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void init(FMLInitializationEvent event) {
/*  49 */     Biome[] spawnBiomes = { (Biome)Biome.REGISTRY.getObject(new ResourceLocation("byg:bmangrovemarshes")) };
/*  50 */     EntityRegistry.addSpawn(EntityCustom.class, 25, 3, 4, EnumCreatureType.CREATURE, spawnBiomes);
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void preInit(FMLPreInitializationEvent event) {
/*  56 */     RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, renderManager -> new RenderLiving(renderManager, new ModelKiwi(), 0.5F)
/*     */         {
/*     */           protected ResourceLocation getEntityTexture(Entity entity) {
/*  59 */             return new ResourceLocation("byg:textures/kiwi.png");
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   public static class EntityCustom
/*     */     extends EntityCreature {
/*     */     public EntityCustom(World world) {
/*  67 */       super(world);
/*  68 */       setSize(0.4F, 0.7F);
/*  69 */       this.experienceValue = 5;
/*  70 */       this.isImmuneToFire = false;
/*  71 */       setNoAI(false);
/*  72 */       this.tasks.addTask(1, (EntityAIBase)new EntityAIWander(this, 1.0D));
/*  73 */       this.tasks.addTask(2, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/*  74 */       this.tasks.addTask(3, (EntityAIBase)new EntityAISwimming((EntityLiving)this));
/*  75 */       this.tasks.addTask(4, (EntityAIBase)new EntityAILeapAtTarget((EntityLiving)this, 0.8F));
/*  76 */       this.tasks.addTask(5, (EntityAIBase)new EntityAIPanic(this, 1.2D));
/*     */     }
/*     */ 
/*     */     
/*     */     public EnumCreatureAttribute getCreatureAttribute() {
/*  81 */       return EnumCreatureAttribute.UNDEFINED;
/*     */     }
/*     */ 
/*     */     
/*     */     protected Item getDropItem() {
/*  86 */       return (new ItemStack(Items.FEATHER, 1)).getItem();
/*     */     }
/*     */ 
/*     */     
/*     */     public SoundEvent getAmbientSound() {
/*  91 */       return (SoundEvent)SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.bat.hurt"));
/*     */     }
/*     */ 
/*     */     
/*     */     public SoundEvent getHurtSound(DamageSource ds) {
/*  96 */       return (SoundEvent)SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.rabbit.hurt"));
/*     */     }
/*     */ 
/*     */     
/*     */     public SoundEvent getDeathSound() {
/* 101 */       return (SoundEvent)SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.bat.death"));
/*     */     }
/*     */ 
/*     */     
/*     */     protected float getSoundVolume() {
/* 106 */       return 1.0F;
/*     */     }
/*     */ 
/*     */     
/*     */     protected void applyEntityAttributes() {
/* 111 */       super.applyEntityAttributes();
/* 112 */       if (getEntityAttribute(SharedMonsterAttributes.ARMOR) != null)
/* 113 */         getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0.0D); 
/* 114 */       if (getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
/* 115 */         getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3D); 
/* 116 */       if (getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
/* 117 */         getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D); 
/* 118 */       if (getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) != null)
/* 119 */         getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(0.0D); 
/*     */     }
/*     */     
/*     */     protected void dropRareDrop(int par1) {
/* 123 */       dropItem((new ItemStack(Items.BONE, 1)).getItem(), 1);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public static class ModelKiwi
/*     */     extends ModelBase
/*     */   {
/*     */     ModelRenderer Body;
/*     */     
/*     */     ModelRenderer Head;
/*     */     
/*     */     ModelRenderer Beak;
/*     */     
/*     */     ModelRenderer legpart1;
/*     */     ModelRenderer legpart2;
/*     */     ModelRenderer rightleg;
/*     */     ModelRenderer leftleg;
/*     */     ModelRenderer Shape1;
/*     */     ModelRenderer Shape2;
/*     */     ModelRenderer Shape3;
/*     */     ModelRenderer Shape4;
/*     */     ModelRenderer Shape5;
/*     */     ModelRenderer Shape6;
/*     */     
/*     */     public ModelKiwi() {
/* 149 */       this.textureWidth = 64;
/* 150 */       this.textureHeight = 32;
/* 151 */       this.Body = new ModelRenderer(this, 27, 0);
/* 152 */       this.Body.addBox(0.0F, 0.0F, 0.0F, 9, 9, 9);
/* 153 */       this.Body.setRotationPoint(-4.0F, 9.0F, -4.0F);
/* 154 */       this.Body.setTextureSize(64, 32);
/* 155 */       this.Body.mirror = true;
/* 156 */       setRotation(this.Body, -0.2082002F, 0.0F, 0.0F);
/* 157 */       this.Head = new ModelRenderer(this, 29, 19);
/* 158 */       this.Head.addBox(0.0F, 0.0F, 0.0F, 6, 6, 7);
/* 159 */       this.Head.setRotationPoint(-2.5F, 10.0F, -11.0F);
/* 160 */       this.Head.setTextureSize(64, 32);
/* 161 */       this.Head.mirror = true;
/* 162 */       setRotation(this.Head, 0.2974289F, 0.0F, 0.0F);
/* 163 */       this.Beak = new ModelRenderer(this, 10, 22);
/* 164 */       this.Beak.addBox(0.0F, 0.0F, 0.0F, 1, 1, 7);
/* 165 */       this.Beak.setRotationPoint(0.0F, 17.0F, -15.0F);
/* 166 */       this.Beak.setTextureSize(64, 32);
/* 167 */       this.Beak.mirror = true;
/* 168 */       setRotation(this.Beak, 0.4461433F, 0.0F, 0.0F);
/* 169 */       this.legpart1 = new ModelRenderer(this, 11, 0);
/* 170 */       this.legpart1.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2);
/* 171 */       this.legpart1.setRotationPoint(3.0F, 19.0F, 0.0F);
/* 172 */       this.legpart1.setTextureSize(64, 32);
/* 173 */       this.legpart1.mirror = true;
/* 174 */       setRotation(this.legpart1, 0.0F, 0.0F, 0.0F);
/* 175 */       this.legpart2 = new ModelRenderer(this, 12, 0);
/* 176 */       this.legpart2.addBox(0.0F, 0.0F, 0.0F, 2, 1, 2);
/* 177 */       this.legpart2.setRotationPoint(-4.0F, 19.0F, 0.0F);
/* 178 */       this.legpart2.setTextureSize(64, 32);
/* 179 */       this.legpart2.mirror = true;
/* 180 */       setRotation(this.legpart2, 0.0F, 0.0F, 0.0F);
/* 181 */       this.rightleg = new ModelRenderer(this, 0, 9);
/* 182 */       this.rightleg.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1);
/* 183 */       this.rightleg.setRotationPoint(-3.5F, 20.0F, 0.5F);
/* 184 */       this.rightleg.setTextureSize(64, 32);
/* 185 */       this.rightleg.mirror = true;
/* 186 */       setRotation(this.rightleg, 0.0F, 0.0F, 0.0F);
/* 187 */       this.leftleg = new ModelRenderer(this, 0, 9);
/* 188 */       this.leftleg.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1);
/* 189 */       this.leftleg.setRotationPoint(3.5F, 20.0F, 0.5F);
/* 190 */       this.leftleg.setTextureSize(64, 32);
/* 191 */       this.leftleg.mirror = true;
/* 192 */       setRotation(this.leftleg, 0.0F, 0.0F, 0.0F);
/* 193 */       this.Shape1 = new ModelRenderer(this, 0, 0);
/* 194 */       this.Shape1.addBox(0.0F, 0.0F, 0.0F, 0, 1, 1);
/* 195 */       this.Shape1.setRotationPoint(0.0F, 9.0F, 0.0F);
/* 196 */       this.Shape1.setTextureSize(64, 32);
/* 197 */       this.Shape1.mirror = true;
/* 198 */       setRotation(this.Shape1, 0.0F, 0.0F, 0.0F);
/* 199 */       this.Shape2 = new ModelRenderer(this, 0, 0);
/* 200 */       this.Shape2.addBox(0.0F, 0.0F, 0.0F, 0, 1, 1);
/* 201 */       this.Shape2.setRotationPoint(0.0F, 12.0F, 4.0F);
/* 202 */       this.Shape2.setTextureSize(64, 32);
/* 203 */       this.Shape2.mirror = true;
/* 204 */       setRotation(this.Shape2, 0.0F, 0.0F, 0.0F);
/* 205 */       this.Shape3 = new ModelRenderer(this, 0, 0);
/* 206 */       this.Shape3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 0);
/* 207 */       this.Shape3.setRotationPoint(5.0F, 11.0F, -1.0F);
/* 208 */       this.Shape3.setTextureSize(64, 32);
/* 209 */       this.Shape3.mirror = true;
/* 210 */       setRotation(this.Shape3, 0.0F, 0.0F, 0.0F);
/* 211 */       this.Shape4 = new ModelRenderer(this, 0, 0);
/* 212 */       this.Shape4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 0);
/* 213 */       this.Shape4.setRotationPoint(-5.0F, 11.0F, -1.0F);
/* 214 */       this.Shape4.setTextureSize(64, 32);
/* 215 */       this.Shape4.mirror = true;
/* 216 */       setRotation(this.Shape4, 0.0F, 0.0F, 0.0F);
/* 217 */       this.Shape5 = new ModelRenderer(this, 0, 0);
/* 218 */       this.Shape5.addBox(0.0F, 0.0F, 0.0F, 1, 1, 0);
/* 219 */       this.Shape5.setRotationPoint(5.0F, 17.0F, 3.0F);
/* 220 */       this.Shape5.setTextureSize(64, 32);
/* 221 */       this.Shape5.mirror = true;
/* 222 */       setRotation(this.Shape5, 0.0F, 0.0F, 0.0F);
/* 223 */       this.Shape6 = new ModelRenderer(this, 0, 0);
/* 224 */       this.Shape6.addBox(0.0F, 0.0F, 0.0F, 1, 1, 0);
/* 225 */       this.Shape6.setRotationPoint(0.0F, 19.0F, 0.0F);
/* 226 */       this.Shape6.setTextureSize(64, 32);
/* 227 */       this.Shape6.mirror = true;
/* 228 */       setRotation(this.Shape6, 0.0F, 0.0F, 0.0F);
/*     */     }
/*     */     
/*     */     public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 232 */       super.render(entity, f, f1, f2, f3, f4, f5);
/* 233 */       setRotationAngles(f, f1, f2, f3, f4, f5, entity);
/* 234 */       this.Body.render(f5);
/* 235 */       this.Head.render(f5);
/* 236 */       this.Beak.render(f5);
/* 237 */       this.legpart1.render(f5);
/* 238 */       this.legpart2.render(f5);
/* 239 */       this.rightleg.render(f5);
/* 240 */       this.leftleg.render(f5);
/* 241 */       this.Shape1.render(f5);
/* 242 */       this.Shape2.render(f5);
/* 243 */       this.Shape3.render(f5);
/* 244 */       this.Shape4.render(f5);
/* 245 */       this.Shape5.render(f5);
/* 246 */       this.Shape6.render(f5);
/*     */     }
/*     */     
/*     */     private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 250 */       model.rotateAngleX = x;
/* 251 */       model.rotateAngleY = y;
/* 252 */       model.rotateAngleZ = z;
/*     */     }
/*     */     
/*     */     public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
/* 256 */       super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
/*     */     }
/*     */   }
/*     */ }



