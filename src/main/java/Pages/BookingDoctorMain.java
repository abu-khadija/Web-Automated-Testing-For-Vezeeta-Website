package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class BookingDoctorMain extends PageBase {


    public BookingDoctorMain(WebDriver driver) {
        super(driver);
    }


    private final By chooseSpecialityClick = By.id("selectSpecialityDropdown");
    private final By SpecialityDent = By.xpath("//*[@data-value='dentistry']");

    private final By City = By.id("selectCityyDropdown");
    private final By CityGiza = By.xpath("//*[@data-value='alexandria']");

    //private final By Checkbox =By.id("search-doctors-page__search-filter-checkbox-container--Adult Dentistry--checkmark");


    private final By Area = By.id("selectAreaDropdown");
    private final By chooseArea = By.xpath("//*[@data-value='smouha']");


    private final By Search = By.xpath("//*[@data-testid='search-bar__text-input-doctorNameText__text-input']");

    private final By ClickSearch = By.xpath("//*[@id=\"home_search_bar\"]/div[2]/div/div[2]/div/div[2]");


    private final By chooseDate = By.xpath("//*[@id=\"doctor-card__238512\"]/span/div[1]/div[4]/div/span/div/span[1]/span/div[3]/div[2]/div/span[1]/span[4]");



    private final By Book = By.xpath("//*[@data-testid='reservation-form__submit-button']");

    private final By Ass = By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div/div[1]/div[2]/div[1]/div[1]/p");




    public void DropdownSp() throws InterruptedException {
        driver.findElement(chooseSpecialityClick).click();
        Thread.sleep(1000);
        driver.findElement(SpecialityDent).click();
    }

    public void DropdownCity() throws InterruptedException {
        driver.findElement(City).click();
        Thread.sleep(1000);
        driver.findElement(CityGiza).click();
    }

    public void DropdownArea() throws InterruptedException {
        driver.findElement(Area).click();
        Thread.sleep(1000);
        driver.findElement(chooseArea).click();
    }

    public void setSearchText()  {
        driver.findElement(Search).sendKeys("Mohamed Assem");

    }

    public void SearchButton(){
        driver.findElement(ClickSearch).click();

    }


    public void setChooseDate() throws InterruptedException {
        Thread.sleep(4000);
        Actions g = new Actions(driver);
        g.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(3000);

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",driver.findElement(chooseDate));
    }


    public void ClickBook() throws InterruptedException {
        Thread.sleep(3000);

        Actions b = new Actions(driver);
        b.sendKeys(Keys.PAGE_DOWN).build().perform();


        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",driver.findElement(Book));
        Thread.sleep(4000);

    }

    public String Assert() throws InterruptedException {
        Thread.sleep(3000);
        return driver.findElement(Ass).getText();

    }

}
