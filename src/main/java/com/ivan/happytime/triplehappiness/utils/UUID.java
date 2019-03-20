package com.ivan.happytime.triplehappiness.utils;


public class UUID {
    private UUID() {
    }

    public static synchronized String execute() {
        return java.util.UUID.randomUUID().toString().replaceAll("\\-", "");
    }

    public static synchronized String execute(String name) {
        byte[] bytes = name.getBytes();
        return java.util.UUID.nameUUIDFromBytes(bytes).toString().replaceAll("\\-", "");
    }
}
