package AmazonPages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private final SelenideElement signInBtn = $x("//span[normalize-space()='Account & Lists']");

    public MainPage(String url) {
        Selenide.open(url);
    }

    public SignInPage clickOnSignInBtn() {
        signInBtn.click();
        return new SignInPage();
    }
}