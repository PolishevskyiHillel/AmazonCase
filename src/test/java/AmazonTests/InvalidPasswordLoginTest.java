package AmazonTests;

import AmazonPages.MainPage;
import Base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidPasswordLoginTest extends BaseTest {

    private final static String BASE_URL = "https://www.amazon.com/";
    private final static String LOGIN = "s.polishevskiy@gmail.com";
    private final static String PASSWORD = "Test";
    private final static String EXPECTED_TITLE = "Your password is incorrect";

    @Test
    @Owner("Polishevskyi")
    @Description("Test verify message title after set the wrong password")
    public void verifyTitleAfterSetWrongPassword() {
        Assert.assertTrue(new MainPage(BASE_URL)
                .clickOnSignInBtn()
                .addLoginToLoginField(LOGIN)
                .clickOnContinueBtn()
                .addLPasswordToPasswordField(PASSWORD)
                .clickOnSignInBtnAndStayHere()
                .getErrorTitlePasswordPage()
                .contains(EXPECTED_TITLE));
    }
}
