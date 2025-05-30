package com.homihq.db2rest.multidb;

public abstract class DatabaseContextHolder {


    private static final ThreadLocal<String> currentDb = new ThreadLocal<>();

    public static String getCurrentDbId() {
        return currentDb.get();
    }

    public static void setCurrentDbId(String tenant) {
        currentDb.set(tenant);
    }

    public static void clear() {
        currentDb.remove();
    }

}
