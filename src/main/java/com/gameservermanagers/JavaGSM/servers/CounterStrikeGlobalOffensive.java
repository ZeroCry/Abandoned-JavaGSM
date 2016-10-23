package com.gameservermanagers.JavaGSM.servers;

import com.gameservermanagers.JavaGSM.ServerInstaller;
import com.gameservermanagers.JavaGSM.util.SteamcmdUtil;

import java.io.File;

@SuppressWarnings("unused")

public class CounterStrikeGlobalOffensive extends ServerInstaller {

    public static void install(File destination) {
        boolean installedSuccessfully = SteamcmdUtil.installApp("anonymous", destination, "740");
        System.out.println(installedSuccessfully
                ? "Finished installing Counter-Strike: Global Offensive server. Start it with the -s flag."
                : "Failed installing Counter-Strike: Global Offensive server. See above for errors generated by SteamCMD.")
        ;
    }

    //TODO: !IMPORTANT! When adding the configure option to this server remmember to add GSLT(http://steamcommunity.com/dev/managegameservers) to make this server work outside of Lan

}