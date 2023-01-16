 package net.mcreator.byg;
 
 import java.util.HashMap;
 import net.minecraft.entity.Entity;
 import net.minecraft.entity.EntityLivingBase;
 
 @Elementsbyg.ModElement.Tag
 public class MCreatorBaobabfruitFoodEaten
   extends Elementsbyg.ModElement {
   public MCreatorBaobabfruitFoodEaten(Elementsbyg instance) {
     super(instance, 973);
   }
   
   public static void executeProcedure(HashMap<String, Object> dependencies) {
     if (dependencies.get("entity") == null) {
       System.err.println("Failed to load dependency entity for procedure MCreatorBaobabfruitFoodEaten!");
       return;
     } 
     Entity entity = (Entity)dependencies.get("entity");
     if (entity instanceof EntityLivingBase)
       ((EntityLivingBase)entity).clearActivePotions(); 
   }
 }


/* Location:              H:\eclipse-workspace-19\BiomesYouGo1.7.1-deobf.jar!\net\mcreator\byg\MCreatorBaobabfruitFoodEaten.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */