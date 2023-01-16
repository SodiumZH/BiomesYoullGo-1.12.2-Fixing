 package net.mcreator.byg;
 
 import java.util.HashMap;
 import net.minecraft.entity.Entity;
 import net.minecraft.entity.player.EntityPlayer;
 import net.minecraft.init.Items;
 import net.minecraft.item.ItemStack;
 import net.minecraftforge.items.ItemHandlerHelper;
 
 @Elementsbyg.ModElement.Tag
 public class MCreatorPbowl
   extends Elementsbyg.ModElement
 {
   public MCreatorPbowl(Elementsbyg instance) {
     super(instance, 134);
   }
   
   public static void executeProcedure(HashMap<String, Object> dependencies) {
     if (dependencies.get("entity") == null) {
       System.err.println("Failed to load dependency entity for procedure MCreatorPbowl!");
       return;
     } 
     Entity entity = (Entity)dependencies.get("entity");
     if (entity instanceof EntityPlayer)
       ItemHandlerHelper.giveItemToPlayer((EntityPlayer)entity, new ItemStack(Items.BOWL, 1)); 
   }
 }


/* Location:              H:\eclipse-workspace-19\BiomesYouGo1.7.1-deobf.jar!\net\mcreator\byg\MCreatorPbowl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */