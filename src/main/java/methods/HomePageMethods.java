package methods;

import org.openqa.selenium.WebDriver;
import pages.HomePage;

public class HomePageMethods extends HomePage {
    public HomePageMethods(WebDriver driver) {
        super(driver);
    }

    public void loginWithoutPassword(String expectedText){
        writeInUsernameField(expectedText);
        clickOnLoginButton();
    }

    public void loginWithoutUsername(String expectedText){
        writeInPasswordFieldBy(expectedText);
        clickOnLoginButton();
    }

    public void loginWithWrongData(String expectedUsername, String expectedPassword){
        writeInUsernameField(expectedUsername);
        writeInPasswordFieldBy(expectedPassword);
        clickOnLoginButton();
    }

    public void loginWithValidData(String expectedUsername, String expectedPassword){
        writeInUsernameField(expectedUsername);
        writeInPasswordFieldBy(expectedPassword);
        clickOnLoginButton();
    }

}
