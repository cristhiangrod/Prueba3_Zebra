package com.example.zebraprinterlibrary.Utils;

import java.util.UUID;

public class Utils {
    public static String GUID() {
        UUID uuid = UUID.randomUUID();
        String str = uuid.toString();
        String uuidStr = str.replace("-", "");
        return uuidStr;
    }
}
