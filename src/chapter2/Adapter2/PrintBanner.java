package chapter2.Adapter2;

/**
 * Created by Pengzili on 2017/7/11.
 */
public class PrintBanner extends Print {
    private Banner banner;

    public PrintBanner(String string){
        this.banner = new Banner(string);
    }

    public void printWeak() {
        this.banner.showWithParen();
    }

    public void printStrong() {
        this.banner.showWithAster();
    }
}
