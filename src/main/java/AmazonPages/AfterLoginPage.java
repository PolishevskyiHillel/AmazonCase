package AmazonPages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class AfterLoginPage {

    private final SelenideElement nameOnTheTopOfThePage = $x("//span[@id='nav-link-accountList-nav-line-1']");

    @Step("Get current title Main Page")
    public String getCurrentTitleMainPage() {
        return nameOnTheTopOfThePage.getAttribute("innerText");
    }

}
