package com.gameservermanagers.JavaGSM.servers;

import com.gameservermanagers.JavaGSM.ServerInstaller;
import com.gameservermanagers.JavaGSM.util.SteamcmdUtil;

import java.io.File;

@SuppressWarnings("unused")
public class SevenDaysToDie extends ServerInstaller {

    public static void install(File destination) {
        boolean installedSuccessfully = SteamcmdUtil.installApp("anonymous", destination, "294420");
        System.out.println(installedSuccessfully
                ? "Finished installing 7 Days To Die server. Start it with the -s flag."
                : "Failed installing 7 Days to Die server. See above for errors generated by SteamCMD.")
        ;
    }

}