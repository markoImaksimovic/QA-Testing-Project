package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutStepTwoPage extends BasePage{
    public CheckoutStepTwoPage(WebDriver driver) {
        super(driver);
    }

    By finishButtonBy = By.xpath("//button[@id= 'finish']");

    public void clickFinishButton(){
        click(finishButtonBy);
    }

}
