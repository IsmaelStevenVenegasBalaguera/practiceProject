package Class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class introduction {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@id=\"L2AGLb\"]" )).click();
        String currentUrl= driver.getCurrentUrl();
        System.out.println(currentUrl);
        String tittle= driver.getTitle();
        System.out.println(tittle);
        Thread.sleep(3000);
        driver.quit();

    }


}
