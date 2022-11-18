package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class VisitHomeMain extends PageBase {

    private final By ClickVisit = By.xpath("//*[@id=\"__next\"]/div/div[1]/div[2]/div/div[1]/div[2]/div[2]/a[2]/span/div");
    private final By ChooseILL = By.xpath("//*[@id=\"__next\"]/div/div[1]/div[2]/section/div/div/div/main/div[1]/div[2]/div/div[6]/p");

    private final By PatientName = By.xpath("//*[@id=\"الاسم\"]");

    private final By PatientPhone = By.xpath("//*[@id=\"رقم_التليفون\"]");
    private final By Speciality = By.id("speciality");
    private final By Area = By.id("area");
    private final By Submit = By.xpath("//*[@id=\"lp-pom-button-123\"]/span");

    private final By Assert = By.xpath("//*[@id=\"lp-pom-text-794\"]/p[1]/span/span");
    private final By Assertt = By.xpath("//*[@id=\"lp-pom-image-802\"]/div/img");

    public VisitHomeMain(WebDriver driver) {
        super(driver);
    }

    public void VISIT() throws InterruptedException {
        driver.navigate().to("https://www.vezeeta.com/en");
        Thread.sleep(2000);
        Actions B1 = new Actions(driver);
        B1.sendKeys(Keys.PAGE_DOWN).build().perform();
        Actions B = new Actions(driver);
        B.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",driver.findElement(ClickVisit));
        driver.findElement(ChooseILL).click();
        driver.findElement(PatientName).sendKeys("Ali Rady");
        driver.findElement(PatientPhone).sendKeys("01025996314");
    }

    public void SUBMIT() throws InterruptedException {
        Select SpecialityDropDown = new Select(driver.findElement(Speciality));
        SpecialityDropDown.selectByIndex(5);

        Select AreaDropDown = new Select(driver.findElement(Area));
        AreaDropDown.selectByIndex(4);

        driver.findElement(Submit).click();
        Thread.sleep(2000);


    }
    public String ASSERT(){

        return driver.findElement(Assert).getText();
    }

    public boolean Assert() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(Assertt).isDisplayed();
    }
}
