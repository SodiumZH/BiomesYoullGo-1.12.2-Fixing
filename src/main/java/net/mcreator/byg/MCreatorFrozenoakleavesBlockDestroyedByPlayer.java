 package net.mcreator.byg;
 
 import java.util.HashMap;
 import net.minecraft.entity.Entity;
 import net.minecraft.entity.EntityLivingBase;
 import net.minecraft.entity.item.EntityItem;
 import net.minecraft.init.Items;
 import net.minecraft.item.Item;
 import net.minecraft.item.ItemStack;
 import net.minecraft.world.World;
 
 @Elementsbyg.ModElement.Tag
 public class MCreatorFrozenoakleavesBlockDestroyedByPlayer extends Elementsbyg.ModElement {
   public MCreatorFrozenoakleavesBlockDestroyedByPlayer(Elementsbyg instance) {
     super(instance, 2439);
   }
   
   public static void executeProcedure(HashMap<String, Object> dependencies) {
     if (dependencies.get("entity") == null) {
       System.err.println("Failed to load dependency entity for procedure MCreatorFrozenoakleavesBlockDestroyedByPlayer!");
       return;
     } 
     if (dependencies.get("x") == null) {
       System.err.println("Failed to load dependency x for procedure MCreatorFrozenoakleavesBlockDestroyedByPlayer!");
       return;
     } 
     if (dependencies.get("y") == null) {
       System.err.println("Failed to load dependency y for procedure MCreatorFrozenoakleavesBlockDestroyedByPlayer!");
       return;
     } 
     if (dependencies.get("z") == null) {
       System.err.println("Failed to load dependency z for procedure MCreatorFrozenoakleavesBlockDestroyedByPlayer!");
       return;
     } 
     if (dependencies.get("world") == null) {
       System.err.println("Failed to load dependency world for procedure MCreatorFrozenoakleavesBlockDestroyedByPlayer!");
       return;
     } 
     Entity entity = (Entity)dependencies.get("entity");
     int x = ((Integer)dependencies.get("x")).intValue();
     int y = ((Integer)dependencies.get("y")).intValue();
     int z = ((Integer)dependencies.get("z")).intValue();
     World world = (World)dependencies.get("world");
     if (((entity instanceof EntityLivingBase) ? ((EntityLivingBase)entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == (new ItemStack((Item)Items.SHEARS, 1))
       .getItem()) {
       if (!world.isRemote) {
         EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(MCreatorFrozenoakleaves.block, 1));
         entityToSpawn.setPickupDelay(10);
         world.spawnEntity((Entity)entityToSpawn);
       }
     
     } else if (Math.random() < 0.03D && 
       !world.isRemote) {
       EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(MCreatorFrozen_oak_sapling.block, 1));
       entityToSpawn.setPickupDelay(10);
       world.spawnEntity((Entity)entityToSpawn);
     } 
   }
 }


/* Location:              H:\eclipse-workspace-19\BiomesYouGo1.7.1-deobf.jar!\net\mcreator\byg\MCreatorFrozenoakleavesBlockDestroyedByPlayer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */