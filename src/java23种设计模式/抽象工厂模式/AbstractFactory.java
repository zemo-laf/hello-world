package java23种设计模式.抽象工厂模式;

/**
 * 象工厂模式的结构同工厂方法模式的结构相似，不同的是其产品的种类不止一个，所以创建产品的方法也不止一个
 *
 */
public interface AbstractFactory {
    public AbstractProduct produce1();
    public AbstractProduct produce2();
    public AbstractProduct produce3();
}
