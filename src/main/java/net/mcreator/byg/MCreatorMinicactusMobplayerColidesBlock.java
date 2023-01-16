 package net.mcreator.byg;
 
 import java.util.HashMap;
 import net.minecraft.entity.Entity;
 import net.minecraft.util.DamageSource;
 
 @Elementsbyg.ModElement.Tag
 public class MCreatorMinicactusMobplayerColidesBlock
   extends Elementsbyg.ModElement {
   public MCreatorMinicactusMobplayerColidesBlock(Elementsbyg instance) {
     super(instance, 850);
   }
   
   public static void executeProcedure(HashMap<String, Object> dependencies) {
     if (dependencies.get("entity") == null) {
       System.err.println("Failed to load dependency entity for procedure MCreatorMinicactusMobplayerColidesBlock!");
       return;
     } 
     Entity entity = (Entity)dependencies.get("entity");
     entity.attackEntityFrom(DamageSource.GENERIC, 1.0F);
   }
 }


/* Location:              H:\eclipse-workspace-19\BiomesYouGo1.7.1-deobf.jar!\net\mcreator\byg\MCreatorMinicactusMobplayerColidesBlock.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */