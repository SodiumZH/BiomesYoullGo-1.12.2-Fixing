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
 public class MCreatorLathariumpickaxe
   extends Elementsbyg.ModElement
 {
   @ObjectHolder("byg:lathariumpickaxe")
   public static final Item block = null;
   
   public MCreatorLathariumpickaxe(Elementsbyg instance) {
     super(instance, 934);
   }
 
   
   public void initElements() {
     this.elements.items.add(() -> ((Item)(new ItemPickaxe(EnumHelper.addToolMaterial("LATHARIUMPICKAXE", 7, 950, 9.0F, 2.0F, 8)) {
           public Set<String> getToolClasses(ItemStack stack) {
             HashMap<String, Object> ret = new HashMap<>();
             ret.put("pickaxe", Integer.valueOf(7));
             return ret.keySet();
           }
         }).setUnlocalizedName("lathariumpickaxe").setRegistryName("lathariumpickaxe")).setCreativeTab(MCreatorBYG.tab));
   }
 
   
   @SideOnly(Side.CLIENT)
   public void registerModels(ModelRegistryEvent event) {
     ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("byg:lathariumpickaxe", "inventory"));
   }
 }


/* Location:              H:\eclipse-workspace-19\BiomesYouGo1.7.1-deobf.jar!\net\mcreator\byg\MCreatorLathariumpickaxe.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */