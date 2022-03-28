package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void click(By elementBy){
        waitForElementToAppear(elementBy);
        driver.findElement(elementBy).click();
    }

    public void writeText(By elementBy, String expectedText){
        waitForElementToAppear(elementBy);
        driver.findElement(elementBy).clear();
        driver.findElement(elementBy).sendKeys(expectedText);
    }

    public String readText(By elementBy){
        waitForElementToAppear(elementBy);
        return driver.findElement(elementBy).getText();
    }

    public void assertStringEqual(String actualText, String expectedText){
        Assert.assertEquals(actualText,expectedText);
    }

    protected void waitForElementToAppear(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementBy));
    }

    public Boolean elementIsInvisible(By elementBy) {
        boolean isInvisible = wait.until(ExpectedConditions.invisibilityOfElementLocated(elementBy));
        if (isInvisible){
            return true;
        }else {
            System.out.println("Element is still visible");
            return false;
        }
    }
    public void assertBooleanEqual(Boolean actual, Boolean expected){
        Assert.assertEquals(actual,expected);
    }

    public void randomClickOnLinkFromCategory(By elementBy){
        waitForElementToAppear(elementBy);
        Random random = new java.util.Random();
        List<WebElement> categoryItems = driver.findElements(elementBy);
        WebElement randomElement = categoryItems.get(random.nextInt(categoryItems.size()));
        randomElement.click();
    }
}
