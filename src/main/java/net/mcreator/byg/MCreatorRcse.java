 package net.mcreator.byg;
 
 import net.minecraft.init.Items;
 import net.minecraft.item.ItemStack;
 import net.minecraftforge.fml.common.event.FMLInitializationEvent;
 import net.minecraftforge.fml.common.registry.GameRegistry;
 
 @Elementsbyg.ModElement.Tag
 public class MCreatorRcse
   extends Elementsbyg.ModElement {
   public MCreatorRcse(Elementsbyg instance) {
     super(instance, 156);
   }
 
   
   public void init(FMLInitializationEvent event) {
     GameRegistry.addSmelting(new ItemStack(Items.SPIDER_EYE, 1), new ItemStack(MCreatorCookedspidereye.block, 1), 1.0F);
   }
 }


/* Location:              H:\eclipse-workspace-19\BiomesYouGo1.7.1-deobf.jar!\net\mcreator\byg\MCreatorRcse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */