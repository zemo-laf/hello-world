package 反射;

import 反射.other.Configuration;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        try {
            //获取类
            Class<?> men=Men.class;
//            System.out.println(men.getName());
//
//            //反射获取字段
//            Field[] fields = men.getDeclaredFields();
//            System.out.println(Arrays.toString(fields));
//            for (int i = 0; i < fields.length; i++){
//                System.out.println(fields[i]);
//            }

            //字段设置
            Field field = men.getField("height");
            Object obj = men.getConstructor().newInstance();
            field.set(obj,"年轻人");
            Men men1=(Men)obj;
            System.out.println(men1.getCharacter());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
