package 反射.other;

import java.util.Properties;

public class PropertiesUtils {

    private static Properties props = new Properties();

    public static final String get(String key) {
        return props.getProperty(key, "");
    }

    // 省略 Properties.load() 等其他相关代码
}
