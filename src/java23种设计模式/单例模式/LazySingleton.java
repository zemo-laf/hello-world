package java23种设计模式.单例模式;

/**
 * 以下volatile和synchronizd可以只用一个
 *
 *
 * 单例模式有 3 个特点：
 * 1、单例类只有一个实例对象；
 * 2、该单例对象必须由单例类自行创建；
 * 3、单例类对外提供一个访问该单例的全局访问点；
 */
public class LazySingleton {
    private static volatile LazySingleton instance = null;//保证 instance 在所有线程中同步
    private LazySingleton(){
    }
    public static synchronized LazySingleton getInstance(){//保证getInstance()方法在所有线程中同步
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
