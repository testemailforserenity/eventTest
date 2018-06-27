package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CreatingNewEventPage extends PageObject {

    @FindBy(xpath ="//*[@id='toolbarButtons_button_publishButton_buttonName']")
    public WebElementFacade adminEventsList;


    @FindBy(xpath =".//input[@id='eventDetailsMain_editTitle']")
    public WebElementFacade title;


    @FindBy(xpath =".//input[@id='eventDetailsMain_editDate']")
    public WebElementFacade startDateField;





    @FindBy(xpath ="//*[@id='toolbarButtons_button_publishButton_buttonName']")
    public WebElementFacade saveButton;

    @FindBy(xpath = "//*[@class='mainIFrameContainer']")
    public WebElementFacade frame;

    @FindBy(xpath = "//*[@class='mainIFrameContainer']")
    public WebElementFacade mainFrame;


    @FindBy(xpath ="//*[@class='xcontainer RadioButtonContainer']//label[contains(text(), 'Enabled')]")
    public WebElementFacade registrationEnable ;

    @FindBy(xpath =".//input[@id='eventDetailsMain_availablePeriodStartDate']")
    public WebElementFacade registartiionStartDateField;


    @FindBy(xpath ="//*[@id='allowCollectTotalNumberOfGuestRegistrationsCheckBox']")
    public WebElementFacade allowGuestRegistrationsCheckBox;

    @FindBy(xpath ="//*[@id='guestRegistrationsMaxCountTextBox']")
    public WebElementFacade maxCountGuest;



}

