package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        WebElement cookies= driver.findElement(By.xpath("//button[contains(text(),'Permitir')]"));
        cookies.click();
        WebElement email= driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("MariviEsUnaEnamorada@Mariconada.com");


    }
}
