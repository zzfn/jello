package com.zzf.util;

import java.util.UUID;

public class UUIDUtil {
    public static String getUUID() {
        String uuid = UUID.randomUUID().toString();
        return uuid.replaceAll("-", "");
    }
}
