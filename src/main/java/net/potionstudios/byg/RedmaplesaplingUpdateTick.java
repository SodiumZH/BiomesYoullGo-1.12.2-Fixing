 package net.potionstudios.byg;
 
 import java.util.HashMap;
 import net.minecraft.block.Block;
 import net.minecraft.block.state.IBlockState;
 import net.minecraft.util.Mirror;
 import net.minecraft.util.ResourceLocation;
 import net.minecraft.util.Rotation;
 import net.minecraft.util.math.BlockPos;
 import net.minecraft.util.math.ChunkPos;
 import net.minecraft.world.World;
 import net.minecraft.world.WorldServer;
 import net.minecraft.world.gen.structure.template.PlacementSettings;
 import net.minecraft.world.gen.structure.template.Template;
 
 @Elementsbyg.ModElement.Tag
 public class RedmaplesaplingUpdateTick
   extends Elementsbyg.ModElement {
   public RedmaplesaplingUpdateTick(Elementsbyg instance) {
     super(instance, 571);
   }
   
   public static void executeProcedure(HashMap<String, Object> dependencies) {
     if (dependencies.get("x") == null) {
       System.err.println("Failed to load dependency x for procedure RedmaplesaplingUpdateTick!");
       return;
     } 
     if (dependencies.get("y") == null) {
       System.err.println("Failed to load dependency y for procedure RedmaplesaplingUpdateTick!");
       return;
     } 
     if (dependencies.get("z") == null) {
       System.err.println("Failed to load dependency z for procedure RedmaplesaplingUpdateTick!");
       return;
     } 
     if (dependencies.get("world") == null) {
       System.err.println("Failed to load dependency world for procedure RedmaplesaplingUpdateTick!");
       return;
     } 
     int x = ((Integer)dependencies.get("x")).intValue();
     int y = ((Integer)dependencies.get("y")).intValue();
     int z = ((Integer)dependencies.get("z")).intValue();
     World world = (World)dependencies.get("world");
     if (world.canSeeSky(new BlockPos(x, y, z)) && world.isDaytime() && ((world.getBiome(new BlockPos(x, y, z))
       .getTemperature(new BlockPos(x, y, z)) * 100.0F) >= -0.5D || (world
       .getBiome(new BlockPos(x, y, z)).getTemperature(new BlockPos(x, y, z)) * 100.0F) <= 0.35D))
       if (Math.random() < 0.5D) {
         world.setBlockToAir(new BlockPos(x, y, z));
         
         if (world.isRemote)
           return; 
         Template template = ((WorldServer)world).getStructureTemplateManager().getTemplate(world.getMinecraftServer(), new ResourceLocation("byg", "maple_sapling1"));
         
         if (template == null)
           return; 
         BlockPos spawnTo = new BlockPos(x - 0, y, z - 0);
         IBlockState iblockstate = world.getBlockState(spawnTo);
         world.notifyBlockUpdate(spawnTo, iblockstate, iblockstate, 3);
         template.addBlocksToWorldChunk(world, spawnTo, (new PlacementSettings()).setRotation(Rotation.NONE).setMirror(Mirror.NONE)
             .setChunk((ChunkPos)null).setReplacedBlock((Block)null).setIgnoreStructureBlock(false).setIgnoreEntities(false));
       } else {
         
         world.setBlockToAir(new BlockPos(x, y, z));
         
         if (world.isRemote)
           return; 
         Template template = ((WorldServer)world).getStructureTemplateManager().getTemplate(world.getMinecraftServer(), new ResourceLocation("byg", "maple_sapling2"));
         
         if (template == null)
           return; 
         BlockPos spawnTo = new BlockPos(x - 0, y, z - 0);
         IBlockState iblockstate = world.getBlockState(spawnTo);
         world.notifyBlockUpdate(spawnTo, iblockstate, iblockstate, 3);
         template.addBlocksToWorldChunk(world, spawnTo, (new PlacementSettings()).setRotation(Rotation.NONE).setMirror(Mirror.NONE)
             .setChunk((ChunkPos)null).setReplacedBlock((Block)null).setIgnoreStructureBlock(false).setIgnoreEntities(false));
       }  
   }
 }


/* Location:              H:\eclipse-workspace-19\BiomesYouGo1.7.1-deobf.jar!\net\mcreator\byg\RedmaplesaplingUpdateTick.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */