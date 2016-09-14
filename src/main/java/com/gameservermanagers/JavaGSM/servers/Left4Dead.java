package com.gameservermanagers.JavaGSM.servers;

import com.gameservermanagers.JavaGSM.util.SteamcmdUtil;

import java.io.File;

@SuppressWarnings("unused")
public class Left4Dead {

    public static void install(File destination) {
        boolean installedSuccessfully = SteamcmdUtil.installApp("anonymous", destination, "500");
        System.out.println(installedSuccessfully
                ? "Finished installing Left 4 Dead server. Start it with the -s flag."
                : "Failed installing Left 4 Dead server. See above for errors generated by SteamCMD.")
        ;
        System.out.println();
    }

}
