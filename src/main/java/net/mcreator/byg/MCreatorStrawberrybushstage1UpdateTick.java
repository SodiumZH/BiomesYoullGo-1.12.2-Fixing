 package net.mcreator.byg;
 
 import java.util.HashMap;
 import net.minecraft.util.math.BlockPos;
 import net.minecraft.world.World;
 
 @Elementsbyg.ModElement.Tag
 public class MCreatorStrawberrybushstage1UpdateTick
   extends Elementsbyg.ModElement {
   public MCreatorStrawberrybushstage1UpdateTick(Elementsbyg instance) {
     super(instance, 880);
   }
   
   public static void executeProcedure(HashMap<String, Object> dependencies) {
     if (dependencies.get("x") == null) {
       System.err.println("Failed to load dependency x for procedure MCreatorStrawberrybushstage1UpdateTick!");
       return;
     } 
     if (dependencies.get("y") == null) {
       System.err.println("Failed to load dependency y for procedure MCreatorStrawberrybushstage1UpdateTick!");
       return;
     } 
     if (dependencies.get("z") == null) {
       System.err.println("Failed to load dependency z for procedure MCreatorStrawberrybushstage1UpdateTick!");
       return;
     } 
     if (dependencies.get("world") == null) {
       System.err.println("Failed to load dependency world for procedure MCreatorStrawberrybushstage1UpdateTick!");
       return;
     } 
     int x = ((Integer)dependencies.get("x")).intValue();
     int y = ((Integer)dependencies.get("y")).intValue();
     int z = ((Integer)dependencies.get("z")).intValue();
     World world = (World)dependencies.get("world");
     if (Math.random() < 0.5D) {
       world.setBlockToAir(new BlockPos(x, y, z));
       world.setBlockState(new BlockPos(x, y, z), MCreatorStrawberrybush.block.getDefaultState(), 3);
     } 
   }
 }


/* Location:              H:\eclipse-workspace-19\BiomesYouGo1.7.1-deobf.jar!\net\mcreator\byg\MCreatorStrawberrybushstage1UpdateTick.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */