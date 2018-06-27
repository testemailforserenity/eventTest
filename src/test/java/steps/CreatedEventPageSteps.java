package steps;

import net.serenitybdd.core.pages.PageObject;
import pages.CreatedEventPage;
import ru.yandex.qatools.allure.annotations.Step;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CreatedEventPageSteps extends PageObject {

    CreatedEventPage createdEventPage;


    @Step("")
    public void afterSaveCheck (String titleName, String startDate) {

        String saveTitle = createdEventPage.tittleHeader.getText().toString();
        String title = createdEventPage.tittleHeader.getText().toString();
        assertEquals(saveTitle, titleName);
        assertEquals(saveTitle, title);

        String savedStartDate = createdEventPage.startDate.getText().toString();

        assertEquals(startDate, savedStartDate);


    }


    @Step("")
    public void afterSaveCheckRegistartionEnabled (String titleName, String startDate, String registrationStartDate) {

        afterSaveCheck(titleName,startDate);
        String savedRegistrationStartDate = createdEventPage.registrationStartDate.getText().toString();

        assertTrue(savedRegistrationStartDate.contains("From "+ registrationStartDate));

    }


    @Step("")
    public void afterSaveCheckGuestsEnabled (String titleName, String startDate, String guestCount) {

        afterSaveCheck(titleName,startDate);
        assertEquals("Allow guest registrations", createdEventPage.allowGuestRegistrations.getText().toString());
        assertEquals(guestCount + " per registrant", createdEventPage.guestRegistrationsMaxCount.getText().toString());

    }
}
