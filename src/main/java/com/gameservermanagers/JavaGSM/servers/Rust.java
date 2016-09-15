package com.gameservermanagers.JavaGSM.servers;

import com.gameservermanagers.JavaGSM.util.SteamcmdUtil;

import java.io.File;

@SuppressWarnings("unused")
public class Rust {

    public static void install(File destination) {
        boolean installedSuccessfully = SteamcmdUtil.installApp("anonymous", destination, "258550");
        System.out.println(installedSuccessfully
                ? "Finished installing Rust server. Start it with the -s flag."
                : "Failed installing Rust server. See above for errors generated by SteamCMD.")
        ;
        System.out.println();
    }

}