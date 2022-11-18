package Pages;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class VezeetaServicesMain extends PageBase{
    public VezeetaServicesMain(WebDriver driver) {
        super(driver);
    }

    private final By FindService = By.xpath("//*[text()='New services for better healthcare']");
    private final By Ask = By.xpath("//*[text()='Ask now']");

    private final By Speciality = By.xpath("//*[@data-testid='specialityKey-placeholder']");
    private final By Dermatology = By.xpath("//*[text()='Dermatology']");
    private final By Question = By.xpath("//*[@data-testid='formik-input__input--title']");
    private final By Description = By.id("formik-input__input--description");
    private final By Age = By.id("formik-input__input--age");



    public void FIND() throws InterruptedException {
        driver.navigate().to("https://www.vezeeta.com/en");
        Thread.sleep(2000);
        Actions c = new Actions(driver);
        c.sendKeys(Keys.PAGE_DOWN).build().perform();
        driver.findElement(FindService);
    }

    public void ASK(){
       driver.findElement(Ask);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",driver.findElement(Ask));
    }

    public void FILLFORM() throws InterruptedException {
        driver.findElement(Speciality).click();
        Thread.sleep(1000);
        driver.findElement(Dermatology).click();
        Thread.sleep(1000);
        driver.findElement(Question).sendKeys("Are my supplements/medications affecting my skin?");
        driver.findElement(Description).sendKeys("Help");
        Thread.sleep(1000);
        Actions d = new Actions(driver);
        d.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(1000);
        driver.findElement(Age).sendKeys(Keys.ENTER);
        Thread.sleep(4000);
    }
}
