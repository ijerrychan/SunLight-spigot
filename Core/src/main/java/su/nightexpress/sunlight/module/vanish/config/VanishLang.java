package su.nightexpress.sunlight.module.vanish.config;

import su.nightexpress.nightcore.language.entry.LangString;
import su.nightexpress.nightcore.language.entry.LangText;

import static su.nightexpress.nightcore.util.text.tag.Tags.*;
import static su.nightexpress.sunlight.Placeholders.*;

public class VanishLang {

    public static final LangString COMMAND_VANISH_DESC = LangString.of("Command.Vanish.Desc", "Toggle Vanish.");

    public static final LangText COMMAND_VANISH_NOTIFY = LangText.of("Command.Vanish.Notify",
        LIGHT_GRAY.enclose("Vanish has been set on " + LIGHT_YELLOW.enclose(GENERIC_STATE) + ".")
    );

    public static final LangText COMMAND_VANISH_TARGET = LangText.of("Command.Vanish.Target",
        LIGHT_GRAY.enclose("Set Vanish on " + LIGHT_YELLOW.enclose(GENERIC_STATE) + " for " + LIGHT_YELLOW.enclose(PLAYER_DISPLAY_NAME) + ".")
    );
}
