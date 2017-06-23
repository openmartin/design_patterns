package chapter5;

/**
 * Created by Pengzili on 2017/6/23.
 */
public class Singleton3 {
    private static Singleton3 instance = null;

    private Singleton3() {
        System.out.println("生成了一个实例.");
    }

    public static Singleton3 getInstance() {
        if (instance == null){
            synchronized (Singleton3.class){
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}
