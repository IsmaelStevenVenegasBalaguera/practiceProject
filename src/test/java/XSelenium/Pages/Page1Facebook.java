package XSelenium.Pages;

import XSelenium.commonMethods.commonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page1Facebook extends commonMethods {
    @FindBy(xpath = "//*[@id='facebook']/body/div[3]/div[2]/div/div/div/div/div[3]/div[2]/div/div[2]/div[1]/div")
    public WebElement accept;

    public Page1Facebook(){PageFactory.initElements(driver,this);}
}
