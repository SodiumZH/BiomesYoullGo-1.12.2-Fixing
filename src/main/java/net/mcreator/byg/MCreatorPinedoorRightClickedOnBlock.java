 package net.mcreator.byg;
 
 import java.util.HashMap;
 import net.minecraft.entity.Entity;
 import net.minecraft.entity.player.EntityPlayer;
 import net.minecraft.item.ItemStack;
 import net.minecraft.util.ResourceLocation;
 import net.minecraft.util.SoundCategory;
 import net.minecraft.util.SoundEvent;
 import net.minecraft.util.math.BlockPos;
 import net.minecraft.world.World;
 
 @Elementsbyg.ModElement.Tag
 public class MCreatorPinedoorRightClickedOnBlock extends Elementsbyg.ModElement {
   public MCreatorPinedoorRightClickedOnBlock(Elementsbyg instance) {
     super(instance, 1924);
   }
   
   public static void executeProcedure(HashMap<String, Object> dependencies) {
     if (dependencies.get("entity") == null) {
       System.err.println("Failed to load dependency entity for procedure MCreatorPinedoorRightClickedOnBlock!");
       return;
     } 
     if (dependencies.get("x") == null) {
       System.err.println("Failed to load dependency x for procedure MCreatorPinedoorRightClickedOnBlock!");
       return;
     } 
     if (dependencies.get("y") == null) {
       System.err.println("Failed to load dependency y for procedure MCreatorPinedoorRightClickedOnBlock!");
       return;
     } 
     if (dependencies.get("z") == null) {
       System.err.println("Failed to load dependency z for procedure MCreatorPinedoorRightClickedOnBlock!");
       return;
     } 
     if (dependencies.get("world") == null) {
       System.err.println("Failed to load dependency world for procedure MCreatorPinedoorRightClickedOnBlock!");
       return;
     } 
     Entity entity = (Entity)dependencies.get("entity");
     int x = ((Integer)dependencies.get("x")).intValue();
     int y = ((Integer)dependencies.get("y")).intValue();
     int z = ((Integer)dependencies.get("z")).intValue();
     World world = (World)dependencies.get("world");
     if (!((entity instanceof EntityPlayer) ? ((EntityPlayer)entity).capabilities.isCreativeMode : false)) {
       if (entity instanceof EntityPlayer)
         ((EntityPlayer)entity).inventory.clearMatchingItems((new ItemStack(MCreatorPine_door.block, 1)).getItem(), -1, 1, null); 
       world.playSound((EntityPlayer)null, x, y, z, (SoundEvent)SoundEvent.REGISTRY
           .getObject(new ResourceLocation("block.wood.place")), SoundCategory.NEUTRAL, 1.0F, 1.0F);
       
       world.setBlockState(new BlockPos(x, y + 1, z), MCreatorPine_door_bottom.block.getDefaultState(), 3);
       world.setBlockState(new BlockPos(x, y + 2, z), MCreatorPine_door_top.block.getDefaultState(), 3);
     } else if (((entity instanceof EntityPlayer) ? ((EntityPlayer)entity).capabilities.isCreativeMode : false) == true) {
       world.playSound((EntityPlayer)null, x, y, z, (SoundEvent)SoundEvent.REGISTRY
           .getObject(new ResourceLocation("block.wood.place")), SoundCategory.NEUTRAL, 1.0F, 1.0F);
       
       world.setBlockState(new BlockPos(x, y + 1, z), MCreatorPine_door_bottom.block.getDefaultState(), 3);
       world.setBlockState(new BlockPos(x, y + 2, z), MCreatorPine_door_top.block.getDefaultState(), 3);
     } 
   }
 }


/* Location:              H:\eclipse-workspace-19\BiomesYouGo1.7.1-deobf.jar!\net\mcreator\byg\MCreatorPinedoorRightClickedOnBlock.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */