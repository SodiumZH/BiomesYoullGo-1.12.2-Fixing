 package net.potionstudios.byg;
 
 import java.util.HashMap;
 import net.minecraft.client.renderer.block.model.ModelResourceLocation;
 import net.minecraft.creativetab.CreativeTabs;
 import net.minecraft.entity.player.EntityPlayer;
 import net.minecraft.item.EnumAction;
 import net.minecraft.item.Item;
 import net.minecraft.item.ItemFood;
 import net.minecraft.item.ItemStack;
 import net.minecraft.world.World;
 import net.minecraftforge.client.event.ModelRegistryEvent;
 import net.minecraftforge.client.model.ModelLoader;
 import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
 import net.minecraftforge.fml.relauncher.Side;
 import net.minecraftforge.fml.relauncher.SideOnly;
 
 @Elementsbyg.ModElement.Tag
 public class Spidereyesoup
   extends Elementsbyg.ModElement
 {
   @ObjectHolder("byg:spidereyesoup")
   public static final Item block = null;
   
   public Spidereyesoup(Elementsbyg instance) {
     super(instance, 151);
   }
 
   
   public void initElements() {
     this.elements.items.add(() -> new ItemFoodCustom());
   }
 
   
   @SideOnly(Side.CLIENT)
   public void registerModels(ModelRegistryEvent event) {
     ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("byg:spidereyesoup", "inventory"));
   }
   
   public static class ItemFoodCustom extends ItemFood {
     public ItemFoodCustom() {
       super(10, 0.3F, false);
       setUnlocalizedName("spidereyesoup");
       setRegistryName("spidereyesoup");
       setCreativeTab(CreativeTabs.FOOD);
       setMaxStackSize(64);
     }
 
     
     public EnumAction getItemUseAction(ItemStack par1ItemStack) {
       return EnumAction.DRINK;
     }
 
     
     protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer entity) {
       super.onFoodEaten(itemStack, world, entity);
       int x = (int)entity.posX;
       int y = (int)entity.posY;
       int z = (int)entity.posZ;
       
       HashMap<String, Object> $_dependencies = new HashMap<>();
       $_dependencies.put("entity", entity);
       Pbowl.executeProcedure($_dependencies);
     }
   }
 }



