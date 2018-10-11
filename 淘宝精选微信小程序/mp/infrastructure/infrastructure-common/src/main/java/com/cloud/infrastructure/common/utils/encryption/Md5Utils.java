package com.cloud.infrastructure.common.utils.encryption;

import java.security.MessageDigest;

public abstract class Md5Utils {
    public Md5Utils() {
    }

    public static String md5(String value, String salt) {
        return md5(value + salt);
    }

    public static String md5(String value) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(value.getBytes());
            byte[] b = md.digest();
            StringBuffer buf = new StringBuffer("");

            for(int offset = 0; offset < b.length; ++offset) {
                int i = b[offset];
                if (i < 0) {
                    i += 256;
                }

                if (i < 16) {
                    buf.append("0");
                }

                buf.append(Integer.toHexString(i));
            }

            return buf.toString();
        } catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }
}
