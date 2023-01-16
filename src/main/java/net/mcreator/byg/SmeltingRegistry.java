 package net.mcreator.byg;
 
 import net.minecraft.block.state.IBlockState;
 import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
 import net.minecraft.item.ItemStack;
 import net.minecraftforge.client.event.ModelRegistryEvent;
 import net.minecraftforge.client.model.ModelLoader;
 import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
 import net.minecraftforge.fml.relauncher.Side;
 import net.minecraftforge.fml.relauncher.SideOnly;
 import net.minecraftforge.oredict.OreDictionary;
 
 @Elementsbyg.ModElement.Tag
public class SmeltingRegistry 
extends Elementsbyg.ModElement {
	 public SmeltingRegistry(Elementsbyg instance) {
		  super(instance, 2420);
		}
	 
	   public void init(FMLInitializationEvent event) {
		     GameRegistry.addSmelting(new ItemStack(MCreatorKasaiore.block, 1), new ItemStack(MCreatorKasaiingot.block, 1), 1.0F);
		   }
}
