 package net.mcreator.byg;
 
 import java.util.HashMap;
 import net.minecraft.init.Blocks;
 import net.minecraft.util.math.BlockPos;
 import net.minecraft.world.World;
 
 @Elementsbyg.ModElement.Tag
 public class MCreatorRockygrassalpsUpdateTick
   extends Elementsbyg.ModElement {
   public MCreatorRockygrassalpsUpdateTick(Elementsbyg instance) {
     super(instance, 2338);
   }
   
   public static void executeProcedure(HashMap<String, Object> dependencies) {
     if (dependencies.get("x") == null) {
       System.err.println("Failed to load dependency x for procedure MCreatorRockygrassalpsUpdateTick!");
       return;
     } 
     if (dependencies.get("y") == null) {
       System.err.println("Failed to load dependency y for procedure MCreatorRockygrassalpsUpdateTick!");
       return;
     } 
     if (dependencies.get("z") == null) {
       System.err.println("Failed to load dependency z for procedure MCreatorRockygrassalpsUpdateTick!");
       return;
     } 
     if (dependencies.get("world") == null) {
       System.err.println("Failed to load dependency world for procedure MCreatorRockygrassalpsUpdateTick!");
       return;
     } 
     int x = ((Integer)dependencies.get("x")).intValue();
     int y = ((Integer)dependencies.get("y")).intValue();
     int z = ((Integer)dependencies.get("z")).intValue();
     World world = (World)dependencies.get("world");
     if (world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorRocky_grass_alps.block.getDefaultState()
       .getBlock()) {
       world.setBlockToAir(new BlockPos(x, y, z));
       world.setBlockState(new BlockPos(x, y, z), Blocks.STONE.getStateFromMeta(0), 3);
     } 
   }
 }


/* Location:              H:\eclipse-workspace-19\BiomesYouGo1.7.1-deobf.jar!\net\mcreator\byg\MCreatorRockygrassalpsUpdateTick.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */