package enums;

public class TestEnum1 {
    public static void main(String[] args){
        System.out.println(Enum1.valueOf(Enum1.class,"three").ordinal());
    }
}
