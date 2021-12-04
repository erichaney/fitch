package com.ehaney.fitch;

import java.util.Map;
import java.util.Set;

public class Aliases {
    private static Map<String, String> aliases = Map.ofEntries(
            Map.entry("/neg", "¬"),
            Map.entry("/and", "∧"),
            Map.entry("/or", "∨"),
            Map.entry("/to", "→"),
            Map.entry("/iff", "⟷")
    );

    public static Set<String> getKeys() {
        return aliases.keySet();
    }

    public static String convert(String alias) {
        if (aliases.containsKey(alias)) {
            return aliases.get(alias);
        } else {
            return "";
        }
    }
}
