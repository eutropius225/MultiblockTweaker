package eutros.multiblocktweaker.crafttweaker.gtwrap.constants;

import crafttweaker.annotations.ZenRegister;
import eutros.multiblocktweaker.crafttweaker.gtwrap.impl.MCTextureArea;
import eutros.multiblocktweaker.crafttweaker.gtwrap.interfaces.ITextureArea;
import gregtech.api.gui.GuiTextures;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenProperty;

@ZenClass("mods.gregtech.render.GuiTextures")
@ZenRegister
public class ConstantGuiTextures {

    /**
     *
     */
    @ZenProperty
    public static final ITextureArea BACKGROUND = new MCTextureArea(GuiTextures.BACKGROUND);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea BORDERED_BACKGROUND = new MCTextureArea(GuiTextures.BORDERED_BACKGROUND);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea SLOT = new MCTextureArea(GuiTextures.SLOT);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea FLUID_SLOT = new MCTextureArea(GuiTextures.FLUID_SLOT);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea DISPLAY = new MCTextureArea(GuiTextures.DISPLAY);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea FLUID_TANK_BACKGROUND = new MCTextureArea(GuiTextures.FLUID_TANK_BACKGROUND);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea FLUID_TANK_OVERLAY = new MCTextureArea(GuiTextures.FLUID_TANK_OVERLAY);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea BUTTON_FLUID_OUTPUT = new MCTextureArea(GuiTextures.BUTTON_FLUID_OUTPUT);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea BUTTON_ITEM_OUTPUT = new MCTextureArea(GuiTextures.BUTTON_ITEM_OUTPUT);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea VANILLA_BUTTON = new MCTextureArea(GuiTextures.VANILLA_BUTTON);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea BUTTON = new MCTextureArea(GuiTextures.BUTTON);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea SWITCH = new MCTextureArea(GuiTextures.SWITCH);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea SWITCH_HORIZONTAL = new MCTextureArea(GuiTextures.SWITCH_HORIZONTAL);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea BUTTON_FILTER_DAMAGE = new MCTextureArea(GuiTextures.BUTTON_FILTER_DAMAGE);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea BUTTON_OVERCLOCK = new MCTextureArea(GuiTextures.BUTTON_OVERCLOCK);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea BUTTON_FILTER_NBT = new MCTextureArea(GuiTextures.BUTTON_FILTER_NBT);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea BUTTON_BLACKLIST = new MCTextureArea(GuiTextures.BUTTON_BLACKLIST);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea BUTTON_SWITCH_VIEW = new MCTextureArea(GuiTextures.BUTTON_SWITCH_VIEW);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea BUTTON_ALLOW_IMPORT_EXPORT = new MCTextureArea(GuiTextures.BUTTON_ALLOW_IMPORT_EXPORT);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea INDICATOR_NO_ENERGY = new MCTextureArea(GuiTextures.INDICATOR_NO_ENERGY);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea TANK_ICON = new MCTextureArea(GuiTextures.TANK_ICON);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea SLIDER_BACKGROUND = new MCTextureArea(GuiTextures.SLIDER_BACKGROUND);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea SLIDER_ICON = new MCTextureArea(GuiTextures.SLIDER_ICON);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea BRONZE_BACKGROUND = new MCTextureArea(GuiTextures.BRONZE_BACKGROUND);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea BRONZE_SLOT = new MCTextureArea(GuiTextures.BRONZE_SLOT);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea BRONZE_BLAST_FURNACE_PROGRESS_BAR = new MCTextureArea(GuiTextures.BRONZE_BLAST_FURNACE_PROGRESS_BAR);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea BRONZE_FURNACE_OVERLAY = new MCTextureArea(GuiTextures.BRONZE_FURNACE_OVERLAY);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea BRONZE_INGOT_OVERLAY = new MCTextureArea(GuiTextures.BRONZE_INGOT_OVERLAY);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea BRONZE_DUST_OVERLAY = new MCTextureArea(GuiTextures.BRONZE_DUST_OVERLAY);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea ARROW_INPUT_OVERLAY = new MCTextureArea(GuiTextures.ARROW_INPUT_OVERLAY);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea ARROW_OUTPUT_OVERLAY = new MCTextureArea(GuiTextures.ARROW_OUTPUT_OVERLAY);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea CHARGER_OVERLAY = new MCTextureArea(GuiTextures.CHARGER_OVERLAY);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea INT_CIRCUIT_OVERLAY = new MCTextureArea(GuiTextures.INT_CIRCUIT_OVERLAY);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea TURBINE_OVERLAY = new MCTextureArea(GuiTextures.TURBINE_OVERLAY);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea FURNACE_OVERLAY = new MCTextureArea(GuiTextures.FURNACE_OVERLAY);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea COMPRESSOR_OVERLAY = new MCTextureArea(GuiTextures.COMPRESSOR_OVERLAY);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea EXTRACTOR_OVERLAY = new MCTextureArea(GuiTextures.EXTRACTOR_OVERLAY);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea CRUSHED_ORE_OVERLAY = new MCTextureArea(GuiTextures.CRUSHED_ORE_OVERLAY);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea DUST_OVERLAY = new MCTextureArea(GuiTextures.DUST_OVERLAY);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea INGOT_OVERLAY = new MCTextureArea(GuiTextures.INGOT_OVERLAY);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea CIRCUIT_OVERLAY = new MCTextureArea(GuiTextures.CIRCUIT_OVERLAY);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea BATTERY_OVERLAY = new MCTextureArea(GuiTextures.BATTERY_OVERLAY);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea PRESS_OVERLAY_1 = new MCTextureArea(GuiTextures.PRESS_OVERLAY_1);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea PRESS_OVERLAY_2 = new MCTextureArea(GuiTextures.PRESS_OVERLAY_2);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea PRESS_OVERLAY_3 = new MCTextureArea(GuiTextures.PRESS_OVERLAY_3);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea DARK_CANISTER_OVERLAY = new MCTextureArea(GuiTextures.DARK_CANISTER_OVERLAY);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea CANISTER_OVERLAY = new MCTextureArea(GuiTextures.CANISTER_OVERLAY);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea LENS_OVERLAY = new MCTextureArea(GuiTextures.LENS_OVERLAY);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea CRYSTAL_OVERLAY = new MCTextureArea(GuiTextures.CRYSTAL_OVERLAY);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea BREWER_OVERLAY = new MCTextureArea(GuiTextures.BREWER_OVERLAY);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea SOLIDIFIER_OVERLAY = new MCTextureArea(GuiTextures.SOLIDIFIER_OVERLAY);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea MOLECULAR_OVERLAY_1 = new MCTextureArea(GuiTextures.MOLECULAR_OVERLAY_1);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea MOLECULAR_OVERLAY_2 = new MCTextureArea(GuiTextures.MOLECULAR_OVERLAY_2);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea MOLECULAR_OVERLAY_3 = new MCTextureArea(GuiTextures.MOLECULAR_OVERLAY_3);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea VIAL_OVERLAY_1 = new MCTextureArea(GuiTextures.VIAL_OVERLAY_1);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea VIAL_OVERLAY_2 = new MCTextureArea(GuiTextures.VIAL_OVERLAY_2);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea WIREMILL_OVERLAY = new MCTextureArea(GuiTextures.WIREMILL_OVERLAY);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea BENDER_OVERLAY = new MCTextureArea(GuiTextures.BENDER_OVERLAY);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea CANNER_OVERLAY = new MCTextureArea(GuiTextures.CANNER_OVERLAY);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea PIPE_OVERLAY_1 = new MCTextureArea(GuiTextures.PIPE_OVERLAY_1);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea PIPE_OVERLAY_2 = new MCTextureArea(GuiTextures.PIPE_OVERLAY_2);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea BOX_OVERLAY = new MCTextureArea(GuiTextures.BOX_OVERLAY);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea BOXED_OVERLAY = new MCTextureArea(GuiTextures.BOXED_OVERLAY);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea CUTTER_OVERLAY = new MCTextureArea(GuiTextures.CUTTER_OVERLAY);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea MOLD_OVERLAY = new MCTextureArea(GuiTextures.MOLD_OVERLAY);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea HAMMER_OVERLAY = new MCTextureArea(GuiTextures.HAMMER_OVERLAY);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea PAPER_OVERLAY = new MCTextureArea(GuiTextures.PAPER_OVERLAY);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea PRINTED_PAPER_OVERLAY = new MCTextureArea(GuiTextures.PRINTED_PAPER_OVERLAY);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea IN_SLOT_OVERLAY = new MCTextureArea(GuiTextures.IN_SLOT_OVERLAY);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea OUT_SLOT_OVERLAY = new MCTextureArea(GuiTextures.OUT_SLOT_OVERLAY);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea FILTER_SLOT_OVERLAY = new MCTextureArea(GuiTextures.FILTER_SLOT_OVERLAY);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea STRING_SLOT_OVERLAY = new MCTextureArea(GuiTextures.STRING_SLOT_OVERLAY);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea PROGRESS_BAR_UNLOCK = new MCTextureArea(GuiTextures.PROGRESS_BAR_UNLOCK);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea PROGRESS_BAR_ARROW = new MCTextureArea(GuiTextures.PROGRESS_BAR_ARROW);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea PROGRESS_BAR_ARROW_MULTIPLE = new MCTextureArea(GuiTextures.PROGRESS_BAR_ARROW_MULTIPLE);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea PROGRESS_BAR_BATH = new MCTextureArea(GuiTextures.PROGRESS_BAR_BATH);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea PROGRESS_BAR_BENDING = new MCTextureArea(GuiTextures.PROGRESS_BAR_BENDING);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea PROGRESS_BAR_CANNER = new MCTextureArea(GuiTextures.PROGRESS_BAR_CANNER);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea PROGRESS_BAR_CIRCUIT = new MCTextureArea(GuiTextures.PROGRESS_BAR_CIRCUIT);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea PROGRESS_BAR_COMPRESS = new MCTextureArea(GuiTextures.PROGRESS_BAR_COMPRESS);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea PROGRESS_BAR_EXTRACT = new MCTextureArea(GuiTextures.PROGRESS_BAR_EXTRACT);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea PROGRESS_BAR_EXTRUDER = new MCTextureArea(GuiTextures.PROGRESS_BAR_EXTRUDER);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea PROGRESS_BAR_HAMMER = new MCTextureArea(GuiTextures.PROGRESS_BAR_HAMMER);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea PROGRESS_BAR_LATHE = new MCTextureArea(GuiTextures.PROGRESS_BAR_LATHE);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea PROGRESS_BAR_MACERATE = new MCTextureArea(GuiTextures.PROGRESS_BAR_MACERATE);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea PROGRESS_BAR_MAGNET = new MCTextureArea(GuiTextures.PROGRESS_BAR_MAGNET);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea PROGRESS_BAR_RECYCLER = new MCTextureArea(GuiTextures.PROGRESS_BAR_RECYCLER);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea PROGRESS_BAR_SIFT = new MCTextureArea(GuiTextures.PROGRESS_BAR_SIFT);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea PROGRESS_BAR_SLICE = new MCTextureArea(GuiTextures.PROGRESS_BAR_SLICE);
    /**
     *
     */
    @ZenProperty
    public static final ITextureArea PROGRESS_BAR_WIREMILL = new MCTextureArea(GuiTextures.PROGRESS_BAR_WIREMILL);

}
