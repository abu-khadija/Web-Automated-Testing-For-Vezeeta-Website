package TestPages;

import Pages.RegistrationMain;


import org.testng.annotations.Test;

public class RegistrationTest extends TestBase {

    @Test
    public void SignUp() throws InterruptedException {
        RegistrationMain sign;
        sign = new RegistrationMain(driver);

        //Click SignUp
        sign.SIGNUP();

        //Type Name
        sign.NAME();

        //Phone Number
        sign.PHONE();

        //E-mail
        sign.MAIL();

        //Select Gender
        sign.GENDER();

        //Select Birthdate
        sign.BIRTHDATE();

        //Type password
        sign.PASSWORD();

        //Click Sign up
        sign.SUBMIT();




    }
}
