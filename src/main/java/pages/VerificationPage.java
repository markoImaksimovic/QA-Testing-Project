package pages;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class VerificationPage extends BasePage{
    public VerificationPage(WebDriver driver) {
        super(driver);
    }

    By errorFieldBy = By.xpath("//div[@class = 'error-message-container error']");
    By logoutButtonBy = By.xpath("//a[@id = 'logout_sidebar_link']");
    By menuButtonBy = By.xpath("//button[@id = 'react-burger-menu-btn']");
    By loginButtonBy = By.xpath("//div[@class = 'login_password']");
    By removeItemButtonBy = By.xpath("//button[@class='btn btn_secondary btn_small cart_button']");
    By yourOrderHasBeenDispatchedFieldBy = By.xpath("//div[@class= 'complete-text']");
    By nameOfItemInCart = By.xpath("//div[@class='inventory_item_name']");


    public VerificationPage verifyLoginWithoutPassword(String expectedText){
        String error = readText(errorFieldBy);
        assertStringEqual(error,expectedText);
        return this;
    }

    public VerificationPage verifyLoginWithoutUsername(String expectedText) {
        String error = readText(errorFieldBy);
        assertStringEqual(error, expectedText);
        return this;
    }

    public VerificationPage verifyLoginWithWrongData(String expectedText) {
        String error = readText(errorFieldBy);
        assertStringEqual(error, expectedText);
        return this;
    }

    public VerificationPage verifyLoginWithValidData(String expectedText) {
        click(menuButtonBy);
        String actualText = readText(logoutButtonBy);
        assertStringEqual(actualText, expectedText);
        return this;
    }

    public VerificationPage verifyLogout(String expectedText) {
        String actualText = readText(loginButtonBy);
        assertStringEqual(actualText, expectedText);
        return this;
    }

    public VerificationPage verifyBuyingItem(String expectedText) {
        String actualText = readText(yourOrderHasBeenDispatchedFieldBy);
        assertStringEqual(actualText, expectedText);
        return this;
    }


    public VerificationPage verifyRemovingItemFromCart(Boolean expected){
        Boolean notVisible =  elementIsInvisible(removeItemButtonBy);
        assertBooleanEqual(notVisible,expected);
        return this;
    }

    public VerificationPage verifyItemNameInCart(String expectedText){
        String actualText = readText(nameOfItemInCart);
        System.out.println(actualText);
        assertStringEqual(actualText,expectedText);
        return this;
    }

}
