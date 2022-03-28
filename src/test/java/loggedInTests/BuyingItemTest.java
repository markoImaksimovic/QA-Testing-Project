package loggedInTests;

import methods.CartPageMethods;
import methods.CheckoutStepOnePageMethods;
import methods.CheckoutStepTwoPageMethods;
import methods.LogedInPageMethods;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.VerificationPage;
import utilities.PropertyManager;

public class BuyingItemTest extends LogedInBaseTest{

    @Test
    public void buyingItemTest(){

        LogedInPageMethods logedInPageMethods = new LogedInPageMethods(driver);
        CartPageMethods cartPageMethods = new CartPageMethods(driver);
        CheckoutStepOnePageMethods checkoutStepOnePageMethods = new CheckoutStepOnePageMethods(driver);
        CheckoutStepTwoPageMethods checkoutStepTwoPageMethods = new CheckoutStepTwoPageMethods(driver);
        VerificationPage verificationPage = new VerificationPage(driver);


        logedInPageMethods.addingBackPackAndNavigatingToCartPage();
        cartPageMethods.navigatingToCheckOutStepOnePage();
        checkoutStepOnePageMethods.navigatingToCheckoutStepTwo(PropertyManager.getInstance().getFirstName(), PropertyManager.getInstance().getLastName(), PropertyManager.getInstance().getPostalCode());
        checkoutStepTwoPageMethods.finishingBuyingProcess();

        try {
            verificationPage.verifyBuyingItem("Your order has been dispatched, and will arrive just as fast as the pony can get there!");
            System.out.println("Pass: Successful buying item");
        }catch (Exception e){
            Assert.fail("Fail: Unsuccessful buying item");
        }

    }


}
