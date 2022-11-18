package TestPages;

import Pages.CancelAppointmentMain;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CancelAppointmentTest extends TestBase {


    @Test
    public void CanselAppointment() throws InterruptedException {
        CancelAppointmentMain cansel;
        cansel = new CancelAppointmentMain(driver);

        // Open Menu
        cansel.APPOINTMENT();

        //Select My Appointment
        cansel.SELECT();

        //Choose Cancel
        cansel.CANCEL();

        //Confirm Cancellation
        cansel.PRESSYES();


        //Assertion
        String expectedResult = "Reservation Date";
        String actualResult = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div[2]/div/div[2]/div[1]/div[3]")).getText();
        Assert.assertEquals(actualResult, expectedResult);



    }
}
