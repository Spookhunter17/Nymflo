package com.spookhunter17.nymflo;

import com.spookhunter17.nymflo.proxy.IProxy;
import com.spookhunter17.nymflo.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Nymflo
{
    @Mod.Instance(Reference.MOD_ID)
    public static Nymflo instance;

    @SidedProxy(clientSide = "com.spookhunter17.nymflo.proxy.ClientProxy", serverSide = "com.spookhunter17.nymflo.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
