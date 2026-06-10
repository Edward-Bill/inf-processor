package infprocessor;

import mindustry.type.Category;
import mindustry.world.blocks.logic.MemoryBlock;
import mindustry.world.meta.BuildVisibility;

public class InfMemory extends MemoryBlock {

    public InfMemory(String name) {
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
        memoryCapacity = 4096;

    };

    @Override
    public boolean accessible() {
        return true;
    }
};
