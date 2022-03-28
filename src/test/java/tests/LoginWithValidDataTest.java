package tests;


import methods.HomePageMethods;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.VerificationPage;
import utilities.PropertyManager;

public class LoginWithValidDataTest extends BaseTest {

    @Test
    public void loginTest(){

        HomePageMethods homePageMethods =new HomePageMethods(driver);
        VerificationPage verificationPage = new VerificationPage(driver);

        homePageMethods.loginWithValidData(PropertyManager.getInstance().getValidUserName(), PropertyManager.getInstance().getValidPassword());


        try {
            verificationPage.verifyLoginWithValidData("LOGOUT");
            System.out.println("Pass: User is Logged in");
        }catch (Exception e){
            Assert.fail("Fail: User is not Logged in");
        }

    }

}
