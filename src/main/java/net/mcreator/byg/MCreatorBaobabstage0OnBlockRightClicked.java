 package net.mcreator.byg;
 
 import java.util.HashMap;
 import net.minecraft.entity.Entity;
 import net.minecraft.entity.EntityLivingBase;
 import net.minecraft.entity.player.EntityPlayer;
 import net.minecraft.init.Items;
 import net.minecraft.item.ItemStack;
 import net.minecraft.util.EnumParticleTypes;
 import net.minecraft.util.ResourceLocation;
 import net.minecraft.util.SoundCategory;
 import net.minecraft.util.SoundEvent;
 import net.minecraft.util.math.BlockPos;
 import net.minecraft.world.World;
 import net.minecraft.world.WorldServer;
 
 @Elementsbyg.ModElement.Tag
 public class MCreatorBaobabstage0OnBlockRightClicked extends Elementsbyg.ModElement {
   public MCreatorBaobabstage0OnBlockRightClicked(Elementsbyg instance) {
     super(instance, 979);
   }
   
   public static void executeProcedure(HashMap<String, Object> dependencies) {
     if (dependencies.get("entity") == null) {
       System.err.println("Failed to load dependency entity for procedure MCreatorBaobabstage0OnBlockRightClicked!");
       return;
     } 
     if (dependencies.get("x") == null) {
       System.err.println("Failed to load dependency x for procedure MCreatorBaobabstage0OnBlockRightClicked!");
       return;
     } 
     if (dependencies.get("y") == null) {
       System.err.println("Failed to load dependency y for procedure MCreatorBaobabstage0OnBlockRightClicked!");
       return;
     } 
     if (dependencies.get("z") == null) {
       System.err.println("Failed to load dependency z for procedure MCreatorBaobabstage0OnBlockRightClicked!");
       return;
     } 
     if (dependencies.get("world") == null) {
       System.err.println("Failed to load dependency world for procedure MCreatorBaobabstage0OnBlockRightClicked!");
       return;
     } 
     Entity entity = (Entity)dependencies.get("entity");
     int x = ((Integer)dependencies.get("x")).intValue();
     int y = ((Integer)dependencies.get("y")).intValue();
     int z = ((Integer)dependencies.get("z")).intValue();
     World world = (World)dependencies.get("world");
     if (Math.random() < 0.4D && ((entity instanceof EntityLivingBase) ? ((EntityLivingBase)entity).getHeldItemMainhand() : ItemStack.EMPTY)
       .getItem() == (new ItemStack(Items.DYE, 1, 15)).getItem()) {
       if (world instanceof WorldServer)
         ((WorldServer)world).spawnParticle(EnumParticleTypes.VILLAGER_HAPPY, x, y, z, 5, 3.0D, 3.0D, 3.0D, 1.0D, new int[0]); 
       if (entity instanceof EntityPlayer)
         ((EntityPlayer)entity).inventory.clearMatchingItems((new ItemStack(Items.DYE, 1, 15)).getItem(), 15, 1, null); 
       world.setBlockToAir(new BlockPos(x, y, z));
       world.setBlockState(new BlockPos(x, y, z), MCreatorBaobabastage1.block.getDefaultState(), 3);
       world.playSound((EntityPlayer)null, x, y, z, (SoundEvent)SoundEvent.REGISTRY
           .getObject(new ResourceLocation("block.chorus_flower.grow")), SoundCategory.NEUTRAL, 2.0F, 1.0F);
     }
     else if (entity instanceof EntityPlayer) {
       ((EntityPlayer)entity).inventory.clearMatchingItems((new ItemStack(Items.DYE, 1, 15)).getItem(), 15, 1, null);
     } 
   }
 }


/* Location:              H:\eclipse-workspace-19\BiomesYouGo1.7.1-deobf.jar!\net\mcreator\byg\MCreatorBaobabstage0OnBlockRightClicked.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */