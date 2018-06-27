package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CreatedEventPage extends PageObject {


    @FindBy(xpath ="//*[@id='eventDetailsHeader_eventTitle']")
    public WebElementFacade tittleHeader;

    @FindBy(xpath ="//*[@id='eventDetailsMain_viewTitle']")
    public WebElementFacade tittle;


    @FindBy(xpath ="//*[@id='eventDetailsMain_viewDateAndTimeLabel']")
    public WebElementFacade startDate;

    @FindBy(xpath ="//*[@id='eventDetailsMain_viewAvailablePeriodLabel']")
    public WebElementFacade registrationStartDate;

    @FindBy(xpath ="//*[@id='eventDetailsMain_allowGuestRegistrationsLabel']")
    public WebElementFacade allowGuestRegistrations;


    @FindBy(xpath ="//*[@id='eventDetailsMain_guestRegistrationsMaxCountLabel']")
    public WebElementFacade guestRegistrationsMaxCount;
}
