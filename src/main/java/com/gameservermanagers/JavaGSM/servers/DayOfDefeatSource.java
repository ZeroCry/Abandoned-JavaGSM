package com.gameservermanagers.JavaGSM.servers;

import com.gameservermanagers.JavaGSM.ServerInstaller;
import com.gameservermanagers.JavaGSM.util.SteamcmdUtil;

import java.io.File;

@SuppressWarnings("unused")
public class DayOfDefeatSource extends ServerInstaller {

    public static void install(File destination) {
        boolean installedSuccessfully = SteamcmdUtil.installApp("anonymous", destination, "232290");
        System.out.println(installedSuccessfully
                ? "Finished installing Day of Defeat: Source server. Start it with the -s flag."
                : "Failed installing Day of Defeat: Source server. See above for errors generated by SteamCMD.")
        ;
    }

}
