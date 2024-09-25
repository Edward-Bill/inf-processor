package example;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class ExampleJavaMod extends Mod{

    public static Block infProcessor;

    @Override
    public void loadContent() {
        infProcessor = new InfProcessorBlock("inf-processor") {{
            requirements(Category.logic, BuildVisibility.shown, Items.copper, 100, Items.lead, 100);
            size = 3;
        }};
    }

}
