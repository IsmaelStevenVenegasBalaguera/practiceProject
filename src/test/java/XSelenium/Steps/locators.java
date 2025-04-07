package XSelenium.Steps;

import XSelenium.Pages.page1;
import XSelenium.commonMethods.commonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators extends commonMethods {
    public static void main(String[] args) throws InterruptedException {
        openBrowser("http://www.bible.com");
        click(page1.login1);
        click(page1.signIn);
        sendText(page2.enterEmail,"istevenvb@gmail.com");
        sendText(page2.enterPassword, "BiblePassword");
        click(page2.signIn2);
        click(page2.bannerButton);


    }
}
