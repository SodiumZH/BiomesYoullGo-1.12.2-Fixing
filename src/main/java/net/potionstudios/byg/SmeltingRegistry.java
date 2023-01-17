 package net.potionstudios.byg;
 
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
		     GameRegistry.addSmelting(new ItemStack(Kasaiore.block, 1), new ItemStack(Kasaiingot.block, 1), 1.0F);
		     GameRegistry.addSmelting(new ItemStack(Lathariumore.block, 1), new ItemStack(Lathariumgem.block, 1), 1.0F);
		     GameRegistry.addSmelting(new ItemStack(Pendoriteore.block, 1), new ItemStack(Pendoritegem.block, 1), 1.0F);
		     GameRegistry.addSmelting(new ItemStack(Tamreliteore.block, 1), new ItemStack(Tamrelitegem.block, 1), 1.0F);
		   }
}
