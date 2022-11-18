package TestPages;

import Pages.VezeetaServicesMain;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VezeetaServicesTest extends TestBase{

    @Test
    public void VezeetaServices() throws InterruptedException {
        VezeetaServicesMain service;
        service = new VezeetaServicesMain(driver);

        //Patient Medical Question Page
        service.FIND();

        //Ask Now
        service.ASK();

        //Fill The Form
        service.FILLFORM();


        //Assertion
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.vezeeta.com/en/questions/sent/dermatology");



    }
}
