 package net.mcreator.byg;
 
 import net.minecraft.block.Block;
 import net.minecraft.block.SoundType;
 import net.minecraft.block.material.Material;
 import net.minecraft.block.state.IBlockState;
 import net.minecraft.client.renderer.block.model.ModelResourceLocation;
 import net.minecraft.entity.player.EntityPlayer;
 import net.minecraft.item.Item;
 import net.minecraft.item.ItemBlock;
 import net.minecraft.util.math.BlockPos;
 import net.minecraft.world.World;
 import net.minecraftforge.client.event.ModelRegistryEvent;
 import net.minecraftforge.client.model.ModelLoader;
 import net.minecraftforge.fml.common.event.FMLInitializationEvent;
 import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
 import net.minecraftforge.fml.relauncher.Side;
 import net.minecraftforge.fml.relauncher.SideOnly;
 import net.minecraftforge.oredict.OreDictionary;
 
 @Elementsbyg.ModElement.Tag
 public class MCreatorHardeneddirt
   extends Elementsbyg.ModElement {
   @ObjectHolder("byg:hardeneddirt")
   public static final Block block = null;
   
   public MCreatorHardeneddirt(Elementsbyg instance) {
     super(instance, 1071);
   }
 
   
   public void initElements() {
     this.elements.blocks.add(() -> new BlockCustom());
     this.elements.items.add(() -> (Item)(new ItemBlock(block)).setRegistryName(block.getRegistryName()));
   }
 
   
   public void init(FMLInitializationEvent event) {
     OreDictionary.registerOre("dirt", block);
   }
 
   
   @SideOnly(Side.CLIENT)
   public void registerModels(ModelRegistryEvent event) {
     ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("byg:hardeneddirt", "inventory"));
   }
   
   public static class BlockCustom extends Block {
     public BlockCustom() {
       super(Material.ROCK);
       setRegistryName("hardeneddirt");
       setUnlocalizedName("hardeneddirt");
       setSoundType(SoundType.GROUND);
       setHarvestLevel("pickaxe", 1);
       setHardness(1.8F);
       setResistance(10.0F);
       setLightLevel(0.0F);
       setLightOpacity(255);
       setCreativeTab(MCreatorBYG.tab);
     }
 
     
     public boolean canSilkHarvest(World world, BlockPos pos, IBlockState state, EntityPlayer player) {
       return false;
     }
   }
 }


/* Location:              H:\eclipse-workspace-19\BiomesYouGo1.7.1-deobf.jar!\net\mcreator\byg\MCreatorHardeneddirt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */