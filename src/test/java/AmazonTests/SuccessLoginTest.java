package AmazonTests;

import AmazonPages.MainPage;
import Base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SuccessLoginTest extends BaseTest {

    private final static String BASE_URL = "https://www.amazon.com/";
    private final static String LOGIN = "s.polishevskiy@gmail.com";
    private final static String PASSWORD = "Test0101";
    private final static String EXPECTED_TITLE = "Hello, s.polishevskiy";

    @Test
    @Owner("Polishevskyi")
    @Description("Test verify successful login")
    public void verifyTitleAfterSignIn() {
        Assert.assertTrue(new MainPage(BASE_URL)
                .clickOnSignInBtn()
                .addLoginToLoginField(LOGIN)
                .clickOnContinueBtn()
                .addLPasswordToPasswordField(PASSWORD)
                .clickOnSignInBtn()
                .getCurrentTitleMainPage()
                .contains(EXPECTED_TITLE));
    }
}
