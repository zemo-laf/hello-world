package anonymous_inner_class;

/**
 * 匿名内部类的好处：
 *      1、隐藏自身
 *      2、可以实现或者继承接口或类中的私有成员
 *      3、节省代码
 *
 *
 *
 */
public class Test1 {
    Father f=new Father() {
        @Override
        public void eat() {

        }

        @Override
        public void sleep() {

        }
//        static int i=10;   报错 不能有静态资源

    };

}
