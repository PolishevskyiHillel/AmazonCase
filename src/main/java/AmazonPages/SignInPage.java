package AmazonPages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class SignInPage extends PasswordPage {

    private final SelenideElement loginField = $x("//input[@id='ap_email']");
    private final SelenideElement continueBtn = $x("//input[@id='continue']");
    private final SelenideElement errorEmailText = $x("//span[@class='a-list-item']");

    @Step("Add {login} to login field")
    public SignInPage addLoginToLoginField(String login) {
        loginField.setValue(login);
        return this;
    }

    @Step("Click on continue button")
    public PasswordPage clickOnContinueBtn() {
        continueBtn.click();
        return new PasswordPage();
    }

    @Step("Click on continue button and stay here")
    public SignInPage clickOnContinueBtnAndStayHere() {
        continueBtn.click();
        return new SignInPage();
    }

    @Step("Get error title Main Page")
    public String getErrorTitleMailPage() {
        return errorEmailText.getAttribute("innerText");
    }
}
