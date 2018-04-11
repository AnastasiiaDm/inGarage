import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.regex.Matcher;

public class FilterCheck {

    WebDriver browser;

    @BeforeTest
    public void openBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
        browser = new ChromeDriver();
        browser.get("https://ingarage.ua/poisk.html");
    }

    @AfterTest
    public void closeBrowser() {
        browser.quit();
    }

    @Test
    public void filterCheck() throws InterruptedException, IllegalArgumentException {
        WebElement getCDChangerCheck = browser.findElement(By.cssSelector("input[value='CD-чейнджер'] + label"));
        getCDChangerCheck.click();
        Thread.sleep(2000);

        WebElement filterResult = browser.findElement(By.cssSelector("div[class='rows']"));
        String result = filterResult.getText();





        List<WebElement> resultCount = browser.findElements(By.cssSelector("div[class='product_item ajax-item']"));



        System.out.println(resultCount.size());

//        Assert.assertTrue();


    }
}
