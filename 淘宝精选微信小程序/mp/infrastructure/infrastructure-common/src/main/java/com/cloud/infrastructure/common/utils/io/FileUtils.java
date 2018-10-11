package com.cloud.infrastructure.common.utils.io;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public abstract class FileUtils {
    public FileUtils() {
    }

    public static String read(String filePath) {
        StringBuilder sb = new StringBuilder();

        try {
            File file = new File(filePath);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String s = "";

            while((s = bufferedReader.readLine()) != null) {
                sb.append(s);
            }

            bufferedReader.close();
        } catch (Exception var5) {
            var5.printStackTrace();
        }

        return sb.toString();
    }
}