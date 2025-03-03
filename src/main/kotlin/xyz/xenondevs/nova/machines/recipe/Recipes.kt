package xyz.xenondevs.nova.machines.recipe

import org.bukkit.NamespacedKey
import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.RecipeChoice
import org.bukkit.potion.PotionEffectType
import xyz.xenondevs.nova.data.recipe.ConversionNovaRecipe
import xyz.xenondevs.nova.data.recipe.MultiInputChoiceRecipe
import xyz.xenondevs.nova.data.recipe.NovaRecipe
import xyz.xenondevs.nova.machines.registry.RecipeTypes
import xyz.xenondevs.nova.tileentity.network.fluid.FluidType

class PulverizerRecipe(
    key: NamespacedKey,
    input: RecipeChoice,
    result: ItemStack,
    time: Int,
) : ConversionNovaRecipe(key, input, result, time) {
    override val type = RecipeTypes.PULVERIZER
}

class PlatePressRecipe(
    key: NamespacedKey,
    input: RecipeChoice,
    result: ItemStack,
    time: Int
) : ConversionNovaRecipe(key, input, result, time) {
    override val type = RecipeTypes.PLATE_PRESS
}

class GearPressRecipe(
    key: NamespacedKey,
    input: RecipeChoice,
    result: ItemStack,
    time: Int
) : ConversionNovaRecipe(key, input, result, time) {
    override val type = RecipeTypes.GEAR_PRESS
}

class FluidInfuserRecipe(
    override val key: NamespacedKey,
    val mode: InfuserMode,
    val fluidType: FluidType,
    val fluidAmount: Long,
    input: RecipeChoice,
    result: ItemStack,
    time: Int
) : ConversionNovaRecipe(key, input, result, time) {
    override val type = RecipeTypes.FLUID_INFUSER
    
    enum class InfuserMode {
        INSERT,
        EXTRACT
    }
    
}

class ElectricBrewingStandRecipe(
    override val key: NamespacedKey,
    override val inputs: List<RecipeChoice>,
    val result: PotionEffectType,
    val defaultTime: Int,
    val redstoneMultiplier: Double,
    val glowstoneMultiplier: Double,
    val maxDurationLevel: Int,
    val maxAmplifierLevel: Int
) : NovaRecipe, MultiInputChoiceRecipe {
    override val type = RecipeTypes.ELECTRIC_BREWING_STAND
}

class CrystallizerRecipe(
    key: NamespacedKey,
    input: RecipeChoice,
    result: ItemStack,
    time: Int
): ConversionNovaRecipe(key, input, result, time) {
    override val type = RecipeTypes.CRYSTALLIZER
}