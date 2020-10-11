package wraith.harvest_scythes;

import com.kwpugh.more_gems.MoreGems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import wraith.harvest_scythes.support.AstromineSupport;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.support.MoreGemsSupport;

public class HarvestScythes implements ModInitializer {

    public static final String MOD_ID = "harvest_scythes";
    public static final Logger LOGGER = LogManager.getLogger();
    public static Identifier STICK = Registry.ITEM.getId(Items.STICK);
    public static String STICK_TYPE = "item";

    @Override
    public void onInitialize() {
        LOGGER.info("Loading [Harvest Scythes]");

        int moddedItems = 0;
        int compatibleMods = 0;

        RecipesGenerator.createShapedRecipes();

        if (FabricLoader.getInstance().isModLoaded("astromine-foundations")) {
            LOGGER.info("[Astromine Foundations] detected. Loading supported items.");
            moddedItems += AstromineSupport.loadItems();
            AstromineSupport.loadRecipes();
            ++compatibleMods;
        }
        if (FabricLoader.getInstance().isModLoaded("more_gems")) {
            LOGGER.info("[More Gems] detected. Loading supported items.");
            moddedItems += MoreGemsSupport.loadItems();
            MoreGemsSupport.loadRecipes();
            ++compatibleMods;
        }
        LOGGER.info("Loaded " + moddedItems + " items from " + compatibleMods + " compatible mod" + (compatibleMods != 1 ? "s" : "") + ", for a total of " + ItemRegistry.registerItems() + " items.");

        RecipesGenerator.addRecipes();

        LOGGER.info("[Harvest Scythes] has successfully been loaded!");

    }

}
