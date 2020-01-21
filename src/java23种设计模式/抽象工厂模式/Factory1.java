package java23种设计模式.抽象工厂模式;

public class Factory1 implements AbstractFactory {
    @Override
    public AbstractProduct produce1() {
        System.out.println("工厂‘1’生产了产品‘1-1’");
        return new Product1();
    }


    @Override
    public AbstractProduct produce2() {
        System.out.println("工厂‘1’生产了产品‘1-2’");
        return new Product1();
    }

    @Override
    public AbstractProduct produce3() {
        System.out.println("工厂‘1’生产了产品‘1-3’");
        return new Product1();
    }
}
