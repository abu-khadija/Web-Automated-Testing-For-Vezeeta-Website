package TestPages;

import Pages.LogoutMain;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest extends TestBase {



    @Test
    public void Logout() throws InterruptedException {
        LogoutMain logout;
        logout = new LogoutMain(driver);
        //Open User Menu
        logout.FindButton();

        //Click Log out
        logout.LOGOUT();
        Thread.sleep(1000);


        //Assertion
        String logoutURL = TestBase.driver.getCurrentUrl();
        Assert.assertEquals(logoutURL,"https://www.vezeeta.com/en");

        String expectedResult = "Login";
        String actualResult = logout.ASSERT();
        Assert.assertEquals(actualResult, expectedResult);




    }


}
