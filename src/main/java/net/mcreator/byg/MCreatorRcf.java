 package net.mcreator.byg;
 
 import net.minecraft.init.Items;
 import net.minecraft.item.ItemStack;
 import net.minecraftforge.fml.common.event.FMLInitializationEvent;
 import net.minecraftforge.fml.common.registry.GameRegistry;
 
 @Elementsbyg.ModElement.Tag
 public class MCreatorRcf
   extends Elementsbyg.ModElement {
   public MCreatorRcf(Elementsbyg instance) {
     super(instance, 155);
   }
 
   
   public void init(FMLInitializationEvent event) {
     GameRegistry.addSmelting(new ItemStack(Items.ROTTEN_FLESH, 1), new ItemStack(MCreatorCookedflesh.block, 1), 1.0F);
   }
 }


/* Location:              H:\eclipse-workspace-19\BiomesYouGo1.7.1-deobf.jar!\net\mcreator\byg\MCreatorRcf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */