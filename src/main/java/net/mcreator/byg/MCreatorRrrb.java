 package net.mcreator.byg;
 
 import net.minecraft.item.ItemStack;
 import net.minecraftforge.fml.common.event.FMLInitializationEvent;
 import net.minecraftforge.fml.common.registry.GameRegistry;
 
 @Elementsbyg.ModElement.Tag
 public class MCreatorRrrb
   extends Elementsbyg.ModElement {
   public MCreatorRrrb(Elementsbyg instance) {
     super(instance, 152);
   }
 
   
   public void init(FMLInitializationEvent event) {
     GameRegistry.addSmelting(new ItemStack(MCreatorRudobeans.block, 1), new ItemStack(MCreatorRudobeansroasted.block, 1), 1.0F);
   }
 }


/* Location:              H:\eclipse-workspace-19\BiomesYouGo1.7.1-deobf.jar!\net\mcreator\byg\MCreatorRrrb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */