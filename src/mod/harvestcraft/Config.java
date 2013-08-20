package mod.harvestcraft;

//Java Standard Library Imports
import java.io.File;

//Forge Mod Loader Imports
import net.minecraftforge.common.Configuration;

public class Config
{
    public static Configuration config;
    
    //Loads the configuration file
    public static void load(File file)
    {
        config = new Configuration(file);
        config.load();
        config.save();
    }

}
