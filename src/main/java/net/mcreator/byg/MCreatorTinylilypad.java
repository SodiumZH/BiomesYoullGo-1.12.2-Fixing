 package net.mcreator.byg;
 
 import java.util.HashMap;
 import java.util.Random;
 import net.minecraft.block.Block;
 import net.minecraft.block.SoundType;
 import net.minecraft.block.material.Material;
 import net.minecraft.block.state.IBlockState;
 import net.minecraft.client.renderer.block.model.ModelResourceLocation;
 import net.minecraft.entity.player.EntityPlayer;
 import net.minecraft.item.Item;
 import net.minecraft.item.ItemBlock;
 import net.minecraft.util.BlockRenderLayer;
 import net.minecraft.util.EnumFacing;
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
 public class MCreatorTinylilypad
   extends Elementsbyg.ModElement
 {
   @ObjectHolder("byg:tinylilypad")
   public static final Block block = null;
   
   public MCreatorTinylilypad(Elementsbyg instance) {
     super(instance, 93);
   }
 
   
   public void initElements() {
     this.elements.blocks.add(() -> new BlockCustom());
     this.elements.items.add(() -> (Item)(new ItemBlock(block)).setRegistryName(block.getRegistryName()));
   }
 
   
   public void init(FMLInitializationEvent event) {
     OreDictionary.registerOre("lilypad", block);
   }
 
   
   @SideOnly(Side.CLIENT)
   public void registerModels(ModelRegistryEvent event) {
     ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("byg:tinylilypad", "inventory"));
   }
   
   public static class BlockCustom extends Block {
     public BlockCustom() {
       super(Material.CORAL);
       setRegistryName("tinylilypad");
       setUnlocalizedName("tinylilypad");
       setSoundType(SoundType.PLANT);
       setHarvestLevel("axe", 0);
       setHardness(0.01F);
       setResistance(1.0F);
       setLightLevel(0.0F);
       setLightOpacity(0);
       setCreativeTab(MCreatorBYG.tab);
     }
 
     
     @SideOnly(Side.CLIENT)
     public BlockRenderLayer getBlockLayer() {
       return BlockRenderLayer.CUTOUT_MIPPED;
     }
 
     
     public boolean isFullCube(IBlockState state) {
       return false;
     }
 
     
     public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
       return new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.1D, 1.0D);
     }
 
     
     public boolean isOpaqueCube(IBlockState state) {
       return false;
     }
 
     
     public boolean isFlammable(IBlockAccess blockAccess, BlockPos pos, EnumFacing face) {
       return true;
     }
 
     
     public boolean canSilkHarvest(World world, BlockPos pos, IBlockState state, EntityPlayer player) {
       return false;
     }
 
     
     public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
       super.onBlockAdded(world, pos, state);
       int x = pos.getX();
       int y = pos.getY();
       int z = pos.getZ();
       Block block = this;
       world.scheduleUpdate(new BlockPos(x, y, z), this, tickRate(world));
     }
 
     
     public void updateTick(World world, BlockPos pos, IBlockState state, Random random) {
       super.updateTick(world, pos, state, random);
       int x = pos.getX();
       int y = pos.getY();
       int z = pos.getZ();
       Block block = this;
       
       HashMap<String, Object> $_dependencies = new HashMap<>();
       $_dependencies.put("x", Integer.valueOf(x));
       $_dependencies.put("y", Integer.valueOf(y));
       $_dependencies.put("z", Integer.valueOf(z));
       $_dependencies.put("world", world);
       MCreatorTinylilypadUpdateTick.executeProcedure($_dependencies);
       
       world.scheduleUpdate(new BlockPos(x, y, z), this, tickRate(world));
     }
   }
 }


/* Location:              H:\eclipse-workspace-19\BiomesYouGo1.7.1-deobf.jar!\net\mcreator\byg\MCreatorTinylilypad.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */