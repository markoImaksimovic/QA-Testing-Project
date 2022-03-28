package methods;

import org.openqa.selenium.WebDriver;
import pages.CartPage;

public class CartPageMethods extends CartPage {
    public CartPageMethods(WebDriver driver) {
        super(driver);
    }

    public void removingItemFromCart(){
        clickRemoveItemButton();
    }

    public void navigatingToCheckOutStepOnePage(){
        clickCheckoutButton();
    }

}
