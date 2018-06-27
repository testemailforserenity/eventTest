package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://testorganizationname10.wildapricot.org")
public class LoginPage extends PageObject {


    @FindBy(xpath ="//*[@class='loginBoxLinkButton']")
    public WebElementFacade loginButton;


    @FindBy(xpath =".//input[@id='ctl00_ContentArea_loginViewControl_loginControl_userName']")
    public WebElementFacade loginForm;

    @FindBy(xpath =".//input[@id='ctl00_ContentArea_loginViewControl_loginControl_Password']")
    public WebElementFacade passwordForm;


    @FindBy(xpath =".//input[@id='ctl00_ContentArea_loginViewControl_loginControl_Login']")
    public WebElementFacade buttonForLogin;




}

