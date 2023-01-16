 package net.mcreator.byg;
 
 import com.google.common.base.Predicate;
 import java.util.Random;
 import net.minecraft.block.Block;
 import net.minecraft.block.BlockFalling;
 import net.minecraft.block.SoundType;
 import net.minecraft.block.material.Material;
 import net.minecraft.block.state.IBlockState;
 import net.minecraft.client.renderer.block.model.ModelResourceLocation;
 import net.minecraft.init.Blocks;
 import net.minecraft.item.Item;
 import net.minecraft.item.ItemBlock;
 import net.minecraft.util.ResourceLocation;
 import net.minecraft.util.math.BlockPos;
 import net.minecraft.world.World;
 import net.minecraft.world.biome.Biome;
 import net.minecraft.world.chunk.IChunkProvider;
 import net.minecraft.world.gen.IChunkGenerator;
 import net.minecraft.world.gen.feature.WorldGenMinable;
 import net.minecraftforge.client.event.ModelRegistryEvent;
 import net.minecraftforge.client.model.ModelLoader;
 import net.minecraftforge.fml.common.event.FMLInitializationEvent;
 import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
 import net.minecraftforge.fml.relauncher.Side;
 import net.minecraftforge.fml.relauncher.SideOnly;
 import net.minecraftforge.oredict.OreDictionary;
 
 @Elementsbyg.ModElement.Tag
 public class MCreatorLight_blue_sand
   extends Elementsbyg.ModElement {
   @ObjectHolder("byg:light_blue_sand")
   public static final Block block = null;
   
   public MCreatorLight_blue_sand(Elementsbyg instance) {
     super(instance, 1358);
   }
 
   
   public void initElements() {
     this.elements.blocks.add(() -> new BlockCustom());
     this.elements.items.add(() -> (Item)(new ItemBlock(block)).setRegistryName(block.getRegistryName()));
   }
 
   
   public void init(FMLInitializationEvent event) {
     OreDictionary.registerOre("sand", block);
   }
 
   
   @SideOnly(Side.CLIENT)
   public void registerModels(ModelRegistryEvent event) {
     ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("byg:light_blue_sand", "inventory"));
   }
 
   
   public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
     boolean dimensionCriteria = false;
     if (dimID == 0)
       dimensionCriteria = true; 
     if (!dimensionCriteria)
       return; 
     boolean biomeCriteria = false;
     Biome biome = world.getBiome(new BlockPos(chunkX, 128, chunkZ));
     if (((ResourceLocation)Biome.REGISTRY.getNameForObject(biome)).equals(new ResourceLocation("byg:btropical_islands")))
       biomeCriteria = true; 
     if (!biomeCriteria)
       return; 
     for (int i = 0; i < 32; i++) {
       int x = chunkX + random.nextInt(16);
       int y = random.nextInt(20) + 44;
       int z = chunkZ + random.nextInt(16);
       (new WorldGenMinable(block.getDefaultState(), 32, new Predicate<IBlockState>() {
             public boolean apply(IBlockState blockAt) {
               boolean blockCriteria = false;
               
               IBlockState require = Blocks.SAND.getStateFromMeta(0);
               try {
                 if (blockAt.getBlock() == require.getBlock() && blockAt
                   .getBlock().getMetaFromState(blockAt) == require.getBlock().getMetaFromState(require))
                   blockCriteria = true; 
               } catch (Exception e) {
                 if (blockAt.getBlock() == require.getBlock())
                   blockCriteria = true; 
               } 
               return blockCriteria;
             }
           })).generate(world, random, new BlockPos(x, y, z));
     } 
   }
   
   public static class BlockCustom extends BlockFalling {
     public BlockCustom() {
       super(Material.SAND);
       setRegistryName("light_blue_sand");
       setUnlocalizedName("light_blue_sand");
       setSoundType(SoundType.SAND);
       setHarvestLevel("shovel", 0);
       setHardness(1.0F);
       setResistance(5.0F);
       setLightLevel(0.0F);
       setLightOpacity(255);
       setCreativeTab(MCreatorBYG.tab);
     }
   }
 }


/* Location:              H:\eclipse-workspace-19\BiomesYouGo1.7.1-deobf.jar!\net\mcreator\byg\MCreatorLight_blue_sand.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */