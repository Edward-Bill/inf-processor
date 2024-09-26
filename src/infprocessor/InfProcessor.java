package infprocessor;

import mindustry.type.Category;
import mindustry.world.blocks.logic.LogicBlock;
import mindustry.world.meta.BuildVisibility;

public class InfProcessor extends LogicBlock {

    public InfProcessor(String name) {
        super(name);
        privileged = true;
        solid = true;
        range = 10000;
        instructionsPerTick = 1024;
        buildCostMultiplier = 0.25f;
        health = 1000;
        destructible = true;
        category = Category.logic;
        privileged = true;
        alwaysUnlocked = true;
        buildVisibility = BuildVisibility.shown;
    };

    @Override
    public boolean accessible() {
        return true;
    }
};
