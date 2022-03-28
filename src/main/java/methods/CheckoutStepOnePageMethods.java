package methods;

import org.openqa.selenium.WebDriver;
import pages.CheckoutStepOnePage;

public class CheckoutStepOnePageMethods extends CheckoutStepOnePage {
    public CheckoutStepOnePageMethods(WebDriver driver) {
        super(driver);
    }

    public void navigatingToCheckoutStepTwo(String firstName, String lastName, String postalCode){
        writeInFirstNameField(firstName);
        writeInLastNameField(lastName);
        writeInPostalCodeField(postalCode);
        clickContinueButton();
    }


}
