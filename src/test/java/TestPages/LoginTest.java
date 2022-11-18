package TestPages;

import Pages.LoginPageMain;
import org.testng.Assert;
import org.testng.annotations.*;


public class LoginTest extends TestBase {

    //Valid Data
    @Test
    public void ValidData() throws InterruptedException {

        LoginPageMain login;
        login = new LoginPageMain(driver);

        //Login
        login.LoginSteps("islamabukhadiga@gmail.com","012345678999");
        Thread.sleep(4000);

        //First Assertion
        String expectedResult = "ITI TESTINGG";
        String actualResult = login.Get();
        Assert.assertEquals(actualResult, expectedResult);

        //second assertion
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.vezeeta.com/en");
    }







    //Run it if u want invalid data
///    @Test
///    public void Invalid () throws InterruptedException {
///       LoginPageMain login;
//        login = new LoginPageMain(driver);
//        //Login
//        login.LoginSteps("ITI","125466");
//        Thread.sleep(3000);
//        //Assertion
//        String expectedResult = "Email Address is invalid";
//        String actualResult = login.InvalidGet();
//        Assert.assertEquals(actualResult, expectedResult);
//    }
}