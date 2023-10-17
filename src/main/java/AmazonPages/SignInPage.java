package AmazonPages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SignInPage extends PasswordPage {

    private final SelenideElement loginField = $x("//input[@id='ap_email']");
    private final SelenideElement continueBtn = $x("//input[@id='continue']");
    private final SelenideElement errorEmailText = $x("//span[@class='a-list-item']");

    public SignInPage addLoginToLoginField(String login) {
        loginField.setValue(login);
        return this;
    }

    public PasswordPage clickOnContinueBtn() {
        continueBtn.click();
        return new PasswordPage();
    }

    public SignInPage clickOnContinueBtnAndStayHere() {
        continueBtn.click();
        return new SignInPage();
    }

    public String getErrorTitleMailPage() {
        return errorEmailText.getAttribute("innerText");
    }
}
