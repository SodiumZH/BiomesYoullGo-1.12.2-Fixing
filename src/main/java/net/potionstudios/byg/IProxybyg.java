package net.potionstudios.byg;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

public interface IProxybyg {
  void preInit(FMLPreInitializationEvent paramFMLPreInitializationEvent);
  
  void init(FMLInitializationEvent paramFMLInitializationEvent);
  
  void postInit(FMLPostInitializationEvent paramFMLPostInitializationEvent);
  
  void serverLoad(FMLServerStartingEvent paramFMLServerStartingEvent);
}


/* Location:              H:\eclipse-workspace-19\BiomesYouGo1.7.1-deobf.jar!\net\mcreator\byg\IProxybyg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */