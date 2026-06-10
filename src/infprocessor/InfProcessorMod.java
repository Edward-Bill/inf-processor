package infprocessor;

import mindustry.mod.Mod;
import mindustry.type.Category;
import mindustry.world.Block;
import mindustry.content.Items;
import mindustry.game.EventType.WorldLoadEvent;
import arc.util.Timer;

import static mindustry.type.ItemStack.with;

import arc.Events;
import mindustry.Vars;

public class InfProcessorMod extends Mod {

    public static Block worldProcessor2;
    public static Block WorldMessage2;
    public static Block WorldSwitch2;
    public static Block WorldMemory2;

    @Override
    public void loadContent() {
        worldProcessor2 = new InfProcessor("world-processor-2") {{
            requirements(Category.logic, with(Items.copper, 100, Items.lead, 100, Items.silicon, 100));
            size = 1;
        }};

        WorldMessage2 = new InfMessage("world-message-2") {{
            requirements(Category.logic, with(Items.copper, 100, Items.lead, 100, Items.silicon, 100));
            size = 1;
        }};

         WorldSwitch2 = new InfSwitch("world-switch-2") {{
            requirements(Category.logic, with(Items.copper, 100, Items.lead, 100, Items.silicon, 100));
            size = 1;
        }};

        WorldMemory2 = new InfMemory("world-memory-2") {{
            requirements(Category.logic, with(Items.copper, 100, Items.lead, 100, Items.silicon, 100));
            size = 1;
        }};
    }

    public InfProcessorMod() {
        Events.on(WorldLoadEvent.class, event -> {
            arc.util.Time.run(1f, () -> {
                Vars.state.rules.allowEditWorldProcessors = true;
                Vars.state.rules.worldProcessorPlayerLink = true;
                Vars.state.rules.allowEditRules = true;
                Vars.state.rules.disableWorldProcessors = false;
            });
        });

        Timer.schedule(() -> {
            if (Vars.state.isPlaying()) {
                Vars.state.rules.allowEditWorldProcessors = true;
                Vars.state.rules.worldProcessorPlayerLink = true;
                Vars.state.rules.allowEditRules = true;
                Vars.state.rules.disableWorldProcessors = false;
            }
        }, 10f, 10f);
    }

}
