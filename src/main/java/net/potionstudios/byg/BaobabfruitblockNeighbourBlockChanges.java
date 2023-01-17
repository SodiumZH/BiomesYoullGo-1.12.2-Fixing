 package net.potionstudios.byg;
 
 import java.util.HashMap;
 import net.minecraft.entity.Entity;
 import net.minecraft.entity.item.EntityItem;
 import net.minecraft.item.ItemStack;
 import net.minecraft.util.math.BlockPos;
 import net.minecraft.world.World;
 
 @Elementsbyg.ModElement.Tag
 public class BaobabfruitblockNeighbourBlockChanges extends Elementsbyg.ModElement {
   public BaobabfruitblockNeighbourBlockChanges(Elementsbyg instance) {
     super(instance, 1171);
   }
   
   public static void executeProcedure(HashMap<String, Object> dependencies) {
     if (dependencies.get("x") == null) {
       System.err.println("Failed to load dependency x for procedure BaobabfruitblockNeighbourBlockChanges!");
       return;
     } 
     if (dependencies.get("y") == null) {
       System.err.println("Failed to load dependency y for procedure BaobabfruitblockNeighbourBlockChanges!");
       return;
     } 
     if (dependencies.get("z") == null) {
       System.err.println("Failed to load dependency z for procedure BaobabfruitblockNeighbourBlockChanges!");
       return;
     } 
     if (dependencies.get("world") == null) {
       System.err.println("Failed to load dependency world for procedure BaobabfruitblockNeighbourBlockChanges!");
       return;
     } 
     int x = ((Integer)dependencies.get("x")).intValue();
     int y = ((Integer)dependencies.get("y")).intValue();
     int z = ((Integer)dependencies.get("z")).intValue();
     World world = (World)dependencies.get("world");
     
     if (!((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == Baobableaves.block.getDefaultState().getBlock()) ? true : false)) {
       world.setBlockToAir(new BlockPos(x, y, z));
       if (!world.isRemote) {
         EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(Baobabfruit.block, 1));
         entityToSpawn.setPickupDelay(10);
         world.spawnEntity((Entity)entityToSpawn);
       } 
       if (!world.isRemote) {
         EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(Baobabfruit.block, 1));
         entityToSpawn.setPickupDelay(10);
         world.spawnEntity((Entity)entityToSpawn);
       } 
       if (!world.isRemote) {
         EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(Baobabfruit.block, 1));
         entityToSpawn.setPickupDelay(10);
         world.spawnEntity((Entity)entityToSpawn);
       } 
     } 
   }
 }


/* Location:              H:\eclipse-workspace-19\BiomesYouGo1.7.1-deobf.jar!\net\mcreator\byg\BaobabfruitblockNeighbourBlockChanges.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */