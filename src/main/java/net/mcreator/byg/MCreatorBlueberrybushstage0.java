 package net.mcreator.byg;
 
 import java.util.HashMap;
 import java.util.Random;
 import net.minecraft.block.Block;
 import net.minecraft.block.BlockFlower;
 import net.minecraft.block.SoundType;
 import net.minecraft.block.state.IBlockState;
 import net.minecraft.client.renderer.block.model.ModelResourceLocation;
 import net.minecraft.creativetab.CreativeTabs;
 import net.minecraft.entity.player.EntityPlayer;
 import net.minecraft.init.Blocks;
 import net.minecraft.item.Item;
 import net.minecraft.item.ItemBlock;
 import net.minecraft.item.ItemStack;
 import net.minecraft.util.EnumFacing;
 import net.minecraft.util.EnumHand;
 import net.minecraft.util.NonNullList;
 import net.minecraft.util.ResourceLocation;
 import net.minecraft.util.math.BlockPos;
 import net.minecraft.world.IBlockAccess;
 import net.minecraft.world.World;
 import net.minecraft.world.biome.Biome;
 import net.minecraft.world.chunk.IChunkProvider;
 import net.minecraft.world.gen.IChunkGenerator;
 import net.minecraft.world.gen.feature.WorldGenFlowers;
 import net.minecraftforge.client.event.ModelRegistryEvent;
 import net.minecraftforge.client.model.ModelLoader;
 import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
 import net.minecraftforge.fml.relauncher.Side;
 import net.minecraftforge.fml.relauncher.SideOnly;
 
 @Elementsbyg.ModElement.Tag
 public class MCreatorBlueberrybushstage0
   extends Elementsbyg.ModElement
 {
   @ObjectHolder("byg:blueberrybushstage0")
   public static final Block block = null;
   
   public MCreatorBlueberrybushstage0(Elementsbyg instance) {
     super(instance, 866);
   }
 
   
   public void initElements() {
     this.elements.blocks.add(() -> new BlockCustomFlower());
     this.elements.items.add(() -> (Item)(new ItemBlock(block)).setRegistryName(block.getRegistryName()));
   }
 
 
   
   @SideOnly(Side.CLIENT)
   public void registerModels(ModelRegistryEvent event) {
     ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("byg:blueberrybushstage0", "inventory"));
   }
 
   
   public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
     boolean dimensionCriteria = false;
     if (dimID == 0)
       dimensionCriteria = true; 
     if (!dimensionCriteria)
       return; 
     boolean biomeCriteria = false;
     Biome biome = world.getBiome(new BlockPos(chunkX, 128, chunkZ));
     if (((ResourceLocation)Biome.REGISTRY.getNameForObject(biome)).equals(new ResourceLocation("byg:bbluetaiga")))
       biomeCriteria = true; 
     if (((ResourceLocation)Biome.REGISTRY.getNameForObject(biome)).equals(new ResourceLocation("byg:bborealforest")))
       biomeCriteria = true; 
     if (((ResourceLocation)Biome.REGISTRY.getNameForObject(biome)).equals(new ResourceLocation("byg:bconiferousforest")))
       biomeCriteria = true; 
     if (((ResourceLocation)Biome.REGISTRY.getNameForObject(biome)).equals(new ResourceLocation("byg:bevergreentaiga")))
       biomeCriteria = true; 
     if (((ResourceLocation)Biome.REGISTRY.getNameForObject(biome)).equals(new ResourceLocation("byg:bsnowyconiferousforest")))
       biomeCriteria = true; 
     if (((ResourceLocation)Biome.REGISTRY.getNameForObject(biome)).equals(new ResourceLocation("byg:bsnowyevergeentaiga")))
       biomeCriteria = true; 
     if (!biomeCriteria)
       return; 
     for (int i = 0; i < 2; i++) {
       int l6 = chunkX + random.nextInt(16) + 8;
       int i11 = random.nextInt(128);
       int l14 = chunkZ + random.nextInt(16) + 8;
       (new WorldGenFlowers((BlockFlower)block, BlockFlower.EnumFlowerType.DANDELION)).generate(world, random, new BlockPos(l6, i11, l14));
     } 
   }
   
   public static class BlockCustomFlower extends BlockFlower {
     public BlockCustomFlower() {
       setSoundType(SoundType.PLANT);
       setCreativeTab(null);
       setHardness(0.01F);
       setResistance(2.0F);
       setLightLevel(0.0F);
       setUnlocalizedName("blueberrybushstage0");
       setRegistryName("blueberrybushstage0");
     }
 
     
     public BlockFlower.EnumFlowerColor getBlockType() {
       return BlockFlower.EnumFlowerColor.YELLOW;
     }
 
     
     @SideOnly(Side.CLIENT)
     public void getSubBlocks(CreativeTabs tab, NonNullList<ItemStack> list) {
       for (BlockFlower.EnumFlowerType blockflower$enumflowertype : BlockFlower.EnumFlowerType.getTypes(getBlockType())) {
         list.add(new ItemStack((Block)this, 1, blockflower$enumflowertype.getMeta()));
       }
     }
 
     
     public void updateTick(World world, BlockPos pos, IBlockState state, Random random) {
       int x = pos.getX();
       int y = pos.getY();
       int z = pos.getZ();
       BlockCustomFlower blockCustomFlower = this;
       
       HashMap<String, Object> $_dependencies = new HashMap<>();
       $_dependencies.put("x", Integer.valueOf(x));
       $_dependencies.put("y", Integer.valueOf(y));
       $_dependencies.put("z", Integer.valueOf(z));
       $_dependencies.put("world", world);
       MCreatorBlueberrybushstage0UpdateTick.executeProcedure($_dependencies);
     }
 
 
     
     public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer entity, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ) {
       int x = pos.getX();
       int y = pos.getY();
       int z = pos.getZ();
       BlockCustomFlower blockCustomFlower = this;
       
       HashMap<String, Object> $_dependencies = new HashMap<>();
       $_dependencies.put("entity", entity);
       $_dependencies.put("x", Integer.valueOf(x));
       $_dependencies.put("y", Integer.valueOf(y));
       $_dependencies.put("z", Integer.valueOf(z));
       $_dependencies.put("world", world);
       MCreatorBlueberrybushstage0OnBlockRightclicked.executeProcedure($_dependencies);
       
       return true;
     }
 
     
     public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
       drops.add(new ItemStack(Blocks.AIR, 1));
     }
   }
 }


/* Location:              H:\eclipse-workspace-19\BiomesYouGo1.7.1-deobf.jar!\net\mcreator\byg\MCreatorBlueberrybushstage0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */