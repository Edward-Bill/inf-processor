package infprocessor;

import mindustry.world.blocks.logic.LogicBlock;

public class InfProcessorBlock extends LogicBlock {

    public InfProcessorBlock(String name) {
        super(name);
        privileged = true;
    };

    // :: to allow configure processors
    /*
    @Override
    public boolean canConfigure() { 
        return true;
    };

    // :: to allow breaking processors
    @Override
    public boolean canBreak() {
        return true;
    };

    // :: returns true always, so we can get rid of editor mode and configure world processors in any gamemode
    @Override
    public boolean isEditor() {
        return false;
    };
    */// :: commented because can just bypass accessible()

    @Override
    public boolean accessible() {
        return true;
    }
};
