 package net.mcreator.byg;
 
 import java.util.HashMap;
 import net.minecraft.entity.Entity;
 import net.minecraft.entity.EntityLivingBase;
 import net.minecraft.init.MobEffects;
 import net.minecraft.potion.PotionEffect;
 
 @Elementsbyg.ModElement.Tag
 public class MCreatorSpringwaterMobplayerCollidesBlock
   extends Elementsbyg.ModElement {
   public MCreatorSpringwaterMobplayerCollidesBlock(Elementsbyg instance) {
     super(instance, 2307);
   }
   
   public static void executeProcedure(HashMap<String, Object> dependencies) {
     if (dependencies.get("entity") == null) {
       System.err.println("Failed to load dependency entity for procedure MCreatorSpringwaterMobplayerCollidesBlock!");
       return;
     } 
     Entity entity = (Entity)dependencies.get("entity");
     if (entity instanceof EntityLivingBase)
       ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 120, 1, false, false)); 
   }
 }


/* Location:              H:\eclipse-workspace-19\BiomesYouGo1.7.1-deobf.jar!\net\mcreator\byg\MCreatorSpringwaterMobplayerCollidesBlock.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */