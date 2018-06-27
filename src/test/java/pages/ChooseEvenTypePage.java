package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ChooseEvenTypePage extends PageObject {


    @FindBy(xpath ="//*[@class='adminTopTabButton Events']")
    public WebElementFacade adminEvents;


    @FindBy(xpath ="//*[@id='WaAdminPanel_AdminMenu_AdminMenuEventsEventListEventListModule_addEventBtn_buttonName']")
    public WebElementFacade createEvent;


    @FindBy(xpath = "//a[contains(@href, '/admin/events/add-simple-event?DetailsDisplayMode=Add')]")
    public WebElementFacade simpleEvent;

}
