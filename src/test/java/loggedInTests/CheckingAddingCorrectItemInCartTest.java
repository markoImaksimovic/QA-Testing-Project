package loggedInTests;

import methods.InventoryItemMethods;
import methods.LogedInPageMethods;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.VerificationPage;

public class CheckingAddingCorrectItemInCartTest extends LogedInBaseTest{

    @Test
    public void correctItemTest(){

        LogedInPageMethods logedInPageMethods = new LogedInPageMethods(driver);
        InventoryItemMethods inventoryItemMethods = new InventoryItemMethods(driver);
        VerificationPage verificationPage = new VerificationPage(driver);

        logedInPageMethods.randomItemClick();
        String name = inventoryItemMethods.inventoryItemName();

        try {
            verificationPage.verifyItemNameInCart(name);
            System.out.println("Pass: Items have same names: " + name);
        }catch (Exception e){
            Assert.fail("Fail: Items names are different: " + name);
        }
    }
}
