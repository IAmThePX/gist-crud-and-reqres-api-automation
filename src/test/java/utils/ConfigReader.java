package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties = new Properties();

    static {
        try {
            FileInputStream fis = new FileInputStream("config.properties");
            properties.load(fis);
        } catch (IOException e) {
            // kalau file tidak ada, biarkan kosong
            e.printStackTrace();
        }
    }

    public static String get(String key) {
        // cek dulu di environment variable (untuk CI/CD)
        String value = System.getenv(key);
        if (value != null) {
            return value;
        }
        // kalau tidak ada, ambil dari config.properties
        return properties.getProperty(key);
    }
}