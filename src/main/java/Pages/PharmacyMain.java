package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;


public class PharmacyMain extends PageBase {

    public PharmacyMain(WebDriver driver) {
        super(driver);
    }


    private final By PlaceOrder = By.xpath ("//*[contains(text(),'Place order')]");

    private final By TypeMedicine = By.xpath("//*[@data-testid='search-input']");

    private final By Add = By.xpath("//*[@id=\"search-results\"]/li[1]/div/div[2]/button");

    private final By OrderList = By.xpath("//*[@id=\"__next\"]/div/div[5]/div[2]/span[2]");

    private final By Continue = By.xpath("//*[@id=\"__next\"]/div/div/div[5]/button");
    private final By Confirm = By.xpath("//*[@id=\"__next\"]/div/div[6]/button");
    private final By RadioButton = By.xpath("//*[@id=\"payment-method__radio-button--pm2kjsdflk532jsfls--selector\"]");




    public void ClickPlaceOrder() throws InterruptedException {
        driver.navigate().to("https://www.vezeeta.com/en");

        Actions s = new Actions(driver);
        s.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(1000);

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",driver.findElement(PlaceOrder));
    }

    public void MEDICINE() throws InterruptedException {
        Thread.sleep(1000);
        Actions f = new Actions(driver);
        f.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(1000);


        driver.findElement(TypeMedicine).sendKeys("Claritine");
        Thread.sleep(4000);
        driver.findElement(Add).click();
        Thread.sleep(3000);


        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",driver.findElement(OrderList));

        driver.findElement(Continue).click();
        Thread.sleep(1000);
    }


   public void CONFIRM() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",driver.findElement(Confirm));

        Thread.sleep(2000);

        driver.findElement(RadioButton).click();
       Thread.sleep(2000);
    }
}
