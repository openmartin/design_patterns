package chapter2.Adapter1;

/**
 * Created by Pengzili on 2017/7/10.
 */
public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
