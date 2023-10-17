package AmazonPages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class PasswordPage extends AfterLoginPage {

    private final SelenideElement passwordField = $x("//input[@id='ap_password']");
    private final SelenideElement signInSubmit = $x("//input[@id='signInSubmit']");
    private final SelenideElement errorPasswordText = $x("//span[@class='a-list-item']");

    public PasswordPage addLPasswordToPasswordField(String password) {
        passwordField.setValue(password);
        return this;
    }

    public AfterLoginPage clickOnSignInBtn() {
        signInSubmit.click();
        return new AfterLoginPage();
    }

    public PasswordPage clickOnSignInBtnAndStayHere() {
        signInSubmit.click();
        return new PasswordPage();
    }

    public String getErrorTitlePasswordPage() {
        return errorPasswordText.getAttribute("innerText");
    }
}
