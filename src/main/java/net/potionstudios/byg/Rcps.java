 package net.potionstudios.byg;
 
 import net.minecraft.init.Items;
 import net.minecraft.item.ItemStack;
 import net.minecraftforge.fml.common.event.FMLInitializationEvent;
 import net.minecraftforge.fml.common.registry.GameRegistry;
 
 @Elementsbyg.ModElement.Tag
 public class Rcps
   extends Elementsbyg.ModElement {
   public Rcps(Elementsbyg instance) {
     super(instance, 172);
   }
 
   
   public void init(FMLInitializationEvent event) {
     GameRegistry.addSmelting(new ItemStack(Items.PUMPKIN_SEEDS, 1), new ItemStack(Cookedpumpkinseeds.block, 1), 1.0F);
   }
 }


/* Location:              H:\eclipse-workspace-19\BiomesYouGo1.7.1-deobf.jar!\net\mcreator\byg\Rcps.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */