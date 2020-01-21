package java23种设计模式.抽象工厂模式;

public class Factory2 implements AbstractFactory {
    @Override
    public AbstractProduct produce1() {
        System.out.println("工厂‘2’生产了产品‘2-1’");
        return new Product2();
    }

    @Override
    public AbstractProduct produce2() {
        System.out.println("工厂‘2’生产了产品‘2-2’");
        return new Product2();
    }

    @Override
    public AbstractProduct produce3() {
        System.out.println("工厂‘2’生产了产品‘2-3’");
        return new Product2();
    }
}
