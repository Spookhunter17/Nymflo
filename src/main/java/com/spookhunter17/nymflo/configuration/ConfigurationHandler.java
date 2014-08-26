package com.spookhunter17.nymflo.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        // Create the config object from the given config file
        Configuration configuration = new Configuration(configFile);

        try
        {
            //Load the config file
            configuration.load();

            //Read in properties from config file
            boolean configValue = configuration.get("Nymflo", "configValue", true, "This is a test config value").getBoolean(true);
        }
        catch (Exception e)
        {
            // Log the exception
        }
        finally
        {
            //Save the config file
            configuration.save();
        }
    }
}
