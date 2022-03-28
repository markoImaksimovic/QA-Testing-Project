package tests;

import methods.HomePageMethods;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.VerificationPage;
import utilities.PropertyManager;

public class LoginWithoutPasswordTest extends BaseTest{

    @Test
    public void LoginTestWithoutPassword(){

        HomePageMethods homePageMethods =new HomePageMethods(driver);
        VerificationPage verificationPage = new VerificationPage(driver);


        homePageMethods.loginWithoutPassword(PropertyManager.getInstance().getValidUserName());

        try {
            verificationPage.verifyLoginWithoutPassword("Epic sadface: Password is required");
            System.out.println("Pass: User is NOT Logged in without password");
        }catch (Exception e){
            Assert.fail("Fail: User is logged in without password");
        }
    }

}
