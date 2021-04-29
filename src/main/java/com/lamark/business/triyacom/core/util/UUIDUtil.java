package com.lamark.business.triyacom.core.util;

import java.util.UUID;

public final class UUIDUtil {
    public UUIDUtil() {
    }

    public static String getPlainUUID() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().replaceAll("-", "");
    }
}