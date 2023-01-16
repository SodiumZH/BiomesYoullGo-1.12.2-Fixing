 package net.mcreator.byg;
 
 import java.util.HashMap;
 import net.minecraft.init.Blocks;
 import net.minecraft.util.math.BlockPos;
 import net.minecraft.world.World;
 
 @Elementsbyg.ModElement.Tag
 public class MCreatorTinylilypadUpdateTick
   extends Elementsbyg.ModElement {
   public MCreatorTinylilypadUpdateTick(Elementsbyg instance) {
     super(instance, 2372);
   }
   
   public static void executeProcedure(HashMap<String, Object> dependencies) {
     if (dependencies.get("x") == null) {
       System.err.println("Failed to load dependency x for procedure MCreatorTinylilypadUpdateTick!");
       return;
     } 
     if (dependencies.get("y") == null) {
       System.err.println("Failed to load dependency y for procedure MCreatorTinylilypadUpdateTick!");
       return;
     } 
     if (dependencies.get("z") == null) {
       System.err.println("Failed to load dependency z for procedure MCreatorTinylilypadUpdateTick!");
       return;
     } 
     if (dependencies.get("world") == null) {
       System.err.println("Failed to load dependency world for procedure MCreatorTinylilypadUpdateTick!");
       return;
     } 
     int x = ((Integer)dependencies.get("x")).intValue();
     int y = ((Integer)dependencies.get("y")).intValue();
     int z = ((Integer)dependencies.get("z")).intValue();
     World world = (World)dependencies.get("world");
     if (!((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false)) {
       world.getBlockState(new BlockPos(x, y, z)).getBlock()
         .dropBlockAsItem(world, new BlockPos(x, y, z), world.getBlockState(new BlockPos(x, y, z)), 1);
       world.setBlockToAir(new BlockPos(x, y, z));
     } 
   }
 }


/* Location:              H:\eclipse-workspace-19\BiomesYouGo1.7.1-deobf.jar!\net\mcreator\byg\MCreatorTinylilypadUpdateTick.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */