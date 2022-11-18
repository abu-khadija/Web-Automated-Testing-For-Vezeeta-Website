package TestPages;


import Pages.VisitHomeMain;
import org.testng.Assert;
import org.testng.annotations.Test;



public class VisitHomeTest extends TestBase {



    @Test
    public void VisitHome() throws InterruptedException {
        VisitHomeMain visit;
        visit = new VisitHomeMain(driver);

        //Book a Home Visit
        visit.VISIT();

        //Fill The Form
        visit.SUBMIT();

        //First Assertion
        String expectedResult = "شكرا لك";
        String actualResult = visit.ASSERT();
        Assert.assertEquals(actualResult,expectedResult);

        //Second Assertion
        Assert.assertEquals(true, visit.Assert());
    }




}
