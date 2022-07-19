import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownPage {

    WebDriver driver;

    private final String dropDownUrl = "https://demo.seleniumeasy.com/basic-select-dropdown-demo.html";
    private final By dropDownDays = By.id("select-demo");

    public DropDownPage(WebDriver driver) {this.driver = driver;}
    public void navigate(){driver.navigate().to(dropDownUrl);}
    public String getLastDay()
    {
        Select select = new Select(driver.findElement(dropDownDays));
        List<WebElement> dayList = select.getOptions();
        String lastDay = dayList.get(7).getText();

        return lastDay;


    }
}
