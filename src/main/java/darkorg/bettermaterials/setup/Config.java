package darkorg.bettermaterials.setup;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;

public class Config {

    public static ForgeConfigSpec CLIENT_CONFIG;
    public static ForgeConfigSpec SERVER_CONFIG;

    public static ForgeConfigSpec.BooleanValue disableStoneTools;
    public static ForgeConfigSpec.BooleanValue disableWoodenTools;

    public static ForgeConfigSpec.BooleanValue easySticksEnabled;
    public static ForgeConfigSpec.DoubleValue easySticksChance;
    public static ForgeConfigSpec.IntValue easySticksDropCount;

    public static ForgeConfigSpec.BooleanValue permaToolsEnabled;

    public static void init() {
        initServer();
        initClient();

        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, SERVER_CONFIG);
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, CLIENT_CONFIG);
    }

    private static void initServer() {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

        builder.push("Better Materials configuration file");

        disableStoneTools = builder.comment("Set to false to enable the usage of Stone Tools").define("stone_tools_disabled", true);
        disableWoodenTools = builder.comment("Set to false to enable the usage of Wooden Tools").define("wooden_tools_disabled", true);

        easySticksEnabled = builder.comment("Set to false to disable the EasySticks feature.").define("easysticks_enabled", true);
        easySticksChance = builder.comment("Set the chance sticks will drop from Leaves.").defineInRange("easysticks_chance", 0.25, 0.0, 1.0);
        easySticksDropCount = builder.comment("Set how many sticks will drop from Leaves.").defineInRange("easysticks_count", 1, 0, Integer.MAX_VALUE);

        permaToolsEnabled = builder.comment("Set to false to disable the PermaTools feature.").define("permatools_enabled", true);

        builder.pop();
        SERVER_CONFIG = builder.build();
    }
    private static void initClient() {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

        //builder.pop();
        CLIENT_CONFIG = builder.build();
    }
}

