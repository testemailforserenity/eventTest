package tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import pages.ChooseEvenTypePage;
import pages.CreatingNewEventPage;
import ru.yandex.qatools.allure.annotations.Title;
import steps.ChooseSimpleEventSteps;
import steps.CreatedEventPageSteps;
import steps.LoginSteps;
import steps.NewEventPageSteps;



@RunWith(SerenityRunner.class)
public class SimpleEventTests {

    @Managed(driver = "chrome")
    public WebDriver driver;


    CreatingNewEventPage creatingNewEventPage;

    LoginSteps loginSteps;
    ChooseSimpleEventSteps chooseSimpleEventSteps;
    NewEventPageSteps newEventPageSteps;
    CreatedEventPageSteps createdEventPageSteps;


    String startDate = "1 Aug 2018";
    String registrationStartDate = "30 Jul 2018";
    String maxCountGuests = "70";

    @Before
    public void before() throws Exception{
        //setImplicitTimeout(120, TimeUnit.SECONDS);
        loginSteps.openLoginPage();
        loginSteps.login("testemailforserenity@gmail.com", "testPassword");
        chooseSimpleEventSteps.chooseSimpleEvent();
    }


    @Test
    @Title("Тест на создание миниммального события")
    public void minamlEvent() throws Exception{

        driver.switchTo().frame(creatingNewEventPage.frame);
        String generatedTiltle = newEventPageSteps.fillEventTitle("TestTitle");
        newEventPageSteps.fillStartDate(startDate);
        driver.switchTo().parentFrame();
        newEventPageSteps.saveEvent();
        driver.switchTo().frame(creatingNewEventPage.mainFrame);
        createdEventPageSteps.afterSaveCheck(generatedTiltle, startDate);

    }



    @Test
    @Title("Тест на возможность регистрации до даты начала мероприятия")
    public void registartionEnabledEvent() throws Exception{

        driver.switchTo().frame(creatingNewEventPage.frame);
        String generatedTiltle = newEventPageSteps.fillEventTitle("TestTitle");
        newEventPageSteps.fillStartDate(startDate);
        newEventPageSteps.enableRegistration();
        newEventPageSteps.fillRegistrationStartDate(registrationStartDate);
        driver.switchTo().parentFrame();
        newEventPageSteps.saveEvent();
        driver.switchTo().frame(creatingNewEventPage.mainFrame);
        createdEventPageSteps.afterSaveCheckRegistartionEnabled(generatedTiltle, startDate, registrationStartDate);

    }


    @Test
    @Title("Тест на количество приглашеннных гостей")
    public void guestEvent() throws Exception{

        driver.switchTo().frame(creatingNewEventPage.frame);
        String generatedTiltle = newEventPageSteps.fillEventTitle("TestTitle");
        newEventPageSteps.fillStartDate(startDate);
        newEventPageSteps.enableAllowGuestRegistrations();
        newEventPageSteps.fillMaxCounGuests(maxCountGuests);
        driver.switchTo().parentFrame();
        newEventPageSteps.saveEvent();
        driver.switchTo().frame(creatingNewEventPage.mainFrame);
        createdEventPageSteps.afterSaveCheckGuestsEnabled(generatedTiltle, startDate,maxCountGuests);

    }



}
