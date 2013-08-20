package mod.harvestcraft;

//Forge Mod Loader Imports
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

//Metadata that is required
@Mod(modid="HarvestCraft",
     name="Harvest Craft",
     version = "0.0.1",
     useMetadata = true)
@NetworkMod(clientSideRequired = true,
            serverSideRequired = false)

public class HarvestCraft
{
    @Instance("HarvestCraft")
    public static HarvestCraft instance;

    @SidedProxy(clientSide = "mod.harvestcraft.client.ClientProxy",
                serverSide = "mod.harvestcraft.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    }

    @EventHandler
    public void load(FMLInitializationEvent event)
    {
        proxy.registerRenderers();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    }
    
}
