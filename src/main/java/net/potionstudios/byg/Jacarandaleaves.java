 package net.potionstudios.byg;
 
 import java.util.HashMap;
 import java.util.Random;
 import net.minecraft.block.Block;
 import net.minecraft.block.SoundType;
 import net.minecraft.block.material.Material;
 import net.minecraft.block.state.IBlockState;
 import net.minecraft.client.renderer.block.model.ModelResourceLocation;
 import net.minecraft.entity.player.EntityPlayer;
 import net.minecraft.init.Blocks;
 import net.minecraft.item.Item;
 import net.minecraft.item.ItemBlock;
 import net.minecraft.item.ItemStack;
 import net.minecraft.util.BlockRenderLayer;
 import net.minecraft.util.EnumFacing;
 import net.minecraft.util.NonNullList;
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
 public class Jacarandaleaves
   extends Elementsbyg.ModElement
 {
   @ObjectHolder("byg:jacarandaleaves")
   public static final Block block = null;
   
   public Jacarandaleaves(Elementsbyg instance) {
     super(instance, 16);
   }
 
   
   public void initElements() {
     this.elements.blocks.add(() -> new BlockCustom());
     this.elements.items.add(() -> (Item)(new ItemBlock(block)).setRegistryName(block.getRegistryName()));
   }
 
   
   public void init(FMLInitializationEvent event) {
     OreDictionary.registerOre("treeLeaves", block);
   }
 
   
   @SideOnly(Side.CLIENT)
   public void registerModels(ModelRegistryEvent event) {
     ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("byg:jacarandaleaves", "inventory"));
   }
   
   public static class BlockCustom extends Block {
     public BlockCustom() {
       super(Material.LEAVES);
       setRegistryName("jacarandaleaves");
       setUnlocalizedName("jacarandaleaves");
       setSoundType(SoundType.PLANT);
       setHarvestLevel("axe", 0);
       setHardness(0.2F);
       setResistance(5.0F);
       setLightLevel(0.0F);
       setLightOpacity(1);
       setCreativeTab(BYGTab.tab);
     }
 
     
     @SideOnly(Side.CLIENT)
     public BlockRenderLayer getBlockLayer() {
       return BlockRenderLayer.CUTOUT_MIPPED;
     }
 
     
     public int tickRate(World world) {
       return 400;
     }
 
     
     public boolean isOpaqueCube(IBlockState state) {
       return false;
     }
 
     
     public boolean isFlammable(IBlockAccess blockAccess, BlockPos pos, EnumFacing face) {
       return true;
     }
 
     
     public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
       drops.add(new ItemStack(Blocks.AIR, 1));
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
       JacarandaleavesUpdateTick.executeProcedure($_dependencies);
       
       world.scheduleUpdate(new BlockPos(x, y, z), this, tickRate(world));
     }
 
     
     public boolean removedByPlayer(IBlockState state, World world, BlockPos pos, EntityPlayer entity, boolean willHarvest) {
       boolean retval = super.removedByPlayer(state, world, pos, entity, willHarvest);
       int x = pos.getX();
       int y = pos.getY();
       int z = pos.getZ();
       Block block = this;
       
       HashMap<String, Object> $_dependencies = new HashMap<>();
       $_dependencies.put("entity", entity);
       $_dependencies.put("x", Integer.valueOf(x));
       $_dependencies.put("y", Integer.valueOf(y));
       $_dependencies.put("z", Integer.valueOf(z));
       $_dependencies.put("world", world);
       JacarandaleavesBlockDestroyedByPlayer.executeProcedure($_dependencies);
       
       return retval;
     }
   }
 }



