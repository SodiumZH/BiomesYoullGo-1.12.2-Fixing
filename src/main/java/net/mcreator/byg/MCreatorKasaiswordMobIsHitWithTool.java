 package net.mcreator.byg;
 
 import java.util.HashMap;
 import net.minecraft.entity.Entity;
 
 @Elementsbyg.ModElement.Tag
 public class MCreatorKasaiswordMobIsHitWithTool
   extends Elementsbyg.ModElement {
   public MCreatorKasaiswordMobIsHitWithTool(Elementsbyg instance) {
     super(instance, 683);
   }
   
   public static void executeProcedure(HashMap<String, Object> dependencies) {
     if (dependencies.get("entity") == null) {
       System.err.println("Failed to load dependency entity for procedure MCreatorKasaiswordMobIsHitWithTool!");
       return;
     } 
     Entity entity = (Entity)dependencies.get("entity");
     entity.setFire(10);
   }
 }


/* Location:              H:\eclipse-workspace-19\BiomesYouGo1.7.1-deobf.jar!\net\mcreator\byg\MCreatorKasaiswordMobIsHitWithTool.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */