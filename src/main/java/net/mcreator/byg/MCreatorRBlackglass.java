 package net.mcreator.byg;
 
 import net.minecraft.block.Block;
 import net.minecraft.init.Blocks;
 import net.minecraft.item.ItemStack;
 import net.minecraftforge.fml.common.event.FMLInitializationEvent;
 import net.minecraftforge.fml.common.registry.GameRegistry;
 
 @Elementsbyg.ModElement.Tag
 public class MCreatorRBlackglass extends Elementsbyg.ModElement {
   public MCreatorRBlackglass(Elementsbyg instance) {
     super(instance, 508);
   }
 
   
   public void init(FMLInitializationEvent event) {
     GameRegistry.addSmelting(new ItemStack(MCreatorBlacksand.block, 1), new ItemStack((Block)Blocks.STAINED_GLASS, 1, 15), 1.0F);
   }
 }


/* Location:              H:\eclipse-workspace-19\BiomesYouGo1.7.1-deobf.jar!\net\mcreator\byg\MCreatorRBlackglass.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */