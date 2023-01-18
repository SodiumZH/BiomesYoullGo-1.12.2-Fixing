 package net.potionstudios.byg;
 
 import java.util.HashMap;
 import net.minecraft.entity.Entity;
 import net.minecraft.entity.EntityLivingBase;
 import net.minecraft.entity.item.EntityItem;
 import net.minecraft.init.Items;
 import net.minecraft.item.Item;
 import net.minecraft.item.ItemStack;
 import net.minecraft.world.World;
 
 @Elementsbyg.ModElement.Tag
 public class RainboweucalyptusleavesBlockDestroyedByPlayer extends Elementsbyg.ModElement {
   public RainboweucalyptusleavesBlockDestroyedByPlayer(Elementsbyg instance) {
     super(instance, 816);
   }
   
   public static void executeProcedure(HashMap<String, Object> dependencies) {
     if (dependencies.get("entity") == null) {
       System.err.println("Failed to load dependency entity for procedure RainboweucalyptusleavesBlockDestroyedByPlayer!");
       return;
     } 
     if (dependencies.get("x") == null) {
       System.err.println("Failed to load dependency x for procedure RainboweucalyptusleavesBlockDestroyedByPlayer!");
       return;
     } 
     if (dependencies.get("y") == null) {
       System.err.println("Failed to load dependency y for procedure RainboweucalyptusleavesBlockDestroyedByPlayer!");
       return;
     } 
     if (dependencies.get("z") == null) {
       System.err.println("Failed to load dependency z for procedure RainboweucalyptusleavesBlockDestroyedByPlayer!");
       return;
     } 
     if (dependencies.get("world") == null) {
       System.err.println("Failed to load dependency world for procedure RainboweucalyptusleavesBlockDestroyedByPlayer!");
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
         EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(Rainboweucalyptusleaves.block, 1));
         entityToSpawn.setPickupDelay(10);
         world.spawnEntity((Entity)entityToSpawn);
       }
     
     } else if (Math.random() < 0.03D && 
       !world.isRemote) {
       EntityItem entityToSpawn = new EntityItem(world, x, y, z, new ItemStack(Rainboweucalyptussapling.block, 1));
       entityToSpawn.setPickupDelay(10);
       world.spawnEntity((Entity)entityToSpawn);
     } 
   }
 }



