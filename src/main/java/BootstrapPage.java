import org.jsoup.Connection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BootstrapPage {

    WebDriver driver;


    private final String bootstrapUrl = "https://demo.seleniumeasy.com/bootstrap-modal-demo.html";

    public BootstrapPage(WebDriver driver) {
        this.driver = driver;
    }
    private By launchButton = By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div/div[2]/a");
    private By modalBody = By.xpath("//*[@id=\"myModal0\"]/div/div/div[3]");
    private By saveChanges = By.xpath("//*[@id=\"myModal0\"]/div/div/div[4]/a[2]");
    private By closeModal = By.xpath("//*[@id=\"myModal0\"]/div/div/div[4]/a[1]");

    public void navigate(){
        driver.navigate().to(bootstrapUrl);
    }
    public void launchModal(){
        driver.findElement(launchButton).click();
    }
    public String getModalText(){
        String actual = driver.findElement(modalBody).getText();
        return actual;
    }
    public void saveModal(){
        driver.findElement(saveChanges).click();
    }
    public void closeModal(){
        driver.findElement(closeModal).click();
    }

}
