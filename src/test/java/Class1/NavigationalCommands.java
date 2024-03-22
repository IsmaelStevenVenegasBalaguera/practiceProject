package Class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");

        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);

       driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        driver.close();



    }
}
