package XSelenium;

import XSelenium.commonMethods.commonMethods;
import io.netty.util.Recycler;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class HANDLES extends commonMethods {
    public static void main(String[] args) throws InterruptedException {
        openBrowser("https://www.gmail.com");
        click(pageGoogle.privacy);
        Thread.sleep(3000);
        switchHandle("Gmail");
        Thread.sleep(3000);
        click(pageGoogle.help);
        Thread.sleep(3000);
        switchHandle("Gmail");
        Thread.sleep(3000);
        switchHandle("Política de Privacidad");






    }
}
