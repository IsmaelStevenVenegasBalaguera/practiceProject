package XSelenium.commonMethods;

import XSelenium.Pages.Page1Facebook;
import XSelenium.Pages.PageGoogle;
import XSelenium.Pages.page1;
import XSelenium.Pages.page2;

public class pInitializer {
    public static page1 page1;
    public static page2 page2;
    public static PageGoogle pageGoogle;
    public static Page1Facebook page1Facebook;

    public static void pageInitializerObject(){
        page1=new page1();
        page2=new page2();
        pageGoogle=new PageGoogle();
        page1Facebook=new Page1Facebook();

    }

}
