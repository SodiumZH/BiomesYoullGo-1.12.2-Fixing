 package net.mcreator.byg;
 
 import java.util.HashMap;
 import net.minecraft.block.state.IBlockState;
 import net.minecraft.client.renderer.block.model.ModelResourceLocation;
 import net.minecraft.entity.player.EntityPlayer;
 import net.minecraft.item.Item;
 import net.minecraft.item.ItemStack;
 import net.minecraft.util.EnumActionResult;
 import net.minecraft.util.EnumFacing;
 import net.minecraft.util.EnumHand;
 import net.minecraft.util.math.BlockPos;
 import net.minecraft.world.World;
 import net.minecraftforge.client.event.ModelRegistryEvent;
 import net.minecraftforge.client.model.ModelLoader;
 import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
 import net.minecraftforge.fml.relauncher.Side;
 import net.minecraftforge.fml.relauncher.SideOnly;
 
 @Elementsbyg.ModElement.Tag
 public class MCreatorMaple_door
   extends Elementsbyg.ModElement
 {
   @ObjectHolder("byg:maple_door")
   public static final Item block = null;
   
   public MCreatorMaple_door(Elementsbyg instance) {
     super(instance, 1805);
   }
 
   
   public void initElements() {
     this.elements.items.add(() -> new ItemCustom());
   }
 
   
   @SideOnly(Side.CLIENT)
   public void registerModels(ModelRegistryEvent event) {
     ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("byg:maple_door", "inventory"));
   }
   
   public static class ItemCustom extends Item {
     public ItemCustom() {
       setMaxDamage(0);
       this.maxStackSize = 64;
       setUnlocalizedName("maple_door");
       setRegistryName("maple_door");
       setCreativeTab(MCreatorBYG.tab);
     }
 
     
     public int getItemEnchantability() {
       return 0;
     }
 
     
     public int getMaxItemUseDuration(ItemStack itemstack) {
       return 0;
     }
 
     
     public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
       return 1.0F;
     }
 
 
     
     public EnumActionResult onItemUseFirst(EntityPlayer entity, World world, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ, EnumHand hand) {
       ItemStack itemstack = entity.getHeldItem(hand);
       int x = pos.getX();
       int y = pos.getY();
       int z = pos.getZ();
       
       HashMap<String, Object> $_dependencies = new HashMap<>();
       $_dependencies.put("entity", entity);
       $_dependencies.put("x", Integer.valueOf(x));
       $_dependencies.put("y", Integer.valueOf(y));
       $_dependencies.put("z", Integer.valueOf(z));
       $_dependencies.put("world", world);
       MCreatorMapledoorRightClickedOnBlock.executeProcedure($_dependencies);
       
       return EnumActionResult.PASS;
     }
   }
 }


/* Location:              H:\eclipse-workspace-19\BiomesYouGo1.7.1-deobf.jar!\net\mcreator\byg\MCreatorMaple_door.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */