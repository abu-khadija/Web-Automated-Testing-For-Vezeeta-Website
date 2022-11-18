package TestPages;

import Pages.MakeCallMain;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MakeCallTest extends TestBase {

    @Test
    public void BookCall () throws InterruptedException {
        MakeCallMain call;
        call = new MakeCallMain(driver);

        //Book a Call
        call.MakeCall();

        //Confirm
        call.CLICK();


        //assertion
        String expectedResult = "Payment is required to confirm.";
        String actualResult = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div/div[1]/div[1]/div[1]/div[2]/div[1]")).getText();
        Assert.assertEquals(actualResult, expectedResult);




    }
}
