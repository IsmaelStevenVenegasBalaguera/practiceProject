package XSelenium.BasicTable;

import XSelenium.commonMethods.commonMethods;
import groovy.lang.GString;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class SimpleTable extends commonMethods {
    public static void main(String[] args) {
        openBrowser("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
        WebElement aceptar= driver.findElement(By.xpath("//*[@id='ez-accept-necessary']"));
        aceptar.click();
        WebElement ok=driver.findElement(By.xpath("//*[@id='cookieChoiceDismiss']"));
        ok.click();

        List<WebElement> allElements=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[2]"));

        for (WebElement element:allElements){
            String content=element.getText();
            //if (content.equalsIgnoreCase("Giovanni Rovelli")){
                System.out.println(content);
            //}
        }

    }

}
