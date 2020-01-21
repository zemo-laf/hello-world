package 反射.other;


/**
 * System Config
 * @author T
 * @since 20180530
 */
public class Configuration {

    public static String sysName = "系统名称";

    public static String sysVer = "系统版本";

    public static String resVer = "静态资源版本";

    public static String support = "技术支持";

    public static String copyright = "版权声明";

    public static final boolean initConfig() {
        String[] names = new String[]{"sysName", "sysVer", "resVer", "support", "copyright"};

        String value = null;
        try {
            for (String name : names) {
                value = PropertiesUtils.get(name);
                if (value.length() > 0) {
                    Configuration.class.getField(name).set(Configuration.class, value);
                }
                 System.out.println(name + "=" + Configuration.class.getField(name).get(Configuration.class));
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}
