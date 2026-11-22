package dev.minecraftmods.helloworld;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorldMod implements ModInitializer {
    public static final String MOD_ID = "hello_world";
    private static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Hello, Minecraft world!");
    }
}
