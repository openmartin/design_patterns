package chapter5;

/**
 * Created by Pengzili on 2017/6/23.
 */
public class Singleton2 {
    private static Singleton2 instance = null;

    private Singleton2() {
        System.out.println("生成了一个实例.");
    }

    public static synchronized Singleton2 getInstance() {
        if (instance == null){
            instance = new Singleton2();
        }
        return instance;
    }
}
