package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class MakeCallMain extends PageBase{
    public MakeCallMain(WebDriver driver) {
        super(driver);
    }
    private final By Call =By.xpath("//*[@id=\"__next\"]/div/div[1]/div[2]/div/div[1]/div[2]/div[2]/a[1]/span/div");
    private final By Book =By.xpath("//*[@id=\"doctor-card__68421\"]/span/div/div[4]/div/span/div/span[1]/span/div[2]/div[2]/div/span[3]");
    private final By Submit = By.xpath("//*[@id=\"phoneNumber\"]");


    public void MakeCall() throws InterruptedException {
        driver.navigate().to("https://www.vezeeta.com/en");
        Thread.sleep(1000);
        Actions A1 = new Actions(driver);
        A1.sendKeys(Keys.PAGE_DOWN).build().perform();
        Actions A = new Actions(driver);
        A.sendKeys(Keys.PAGE_DOWN).build().perform();

        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",driver.findElement(Call));

    }

    public void CLICK() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",driver.findElement(Book));

        Thread.sleep(3000);
        driver.findElement(Submit).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }
}
