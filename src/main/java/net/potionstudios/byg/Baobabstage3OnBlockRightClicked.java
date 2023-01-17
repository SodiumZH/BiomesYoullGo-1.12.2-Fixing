 package net.potionstudios.byg;
 
 import java.util.HashMap;
 import net.minecraft.entity.Entity;
 import net.minecraft.entity.EntityLivingBase;
 import net.minecraft.entity.item.EntityItem;
 import net.minecraft.entity.player.EntityPlayer;
 import net.minecraft.init.Items;
 import net.minecraft.item.ItemStack;
 import net.minecraft.util.EnumParticleTypes;
 import net.minecraft.util.ResourceLocation;
 import net.minecraft.util.SoundCategory;
 import net.minecraft.util.SoundEvent;
 import net.minecraft.util.math.BlockPos;
 import net.minecraft.world.World;
 import net.minecraft.world.WorldServer;
 
 @Elementsbyg.ModElement.Tag
 public class Baobabstage3OnBlockRightClicked extends Elementsbyg.ModElement {
   public Baobabstage3OnBlockRightClicked(Elementsbyg instance) {
     super(instance, 985);
   }
   
   public static void executeProcedure(HashMap<String, Object> dependencies) {
     if (dependencies.get("entity") == null) {
       System.err.println("Failed to load dependency entity for procedure Baobabstage3OnBlockRightClicked!");
       return;
     } 
     if (dependencies.get("x") == null) {
       System.err.println("Failed to load dependency x for procedure Baobabstage3OnBlockRightClicked!");
       return;
     } 
     if (dependencies.get("y") == null) {
       System.err.println("Failed to load dependency y for procedure Baobabstage3OnBlockRightClicked!");
       return;
     } 
     if (dependencies.get("z") == null) {
       System.err.println("Failed to load dependency z for procedure Baobabstage3OnBlockRightClicked!");
       return;
     } 
     if (dependencies.get("world") == null) {
       System.err.println("Failed to load dependency world for procedure Baobabstage3OnBlockRightClicked!");
       return;
     } 
     Entity entity = (Entity)dependencies.get("entity");
     int x = ((Integer)dependencies.get("x")).intValue();
     int y = ((Integer)dependencies.get("y")).intValue();
     int z = ((Integer)dependencies.get("z")).intValue();
     World world = (World)dependencies.get("world");
     if (Math.random() < 0.4D && ((entity instanceof EntityLivingBase) ? ((EntityLivingBase)entity).getHeldItemMainhand() : ItemStack.EMPTY)
       .getItem() == (new ItemStack(Items.DYE, 1, 15)).getItem()) {
       if (world instanceof WorldServer)
         ((WorldServer)world).spawnParticle(EnumParticleTypes.VILLAGER_HAPPY, x, y, z, 5, 3.0D, 3.0D, 3.0D, 1.0D, new int[0]); 
       if (entity instanceof EntityPlayer)
         ((EntityPlayer)entity).inventory.clearMatchingItems((new ItemStack(Items.DYE, 1, 15)).getItem(), 15, 1, null); 
       world.setBlockToAir(new BlockPos(x, y, z));
       world.setBlockState(new BlockPos(x, y, z), Baobabfruitblock.block.getDefaultState(), 3);
       world.playSound((EntityPlayer)null, x, y, z, (SoundEvent)SoundEvent.REGISTRY
           .getObject(new ResourceLocation("block.chorus_flower.grow")), SoundCategory.NEUTRAL, 2.0F, 1.0F);
     }
     else if (entity instanceof EntityPlayer) {
       ((EntityPlayer)entity).inventory.clearMatchingItems((new ItemStack(Items.DYE, 1, 15)).getItem(), 15, 1, null);
     } 
     if (!(
       (((entity instanceof EntityLivingBase) ? ((EntityLivingBase)entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == (new ItemStack(Items.DYE, 1, 15)).getItem()) ? true : false)) {
       world.setBlockToAir(new BlockPos(x, y, z));
       world.setBlockState(new BlockPos(x, y, z), Baobabstage2.block.getDefaultState(), 3);
       if (!world.isRemote) {
         EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(Baobabfruit.block, 1));
         entityToSpawn.setPickupDelay(10);
         world.spawnEntity((Entity)entityToSpawn);
       } 
     } 
   }
 }


/* Location:              H:\eclipse-workspace-19\BiomesYouGo1.7.1-deobf.jar!\net\mcreator\byg\Baobabstage3OnBlockRightClicked.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */