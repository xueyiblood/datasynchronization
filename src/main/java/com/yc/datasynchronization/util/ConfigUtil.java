package com.yc.datasynchronization.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class ConfigUtil {
    /**
     * 获得值
     *
     * @param key 键
     * @return 值
     */
    public static String getConfig(String key) {
        Properties p;
        p = new Properties();
        FileInputStream fis = null;
        URL url;
        url = ConfigUtil.class.getClassLoader().getResource("config.properties");
        try {
            fis = new FileInputStream(url.getPath());
            p.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return p.getProperty(key);
    }
}
