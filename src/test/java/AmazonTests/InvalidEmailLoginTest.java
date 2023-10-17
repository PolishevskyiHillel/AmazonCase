package AmazonTests;

import AmazonPages.MainPage;
import Base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidEmailLoginTest extends BaseTest {

    private final static String BASE_URL = "https://www.amazon.com/";
    private final static String LOGIN = "s.polishevskiy";
    private final static String EXPECTED_TITLE = "We cannot find an account with that email address";

    @Test
    @Owner("Polishevskyi")
    @Description("Test verify message title after set the wrong email")
    public void verifyTitleAfterSetWrongEmail() {
        Assert.assertTrue(new MainPage(BASE_URL)
                .clickOnSignInBtn()
                .addLoginToLoginField(LOGIN)
                .clickOnContinueBtnAndStayHere()
                .getErrorTitleMailPage()
                .contains(EXPECTED_TITLE));
    }
}
