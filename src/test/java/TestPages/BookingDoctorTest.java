package TestPages;

import Pages.BookingDoctorMain;
import org.testng.Assert;
import org.testng.annotations.Test;


public class BookingDoctorTest extends TestBase {


    @Test
    public void BookingDoctor() throws InterruptedException {

        BookingDoctorMain booking;
        booking = new BookingDoctorMain(driver);

        //Select Speciality
        booking.DropdownSp();

        //Select City
        booking.DropdownCity();

        //Select Area
        booking.DropdownArea();

        //Select Doctor
        booking.setSearchText();

        //Click Search Button
        booking.SearchButton();

        //Select Appointment
        booking.setChooseDate();

        //Click Book
        booking.ClickBook();

        //Assertion
        String expectedResult = "Your booking was successfully submitted";
        String actualResult = booking.Assert();
        Assert.assertEquals(actualResult, expectedResult);
        Thread.sleep(3000);

    }





}
