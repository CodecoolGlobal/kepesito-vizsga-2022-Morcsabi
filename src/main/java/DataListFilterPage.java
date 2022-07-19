import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataListFilterPage {

    WebDriver driver;

    private final String dataListFilterUrl = "https://demo.seleniumeasy.com/data-list-filter-demo.html";

    private final By names = By.xpath("//*[@class=\"searchable-container\"]//h4");

    public DataListFilterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigate() {
        driver.navigate().to(dataListFilterUrl);
    }

    public List<String> getNames() {

        List<String> returnList = new ArrayList<>();
        List<WebElement> nameList = driver.findElements(names);
        for (int i = 0; i < nameList.size(); i++) {
            List<String> listItem = new ArrayList<>();
            String name = nameList.get(i).findElement(names).getText();
            name = name.replace("Name: ", "");
            listItem.add(name);
            returnList = listItem;
        }
        System.out.println(returnList);

        return returnList;
    }

}
