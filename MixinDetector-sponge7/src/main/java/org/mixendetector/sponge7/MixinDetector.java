package org.mixendetector.sponge;

import com.google.inject.Inject;
import org.slf4j.Logger;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.plugin.Plugin;

@Plugin(
        id = "mixindetector-sponge",
        name = "MixinDetector",
        description = "Detects all mods/plugins that provide mixins",
        authors = {
                "mosemister"
        }
)
public class MixinDetector {

    @Inject
    private Logger logger;

    @Listener
    public void onServerStart(GameStartedServerEvent event) {
    }
}
