package java23种设计模式.工厂方法模式;

public class Factory1 implements AbstractFactory{
    @Override
    public AbstractProduct produce() {
        System.out.println("工厂‘1’生产了产品‘1’");
        return new Product1();
    }
}
