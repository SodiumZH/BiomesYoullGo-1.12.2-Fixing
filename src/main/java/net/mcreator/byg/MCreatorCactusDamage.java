 package net.mcreator.byg;
 
 import java.util.HashMap;
 import net.minecraft.entity.Entity;
 import net.minecraft.util.DamageSource;
 
 @Elementsbyg.ModElement.Tag
 public class MCreatorCactusDamage
   extends Elementsbyg.ModElement {
   public MCreatorCactusDamage(Elementsbyg instance) {
     super(instance, 457);
   }
   
   public static void executeProcedure(HashMap<String, Object> dependencies) {
     if (dependencies.get("entity") == null) {
       System.err.println("Failed to load dependency entity for procedure MCreatorCactusDamage!");
       return;
     } 
     Entity entity = (Entity)dependencies.get("entity");
     entity.attackEntityFrom(DamageSource.GENERIC, 1.0F);
   }
 }


/* Location:              H:\eclipse-workspace-19\BiomesYouGo1.7.1-deobf.jar!\net\mcreator\byg\MCreatorCactusDamage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */