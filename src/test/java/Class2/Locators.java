package Class2;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Locators {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        WebElement cookies= driver.findElement(By.xpath("//button[contains(text(),'Permitir')]"));
        cookies.click();
        WebElement email= driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("MariviEsUnaEnamorada@Mariconada.com");
       Thread.sleep(300);

        WebElement password= driver.findElement(By.id("pass"));
        password.sendKeys("lolalola");
        WebElement login= driver.findElement(By.name("login"));
        login.click();

        TakesScreenshot ts=(TakesScreenshot) driver;
        File ss= ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(ss,new File("C:\\Users\\35269\\Desktop\\GIT\\Javadocs\\PersonalSelenium\\screenshots\\abc.jpg"));

        driver.close();



    }
}
