package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryItemPage extends BasePage{
    public InventoryItemPage(WebDriver driver) {
        super(driver);
    }


    By nameOfItemFieldBy = By.xpath("//div[@class='inventory_details_name large_size']");
    By addToCartButtonBy = By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']");
    By shopingCartBadgeButtonBy = By.xpath("//span[@class='shopping_cart_badge']");

    public String nameOfItem(){
        return readText(nameOfItemFieldBy);
    }

    public void clickAddToCartButton(){
        click(addToCartButtonBy);
    }

    public void clickShopingCartBadgeButton(){
        click(shopingCartBadgeButtonBy);
    }


}
