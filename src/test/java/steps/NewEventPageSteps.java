package steps;

import net.serenitybdd.core.pages.PageObject;
import pages.CreatingNewEventPage;
import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class NewEventPageSteps  extends PageObject {

    CreatingNewEventPage creatingNewEventPage;
    MainPage mainPage;

    @Step("Заполнение заголовка - название События")
    public String  fillEventTitle (String titleName)  throws Exception{

        mainPage.loadingCircleShade.waitUntilNotVisible();

        String genTitle = titleName + "_"+ UUID.randomUUID().toString();

        TimeUnit.SECONDS.sleep(2);

        creatingNewEventPage.title.waitUntilEnabled().waitUntilClickable().click();

        creatingNewEventPage.title.type(genTitle);


        return genTitle;

    }


    @Step("Заполнение даты начала события")
    public void  fillStartDate (String startDate) {
        creatingNewEventPage.startDateField.type(startDate);
    }


    @Step("Выбор возможности регистрации до начала события")
    public void  enableRegistration () {
        creatingNewEventPage.registrationEnable.waitUntilEnabled().waitUntilClickable().click();
    }


    @Step("Заполнение даты начала регистрации")
    public void  fillRegistrationStartDate (String registrationStartDate) {
        creatingNewEventPage.registartiionStartDateField.type(registrationStartDate);
    }


    @Step("Выбор возможности приглашения гостей")
    public void  enableAllowGuestRegistrations () {
        creatingNewEventPage.maxCountGuest.shouldNotBeEnabled();
        creatingNewEventPage.allowGuestRegistrationsCheckBox.waitUntilEnabled().waitUntilClickable().click();
        creatingNewEventPage.maxCountGuest.shouldBeEnabled();
    }


    @Step("Выбор максимального количества гостей")
    public void  fillMaxCounGuests (String maxCounGuests) {
        creatingNewEventPage.maxCountGuest.type(maxCounGuests);
    }

    @Step("Сохранение события")
    public void  saveEvent () {
        creatingNewEventPage.saveButton.waitUntilClickable().click();
    }








}

