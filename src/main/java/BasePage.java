import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    WebDriver driver;

    private final String inputUrl = "http://demo.seleniumeasy.com/basic-first-form-demo.html";
    private final By popUp = By.id("at-cv-lightbox-close");
    private final By valueA = By.id("sum1");
    private final By valueB = By.id("sum2");
    private final By getTotalButton = By.xpath("//*[@id=\"gettotal\"]/button");
    private final By displayValue = By.id("displayvalue");

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigate() {
        driver.navigate().to(inputUrl);
    }

    public void closePopUp() {
        driver.findElement(popUp).click();
    }

    public void setA(String testDataA) {
        driver.findElement(valueA).sendKeys(testDataA);
    }

    public void setB(String testDataB) {
        driver.findElement(valueB).sendKeys(testDataB);
    }

    public void getTotal() {
        driver.findElement(getTotalButton).click();
    }

    public String getDisplayValue() {
        String actual = driver.findElement(displayValue).getText();
        return actual;
    }
}
