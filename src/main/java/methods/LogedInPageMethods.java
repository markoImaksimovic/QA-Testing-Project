package methods;

import org.openqa.selenium.WebDriver;
import pages.LogedInPage;

public class LogedInPageMethods extends LogedInPage {
    public LogedInPageMethods(WebDriver driver) {
        super(driver);
    }

    public void clickingMenuButton(){
        clickMenuButton();
    }

    public void logout(){
        clickingMenuButton();
        clickLogoutButton();
    }

    public void addingBackPackAndNavigatingToCartPage(){
        clickAddingBackpackToCart();
        clickShoppingCartButton();
    }

    public void randomItemClick(){
        clickOnRandomItem();
    }

}
