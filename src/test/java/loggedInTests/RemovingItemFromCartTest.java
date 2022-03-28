package loggedInTests;

import methods.CartPageMethods;
import methods.LogedInPageMethods;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.VerificationPage;

public class RemovingItemFromCartTest extends LogedInBaseTest{

    @Test
    public void removingItemTest(){

        LogedInPageMethods logedInPageMethods = new LogedInPageMethods(driver);
        CartPageMethods cartPageMethods = new CartPageMethods(driver);

        VerificationPage verificationPage = new VerificationPage(driver);


        logedInPageMethods.addingBackPackAndNavigatingToCartPage();
        cartPageMethods.removingItemFromCart();

        try {
            verificationPage.verifyRemovingItemFromCart(true);
            System.out.println("Pass: Successful in removing item from cart");
        }catch (Exception e){
            Assert.fail("Fail: Unsuccessful in removing item from cart");
        }
    }
}
