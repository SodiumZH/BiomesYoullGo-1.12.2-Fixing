 package net.mcreator.byg;
 
 import java.util.HashMap;
 import net.minecraft.init.Blocks;
 import net.minecraft.init.Items;
 import net.minecraft.item.ItemStack;
 import net.minecraft.tileentity.TileEntity;
 import net.minecraft.tileentity.TileEntityLockableLoot;
 import net.minecraft.util.math.BlockPos;
 import net.minecraft.world.World;
 
 @Elementsbyg.ModElement.Tag
 public class MCreatorNetherfurnacelitOnBlockRightclicked
   extends Elementsbyg.ModElement {
   public MCreatorNetherfurnacelitOnBlockRightclicked(Elementsbyg instance) {
     super(instance, 647);
   }
   
   public static void executeProcedure(HashMap<String, Object> dependencies) {
     if (dependencies.get("x") == null) {
       System.err.println("Failed to load dependency x for procedure MCreatorNetherfurnacelitOnBlockRightclicked!");
       return;
     } 
     if (dependencies.get("y") == null) {
       System.err.println("Failed to load dependency y for procedure MCreatorNetherfurnacelitOnBlockRightclicked!");
       return;
     } 
     if (dependencies.get("z") == null) {
       System.err.println("Failed to load dependency z for procedure MCreatorNetherfurnacelitOnBlockRightclicked!");
       return;
     } 
     if (dependencies.get("world") == null) {
       System.err.println("Failed to load dependency world for procedure MCreatorNetherfurnacelitOnBlockRightclicked!");
       return;
     } 
     int x = ((Integer)dependencies.get("x")).intValue();
     int y = ((Integer)dependencies.get("y")).intValue();
     int z = ((Integer)dependencies.get("z")).intValue();
     final World world = (World)dependencies.get("world");
     if ((new Object() {
         public ItemStack getItemStack(BlockPos pos, int sltid) {
           TileEntity inv = world.getTileEntity(pos);
           if (inv instanceof TileEntityLockableLoot)
             return ((TileEntityLockableLoot)inv).getStackInSlot(sltid); 
           return ItemStack.EMPTY;
         }
       }).getItemStack(new BlockPos(x, y, z), 1).getItem() == (new ItemStack(MCreatorKasaiore.block, 1)).getItem() && (new Object() {
         public ItemStack getItemStack(BlockPos pos, int sltid) {
           TileEntity inv = world.getTileEntity(pos);
           if (inv instanceof TileEntityLockableLoot)
             return ((TileEntityLockableLoot)inv).getStackInSlot(sltid); 
           return ItemStack.EMPTY;
         }
       }).getItemStack(new BlockPos(x, y, z), 1).getMetadata() == (new ItemStack(MCreatorKasaiore.block, 1))
       .getMetadata() && (new Object() {
         public ItemStack getItemStack(BlockPos pos, int sltid) {
           TileEntity inv = world.getTileEntity(pos);
           if (inv instanceof TileEntityLockableLoot)
             return ((TileEntityLockableLoot)inv).getStackInSlot(sltid); 
           return ItemStack.EMPTY;
         }
       }).getItemStack(new BlockPos(x, y, z), 0).getItem() == (new ItemStack(Items.BLAZE_POWDER, 1)).getItem() && (new Object() {
         public ItemStack getItemStack(BlockPos pos, int sltid) {
           TileEntity inv = world.getTileEntity(pos);
           if (inv instanceof TileEntityLockableLoot)
             return ((TileEntityLockableLoot)inv).getStackInSlot(sltid); 
           return ItemStack.EMPTY;
         }
       }).getItemStack(new BlockPos(x, y, z), 0).getMetadata() == (new ItemStack(Items.BLAZE_POWDER, 1))
       .getMetadata() && ((new Object() {
         public int getAmount(BlockPos pos, int sltid) {
           TileEntity inv = world.getTileEntity(pos);
           if (inv instanceof TileEntityLockableLoot) {
             ItemStack stack = ((TileEntityLockableLoot)inv).getStackInSlot(sltid);
             if (stack != null)
               return stack.getCount(); 
           } 
           return 0;
         }
       }).getAmount(new BlockPos(x, y, z), 2) == 0 || ((new Object() {
         public ItemStack getItemStack(BlockPos pos, int sltid) {
           TileEntity inv = world.getTileEntity(pos);
           if (inv instanceof TileEntityLockableLoot)
             return ((TileEntityLockableLoot)inv).getStackInSlot(sltid); 
           return ItemStack.EMPTY;
         }
       }).getItemStack(new BlockPos(x, y, z), 2).getItem() == (new ItemStack(MCreatorKasaiingot.block, 1)).getItem() && (new Object() {
         public ItemStack getItemStack(BlockPos pos, int sltid) {
           TileEntity inv = world.getTileEntity(pos);
           if (inv instanceof TileEntityLockableLoot)
             return ((TileEntityLockableLoot)inv).getStackInSlot(sltid); 
           return ItemStack.EMPTY;
         }
       }).getItemStack(new BlockPos(x, y, z), 2).getMetadata() == (new ItemStack(MCreatorKasaiingot.block, 1))
       .getMetadata()))) {
       
       TileEntity inv = world.getTileEntity(new BlockPos(x, y, z));
       if (inv instanceof TileEntityLockableLoot) {
         ((TileEntityLockableLoot)inv).decrStackSize(0, 1);
       }
       
       inv = world.getTileEntity(new BlockPos(x, y, z));
       if (inv instanceof TileEntityLockableLoot) {
         ((TileEntityLockableLoot)inv).decrStackSize(1, 1);
       }
       
       inv = world.getTileEntity(new BlockPos(x, y, z));
       if (inv != null && inv instanceof TileEntityLockableLoot) {
         ((TileEntityLockableLoot)inv).setInventorySlotContents(2, new ItemStack(MCreatorKasaiingot.block, (new Object() {
                 public int getAmount(BlockPos pos, int sltid) {
                   TileEntity inv = world.getTileEntity(pos);
                   if (inv instanceof TileEntityLockableLoot) {
                     ItemStack stack = ((TileEntityLockableLoot)inv).getStackInSlot(sltid);
                     if (stack != null)
                       return stack.getCount(); 
                   } 
                   return 0;
                 }
               }).getAmount(new BlockPos(x, y, z), 2) + 1));
       }
     } 
     if ((new Object() {
         public ItemStack getItemStack(BlockPos pos, int sltid) {
           TileEntity inv = world.getTileEntity(pos);
           if (inv instanceof TileEntityLockableLoot)
             return ((TileEntityLockableLoot)inv).getStackInSlot(sltid); 
           return ItemStack.EMPTY;
         }
       }).getItemStack(new BlockPos(x, y, z), 1).getItem() == (new ItemStack(Blocks.OBSIDIAN, 1)).getItem() && (new Object() {
         public ItemStack getItemStack(BlockPos pos, int sltid) {
           TileEntity inv = world.getTileEntity(pos);
           if (inv instanceof TileEntityLockableLoot)
             return ((TileEntityLockableLoot)inv).getStackInSlot(sltid); 
           return ItemStack.EMPTY;
         }
       }).getItemStack(new BlockPos(x, y, z), 1).getMetadata() == (new ItemStack(Blocks.OBSIDIAN, 1)).getMetadata() && (new Object() {
         public ItemStack getItemStack(BlockPos pos, int sltid) {
           TileEntity inv = world.getTileEntity(pos);
           if (inv instanceof TileEntityLockableLoot)
             return ((TileEntityLockableLoot)inv).getStackInSlot(sltid); 
           return ItemStack.EMPTY;
         }
       }).getItemStack(new BlockPos(x, y, z), 0).getItem() == (new ItemStack(Items.BLAZE_POWDER, 1)).getItem() && (new Object() {
         public ItemStack getItemStack(BlockPos pos, int sltid) {
           TileEntity inv = world.getTileEntity(pos);
           if (inv instanceof TileEntityLockableLoot)
             return ((TileEntityLockableLoot)inv).getStackInSlot(sltid); 
           return ItemStack.EMPTY;
         }
       }).getItemStack(new BlockPos(x, y, z), 0).getMetadata() == (new ItemStack(Items.BLAZE_POWDER, 1))
       .getMetadata() && ((new Object() {
         public int getAmount(BlockPos pos, int sltid) {
           TileEntity inv = world.getTileEntity(pos);
           if (inv instanceof TileEntityLockableLoot) {
             ItemStack stack = ((TileEntityLockableLoot)inv).getStackInSlot(sltid);
             if (stack != null)
               return stack.getCount(); 
           } 
           return 0;
         }
       }).getAmount(new BlockPos(x, y, z), 2) == 0 || ((new Object() {
         public ItemStack getItemStack(BlockPos pos, int sltid) {
           TileEntity inv = world.getTileEntity(pos);
           if (inv instanceof TileEntityLockableLoot)
             return ((TileEntityLockableLoot)inv).getStackInSlot(sltid); 
           return ItemStack.EMPTY;
         }
       }).getItemStack(new BlockPos(x, y, z), 2).getItem() == (new ItemStack(MCreatorObsidianingot.block, 1))
       .getItem() && (new Object() {
         public ItemStack getItemStack(BlockPos pos, int sltid) {
           TileEntity inv = world.getTileEntity(pos);
           if (inv instanceof TileEntityLockableLoot)
             return ((TileEntityLockableLoot)inv).getStackInSlot(sltid); 
           return ItemStack.EMPTY;
         }
       }).getItemStack(new BlockPos(x, y, z), 2).getMetadata() == (new ItemStack(MCreatorObsidianingot.block, 1))
       .getMetadata()))) {
       
       TileEntity inv = world.getTileEntity(new BlockPos(x, y, z));
       if (inv instanceof TileEntityLockableLoot) {
         ((TileEntityLockableLoot)inv).decrStackSize(0, 1);
       }
       
       inv = world.getTileEntity(new BlockPos(x, y, z));
       if (inv instanceof TileEntityLockableLoot) {
         ((TileEntityLockableLoot)inv).decrStackSize(1, 1);
       }
       
       inv = world.getTileEntity(new BlockPos(x, y, z));
       if (inv != null && inv instanceof TileEntityLockableLoot)
         ((TileEntityLockableLoot)inv).setInventorySlotContents(2, new ItemStack(MCreatorObsidianingot.block, (new Object()
               {
                 public int getAmount(BlockPos pos, int sltid) {
                   TileEntity inv = world.getTileEntity(pos);
                   if (inv instanceof TileEntityLockableLoot) {
                     ItemStack stack = ((TileEntityLockableLoot)inv).getStackInSlot(sltid);
                     if (stack != null)
                       return stack.getCount(); 
                   } 
                   return 0;
                 }
               }).getAmount(new BlockPos(x, y, z), 2) + 1)); 
     } 
   }
 }


/* Location:              H:\eclipse-workspace-19\BiomesYouGo1.7.1-deobf.jar!\net\mcreator\byg\MCreatorNetherfurnacelitOnBlockRightclicked.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */