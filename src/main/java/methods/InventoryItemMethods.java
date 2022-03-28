package methods;

import org.openqa.selenium.WebDriver;
import pages.InventoryItemPage;

public class InventoryItemMethods extends InventoryItemPage {
    public InventoryItemMethods(WebDriver driver) {
        super(driver);
    }

    public String inventoryItemName(){
        clickAddToCartButton();
        String name =  nameOfItem();
        clickShopingCartBadgeButton();
        return name;
    }

}
