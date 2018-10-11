package com.cloud.infrastructure.web.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter implements Converter<String, Date> {
    public DateConverter() {
    }

    public Date convert(String source) {
        String[] formats = new String[]{"yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm", "yyyy-MM-dd", "yyyy/MM/dd HH:mm:ss"};
        int index = 0;
        while(index < formats.length) {
            String format = formats[index];
            try {
                SimpleDateFormat sdf = new SimpleDateFormat(format);
                sdf.setLenient(false);
                return sdf.parse(source);
            } catch (Exception e) {
                ++index;
            }
        }
        return null;
    }
}