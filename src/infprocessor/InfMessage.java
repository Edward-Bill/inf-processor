package infprocessor;

import mindustry.type.Category;
import mindustry.world.blocks.logic.MessageBlock;
import mindustry.world.meta.BuildVisibility;

public class InfMessage extends MessageBlock {

    public InfMessage(String name) {
        super(name);
        privileged = true;
        solid = true;
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
