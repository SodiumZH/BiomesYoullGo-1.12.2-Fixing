 package net.mcreator.byg;
 
 import com.google.common.base.Predicate;
 import java.util.Random;
 import net.minecraft.block.Block;
 import net.minecraft.block.SoundType;
 import net.minecraft.block.material.Material;
 import net.minecraft.block.state.IBlockState;
 import net.minecraft.client.renderer.block.model.ModelResourceLocation;
 import net.minecraft.init.Blocks;
 import net.minecraft.item.Item;
 import net.minecraft.item.ItemBlock;
 import net.minecraft.item.ItemStack;
 import net.minecraft.util.EnumFacing;
 import net.minecraft.util.NonNullList;
 import net.minecraft.util.ResourceLocation;
 import net.minecraft.util.math.BlockPos;
 import net.minecraft.world.IBlockAccess;
 import net.minecraft.world.World;
 import net.minecraft.world.biome.Biome;
 import net.minecraft.world.chunk.IChunkProvider;
 import net.minecraft.world.gen.IChunkGenerator;
 import net.minecraft.world.gen.feature.WorldGenMinable;
 import net.minecraftforge.client.event.ModelRegistryEvent;
 import net.minecraftforge.client.model.ModelLoader;
 import net.minecraftforge.common.IPlantable;
 import net.minecraftforge.fml.common.event.FMLInitializationEvent;
 import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
 import net.minecraftforge.fml.relauncher.Side;
 import net.minecraftforge.fml.relauncher.SideOnly;
 import net.minecraftforge.oredict.OreDictionary;
 
 @Elementsbyg.ModElement.Tag
 public class MCreatorRocky_grass
   extends Elementsbyg.ModElement {
   @ObjectHolder("byg:rocky_grass")
   public static final Block block = null;
   
   public MCreatorRocky_grass(Elementsbyg instance) {
     super(instance, 1494);
   }
 
   
   public void initElements() {
     this.elements.blocks.add(() -> new BlockCustom());
     this.elements.items.add(() -> (Item)(new ItemBlock(block)).setRegistryName(block.getRegistryName()));
   }
 
   
   public void init(FMLInitializationEvent event) {
     OreDictionary.registerOre("grass", block);
   }
 
   
   @SideOnly(Side.CLIENT)
   public void registerModels(ModelRegistryEvent event) {
     ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("byg:rocky_grass", "inventory"));
   }
 
   
   public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
     boolean dimensionCriteria = false;
     if (dimID == 0)
       dimensionCriteria = true; 
     if (!dimensionCriteria)
       return; 
     boolean biomeCriteria = false;
     Biome biome = world.getBiome(new BlockPos(chunkX, 128, chunkZ));
     if (((ResourceLocation)Biome.REGISTRY.getNameForObject(biome)).equals(new ResourceLocation("byg:bbluff_mountains")))
       biomeCriteria = true; 
     if (((ResourceLocation)Biome.REGISTRY.getNameForObject(biome)).equals(new ResourceLocation("byg:bstone_brushlands")))
       biomeCriteria = true; 
     if (!biomeCriteria)
       return; 
     for (int i = 0; i < 32; i++) {
       int x = chunkX + random.nextInt(16);
       int y = random.nextInt(138) + 70;
       int z = chunkZ + random.nextInt(16);
       (new WorldGenMinable(block.getDefaultState(), 32, new Predicate<IBlockState>() {
             public boolean apply(IBlockState blockAt) {
               boolean blockCriteria = false;
               
               if (blockAt.getBlock() == Blocks.GRASS.getDefaultState().getBlock())
                 blockCriteria = true; 
               if (blockAt.getBlock() == MCreatorPeatgrass.block.getDefaultState().getBlock())
                 blockCriteria = true; 
               return blockCriteria;
             }
           })).generate(world, random, new BlockPos(x, y, z));
     } 
   }
   
   public static class BlockCustom extends Block {
     public BlockCustom() {
       super(Material.ROCK);
       setRegistryName("rocky_grass");
       setUnlocalizedName("rocky_grass");
       setSoundType(SoundType.STONE);
       setHarvestLevel("pickaxe", 1);
       setHardness(2.0F);
       setResistance(10.0F);
       setLightLevel(0.0F);
       setLightOpacity(255);
       setCreativeTab(MCreatorBYG.tab);
     }
 
 
     
     public boolean canSustainPlant(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing direction, IPlantable plantable) {
       return true;
     }
 
     
     public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
       drops.add(new ItemStack(Blocks.COBBLESTONE, 1));
     }
   }
 }


/* Location:              H:\eclipse-workspace-19\BiomesYouGo1.7.1-deobf.jar!\net\mcreator\byg\MCreatorRocky_grass.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */