package java23种设计模式.工厂方法模式;

/**
 * 如果要创建的产品不多，只要一个工厂类就可以完成，这种模式叫“简单工厂模式”，
 * 它不属于 GoF 的 23 种经典设计模式，它的缺点是增加新产品时会违背“开闭原则”。
 *
 * 工厂方法模式的主要优点有：
 * 用户只需要知道具体工厂的名称就可得到所要的产品，无须知道产品的具体创建过程；
 * 在系统增加新的产品时只需要添加具体产品类和对应的具体工厂类，无须对原工厂进行任何修改，满足开闭原则；
 *
 * 其缺点是：每增加一个产品就要增加一个具体产品类和一个对应的具体工厂类，这增加了系统的复杂度。
 *
 */
public interface AbstractFactory {
    public AbstractProduct produce();
}
