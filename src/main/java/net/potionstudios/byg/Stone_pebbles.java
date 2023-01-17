 package net.potionstudios.byg;
 import javax.annotation.Nullable;
 import net.minecraft.block.Block;
 import net.minecraft.block.BlockHorizontal;
 import net.minecraft.block.SoundType;
 import net.minecraft.block.material.MapColor;
 import net.minecraft.block.material.Material;
 import net.minecraft.block.properties.IProperty;
 import net.minecraft.block.properties.PropertyDirection;
 import net.minecraft.block.state.BlockStateContainer;
 import net.minecraft.block.state.IBlockState;
 import net.minecraft.client.renderer.block.model.ModelResourceLocation;
 import net.minecraft.entity.EntityLivingBase;
 import net.minecraft.entity.player.EntityPlayer;
 import net.minecraft.init.Blocks;
 import net.minecraft.item.Item;
 import net.minecraft.item.ItemBlock;
 import net.minecraft.item.ItemStack;
 import net.minecraft.util.BlockRenderLayer;
 import net.minecraft.util.EnumFacing;
 import net.minecraft.util.NonNullList;
 import net.minecraft.util.math.AxisAlignedBB;
 import net.minecraft.util.math.BlockPos;
 import net.minecraft.world.IBlockAccess;
 import net.minecraft.world.World;
 import net.minecraftforge.client.event.ModelRegistryEvent;
 import net.minecraftforge.client.model.ModelLoader;
 import net.minecraftforge.fml.common.event.FMLInitializationEvent;
 import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
 import net.minecraftforge.fml.relauncher.Side;
 import net.minecraftforge.fml.relauncher.SideOnly;
 import net.minecraftforge.oredict.OreDictionary;
 
 @Elementsbyg.ModElement.Tag
 public class Stone_pebbles extends Elementsbyg.ModElement {
   @ObjectHolder("byg:stone_pebbles")
   public static final Block block = null;
   
   public Stone_pebbles(Elementsbyg instance) {
     super(instance, 2374);
   }
 
   
   public void initElements() {
     this.elements.blocks.add(() -> new BlockCustom());
     this.elements.items.add(() -> (Item)(new ItemBlock(block)).setRegistryName(block.getRegistryName()));
   }
 
   
   public void init(FMLInitializationEvent event) {
     OreDictionary.registerOre("stonePebble", block);
   }
 
   
   @SideOnly(Side.CLIENT)
   public void registerModels(ModelRegistryEvent event) {
     ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("byg:stone_pebbles", "inventory"));
   }
   
   public static class BlockCustom extends Block {
     public static final PropertyDirection FACING = BlockHorizontal.FACING;
     
     public BlockCustom() {
       super(Material.ROCK);
       setRegistryName("stone_pebbles");
       setUnlocalizedName("stone_pebbles");
       setSoundType(SoundType.STONE);
       setHarvestLevel("pickaxe", 1);
       setHardness(0.8F);
       setResistance(10.0F);
       setLightLevel(0.0F);
       setLightOpacity(0);
       setCreativeTab(BYGTab.tab);
       setDefaultState(this.blockState.getBaseState().withProperty((IProperty)FACING, (Comparable)EnumFacing.NORTH));
     }
 
     
     @SideOnly(Side.CLIENT)
     public BlockRenderLayer getBlockLayer() {
       return BlockRenderLayer.CUTOUT_MIPPED;
     }
 
     
     @Nullable
     public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
       return NULL_AABB;
     }
 
     
     public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {
       return true;
     }
 
     
     public boolean isFullCube(IBlockState state) {
       return false;
     }
 
     
     public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
       switch ((EnumFacing)state.getValue((IProperty)BlockHorizontal.FACING))
       
       { 
         
         default:
           return new AxisAlignedBB(1.0D, 0.0D, 1.0D, 0.0D, 0.3D, 0.0D);
         case NORTH:
           return new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.3D, 1.0D);
         case WEST:
           return new AxisAlignedBB(0.0D, 0.0D, 1.0D, 1.0D, 0.3D, 0.0D);
         case EAST:
           break; }  return new AxisAlignedBB(1.0D, 0.0D, 0.0D, 0.0D, 0.3D, 1.0D);
     }
 
 
     
     protected BlockStateContainer createBlockState() {
       return new BlockStateContainer(this, new IProperty[] { (IProperty)FACING });
     }
 
     
     public IBlockState getStateFromMeta(int meta) {
       return getDefaultState().withProperty((IProperty)FACING, (Comparable)EnumFacing.getFront(meta));
     }
 
     
     public int getMetaFromState(IBlockState state) {
       return ((EnumFacing)state.getValue((IProperty)FACING)).getIndex();
     }
 
 
     
     public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
       return getDefaultState().withProperty((IProperty)FACING, (Comparable)placer.getHorizontalFacing().getOpposite());
     }
 
     
     public boolean isOpaqueCube(IBlockState state) {
       return false;
     }
 
     
     public MapColor getMapColor(IBlockState state, IBlockAccess blockAccess, BlockPos pos) {
       return MapColor.STONE;
     }
 
     
     public boolean canSilkHarvest(World world, BlockPos pos, IBlockState state, EntityPlayer player) {
       return false;
     }
 
     
     public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
       drops.add(new ItemStack(Blocks.COBBLESTONE, 1));
     }
   }
 }


/* Location:              H:\eclipse-workspace-19\BiomesYouGo1.7.1-deobf.jar!\net\mcreator\byg\Stone_pebbles.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */