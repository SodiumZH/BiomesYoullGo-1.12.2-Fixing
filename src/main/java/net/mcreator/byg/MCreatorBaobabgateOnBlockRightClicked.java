 package net.mcreator.byg;
 
 import java.util.HashMap;
 import net.minecraft.entity.player.EntityPlayer;
 import net.minecraft.util.ResourceLocation;
 import net.minecraft.util.SoundCategory;
 import net.minecraft.util.SoundEvent;
 import net.minecraft.util.math.BlockPos;
 import net.minecraft.world.World;
 
 @Elementsbyg.ModElement.Tag
 public class MCreatorBaobabgateOnBlockRightClicked extends Elementsbyg.ModElement {
   public MCreatorBaobabgateOnBlockRightClicked(Elementsbyg instance) {
     super(instance, 1722);
   }
   
   public static void executeProcedure(HashMap<String, Object> dependencies) {
     if (dependencies.get("x") == null) {
       System.err.println("Failed to load dependency x for procedure MCreatorBaobabgateOnBlockRightClicked!");
       return;
     } 
     if (dependencies.get("y") == null) {
       System.err.println("Failed to load dependency y for procedure MCreatorBaobabgateOnBlockRightClicked!");
       return;
     } 
     if (dependencies.get("z") == null) {
       System.err.println("Failed to load dependency z for procedure MCreatorBaobabgateOnBlockRightClicked!");
       return;
     } 
     if (dependencies.get("world") == null) {
       System.err.println("Failed to load dependency world for procedure MCreatorBaobabgateOnBlockRightClicked!");
       return;
     } 
     int x = ((Integer)dependencies.get("x")).intValue();
     int y = ((Integer)dependencies.get("y")).intValue();
     int z = ((Integer)dependencies.get("z")).intValue();
     World world = (World)dependencies.get("world");
     world.playSound((EntityPlayer)null, x, y, z, (SoundEvent)SoundEvent.REGISTRY
         .getObject(new ResourceLocation("block.fence_gate.open")), SoundCategory.NEUTRAL, 1.0F, 1.0F);
     
     world.setBlockToAir(new BlockPos(x, y, z));
     world.setBlockState(new BlockPos(x, y, z), MCreatorBaobab_gate_open.block.getDefaultState(), 3);
   }
 }


/* Location:              H:\eclipse-workspace-19\BiomesYouGo1.7.1-deobf.jar!\net\mcreator\byg\MCreatorBaobabgateOnBlockRightClicked.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */