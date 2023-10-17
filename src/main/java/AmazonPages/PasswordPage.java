package AmazonPages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class PasswordPage extends AfterLoginPage {

    private final SelenideElement passwordField = $x("//input[@id='ap_password']");
    private final SelenideElement signInSubmit = $x("//input[@id='signInSubmit']");
    private final SelenideElement errorPasswordText = $x("//span[@class='a-list-item']");

    @Step("Add {password} to password field")
    public PasswordPage addLPasswordToPasswordField(String password) {
        passwordField.setValue(password);
        return this;
    }

    @Step("Click on Sign In button")
    public AfterLoginPage clickOnSignInBtn() {
        signInSubmit.click();
        return new AfterLoginPage();
    }

    @Step("Click on Sign In button and stay here")
    public PasswordPage clickOnSignInBtnAndStayHere() {
        signInSubmit.click();
        return new PasswordPage();
    }

    @Step("Get error title Password Page")
    public String getErrorTitlePasswordPage() {
        return errorPasswordText.getAttribute("innerText");
    }
}
