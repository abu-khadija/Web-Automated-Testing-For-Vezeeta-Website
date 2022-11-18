package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationMain extends PageBase{

    public RegistrationMain(WebDriver driver) {super(driver);}

    private final By ClickSignUp = By.xpath("//*[@id='Header_button_link_Sign Up--false']");

    private final By Fullname = By.xpath("//*[@id='formik-input__input--fullName']");

    private final By Phone = By.xpath("//*[@id='phoneNumber']");

    private final By Mail = By.xpath("//*[@id='formik-input__input--email']");

    private final By Gender = By.xpath("//*[@id='formik-form__radio-button--female--selector']");

    //Birth Date
    private final By FirstBD = By.xpath("//*[@name='birthDate']");
    private final By SecondBD = By.xpath("//*[text()='2022']");
    private final By ThirdBD = By.xpath("//*[@aria-label='July 2022']");
    private final By ForthBD = By.xpath("//*[@aria-label='July 12, 2022']");

    //Password
    private final By Password = By.xpath("//*[@id='formik-input__input--password']");

    //ClickSubmet
    private final By Submit =By.xpath("//*[text()='JOIN NOW']");




    //clickSignUP
    public void SIGNUP(){
        driver.findElement(ClickSignUp).click();
    }

    //EnterFullName
    public void NAME(){
        driver.findElement(Fullname).sendKeys("Bassmaa Refaat");
    }

    //EnterPhoneNumber
    public void PHONE(){
        driver.findElement(Phone).sendKeys("01060523777");
    }

    // Email Address
    public void MAIL(){
        driver.findElement(Mail).sendKeys("hana_basmaket10@gmail.com");
    }

    //Select Geender
    public void GENDER(){
        driver.findElement(Gender).click();
    }

    //Birth Date
    public void BIRTHDATE(){
        driver.findElement(FirstBD).click();
        driver.findElement(SecondBD).click();
        driver.findElement(ThirdBD).click();
        driver.findElement(ForthBD).click();
    }

    //password
    public void PASSWORD(){
        driver.findElement(Password).sendKeys("HanaKito");
    }

    public void SUBMIT() throws InterruptedException {

        driver.findElement(Submit).click();
        Thread.sleep(3000);
    }
}
