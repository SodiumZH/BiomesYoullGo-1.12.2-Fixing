 package net.mcreator.byg;
 
 import java.util.HashMap;
 import net.minecraft.entity.Entity;
 import net.minecraft.entity.player.EntityPlayer;
 import net.minecraft.init.Items;
 import net.minecraft.item.ItemStack;
 import net.minecraftforge.items.ItemHandlerHelper;
 
 @Elementsbyg.ModElement.Tag
 public class MCreatorPglassbottle
   extends Elementsbyg.ModElement
 {
   public MCreatorPglassbottle(Elementsbyg instance) {
     super(instance, 135);
   }
   
   public static void executeProcedure(HashMap<String, Object> dependencies) {
     if (dependencies.get("entity") == null) {
       System.err.println("Failed to load dependency entity for procedure MCreatorPglassbottle!");
       return;
     } 
     Entity entity = (Entity)dependencies.get("entity");
     if (entity instanceof EntityPlayer)
       ItemHandlerHelper.giveItemToPlayer((EntityPlayer)entity, new ItemStack(Items.GLASS_BOTTLE, 1)); 
   }
 }


/* Location:              H:\eclipse-workspace-19\BiomesYouGo1.7.1-deobf.jar!\net\mcreator\byg\MCreatorPglassbottle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */