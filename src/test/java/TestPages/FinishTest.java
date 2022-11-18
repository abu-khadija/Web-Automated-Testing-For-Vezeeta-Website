package TestPages;

import Pages.FinishMain;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FinishTest extends TestBase{

    @Test
    public void Logout() throws InterruptedException {
        FinishMain logout;
        logout = new FinishMain(driver);

        //Open User Menu
        logout.FindButton();

        //Click Log out
        logout.LOGOUT();
        Thread.sleep(1000);

        String logoutURL = TestBase.driver.getCurrentUrl();
        Assert.assertEquals(logoutURL,"https://www.vezeeta.com/en");

        String expectedResult = "Login";
        String actualResult = logout.ASSERT();
        Assert.assertEquals(actualResult, expectedResult);
    }
}
