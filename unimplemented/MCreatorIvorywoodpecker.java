/*     */ package net.potionstudios.byg;
/*     */ import java.util.Random;
/*     */ import net.minecraft.block.state.IBlockState;
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
/*     */ import net.minecraft.entity.MoverType;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.entity.ai.EntityAIBase;
/*     */ import net.minecraft.entity.ai.EntityAILeapAtTarget;
/*     */ import net.minecraft.entity.ai.EntityAILookIdle;
/*     */ import net.minecraft.entity.ai.EntityAIPanic;
/*     */ import net.minecraft.entity.ai.EntityAIWander;
/*     */ import net.minecraft.entity.ai.EntityMoveHelper;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.util.DamageSource;
/*     */ import net.minecraft.util.ResourceLocation;
/*     */ import net.minecraft.util.SoundEvent;
/*     */ import net.minecraft.util.math.AxisAlignedBB;
/*     */ import net.minecraft.util.math.BlockPos;
/*     */ import net.minecraft.util.math.MathHelper;
/*     */ import net.minecraft.world.IBlockAccess;
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
/*     */ public class Ivorywoodpecker extends Elementsbyg.ModElement {
/*     */   public static final int ENTITYID = 60;
/*     */   
/*     */   public Ivorywoodpecker(Elementsbyg instance) {
/*  46 */     super(instance, 718);
/*     */   }
/*     */   public static final int ENTITYID_RANGED = 61;
/*     */   
/*     */   public void initElements() {
/*  51 */     this.elements.entities.add(() -> EntityEntryBuilder.create().entity(EntityCustom.class).id(new ResourceLocation("byg", "ivorywoodpecker"), 60).name("ivorywoodpecker").tracker(64, 1, true).egg(-16448251, -8126464).build());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void init(FMLInitializationEvent event) {
/*  58 */     Biome[] spawnBiomes = { (Biome)Biome.REGISTRY.getObject(new ResourceLocation("byg:bbayou")) };
/*  59 */     EntityRegistry.addSpawn(EntityCustom.class, 25, 3, 5, EnumCreatureType.CREATURE, spawnBiomes);
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void preInit(FMLPreInitializationEvent event) {
/*  65 */     RenderingRegistry.registerEntityRenderingHandler(EntityCustom.class, renderManager -> new RenderLiving(renderManager, new ModelIvoryBilledWoodpecker(), 0.4F)
/*     */         {
/*     */           protected ResourceLocation getEntityTexture(Entity entity) {
/*  68 */             return new ResourceLocation("byg:textures/ivorybilledwoodpecker.png");
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   public static class EntityCustom
/*     */     extends EntityCreature {
/*     */     public EntityCustom(World world) {
/*  76 */       super(world);
/*  77 */       setSize(0.4F, 0.7F);
/*  78 */       this.experienceValue = 5;
/*  79 */       this.isImmuneToFire = false;
/*  80 */       setNoAI(false);
/*  81 */       this.tasks.addTask(1, new EntityAIBase()
/*     */           {
/*     */ 
/*     */ 
/*     */             
/*     */             public boolean shouldExecute()
/*     */             {
/*  88 */               EntityMoveHelper entitymovehelper = Ivorywoodpecker.EntityCustom.this.getMoveHelper();
/*  89 */               if (!entitymovehelper.isUpdating()) {
/*  90 */                 return true;
/*     */               }
/*  92 */               double dx = entitymovehelper.getX() - Ivorywoodpecker.EntityCustom.this.posX;
/*  93 */               double dy = entitymovehelper.getY() - Ivorywoodpecker.EntityCustom.this.posY;
/*  94 */               double dz = entitymovehelper.getZ() - Ivorywoodpecker.EntityCustom.this.posZ;
/*  95 */               double d = dx * dx + dy * dy + dz * dz;
/*  96 */               return (d < 1.0D || d > 3600.0D);
/*     */             }
/*     */ 
/*     */ 
/*     */             
/*     */             public boolean shouldContinueExecuting() {
/* 102 */               return false;
/*     */             }
/*     */ 
/*     */             
/*     */             public void startExecuting() {
/* 107 */               Random random = Ivorywoodpecker.EntityCustom.this.getRNG();
/* 108 */               double dir_x = Ivorywoodpecker.EntityCustom.this.posX + ((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
/* 109 */               double dir_y = Ivorywoodpecker.EntityCustom.this.posY + ((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
/* 110 */               double dir_z = Ivorywoodpecker.EntityCustom.this.posZ + ((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
/* 111 */               Ivorywoodpecker.EntityCustom.this.getMoveHelper().setMoveTo(dir_x, dir_y, dir_z, 0.8D);
/*     */             }
/*     */           });
/* 114 */       this.moveHelper = new EntityMoveHelper((EntityLiving)this)
/*     */         {
/*     */           private int patchChangeTimer;
/*     */ 
/*     */           
/*     */           public void onUpdateMoveHelper() {
/* 120 */             double dx = this.posX - Ivorywoodpecker.EntityCustom.this.posX;
/* 121 */             double dy = this.posY - Ivorywoodpecker.EntityCustom.this.posY;
/* 122 */             double dz = this.posZ - Ivorywoodpecker.EntityCustom.this.posZ;
/* 123 */             double d = dx * dx + dy * dy + dz * dz;
/* 124 */             if (this.action == EntityMoveHelper.Action.MOVE_TO && this.patchChangeTimer-- <= 0) {
/* 125 */               this.patchChangeTimer += Ivorywoodpecker.EntityCustom.this.getRNG().nextInt(5) + 2;
/* 126 */               d = MathHelper.sqrt(d);
/* 127 */               if (isNotColliding(this.posX, this.posY, this.posZ, d)) {
/* 128 */                 Ivorywoodpecker.EntityCustom.this.motionX += dx / d * 0.1D;
/* 129 */                 Ivorywoodpecker.EntityCustom.this.motionY += dy / d * 0.1D;
/* 130 */                 Ivorywoodpecker.EntityCustom.this.motionZ += dz / d * 0.1D;
/*     */               } else {
/* 132 */                 this.action = EntityMoveHelper.Action.WAIT;
/*     */               } 
/*     */             } 
/*     */           }
/*     */ 
/*     */           
/*     */           private boolean isNotColliding(double x, double y, double z, double par) {
/* 139 */             double dx = (x - Ivorywoodpecker.EntityCustom.this.posX) / par;
/* 140 */             double dy = (y - Ivorywoodpecker.EntityCustom.this.posY) / par;
/* 141 */             double dz = (z - Ivorywoodpecker.EntityCustom.this.posZ) / par;
/* 142 */             AxisAlignedBB axisalignedbb = Ivorywoodpecker.EntityCustom.this.getEntityBoundingBox();
/* 143 */             for (int i = 1; i < par; i++) {
/* 144 */               axisalignedbb = axisalignedbb.offset(dx, dy, dz);
/* 145 */               if (!Ivorywoodpecker.EntityCustom.this.world.getCollisionBoxes((Entity)Ivorywoodpecker.EntityCustom.this, axisalignedbb).isEmpty())
/* 146 */                 return false; 
/*     */             } 
/* 148 */             return true;
/*     */           }
/*     */         };
/* 151 */       this.tasks.addTask(2, (EntityAIBase)new EntityAIWander(this, 1.0D));
/* 152 */       this.tasks.addTask(3, (EntityAIBase)new EntityAILookIdle((EntityLiving)this));
/* 153 */       this.tasks.addTask(4, (EntityAIBase)new EntityAILeapAtTarget((EntityLiving)this, 0.8F));
/* 154 */       this.tasks.addTask(5, (EntityAIBase)new EntityAIPanic(this, 1.2D));
/*     */     }
/*     */ 
/*     */     
/*     */     public EnumCreatureAttribute getCreatureAttribute() {
/* 159 */       return EnumCreatureAttribute.UNDEFINED;
/*     */     }
/*     */ 
/*     */     
/*     */     protected Item getDropItem() {
/* 164 */       return (new ItemStack(Items.FEATHER, 1)).getItem();
/*     */     }
/*     */ 
/*     */     
/*     */     public SoundEvent getAmbientSound() {
/* 169 */       return (SoundEvent)SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.parrot.ambient"));
/*     */     }
/*     */ 
/*     */     
/*     */     public SoundEvent getHurtSound(DamageSource ds) {
/* 174 */       return (SoundEvent)SoundEvent.REGISTRY.getObject(new ResourceLocation("entity.parrot.hurt"));
/*     */     }
/*     */ 
/*     */     
/*     */     public SoundEvent getDeathSound() {
/* 179 */       return (SoundEvent)SoundEvent.REGISTRY.getObject(new ResourceLocation(""));
/*     */     }
/*     */ 
/*     */     
/*     */     protected float getSoundVolume() {
/* 184 */       return 1.0F;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     public void fall(float l, float d) {}
/*     */ 
/*     */     
/*     */     protected void applyEntityAttributes() {
/* 193 */       super.applyEntityAttributes();
/* 194 */       if (getEntityAttribute(SharedMonsterAttributes.ARMOR) != null)
/* 195 */         getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(0.0D); 
/* 196 */       if (getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED) != null)
/* 197 */         getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3D); 
/* 198 */       if (getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH) != null)
/* 199 */         getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(12.0D); 
/* 200 */       if (getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE) != null)
/* 201 */         getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(2.0D); 
/*     */     }
/*     */     
/*     */     protected void dropRareDrop(int par1) {
/* 205 */       dropItem((new ItemStack(Items.BONE, 1)).getItem(), 1);
/*     */     }
/*     */ 
/*     */     
/*     */     public void travel(float ti, float tj, float tk) {
/* 210 */       if (isInWater()) {
/* 211 */         moveRelative(ti, tj, tk, 0.02F);
/* 212 */         move(MoverType.SELF, this.motionX, this.motionY, this.motionZ);
/* 213 */         this.motionX *= 0.8D;
/* 214 */         this.motionY *= 0.8D;
/* 215 */         this.motionZ *= 0.8D;
/*     */         return;
/*     */       } 
/* 218 */       if (isInLava()) {
/* 219 */         moveRelative(ti, tj, tk, 0.02F);
/* 220 */         move(MoverType.SELF, this.motionX, this.motionY, this.motionZ);
/* 221 */         this.motionX *= 0.5D;
/* 222 */         this.motionY *= 0.5D;
/* 223 */         this.motionZ *= 0.5D;
/*     */         return;
/*     */       } 
/* 226 */       float f = 0.91F;
/* 227 */       if (this.onGround) {
/*     */         
/* 229 */         BlockPos underPos = new BlockPos(MathHelper.floor(this.posX), MathHelper.floor((getEntityBoundingBox()).minY) - 1, MathHelper.floor(this.posZ));
/* 230 */         IBlockState underState = this.world.getBlockState(underPos);
/* 231 */         f = underState.getBlock().getSlipperiness(underState, (IBlockAccess)this.world, underPos, (Entity)this) * 0.91F;
/*     */       } 
/* 233 */       moveRelative(ti, tj, tk, this.onGround ? (0.016F / f * f * f) : 0.02F);
/* 234 */       f = 0.91F;
/* 235 */       if (this.onGround) {
/*     */         
/* 237 */         BlockPos underPos = new BlockPos(MathHelper.floor(this.posX), MathHelper.floor((getEntityBoundingBox()).minY) - 1, MathHelper.floor(this.posZ));
/* 238 */         IBlockState underState = this.world.getBlockState(underPos);
/* 239 */         f = underState.getBlock().getSlipperiness(underState, (IBlockAccess)this.world, underPos, (Entity)this) * 0.91F;
/*     */       } 
/* 241 */       move(MoverType.SELF, this.motionX, this.motionY, this.motionZ);
/* 242 */       this.motionX *= f;
/* 243 */       this.motionY *= f;
/* 244 */       this.motionZ *= f;
/* 245 */       this.prevLimbSwingAmount = this.limbSwingAmount;
/* 246 */       double d1 = this.posX - this.prevPosX;
/* 247 */       double d0 = this.posZ - this.prevPosZ;
/* 248 */       float f2 = MathHelper.sqrt(d1 * d1 + d0 * d0) * 4.0F;
/* 249 */       if (f2 > 1.0F)
/* 250 */         f2 = 1.0F; 
/* 251 */       this.limbSwingAmount += (f2 - this.limbSwingAmount) * 0.4F;
/* 252 */       this.limbSwing += this.limbSwingAmount;
/*     */     }
/*     */ 
/*     */     
/*     */     protected void updateFallState(double y, boolean onGroundIn, IBlockState state, BlockPos pos) {}
/*     */   }
/*     */ 
/*     */   
/*     */   public static class ModelIvoryBilledWoodpecker
/*     */     extends ModelBase
/*     */   {
/*     */     ModelRenderer Shape1;
/*     */     
/*     */     ModelRenderer Shape2;
/*     */     
/*     */     ModelRenderer Shape3;
/*     */     
/*     */     ModelRenderer Shape4;
/*     */     
/*     */     ModelRenderer Shape5;
/*     */     ModelRenderer Shape6;
/*     */     ModelRenderer Shape7;
/*     */     ModelRenderer Shape8;
/*     */     ModelRenderer Shape9;
/*     */     ModelRenderer Shape10;
/*     */     ModelRenderer Shape11;
/*     */     ModelRenderer Shape12;
/*     */     ModelRenderer Shape13;
/*     */     ModelRenderer Shape14;
/*     */     ModelRenderer Shape15;
/*     */     ModelRenderer Shape16;
/*     */     
/*     */     public ModelIvoryBilledWoodpecker() {
/* 285 */       this.textureWidth = 64;
/* 286 */       this.textureHeight = 32;
/* 287 */       this.Shape1 = new ModelRenderer(this, 41, 23);
/* 288 */       this.Shape1.addBox(0.0F, 0.0F, 0.0F, 3, 3, 5);
/* 289 */       this.Shape1.setRotationPoint(1.5F, 1.0F, -5.0F);
/* 290 */       this.Shape1.setTextureSize(64, 32);
/* 291 */       this.Shape1.mirror = true;
/* 292 */       setRotation(this.Shape1, 0.1784573F, 0.0F, 0.0F);
/* 293 */       this.Shape2 = new ModelRenderer(this, 0, 15);
/* 294 */       this.Shape2.addBox(0.0F, 0.0F, 0.0F, 6, 6, 11);
/* 295 */       this.Shape2.setRotationPoint(0.0F, 0.0F, -1.0F);
/* 296 */       this.Shape2.setTextureSize(64, 32);
/* 297 */       this.Shape2.mirror = true;
/* 298 */       setRotation(this.Shape2, 0.0F, 0.0F, 0.0F);
/* 299 */       this.Shape3 = new ModelRenderer(this, 36, 0);
/* 300 */       this.Shape3.addBox(0.0F, 0.0F, 0.0F, 4, 4, 6);
/* 301 */       this.Shape3.setRotationPoint(1.0F, 2.0F, -10.0F);
/* 302 */       this.Shape3.setTextureSize(64, 32);
/* 303 */       this.Shape3.mirror = true;
/* 304 */       setRotation(this.Shape3, 0.3866576F, 0.0F, 0.0F);
/* 305 */       this.Shape4 = new ModelRenderer(this, 35, 15);
/* 306 */       this.Shape4.addBox(0.0F, 0.0F, 0.0F, 3, 6, 1);
/* 307 */       this.Shape4.setRotationPoint(1.5F, -3.0F, -4.0F);
/* 308 */       this.Shape4.setTextureSize(64, 32);
/* 309 */       this.Shape4.mirror = true;
/* 310 */       setRotation(this.Shape4, -0.5651149F, 0.0F, 0.0F);
/* 311 */       this.Shape5 = new ModelRenderer(this, 22, 8);
/* 312 */       this.Shape5.addBox(0.0F, 0.0F, 0.0F, 1, 1, 5);
/* 313 */       this.Shape5.setRotationPoint(2.5F, 6.0F, -12.0F);
/* 314 */       this.Shape5.setTextureSize(64, 32);
/* 315 */       this.Shape5.mirror = true;
/* 316 */       setRotation(this.Shape5, 0.535372F, 0.0F, 0.0F);
/* 317 */       this.Shape6 = new ModelRenderer(this, 44, 14);
/* 318 */       this.Shape6.addBox(0.0F, 0.0F, 0.0F, 3, 1, 7);
/* 319 */       this.Shape6.setRotationPoint(1.54F, 1.0F, 9.0F);
/* 320 */       this.Shape6.setTextureSize(64, 32);
/* 321 */       this.Shape6.mirror = true;
/* 322 */       setRotation(this.Shape6, -0.2379431F, 0.0F, 0.0F);
/* 323 */       this.Shape7 = new ModelRenderer(this, 0, 0);
/* 324 */       this.Shape7.addBox(0.0F, 0.0F, 0.0F, 10, 1, 6);
/* 325 */       this.Shape7.setRotationPoint(5.0F, 0.0F, -1.0F);
/* 326 */       this.Shape7.setTextureSize(64, 32);
/* 327 */       this.Shape7.mirror = true;
/* 328 */       setRotation(this.Shape7, 0.0F, 0.0F, 0.0F);
/* 329 */       this.Shape8 = new ModelRenderer(this, 0, 0);
/* 330 */       this.Shape8.addBox(0.0F, 0.0F, 0.0F, 10, 1, 6);
/* 331 */       this.Shape8.setRotationPoint(-9.0F, 0.0F, -1.0F);
/* 332 */       this.Shape8.setTextureSize(64, 32);
/* 333 */       this.Shape8.mirror = true;
/* 334 */       setRotation(this.Shape8, 0.0F, 0.0F, 0.0F);
/* 335 */       this.Shape9 = new ModelRenderer(this, 0, 11);
/* 336 */       this.Shape9.addBox(0.0F, 0.0F, 0.0F, 3, 1, 2);
/* 337 */       this.Shape9.setRotationPoint(12.0F, 0.0F, 5.0F);
/* 338 */       this.Shape9.setTextureSize(64, 32);
/* 339 */       this.Shape9.mirror = true;
/* 340 */       setRotation(this.Shape9, 0.0F, 0.0F, 0.0F);
/* 341 */       this.Shape10 = new ModelRenderer(this, 0, 11);
/* 342 */       this.Shape10.addBox(0.0F, 0.0F, 0.0F, 3, 1, 2);
/* 343 */       this.Shape10.setRotationPoint(-9.0F, 0.0F, 5.0F);
/* 344 */       this.Shape10.setTextureSize(64, 32);
/* 345 */       this.Shape10.mirror = true;
/* 346 */       setRotation(this.Shape10, 0.0F, 0.0F, 0.0F);
/* 347 */       this.Shape11 = new ModelRenderer(this, 54, 0);
/* 348 */       this.Shape11.addBox(0.0F, 0.0F, 0.0F, 2, 2, 3);
/* 349 */       this.Shape11.setRotationPoint(0.0F, 6.0F, 7.0F);
/* 350 */       this.Shape11.setTextureSize(64, 32);
/* 351 */       this.Shape11.mirror = true;
/* 352 */       setRotation(this.Shape11, 0.0F, 0.0F, 0.0F);
/* 353 */       this.Shape12 = new ModelRenderer(this, 54, 0);
/* 354 */       this.Shape12.addBox(0.0F, 0.0F, 0.0F, 2, 2, 3);
/* 355 */       this.Shape12.setRotationPoint(4.0F, 6.0F, 7.0F);
/* 356 */       this.Shape12.setTextureSize(64, 32);
/* 357 */       this.Shape12.mirror = true;
/* 358 */       setRotation(this.Shape12, 0.0F, 0.0F, 0.0F);
/* 359 */       this.Shape13 = new ModelRenderer(this, 14, 9);
/* 360 */       this.Shape13.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1);
/* 361 */       this.Shape13.setRotationPoint(0.5F, 7.0F, 8.0F);
/* 362 */       this.Shape13.setTextureSize(64, 32);
/* 363 */       this.Shape13.mirror = true;
/* 364 */       setRotation(this.Shape13, 0.0F, 0.0F, 0.0F);
/* 365 */       this.Shape14 = new ModelRenderer(this, 14, 9);
/* 366 */       this.Shape14.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1);
/* 367 */       this.Shape14.setRotationPoint(4.5F, 7.0F, 8.0F);
/* 368 */       this.Shape14.setTextureSize(64, 32);
/* 369 */       this.Shape14.mirror = true;
/* 370 */       setRotation(this.Shape14, 0.0F, 0.0F, 0.0F);
/* 371 */       this.Shape15 = new ModelRenderer(this, 58, 8);
/* 372 */       this.Shape15.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1);
/* 373 */       this.Shape15.setRotationPoint(0.5F, 10.0F, 7.9F);
/* 374 */       this.Shape15.setTextureSize(64, 32);
/* 375 */       this.Shape15.mirror = true;
/* 376 */       setRotation(this.Shape15, 0.5651149F, 0.0F, 0.0F);
/* 377 */       this.Shape16 = new ModelRenderer(this, 58, 8);
/* 378 */       this.Shape16.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1);
/* 379 */       this.Shape16.setRotationPoint(4.5F, 10.0F, 7.9F);
/* 380 */       this.Shape16.setTextureSize(64, 32);
/* 381 */       this.Shape16.mirror = true;
/* 382 */       setRotation(this.Shape16, 0.5651149F, 0.0F, 0.0F);
/*     */     }
/*     */     
/*     */     public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 386 */       super.render(entity, f, f1, f2, f3, f4, f5);
/* 387 */       setRotationAngles(f, f1, f2, f3, f4, f5, entity);
/* 388 */       this.Shape1.render(f5);
/* 389 */       this.Shape2.render(f5);
/* 390 */       this.Shape3.render(f5);
/* 391 */       this.Shape4.render(f5);
/* 392 */       this.Shape5.render(f5);
/* 393 */       this.Shape6.render(f5);
/* 394 */       this.Shape7.render(f5);
/* 395 */       this.Shape8.render(f5);
/* 396 */       this.Shape9.render(f5);
/* 397 */       this.Shape10.render(f5);
/* 398 */       this.Shape11.render(f5);
/* 399 */       this.Shape12.render(f5);
/* 400 */       this.Shape13.render(f5);
/* 401 */       this.Shape14.render(f5);
/* 402 */       this.Shape15.render(f5);
/* 403 */       this.Shape16.render(f5);
/*     */     }
/*     */     
/*     */     private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 407 */       model.rotateAngleX = x;
/* 408 */       model.rotateAngleY = y;
/* 409 */       model.rotateAngleZ = z;
/*     */     }
/*     */     
/*     */     public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
/* 413 */       super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
/*     */     }
/*     */   }
/*     */ }


/* Location:              H:\eclipse-workspace-19\BiomesYouGo1.7.1-deobf.jar!\net\mcreator\byg\Ivorywoodpecker.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */