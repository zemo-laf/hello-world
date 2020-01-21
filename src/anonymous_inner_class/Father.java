package anonymous_inner_class;

/**
 * 接口里能声明方法和属性：
 *  方法不能有方法体，默认是用public，abstract修饰
 *  属性的初始化，默认使用用final，static修饰
 *
 *  接口好处：
 *      1、弥补java中类不能多继承的缺陷
 *      2、解耦合
 *      3、有利于团队开发
 */
public interface Father {
    static final  String name="";

    abstract void eat();
    public void sleep();
}
