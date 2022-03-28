package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogedInPage extends BasePage{
    public LogedInPage(WebDriver driver) {
        super(driver);
    }

    By menuButtonBy = By.xpath("//button[@id = 'react-burger-menu-btn']");
    By logoutButtonBy = By.xpath("//a[@id = 'logout_sidebar_link']");
    By addingBackpackToCartBy = By.xpath("//button[@id= 'add-to-cart-sauce-labs-backpack']");
    By shoppingCartButtonBy = By.xpath("//a[@class= 'shopping_cart_link']");

    By randomItemSelectionFieldBy = By.xpath("//div[@class='inventory_item_name']");


    public void clickMenuButton(){
        click(menuButtonBy);
    }

    public void clickLogoutButton(){
        click(logoutButtonBy);
    }

    public void clickAddingBackpackToCart(){
        click(addingBackpackToCartBy);
    }

    public void clickShoppingCartButton(){
        click(shoppingCartButtonBy);
    }


    public void clickOnRandomItem(){
        randomClickOnLinkFromCategory(randomItemSelectionFieldBy);
    }

}
