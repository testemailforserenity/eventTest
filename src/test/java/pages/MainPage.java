package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MainPage extends PageObject {

    @FindBy(xpath = "//a[contains(@href, '/Sys/Login/SwitchToAdmin')]")
    public WebElementFacade admin;

    @FindBy(xpath ="//*[@id='idShadingMessageContainer']")
    public WebElementFacade loadingCircleShade;

}
