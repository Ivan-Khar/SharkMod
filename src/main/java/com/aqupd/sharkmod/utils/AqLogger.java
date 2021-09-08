package com.aqupd.sharkmod.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AqLogger {
    private static final Logger LOGGER = LogManager.getLogger();

    public static void logError(String error) {
        LOGGER.error("[AqUpd's Mobs] " + error);
    }

    public static void logWarn(String warn) {
        LOGGER.warn("[AqUpd's Mobs] " + warn);
    }

    public static void logInfo(String info) {
        LOGGER.info("[AqUpd's Mobs] " + info);
    }

}
