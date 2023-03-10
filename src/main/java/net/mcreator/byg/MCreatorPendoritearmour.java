 package net.mcreator.byg;
 
 import net.minecraft.client.renderer.block.model.ModelResourceLocation;
 import net.minecraft.inventory.EntityEquipmentSlot;
 import net.minecraft.item.Item;
 import net.minecraft.item.ItemArmor;
 import net.minecraftforge.client.event.ModelRegistryEvent;
 import net.minecraftforge.client.model.ModelLoader;
 import net.minecraftforge.common.util.EnumHelper;
 import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
 import net.minecraftforge.fml.relauncher.Side;
 import net.minecraftforge.fml.relauncher.SideOnly;
 
 @Elementsbyg.ModElement.Tag
 public class MCreatorPendoritearmour
   extends Elementsbyg.ModElement {
   @ObjectHolder("byg:pendoritearmourhelmet")
   public static final Item helmet = null;
   @ObjectHolder("byg:pendoritearmourbody")
   public static final Item body = null;
   @ObjectHolder("byg:pendoritearmourlegs")
   public static final Item legs = null;
   @ObjectHolder("byg:pendoritearmourboots")
   public static final Item boots = null;
   
   public MCreatorPendoritearmour(Elementsbyg instance) {
     super(instance, 522);
   }
 
   
   public void initElements() {
     ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("PENDORITEARMOUR", "byg:pandorite_", 25, new int[] { 2, 2, 4, 2 }, 15, null, 1.0F);
     this.elements.items.add(() -> ((Item)(new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD)).setUnlocalizedName("pendoritearmourhelmet").setRegistryName("pendoritearmourhelmet")).setCreativeTab(MCreatorBYG.tab));
     
     this.elements.items.add(() -> ((Item)(new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST)).setUnlocalizedName("pendoritearmourbody").setRegistryName("pendoritearmourbody")).setCreativeTab(MCreatorBYG.tab));
     
     this.elements.items.add(() -> ((Item)(new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS)).setUnlocalizedName("pendoritearmourlegs").setRegistryName("pendoritearmourlegs")).setCreativeTab(MCreatorBYG.tab));
     
     this.elements.items.add(() -> ((Item)(new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET)).setUnlocalizedName("pendoritearmourboots").setRegistryName("pendoritearmourboots")).setCreativeTab(MCreatorBYG.tab));
   }
 
 
   
   @SideOnly(Side.CLIENT)
   public void registerModels(ModelRegistryEvent event) {
     ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("byg:pendoritearmourhelmet", "inventory"));
     ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("byg:pendoritearmourbody", "inventory"));
     ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("byg:pendoritearmourlegs", "inventory"));
     ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("byg:pendoritearmourboots", "inventory"));
   }
 }


/* Location:              H:\eclipse-workspace-19\BiomesYouGo1.7.1-deobf.jar!\net\mcreator\byg\MCreatorPendoritearmour.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */