package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutStepOnePage extends BasePage{
    public CheckoutStepOnePage(WebDriver driver) {
        super(driver);
    }

    By firstNameFieldBy = By.xpath("//input[@id= 'first-name']");
    By lastNameFieldBy = By.xpath("//input[@id= 'last-name']");
    By postalCodeFieldBy = By.xpath("//input[@id= 'postal-code']");
    By continueButtonBy = By.xpath("//input[@id= 'continue']");

    public void writeInFirstNameField(String expectedText){
        writeText(firstNameFieldBy,expectedText);
    }
    public void writeInLastNameField(String expectedText){
        writeText(lastNameFieldBy,expectedText);
    }
    public void writeInPostalCodeField(String expectedText){
        writeText(postalCodeFieldBy,expectedText);
    }
    public void clickContinueButton(){
        click(continueButtonBy);
    }


}
