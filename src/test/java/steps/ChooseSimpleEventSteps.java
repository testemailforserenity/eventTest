package steps;

import net.serenitybdd.core.pages.PageObject;
import pages.ChooseEvenTypePage;
import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.concurrent.TimeUnit;

public class ChooseSimpleEventSteps  extends PageObject {

    MainPage mainPage;
    ChooseEvenTypePage chooseEvenTypePage;

    @Step("Создание простого события")
    public void chooseSimpleEvent () throws  Exception{
        mainPage.admin.waitUntilClickable().click();
        mainPage.loadingCircleShade.waitUntilNotVisible();
        chooseEvenTypePage.adminEvents.waitUntilEnabled().waitUntilClickable().click();
        chooseEvenTypePage.createEvent.waitUntilEnabled().waitUntilClickable().click();
        mainPage.loadingCircleShade.waitUntilNotVisible();
        TimeUnit.SECONDS.sleep(3);
        chooseEvenTypePage.simpleEvent.waitUntilEnabled().waitUntilClickable().click();

    }
}
