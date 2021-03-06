package com.gameservermanagers.JavaGSM.servers;

import com.gameservermanagers.JavaGSM.ServerInstaller;
import com.gameservermanagers.JavaGSM.util.SteamcmdUtil;

import java.io.File;

@SuppressWarnings("unused")
public class GarrysMod extends ServerInstaller {

    public static void install(File destination) {
        boolean installedSuccessfully = SteamcmdUtil.installApp("anonymous", destination, "4020");
        System.out.println(installedSuccessfully
                ? "Finished installing Garry's Mod server. Start it with the -s flag."
                : "Failed installing Garry's Mod server. See above for errors generated by SteamCMD.")
        ;
    }

}
