package java23种设计模式.工厂方法模式;

public class Factory2 implements AbstractFactory{
    @Override
    public AbstractProduct produce() {
        System.out.println("工厂‘2’生产了产品‘2’");
        return new Product2();
    }
}
