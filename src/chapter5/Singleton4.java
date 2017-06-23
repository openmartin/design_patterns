package chapter5;

/**
 * Created by Pengzili on 2017/6/23.
 */
public class Singleton4 {
    private static class SingletonHolder {
        private static final Singleton4 INSTANCE = new Singleton4();
    }
    private Singleton4 (){}
    public static final Singleton4 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
