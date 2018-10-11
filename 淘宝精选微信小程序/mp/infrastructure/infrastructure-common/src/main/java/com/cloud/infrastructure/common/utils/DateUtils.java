package com.cloud.infrastructure.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class DateUtils {

    public static Date parse(String value, String format){
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        try {
            return sdf.parse(value);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Date parse(String value){
        return parse(value, "yyyy-MM-dd HH:mm:ss");
    }

    public static Date parseShort(String value){
        return parse(value, "yyyy-MM-dd");
    }
}
