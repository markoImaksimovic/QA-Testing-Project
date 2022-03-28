package tests;

import methods.HomePageMethods;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.VerificationPage;
import utilities.PropertyManager;

public class LoginWithoutUsernameTest extends BaseTest{

    @Test
    public void loginTestWithoutUsername(){

        HomePageMethods homePageMethods =new HomePageMethods(driver);
        VerificationPage verificationPage = new VerificationPage(driver);

        homePageMethods.loginWithoutUsername(PropertyManager.getInstance().getValidPassword());

        try {
            verificationPage.verifyLoginWithoutUsername("Epic sadface: Username is required");
            System.out.println("Pass: User is NOT Logged in without username");
        }catch (Exception e){
            Assert.fail("Fail: User is Logged in without username");
        }
    }
}
