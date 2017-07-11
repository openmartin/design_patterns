package chapter2.Adapter1;

/**
 * Created by Pengzili on 2017/7/10.
 */
public class PrintBanner extends Banner implements Print {

    public PrintBanner(String string){
        super(string);
    }

    public void printWeak() {
        showWithParen();
    }

    public void printStrong() {
        showWithAster();
    }
}
