package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageMain extends PageBase {


    public LoginPageMain(WebDriver driver) {
        super(driver);
    }

    private final By getText = By.xpath("//*[@id=\"UserWidgetMenuTrigger\"]/span");


    //Run it if u want invalid data
    //private final By InvalidGetText = By.xpath("//*[@id=\"formik-input__input-wrapper--email\"]/div");






    public WebElement clickForLogInPom()
    {
        return driver.findElement(By.id("Header_nav_link_Login--false"));
    }


    public WebElement userNamePom() {
        return driver.findElement(By.id("formik-input__input--email"));
    }

    public WebElement passwordPom()
    {

        return driver.findElement(By.id("formik-input__input--password"));
    }


    public WebElement checkPom()
    {
        return driver.findElement(By.id("login-page__remeber-me-checkbox--checkmark"));
    }

    //Valid Assertion
    public String Get(){
        return driver.findElement(getText).getText();
    }


    public void LoginSteps(String username ,String password)
    {
        clickForLogInPom().click();
        //Enter userName using POM
        userNamePom().sendKeys(username);
        //Enter Password using POM
        passwordPom().sendKeys(password);
        checkPom().click();
        passwordPom().sendKeys(Keys.ENTER);
    }
}