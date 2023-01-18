 package net.potionstudios.byg;
 
 import java.util.HashMap;
 import net.minecraft.entity.player.EntityPlayer;
 import net.minecraft.util.ResourceLocation;
 import net.minecraft.util.SoundCategory;
 import net.minecraft.util.SoundEvent;
 import net.minecraft.util.math.BlockPos;
 import net.minecraft.world.World;
 
 @Elementsbyg.ModElement.Tag
 public class SkyrisdooropentopNeighbourBlockChanges extends Elementsbyg.ModElement {
   public SkyrisdooropentopNeighbourBlockChanges(Elementsbyg instance) {
     super(instance, 2093);
   }
   
   public static void executeProcedure(HashMap<String, Object> dependencies) {
     if (dependencies.get("x") == null) {
       System.err.println("Failed to load dependency x for procedure SkyrisdooropentopNeighbourBlockChanges!");
       return;
     } 
     if (dependencies.get("y") == null) {
       System.err.println("Failed to load dependency y for procedure SkyrisdooropentopNeighbourBlockChanges!");
       return;
     } 
     if (dependencies.get("z") == null) {
       System.err.println("Failed to load dependency z for procedure SkyrisdooropentopNeighbourBlockChanges!");
       return;
     } 
     if (dependencies.get("world") == null) {
       System.err.println("Failed to load dependency world for procedure SkyrisdooropentopNeighbourBlockChanges!");
       return;
     } 
     int x = ((Integer)dependencies.get("x")).intValue();
     int y = ((Integer)dependencies.get("y")).intValue();
     int z = ((Integer)dependencies.get("z")).intValue();
     World world = (World)dependencies.get("world");
     if (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Skyris_door_bottom.block.getDefaultState()
       .getBlock()) {
       world.playSound((EntityPlayer)null, x, y, z, (SoundEvent)SoundEvent.REGISTRY
 
 
 
           
           .getObject(new ResourceLocation("block.wooden_door.close")), SoundCategory.NEUTRAL, 1.0F, 1.0F);
       
       world.setBlockToAir(new BlockPos(x, y, z));
       world.setBlockState(new BlockPos(x, y, z), Skyris_door_top.block.getDefaultState(), 3);
     } 
   }
 }



