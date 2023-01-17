 package net.potionstudios.byg;
 
 import java.util.HashMap;
 import net.minecraft.entity.Entity;
 import net.minecraft.entity.EntityLivingBase;
 import net.minecraft.init.MobEffects;
 import net.minecraft.potion.PotionEffect;
 
 @Elementsbyg.ModElement.Tag
 public class PoisionIvyProcedue
   extends Elementsbyg.ModElement {
   public PoisionIvyProcedue(Elementsbyg instance) {
     super(instance, 459);
   }
   
   public static void executeProcedure(HashMap<String, Object> dependencies) {
     if (dependencies.get("entity") == null) {
       System.err.println("Failed to load dependency entity for procedure PoisionIvyProcedue!");
       return;
     } 
     Entity entity = (Entity)dependencies.get("entity");
     if (entity instanceof EntityLivingBase)
       ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(MobEffects.POISON, 300, 1, true, false)); 
   }
 }


/* Location:              H:\eclipse-workspace-19\BiomesYouGo1.7.1-deobf.jar!\net\mcreator\byg\PoisionIvyProcedue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */