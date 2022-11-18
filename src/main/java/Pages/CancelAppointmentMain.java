package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CancelAppointmentMain extends PageBase{
    public CancelAppointmentMain(WebDriver driver) {
        super(driver);
    }

    private final By MyAppointment = By.id("UserWidgetMenuTrigger");
    private final By SelectAppointment = By.xpath("//*[text()='My Appointments']");
    private final By cancel = By.xpath("//*[@class='Un_Safe_UserAppointmentsstyle__ActionIcon-sc-1h8wnbz-11 hoAPtn']");
    private final By PressYes = By.id("user-appointment__popup-box__button--yes");





    public void APPOINTMENT() throws InterruptedException {
        driver.navigate().to("https://www.vezeeta.com/en");
        Thread.sleep(2000);
        driver.findElement(MyAppointment).click();
    }

    public void SELECT() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(SelectAppointment).click();
    }

    public void CANCEL() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(cancel).click();
    }

    public void PRESSYES() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(PressYes).click();
    }

}
