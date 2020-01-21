package java23种设计模式.原型模式;

public class Test {
    public static void main(String[] args) {
        Prototype prototype=new Prototype();
        Prototype prototype1 = null;
        try {
            prototype1= (Prototype) (prototype).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
