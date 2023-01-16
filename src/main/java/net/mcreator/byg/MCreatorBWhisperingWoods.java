 package net.mcreator.byg;
 
 import java.util.Random;
 import net.minecraft.init.Blocks;
 import net.minecraft.util.math.BlockPos;
 import net.minecraft.world.biome.Biome;
 import net.minecraft.world.gen.feature.WorldGenAbstractTree;
 import net.minecraftforge.common.BiomeDictionary;
 import net.minecraftforge.common.BiomeManager;
 import net.minecraftforge.fml.common.event.FMLInitializationEvent;
 import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
 import net.minecraftforge.fml.relauncher.Side;
 import net.minecraftforge.fml.relauncher.SideOnly;
 
 @Elementsbyg.ModElement.Tag
 public class MCreatorBWhisperingWoods
   extends Elementsbyg.ModElement
 {
   @ObjectHolder("byg:bwhisperingwoods")
   public static final BiomeGenCustom biome = null;
   
   public MCreatorBWhisperingWoods(Elementsbyg instance) {
     super(instance, 1093);
   }
 
   
   public void initElements() {
     this.elements.biomes.add(() -> new BiomeGenCustom());
   }
 
   
   public void init(FMLInitializationEvent event) {
     BiomeDictionary.addTypes(biome, new BiomeDictionary.Type[] { BiomeDictionary.Type.FOREST, BiomeDictionary.Type.DENSE, BiomeDictionary.Type.SPOOKY, BiomeDictionary.Type.MAGICAL, BiomeDictionary.Type.RARE });
     
     BiomeManager.addSpawnBiome(biome);
     BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(biome, 2));
   }
   
   static class BiomeGenCustom extends Biome {
     public BiomeGenCustom() {
       super((new Biome.BiomeProperties("Whispering Woods")).setRainfall(0.5F).setBaseHeight(0.3F).setWaterColor(-14329397)
           .setHeightVariation(0.1F).setTemperature(0.7F));
       setRegistryName("bwhisperingwoods");
       this.topBlock = Blocks.GRASS.getDefaultState();
       this.fillerBlock = Blocks.DIRT.getStateFromMeta(0);
       this.decorator.generateFalls = false;
       this.decorator.treesPerChunk = 1;
       this.decorator.flowersPerChunk = 2;
       this.decorator.grassPerChunk = 10;
       this.decorator.deadBushPerChunk = 0;
       this.decorator.mushroomsPerChunk = 2;
       this.decorator.bigMushroomsPerChunk = 0;
       this.decorator.reedsPerChunk = 15;
       this.decorator.cactiPerChunk = 0;
       this.decorator.sandPatchesPerChunk = 0;
       this.decorator.gravelPatchesPerChunk = 0;
     }
 
     
     @SideOnly(Side.CLIENT)
     public int getGrassColorAtPos(BlockPos pos) {
       return -14123726;
     }
 
     
     @SideOnly(Side.CLIENT)
     public int getFoliageColorAtPos(BlockPos pos) {
       return -14123726;
     }
 
     
     @SideOnly(Side.CLIENT)
     public int getSkyColorByTemp(float currentTemperature) {
       return -13395457;
     }
 
     
     public WorldGenAbstractTree getRandomTreeFeature(Random rand) {
       return (WorldGenAbstractTree)BIG_TREE_FEATURE;
     }
   }
 }


/* Location:              H:\eclipse-workspace-19\BiomesYouGo1.7.1-deobf.jar!\net\mcreator\byg\MCreatorBWhisperingWoods.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */