package tests;

import methods.HomePageMethods;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.VerificationPage;
import utilities.PropertyManager;

public class LoginWithWrongDataTest extends BaseTest{

    @Test
    public void loginTestWithWrongData(){

        HomePageMethods homePageMethods =new HomePageMethods(driver);
        VerificationPage verificationPage = new VerificationPage(driver);

        homePageMethods.loginWithWrongData(PropertyManager.getInstance().getInvalidUserName(), PropertyManager.getInstance().getInvalidPassword());

        try {
            verificationPage.verifyLoginWithWrongData("Epic sadface: Username and password do not match any user in this service");
            System.out.println("Pass: User with wrong data is NOT Logged in");
        }catch (Exception e){
            Assert.fail("Fail: User with wrong data is Logged in");
        }

    }
}
