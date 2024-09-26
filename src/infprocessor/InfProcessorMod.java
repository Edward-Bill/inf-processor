package infprocessor;

import mindustry.mod.Mod;
import mindustry.type.Category;
import mindustry.world.Block;
import mindustry.content.Items;


import static mindustry.type.ItemStack.with;

import arc.util.Log;

public class InfProcessorMod extends Mod {

    public static Block worldProcessor2;

    @Override
    public void loadContent() {
        Log.info("000000000000000\\nInf-Processor блок зарегистрирован 2");
        worldProcessor2 = new InfProcessor("world-processor-2") {{
            requirements(Category.logic, with(Items.copper, 100, Items.lead, 100));
            size = 1;
            
        }};
    }
    
}
