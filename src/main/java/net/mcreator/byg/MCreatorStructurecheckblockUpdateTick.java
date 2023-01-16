 package net.mcreator.byg;
 
 import java.util.HashMap;
 import net.minecraft.init.Blocks;
 import net.minecraft.util.math.BlockPos;
 import net.minecraft.world.World;
 
 @Elementsbyg.ModElement.Tag
 public class MCreatorStructurecheckblockUpdateTick
   extends Elementsbyg.ModElement {
   public MCreatorStructurecheckblockUpdateTick(Elementsbyg instance) {
     super(instance, 1191);
   }
   
   public static void executeProcedure(HashMap<String, Object> dependencies) {
     if (dependencies.get("x") == null) {
       System.err.println("Failed to load dependency x for procedure MCreatorStructurecheckblockUpdateTick!");
       return;
     } 
     if (dependencies.get("y") == null) {
       System.err.println("Failed to load dependency y for procedure MCreatorStructurecheckblockUpdateTick!");
       return;
     } 
     if (dependencies.get("z") == null) {
       System.err.println("Failed to load dependency z for procedure MCreatorStructurecheckblockUpdateTick!");
       return;
     } 
     if (dependencies.get("world") == null) {
       System.err.println("Failed to load dependency world for procedure MCreatorStructurecheckblockUpdateTick!");
       return;
     } 
     int x = ((Integer)dependencies.get("x")).intValue();
     int y = ((Integer)dependencies.get("y")).intValue();
     int z = ((Integer)dependencies.get("z")).intValue();
     World world = (World)dependencies.get("world");
     
     if (!((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == MCreatorStructure_check_block_disabled.block.getDefaultState().getBlock()) ? true : false)) {
       
       if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorPinelog.block.getDefaultState().getBlock()) ? true : false) == true && ((
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false) == true)) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorPinelog.block.getDefaultState(), 3);
         world.setBlockState(new BlockPos(x, y - 1, z), MCreatorStructurecheckblock.block.getDefaultState(), 3);
       }
       else if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorPinelog.block.getDefaultState().getBlock()) ? true : false) == true && (
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false))) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorPinelog.block.getDefaultState(), 3);
       } 
       
       if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorSkyrislog.block.getDefaultState().getBlock()) ? true : false) == true && ((
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false) == true)) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorSkyrislog.block.getDefaultState(), 3);
         world.setBlockState(new BlockPos(x, y - 1, z), MCreatorStructurecheckblock.block.getDefaultState(), 3);
       }
       else if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorSkyrislog.block.getDefaultState().getBlock()) ? true : false) == true && (
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false))) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorSkyrislog.block.getDefaultState(), 3);
       } 
       
       if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorFirlog.block.getDefaultState().getBlock()) ? true : false) == true && ((
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false) == true)) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorFirlog.block.getDefaultState(), 3);
         world.setBlockState(new BlockPos(x, y - 1, z), MCreatorStructurecheckblock.block.getDefaultState(), 3);
       }
       else if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorFirlog.block.getDefaultState().getBlock()) ? true : false) == true && (
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false))) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorFirlog.block.getDefaultState(), 3);
       } 
       
       if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorFrozenoaklog.block.getDefaultState().getBlock()) ? true : false) == true && ((
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false) == true)) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorFrozenoaklog.block.getDefaultState(), 3);
         world.setBlockState(new BlockPos(x, y - 1, z), MCreatorStructurecheckblock.block.getDefaultState(), 3);
       }
       else if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorFrozenoaklog.block.getDefaultState().getBlock()) ? true : false) == true && (
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false))) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorFrozenoaklog.block.getDefaultState(), 3);
       } 
       
       if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorEnchantedlog.block.getDefaultState().getBlock()) ? true : false) == true && ((
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false) == true)) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorEnchantedlog.block.getDefaultState(), 3);
         world.setBlockState(new BlockPos(x, y - 1, z), MCreatorStructurecheckblock.block.getDefaultState(), 3);
       }
       else if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorEnchantedlog.block.getDefaultState().getBlock()) ? true : false) == true && (
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false))) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorEnchantedlog.block.getDefaultState(), 3);
       } 
       
       if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorGreenenchantedlog.block.getDefaultState().getBlock()) ? true : false) == true && ((
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false) == true)) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorGreenenchantedlog.block.getDefaultState(), 3);
         world.setBlockState(new BlockPos(x, y - 1, z), MCreatorStructurecheckblock.block.getDefaultState(), 3);
       }
       else if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorGreenenchantedlog.block.getDefaultState().getBlock()) ? true : false) == true && (
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false))) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorGreenenchantedlog.block.getDefaultState(), 3);
       } 
       if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == Blocks.LOG.getStateFromMeta(1).getBlock()) ? true : false) == true && ((
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false) == true)) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), Blocks.LOG.getStateFromMeta(1), 3);
         world.setBlockState(new BlockPos(x, y - 1, z), MCreatorStructurecheckblock.block.getDefaultState(), 3);
       }
       else if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == Blocks.LOG.getStateFromMeta(1).getBlock()) ? true : false) == true && (
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false))) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), Blocks.LOG.getStateFromMeta(1), 3);
       } 
       
       if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorWillowlog.block.getDefaultState().getBlock()) ? true : false) == true && ((
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false) == true)) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorWillowlog.block.getDefaultState(), 3);
         world.setBlockState(new BlockPos(x, y - 1, z), MCreatorStructurecheckblock.block.getDefaultState(), 3);
       }
       else if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorWillowlog.block.getDefaultState().getBlock()) ? true : false) == true && (
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false))) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorWillowlog.block.getDefaultState(), 3);
       } 
       
       if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorWitchhazellog.block.getDefaultState().getBlock()) ? true : false) == true && ((
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false) == true)) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorWitchhazellog.block.getDefaultState(), 3);
         world.setBlockState(new BlockPos(x, y - 1, z), MCreatorStructurecheckblock.block.getDefaultState(), 3);
       }
       else if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorWitchhazellog.block.getDefaultState().getBlock()) ? true : false) == true && (
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false))) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorWitchhazellog.block.getDefaultState(), 3);
       } 
       
       if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorBaobablog.block.getDefaultState().getBlock()) ? true : false) == true && ((
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false) == true)) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorBaobablog.block.getDefaultState(), 3);
         world.setBlockState(new BlockPos(x, y - 1, z), MCreatorStructurecheckblock.block.getDefaultState(), 3);
       }
       else if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorBaobablog.block.getDefaultState().getBlock()) ? true : false) == true && (
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false))) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorBaobablog.block.getDefaultState(), 3);
       } 
       
       if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorMangrovelog.block.getDefaultState().getBlock()) ? true : false) == true && ((
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false) == true)) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorMangrovelog.block.getDefaultState(), 3);
         world.setBlockState(new BlockPos(x, y - 1, z), MCreatorStructurecheckblock.block.getDefaultState(), 3);
       }
       else if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorMangrovelog.block.getDefaultState().getBlock()) ? true : false) == true && (
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false))) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorMangrovelog.block.getDefaultState(), 3);
       } 
       
       if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorCypresslog.block.getDefaultState().getBlock()) ? true : false) == true && ((
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false) == true)) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorCypresslog.block.getDefaultState(), 3);
         world.setBlockState(new BlockPos(x, y - 1, z), MCreatorStructurecheckblock.block.getDefaultState(), 3);
       }
       else if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorCypresslog.block.getDefaultState().getBlock()) ? true : false) == true && (
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false))) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorCypresslog.block.getDefaultState(), 3);
       } 
       
       if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorCikalog.block.getDefaultState().getBlock()) ? true : false) == true && ((
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false) == true)) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorCikalog.block.getDefaultState(), 3);
         world.setBlockState(new BlockPos(x, y - 1, z), MCreatorStructurecheckblock.block.getDefaultState(), 3);
       }
       else if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorCikalog.block.getDefaultState().getBlock()) ? true : false) == true && (
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false))) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorCikalog.block.getDefaultState(), 3);
       } 
       
       if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorRedwoodlog.block.getDefaultState().getBlock()) ? true : false) == true && ((
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false) == true)) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorRedwoodlog.block.getDefaultState(), 3);
         world.setBlockState(new BlockPos(x, y - 1, z), MCreatorStructurecheckblock.block.getDefaultState(), 3);
       }
       else if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorRedwoodlog.block.getDefaultState().getBlock()) ? true : false) == true && (
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false))) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorRedwoodlog.block.getDefaultState(), 3);
       } 
       
       if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorMaplelog.block.getDefaultState().getBlock()) ? true : false) == true && ((
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false) == true)) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorMaplelog.block.getDefaultState(), 3);
         world.setBlockState(new BlockPos(x, y - 1, z), MCreatorStructurecheckblock.block.getDefaultState(), 3);
       }
       else if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorMaplelog.block.getDefaultState().getBlock()) ? true : false) == true && (
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false))) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorMaplelog.block.getDefaultState(), 3);
       } 
       
       if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorEbonylog.block.getDefaultState().getBlock()) ? true : false) == true && ((
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false) == true)) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorEbonylog.block.getDefaultState(), 3);
         world.setBlockState(new BlockPos(x, y - 1, z), MCreatorStructurecheckblock.block.getDefaultState(), 3);
       }
       else if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorEbonylog.block.getDefaultState().getBlock()) ? true : false) == true && (
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false))) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorEbonylog.block.getDefaultState(), 3);
       } 
       
       if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorMahogany_log.block.getDefaultState().getBlock()) ? true : false) == true && ((
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false) == true)) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorMahogany_log.block.getDefaultState(), 3);
         world.setBlockState(new BlockPos(x, y - 1, z), MCreatorStructurecheckblock.block.getDefaultState(), 3);
       }
       else if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorMahogany_log.block.getDefaultState().getBlock()) ? true : false) == true && (
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false))) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorMahogany_log.block.getDefaultState(), 3);
       } 
       
       if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorPalm_log.block.getDefaultState().getBlock()) ? true : false) == true && ((
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false) == true)) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorPalm_log.block.getDefaultState(), 3);
         world.setBlockState(new BlockPos(x, y - 1, z), MCreatorStructurecheckblock.block.getDefaultState(), 3);
       }
       else if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorPalm_log.block.getDefaultState().getBlock()) ? true : false) == true && (
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false))) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorPalm_log.block.getDefaultState(), 3);
       } 
       
       if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorCherrylog.block.getDefaultState().getBlock()) ? true : false) == true && ((
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false) == true)) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorCherrylog.block.getDefaultState(), 3);
         world.setBlockState(new BlockPos(x, y - 1, z), MCreatorStructurecheckblock.block.getDefaultState(), 3);
       }
       else if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorCherrylog.block.getDefaultState().getBlock()) ? true : false) == true && (
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false))) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorCherrylog.block.getDefaultState(), 3);
       } 
       
       if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorHawthornlog.block.getDefaultState().getBlock()) ? true : false) == true && ((
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false) == true)) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorHawthornlog.block.getDefaultState(), 3);
         world.setBlockState(new BlockPos(x, y - 1, z), MCreatorStructurecheckblock.block.getDefaultState(), 3);
       }
       else if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorHawthornlog.block.getDefaultState().getBlock()) ? true : false) == true && (
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false))) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorHawthornlog.block.getDefaultState(), 3);
       } 
       
       if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorRowanlog.block.getDefaultState().getBlock()) ? true : false) == true && ((
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false) == true)) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorRowanlog.block.getDefaultState(), 3);
         world.setBlockState(new BlockPos(x, y - 1, z), MCreatorStructurecheckblock.block.getDefaultState(), 3);
       }
       else if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorRowanlog.block.getDefaultState().getBlock()) ? true : false) == true && (
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false))) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorRowanlog.block.getDefaultState(), 3);
       } 
       
       if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorAspen_log.block.getDefaultState().getBlock()) ? true : false) == true && ((
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false) == true)) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorAspen_log.block.getDefaultState(), 3);
         world.setBlockState(new BlockPos(x, y - 1, z), MCreatorStructurecheckblock.block.getDefaultState(), 3);
       }
       else if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorAspen_log.block.getDefaultState().getBlock()) ? true : false) == true && (
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false))) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorAspen_log.block.getDefaultState(), 3);
       } 
       
       if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorHollylog.block.getDefaultState().getBlock()) ? true : false) == true && ((
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false) == true)) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorHollylog.block.getDefaultState(), 3);
         world.setBlockState(new BlockPos(x, y - 1, z), MCreatorStructurecheckblock.block.getDefaultState(), 3);
       }
       else if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorHollylog.block.getDefaultState().getBlock()) ? true : false) == true && (
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false))) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorHollylog.block.getDefaultState(), 3);
       } 
       
       if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorRainboweucalyptuslog.block.getDefaultState().getBlock()) ? true : false) == true && ((
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false) == true)) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorRainboweucalyptuslog.block.getDefaultState(), 3);
         world.setBlockState(new BlockPos(x, y - 1, z), MCreatorStructurecheckblock.block.getDefaultState(), 3);
       }
       else if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorRainboweucalyptuslog.block.getDefaultState().getBlock()) ? true : false) == true && (
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false))) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorRainboweucalyptuslog.block.getDefaultState(), 3);
       } 
       
       if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorZelkovalog.block.getDefaultState().getBlock()) ? true : false) == true && ((
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false) == true)) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorZelkovalog.block.getDefaultState(), 3);
         world.setBlockState(new BlockPos(x, y - 1, z), MCreatorStructurecheckblock.block.getDefaultState(), 3);
       }
       else if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorZelkovalog.block.getDefaultState().getBlock()) ? true : false) == true && (
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false))) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorZelkovalog.block.getDefaultState(), 3);
       } 
       
       if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorGreatoaklog.block.getDefaultState().getBlock()) ? true : false) == true && ((
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false) == true)) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorGreatoaklog.block.getDefaultState(), 3);
         world.setBlockState(new BlockPos(x, y - 1, z), MCreatorStructurecheckblock.block.getDefaultState(), 3);
       }
       else if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorGreatoaklog.block.getDefaultState().getBlock()) ? true : false) == true && (
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false))) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorGreatoaklog.block.getDefaultState(), 3);
       } 
       
       if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorPlant_stem.block.getDefaultState().getBlock()) ? true : false) == true && ((
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) == true || (
         (world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false) == true)) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorPlant_stem.block.getDefaultState(), 3);
         world.setBlockState(new BlockPos(x, y - 1, z), MCreatorStructurecheckblock.block.getDefaultState(), 3);
       }
       else if (((world.getBlockState(new BlockPos(x, y + 1, z)).getBlock() == MCreatorPlant_stem.block.getDefaultState().getBlock()) ? true : false) == true && (
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.FLOWING_WATER.getDefaultState().getBlock()) ? true : false) || 
         !((world.getBlockState(new BlockPos(x, y - 1, z)).getBlock() == Blocks.AIR.getDefaultState().getBlock()) ? true : false))) {
         world.setBlockToAir(new BlockPos(x, y, z));
         world.setBlockState(new BlockPos(x, y, z), MCreatorPlant_stem.block.getDefaultState(), 3);
       } 
     } 
   }
 }


/* Location:              H:\eclipse-workspace-19\BiomesYouGo1.7.1-deobf.jar!\net\mcreator\byg\MCreatorStructurecheckblockUpdateTick.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */