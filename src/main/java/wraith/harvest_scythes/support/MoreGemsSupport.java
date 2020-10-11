package wraith.harvest_scythes.support;

import com.kwpugh.more_gems.MoreGems;
import com.kwpugh.more_gems.materials.ModToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import wraith.harvest_scythes.HarvestScythes;
import wraith.harvest_scythes.ItemGroup;
import wraith.harvest_scythes.ItemRegistry;
import wraith.harvest_scythes.ScytheTool;
import wraith.harvest_scythes.recipe.RecipesGenerator;
import wraith.harvest_scythes.recipe.ShapedRecipeMaterials;

public class MoreGemsSupport {

    public static int loadItems() {
        ItemRegistry.ITEMS.put("alexandrite_scythe", new ScytheTool(ModToolMaterial.ALEXANDRITE, 3, 0.0f, 2, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("amethyst_scythe", new ScytheTool(ModToolMaterial.AMETHYST, 3, 0.0f, 2, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("carbonado_scythe", new ScytheTool(ModToolMaterial.CARBONADO, 3, 0.0f, 2, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("citrine_scythe", new ScytheTool(ModToolMaterial.CITRINE, 3, 0.0f, 2, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("corundum_scythe", new ScytheTool(ModToolMaterial.CORUNDUM, 3, 0.0f, 2, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("emerald_scythe", new ScytheTool(ModToolMaterial.EMERALD, 3, 0.0f, 2, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("ruby_scythe", new ScytheTool(ModToolMaterial.RUBY, 3, 0.0f, 2, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("sapphire_scythe", new ScytheTool(ModToolMaterial.SAPPHIRE, 3, 0.0f, 2, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("topaz_scythe", new ScytheTool(ModToolMaterial.TOPAZ, 3, 0.0f, 2, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        ItemRegistry.ITEMS.put("tourmaline_scythe", new ScytheTool(ModToolMaterial.TOURMALINE, 3, 0.0f, 2, false, new Item.Settings().group(ItemGroup.SCYTHES)));
        return 10;
    }

    public static void loadRecipes() {
        RecipesGenerator.SHAPED_RECIPES.put("alexandrite_scythe", new ShapedRecipeMaterials(new Identifier("c", "alexandrite"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "alexandrite_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("amethyst_scythe", new ShapedRecipeMaterials(new Identifier("c", "amethyst"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "amethyst_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("carbonado_scythe", new ShapedRecipeMaterials(new Identifier("c", "carbonado"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "carbonado_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("citrine_scythe", new ShapedRecipeMaterials(new Identifier("c", "citrine"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "citrine_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("corundum_scythe", new ShapedRecipeMaterials(new Identifier("c", "corundum"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "corundum_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("emerald_scythe", new ShapedRecipeMaterials(new Identifier("c", "emerald"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "emerald_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("ruby_scythe", new ShapedRecipeMaterials(new Identifier("c", "ruby"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "ruby_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("sapphire_scythe", new ShapedRecipeMaterials(new Identifier("c", "sapphire"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "sapphire_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("topaz_scythe", new ShapedRecipeMaterials(new Identifier("c", "topaz"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "topaz_scythe")));
        RecipesGenerator.SHAPED_RECIPES.put("tourmaline_scythe", new ShapedRecipeMaterials(new Identifier("c", "tourmaline"), HarvestScythes.STICK, "tag", HarvestScythes.STICK_TYPE, new Identifier(HarvestScythes.MOD_ID, "tourmaline_scythe")));
    }

}
