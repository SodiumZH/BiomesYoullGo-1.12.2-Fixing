 package net.potionstudios.byg;
 
 import net.minecraft.init.Blocks;
 import net.minecraft.item.ItemStack;
 import net.minecraftforge.fml.common.event.FMLInitializationEvent;
 import net.minecraftforge.fml.common.registry.GameRegistry;
 
 @Elementsbyg.ModElement.Tag
 public class Robsidianingot
   extends Elementsbyg.ModElement {
   public Robsidianingot(Elementsbyg instance) {
     super(instance, 636);
   }
 
   
   public void init(FMLInitializationEvent event) {
     GameRegistry.addSmelting(new ItemStack(Blocks.OBSIDIAN, 1), new ItemStack(Obsidianingot.block, 1), 8.0F);
   }
 }


/* Location:              H:\eclipse-workspace-19\BiomesYouGo1.7.1-deobf.jar!\net\mcreator\byg\Robsidianingot.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */