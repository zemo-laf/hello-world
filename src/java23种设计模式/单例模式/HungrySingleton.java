package java23种设计模式.单例模式;

public class HungrySingleton {
    private static final  HungrySingleton instance = new HungrySingleton();
    private HungrySingleton(){}
    public static HungrySingleton getInstance(){
        return  instance;
    }

}
