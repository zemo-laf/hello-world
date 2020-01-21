package java23种设计模式.原型模式;

/**
 * 用一个已经创建的实例作为原型，通过复制该原型对象来创建一个和原型相同或相似的新对象
 */
public class Prototype implements Cloneable{
    Prototype(){
        System.out.println("原型");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("复制体");
        return (Prototype)super.clone();
    }
}
