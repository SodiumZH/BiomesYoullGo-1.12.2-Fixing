 package net.potionstudios.byg;
 
 import java.util.HashMap;
 import net.minecraft.entity.Entity;
 import net.minecraft.entity.item.EntityItem;
 import net.minecraft.item.ItemStack;
 import net.minecraft.world.World;
 
 @Elementsbyg.ModElement.Tag
 public class PurplecrystalblockBlockDestroyedByPlayer extends Elementsbyg.ModElement {
   public PurplecrystalblockBlockDestroyedByPlayer(Elementsbyg instance) {
     super(instance, 2418);
   }
   
   public static void executeProcedure(HashMap<String, Object> dependencies) {
     if (dependencies.get("x") == null) {
       System.err.println("Failed to load dependency x for procedure PurplecrystalblockBlockDestroyedByPlayer!");
       return;
     } 
     if (dependencies.get("y") == null) {
       System.err.println("Failed to load dependency y for procedure PurplecrystalblockBlockDestroyedByPlayer!");
       return;
     } 
     if (dependencies.get("z") == null) {
       System.err.println("Failed to load dependency z for procedure PurplecrystalblockBlockDestroyedByPlayer!");
       return;
     } 
     if (dependencies.get("world") == null) {
       System.err.println("Failed to load dependency world for procedure PurplecrystalblockBlockDestroyedByPlayer!");
       return;
     } 
     int x = ((Integer)dependencies.get("x")).intValue();
     int y = ((Integer)dependencies.get("y")).intValue();
     int z = ((Integer)dependencies.get("z")).intValue();
     World world = (World)dependencies.get("world");
     if (Math.random() < 0.5D && 
       !world.isRemote) {
       EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(Purple_crystals.block, 1));
       entityToSpawn.setPickupDelay(10);
       world.spawnEntity((Entity)entityToSpawn);
     } 
   }
 }


/* Location:              H:\eclipse-workspace-19\BiomesYouGo1.7.1-deobf.jar!\net\mcreator\byg\PurplecrystalblockBlockDestroyedByPlayer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */