 package net.mcreator.byg;
 
 import java.util.HashMap;
 import java.util.Set;
 import net.minecraft.client.renderer.block.model.ModelResourceLocation;
 import net.minecraft.item.Item;
 import net.minecraft.item.ItemPickaxe;
 import net.minecraft.item.ItemStack;
 import net.minecraftforge.client.event.ModelRegistryEvent;
 import net.minecraftforge.client.model.ModelLoader;
 import net.minecraftforge.common.util.EnumHelper;
 import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
 import net.minecraftforge.fml.relauncher.Side;
 import net.minecraftforge.fml.relauncher.SideOnly;
 
 @Elementsbyg.ModElement.Tag
 public class MCreatorKasaipickaxe
   extends Elementsbyg.ModElement
 {
   @ObjectHolder("byg:kasaipickaxe")
   public static final Item block = null;
   
   public MCreatorKasaipickaxe(Elementsbyg instance) {
     super(instance, 684);
   }
 
   
   public void initElements() {
     this.elements.items.add(() -> ((Item)(new ItemPickaxe(EnumHelper.addToolMaterial("KASAIPICKAXE", 6, 1800, 10.0F, 2.0F, 10)) {
           public Set<String> getToolClasses(ItemStack stack) {
             HashMap<String, Object> ret = new HashMap<>();
             ret.put("pickaxe", Integer.valueOf(6));
             return ret.keySet();
           }
         }).setUnlocalizedName("kasaipickaxe").setRegistryName("kasaipickaxe")).setCreativeTab(MCreatorBYG.tab));
   }
 
   
   @SideOnly(Side.CLIENT)
   public void registerModels(ModelRegistryEvent event) {
     ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("byg:kasaipickaxe", "inventory"));
   }
 }


/* Location:              H:\eclipse-workspace-19\BiomesYouGo1.7.1-deobf.jar!\net\mcreator\byg\MCreatorKasaipickaxe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */