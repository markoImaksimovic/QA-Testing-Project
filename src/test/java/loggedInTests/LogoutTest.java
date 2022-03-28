package loggedInTests;

import methods.LogedInPageMethods;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.VerificationPage;

public class LogoutTest extends LogedInBaseTest{

    @Test
    public void logoutTest(){

        LogedInPageMethods logedInPageMethods = new LogedInPageMethods(driver);
        VerificationPage verificationPage = new VerificationPage(driver);

        logedInPageMethods.logout();

        try {
            verificationPage.verifyLogout("Password for all users:\n" +
                    "secret_sauce");
            System.out.println("Pass: User is Logged out");
        }catch (Exception e){
            Assert.fail("Fail: User is still Logged in");
        }

    }
}
