package XSelenium.Pages;

import XSelenium.commonMethods.commonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class page1 extends commonMethods {
    @FindBy(xpath = "//button[@class='items-center justify-end bg-transparent hover:bg-gray-10 hover:dark:bg-canvas-dark inline-flex rounded-3 pli-1 pis-1.5 plb-0.5 h-auto']")
    public WebElement login1;
    @FindBy(xpath = "//*[@id='headlessui-popover-panel-:Rjcr9m:']/a[3]")
    public WebElement signIn;

    public page1(){
        PageFactory.initElements(driver,this);
    }

}
