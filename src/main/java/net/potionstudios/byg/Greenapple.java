 package net.potionstudios.byg;
 
 import net.minecraft.client.renderer.block.model.ModelResourceLocation;
 import net.minecraft.creativetab.CreativeTabs;
 import net.minecraft.item.EnumAction;
 import net.minecraft.item.Item;
 import net.minecraft.item.ItemFood;
 import net.minecraft.item.ItemStack;
 import net.minecraftforge.client.event.ModelRegistryEvent;
 import net.minecraftforge.client.model.ModelLoader;
 import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
 import net.minecraftforge.fml.relauncher.Side;
 import net.minecraftforge.fml.relauncher.SideOnly;
 
 @Elementsbyg.ModElement.Tag
 public class Greenapple
   extends Elementsbyg.ModElement {
   @ObjectHolder("byg:greenapple")
   public static final Item block = null;
   
   public Greenapple(Elementsbyg instance) {
     super(instance, 126);
   }
 
   
   public void initElements() {
     this.elements.items.add(() -> new ItemFoodCustom());
   }
 
   
   @SideOnly(Side.CLIENT)
   public void registerModels(ModelRegistryEvent event) {
     ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("byg:greenapple", "inventory"));
   }
   
   public static class ItemFoodCustom extends ItemFood {
     public ItemFoodCustom() {
       super(6, 0.3F, false);
       setUnlocalizedName("greenapple");
       setRegistryName("greenapple");
       setAlwaysEdible();
       setCreativeTab(CreativeTabs.FOOD);
       setMaxStackSize(64);
     }
 
     
     public EnumAction getItemUseAction(ItemStack par1ItemStack) {
       return EnumAction.EAT;
     }
   }
 }


/* Location:              H:\eclipse-workspace-19\BiomesYouGo1.7.1-deobf.jar!\net\mcreator\byg\Greenapple.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */