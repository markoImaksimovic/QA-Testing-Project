package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    By usernameFieldBy = By.xpath("//input[@id= 'user-name']");
    By passwordFieldBy = By.xpath("//input[@id= 'password']");
    By loginButtonBy = By.xpath("//input[@id= 'login-button']");


    public void writeInUsernameField(String expectedText){
        writeText(usernameFieldBy,expectedText);
    }

    public void writeInPasswordFieldBy(String expectedText){
        writeText(passwordFieldBy,expectedText);
    }

    public void clickOnLoginButton(){
        click(loginButtonBy);
    }

}
