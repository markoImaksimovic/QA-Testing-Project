package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{
    public CartPage(WebDriver driver) {
        super(driver);
    }

    By removeItemButtonBy = By.xpath("//button[@id= 'remove-sauce-labs-backpack']");
    By checkoutButtonBy = By.xpath("//button[@id= 'checkout']");

    public void clickRemoveItemButton(){
        click(removeItemButtonBy);
    }

    public void clickCheckoutButton(){
        click(checkoutButtonBy);
    }


}
