package chapter5;

/**
 * Created by Pengzili on 2017/6/23.
 */
public class Singleton1 {
    private static Singleton1 singleton1 = new Singleton1();

    private Singleton1() {
        System.out.println("生成了一个实例.");
    }

    public static Singleton1 getInstance() {
        return singleton1;
    }
}
