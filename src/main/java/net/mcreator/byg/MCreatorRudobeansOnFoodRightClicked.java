 package net.mcreator.byg;
 
 import java.util.HashMap;
 import net.minecraft.entity.Entity;
 import net.minecraft.entity.EntityLivingBase;
 import net.minecraft.entity.player.EntityPlayer;
 import net.minecraft.init.Blocks;
 import net.minecraft.item.ItemStack;
 import net.minecraft.util.math.BlockPos;
 import net.minecraft.world.World;
 import net.minecraftforge.common.MinecraftForge;
 import net.minecraftforge.event.entity.player.PlayerInteractEvent;
 import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
 import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
 
 @Elementsbyg.ModElement.Tag
 public class MCreatorRudobeansOnFoodRightClicked
   extends Elementsbyg.ModElement
 {
   public MCreatorRudobeansOnFoodRightClicked(Elementsbyg instance) {
     super(instance, 858);
   }
   
   public static void executeProcedure(HashMap<String, Object> dependencies) {
     if (dependencies.get("entity") == null) {
       System.err.println("Failed to load dependency entity for procedure MCreatorRudobeansOnFoodRightClicked!");
       return;
     } 
     if (dependencies.get("x") == null) {
       System.err.println("Failed to load dependency x for procedure MCreatorRudobeansOnFoodRightClicked!");
       return;
     } 
     if (dependencies.get("y") == null) {
       System.err.println("Failed to load dependency y for procedure MCreatorRudobeansOnFoodRightClicked!");
       return;
     } 
     if (dependencies.get("z") == null) {
       System.err.println("Failed to load dependency z for procedure MCreatorRudobeansOnFoodRightClicked!");
       return;
     } 
     if (dependencies.get("world") == null) {
       System.err.println("Failed to load dependency world for procedure MCreatorRudobeansOnFoodRightClicked!");
       return;
     } 
     Entity entity = (Entity)dependencies.get("entity");
     int x = ((Integer)dependencies.get("x")).intValue();
     int y = ((Integer)dependencies.get("y")).intValue();
     int z = ((Integer)dependencies.get("z")).intValue();
     World world = (World)dependencies.get("world");
     if (((entity instanceof EntityLivingBase) ? ((EntityLivingBase)entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == (new ItemStack(MCreatorRudobeans.block, 1))
       .getItem() && (
       (world.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.FARMLAND.getDefaultState().getBlock()) ? true : false) == true) {
       if (entity instanceof EntityPlayer)
         ((EntityPlayer)entity).inventory.clearMatchingItems((new ItemStack(MCreatorRudobeans.block, 1)).getItem(), -1, 1, null); 
       world.setBlockState(new BlockPos(x, y + 1, z), MCreatorRudostage0.block.getDefaultState(), 3);
     } 
   }
   
   @SubscribeEvent
   public void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
     EntityPlayer entity = event.getEntityPlayer();
     int i = event.getPos().getX();
     int j = event.getPos().getY();
     int k = event.getPos().getZ();
     World world = event.getWorld();
     HashMap<String, Object> dependencies = new HashMap<>();
     dependencies.put("x", Integer.valueOf(i));
     dependencies.put("y", Integer.valueOf(j));
     dependencies.put("z", Integer.valueOf(k));
     dependencies.put("world", world);
     dependencies.put("entity", entity);
     dependencies.put("event", event);
     executeProcedure(dependencies);
   }
 
   
   public void preInit(FMLPreInitializationEvent event) {
     MinecraftForge.EVENT_BUS.register(this);
   }
 }


/* Location:              H:\eclipse-workspace-19\BiomesYouGo1.7.1-deobf.jar!\net\mcreator\byg\MCreatorRudobeansOnFoodRightClicked.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */