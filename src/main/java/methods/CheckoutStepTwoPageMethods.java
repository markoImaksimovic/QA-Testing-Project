package methods;

import org.openqa.selenium.WebDriver;
import pages.CheckoutStepTwoPage;

public class CheckoutStepTwoPageMethods extends CheckoutStepTwoPage {
    public CheckoutStepTwoPageMethods(WebDriver driver) {
        super(driver);
    }

    public void finishingBuyingProcess(){
        clickFinishButton();
    }

}
