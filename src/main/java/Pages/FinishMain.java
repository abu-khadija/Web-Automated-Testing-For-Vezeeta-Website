package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FinishMain extends PageBase {
    public FinishMain(WebDriver driver) {
        super(driver);
    }

    private final By FindLogout = By.id("UserWidgetMenuTrigger");

    private final By PressLogout = By.xpath("//*[text()='Logout']");

    //Assertion
    private final By Assert =By.xpath("//*[text()='Login']");



    public void FindButton() throws InterruptedException {
        driver.navigate().to("https://www.vezeeta.com/en");
        Thread.sleep(2000);
        driver.findElement(FindLogout).click();

    }

    public void LOGOUT() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(PressLogout).click();
        Thread.sleep(1000);
    }

    //Assertion
    public String ASSERT(){
        return driver.findElement(Assert).getText();
    }
}
