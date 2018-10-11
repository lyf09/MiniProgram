package com.cloud.infrastructure.common.utils.function;


import java.util.UUID;

public abstract class FunctionUtils {
    public FunctionUtils() {
    }

    public static Boolean isNullOrEmpty(String obj) {
        if (null == obj) {
            return Boolean.TRUE;
        } else if ("".equals(obj)) {
            return Boolean.TRUE;
        } else {
            return "".equals(obj.trim()) ? Boolean.TRUE : Boolean.FALSE;
        }
    }

    public static Boolean isNullOrEmpty(Object obj) {
        return null == obj ? Boolean.TRUE : Boolean.FALSE;
    }

    public static String uuid(Boolean upperCase) {
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        return upperCase.booleanValue() ? uuid.toUpperCase() : uuid;
    }

    public static String uuid() {
        return uuid(true);
    }

    public static String uuid64(Boolean upperCase) {
        return uuid(upperCase) + uuid(upperCase);
    }

    public static String uuid64() {
        return uuid() + uuid();
    }

    public static String md5(String value) {
        return null;
    }
}

