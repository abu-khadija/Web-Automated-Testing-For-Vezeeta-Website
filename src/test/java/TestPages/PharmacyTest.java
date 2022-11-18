package TestPages;

import Pages.PharmacyMain;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class PharmacyTest extends TestBase {


    @Test
    public void PlaceOrder() throws InterruptedException {
        PharmacyMain pharmacy;
        pharmacy = new PharmacyMain(driver);


        //Click on Place Order
        pharmacy.ClickPlaceOrder();

        //Select Medicine
        pharmacy.MEDICINE();

        //Confirm The Order
        pharmacy.CONFIRM();

        //Assertion
        String expectedResult = "Complete Order";
        String actualResult = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[8]/div/div[2]/span")).getText();
        Assert.assertEquals(actualResult, expectedResult);
    }
}
