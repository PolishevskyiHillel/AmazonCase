package AmazonPages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AfterLoginPage {

    private final SelenideElement nameOnTheTopOfThePage = $x("//span[@id='nav-link-accountList-nav-line-1']");

    public String getCurrentTitleMainPage() {
        return nameOnTheTopOfThePage.getAttribute("innerText");
    }

}
