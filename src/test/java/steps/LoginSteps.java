package steps;

import net.serenitybdd.core.pages.PageObject;
import pages.LoginPage;
import ru.yandex.qatools.allure.annotations.Step;

public class LoginSteps extends PageObject {

    LoginPage loginPage;

    @Step("Открытие страницы логина")
    public void openLoginPage() {
        loginPage.open();
    }


    @Step("Логин на страницу")
    public void login (String login, String password) {

        loginPage.loginButton.waitUntilClickable().click();
        loginPage.loginForm.waitUntilEnabled().type(login);
        loginPage.passwordForm.waitUntilEnabled().type(password);
        loginPage.buttonForLogin.waitUntilClickable().click();

    }



}