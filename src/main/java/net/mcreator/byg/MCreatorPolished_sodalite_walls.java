 package net.mcreator.byg;
 
 import net.minecraft.block.Block;
 import net.minecraft.block.BlockWall;
 import net.minecraft.block.SoundType;
 import net.minecraft.block.material.Material;
 import net.minecraft.block.state.IBlockState;
 import net.minecraft.client.renderer.block.model.ModelResourceLocation;
 import net.minecraft.creativetab.CreativeTabs;
 import net.minecraft.item.Item;
 import net.minecraft.item.ItemBlock;
 import net.minecraft.item.ItemStack;
 import net.minecraft.util.BlockRenderLayer;
 import net.minecraft.util.NonNullList;
 import net.minecraftforge.client.event.ModelRegistryEvent;
 import net.minecraftforge.client.model.ModelLoader;
 import net.minecraftforge.fml.common.event.FMLInitializationEvent;
 import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
 import net.minecraftforge.fml.relauncher.Side;
 import net.minecraftforge.fml.relauncher.SideOnly;
 import net.minecraftforge.oredict.OreDictionary;
 
 @Elementsbyg.ModElement.Tag
 public class MCreatorPolished_sodalite_walls
   extends Elementsbyg.ModElement {
   @ObjectHolder("byg:polished_sodalite_walls")
   public static final Block block = null;
   
   public MCreatorPolished_sodalite_walls(Elementsbyg instance) {
     super(instance, 1747);
   }
 
   
   public void initElements() {
     this.elements.blocks.add(() -> new BlockCustom());
     this.elements.items.add(() -> (Item)(new ItemBlock(block)).setRegistryName(block.getRegistryName()));
   }
 
   
   public void init(FMLInitializationEvent event) {
     OreDictionary.registerOre("wallsSodaLitePolished", block);
   }
 
   
   @SideOnly(Side.CLIENT)
   public void registerModels(ModelRegistryEvent event) {
     ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("byg:polished_sodalite_walls", "inventory"));
   }
   
   public static class BlockCustom
     extends BlockWall {
     public BlockCustom() {
       super(new Block(Material.ROCK));
       setRegistryName("polished_sodalite_walls");
       setUnlocalizedName("polished_sodalite_walls");
       setSoundType(SoundType.STONE);
       setHarvestLevel("pickaxe", 1);
       setHardness(1.5F);
       setResistance(30.0F);
       setLightLevel(0.0F);
       setLightOpacity(0);
       setCreativeTab(MCreatorBYG.tab);
     }
 
     
     public void getSubBlocks(CreativeTabs tab, NonNullList<ItemStack> items) {
       items.add(new ItemStack((Block)this));
     }
 
     
     @SideOnly(Side.CLIENT)
     public BlockRenderLayer getBlockLayer() {
       return BlockRenderLayer.CUTOUT_MIPPED;
     }
 
     
     public boolean isOpaqueCube(IBlockState state) {
       return false;
     }
   }
 }


/* Location:              H:\eclipse-workspace-19\BiomesYouGo1.7.1-deobf.jar!\net\mcreator\byg\MCreatorPolished_sodalite_walls.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */