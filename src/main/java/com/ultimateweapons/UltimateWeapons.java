
package com.ultimateweapons;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(UltimateWeapons.MOD_ID)
public class UltimateWeapons {

    public static final String MOD_ID = "ultimateweapons";

    public static final Logger LOGGER =
            LogManager.getLogger(MOD_ID);

    public UltimateWeapons() {
        LOGGER.info("UltimateWeapons mod loaded!");
    }
}
