package eutros.multiblocktweaker.crafttweaker.functions;

import crafttweaker.annotations.ZenRegister;
import eutros.multiblocktweaker.crafttweaker.gtwrap.interfaces.IRecipeLogic;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;

import javax.annotation.Nonnull;

/**
 * Called every time the worktable updates.
 *
 * @zenClass mods.gregtech.recipe.functions.IUpdateFunction
 */
@FunctionalInterface
@ZenClass("mods.gregtech.recipe.functions.IUpdateFunction")
@ZenRegister
public interface IUpdateFunction {

    /**
     * Called every time the worktable updates.
     * <p>
     * Implement this with a function.
     *
     * @param logic The {@link IRecipeLogic} of the multiblock from which this is run.
     */
    @ZenMethod
    void run(@Nonnull IRecipeLogic logic);

}
