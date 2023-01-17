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
 public class WitchhazelsaplingUpdateTick
   extends Elementsbyg.ModElement {
   public WitchhazelsaplingUpdateTick(Elementsbyg instance) {
     super(instance, 832);
   }
   
   public static void executeProcedure(HashMap<String, Object> dependencies) {
     if (dependencies.get("x") == null) {
       System.err.println("Failed to load dependency x for procedure WitchhazelsaplingUpdateTick!");
       return;
     } 
     if (dependencies.get("y") == null) {
       System.err.println("Failed to load dependency y for procedure WitchhazelsaplingUpdateTick!");
       return;
     } 
     if (dependencies.get("z") == null) {
       System.err.println("Failed to load dependency z for procedure WitchhazelsaplingUpdateTick!");
       return;
     } 
     if (dependencies.get("world") == null) {
       System.err.println("Failed to load dependency world for procedure WitchhazelsaplingUpdateTick!");
       return;
     } 
     int x = ((Integer)dependencies.get("x")).intValue();
     int y = ((Integer)dependencies.get("y")).intValue();
     int z = ((Integer)dependencies.get("z")).intValue();
     World world = (World)dependencies.get("world");
     if (world.canSeeSky(new BlockPos(x, y, z)) && world.isDaytime()) {
       world.setBlockToAir(new BlockPos(x, y, z));
       
       if (world.isRemote)
         return; 
       Template template = ((WorldServer)world).getStructureTemplateManager().getTemplate(world.getMinecraftServer(), new ResourceLocation("byg", "weepingtree_sapling"));
       
       if (template == null)
         return; 
       BlockPos spawnTo = new BlockPos(x - 7, y, z - 7);
       IBlockState iblockstate = world.getBlockState(spawnTo);
       world.notifyBlockUpdate(spawnTo, iblockstate, iblockstate, 3);
       template.addBlocksToWorldChunk(world, spawnTo, (new PlacementSettings())
 
           
           .setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk((ChunkPos)null)
           .setReplacedBlock((Block)null).setIgnoreStructureBlock(false).setIgnoreEntities(false));
     } 
   }
 }


/* Location:              H:\eclipse-workspace-19\BiomesYouGo1.7.1-deobf.jar!\net\mcreator\byg\WitchhazelsaplingUpdateTick.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */