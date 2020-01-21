package java23种设计模式.工厂方法模式;

public class Test1 {
    public static void main(String[] args) {
        AbstractFactory factory = new Factory1();
        factory.produce().show();
        AbstractFactory factory1 = new Factory2();
        factory1.produce().show();
    }
}
