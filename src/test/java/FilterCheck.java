import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;


public class FilterCheck {

    private WebDriver browser;


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
        JSWaiter jsWaiter = new JSWaiter(browser);
        getCDChangerCheck.click();

        while (!jsWaiter.waitForJQueryLoad()) {
            Thread.sleep(100);
        }
//        Thread.sleep(2000);
        WebElement filterResultFirstPage = browser.findElement(By.cssSelector("div.rows"));
        String result = filterResultFirstPage.getText();
        List<WebElement> resultCount = browser.findElements(By.cssSelector("div.product_item.ajax-item"));

        WebElement nextPage = browser.findElement(By.cssSelector(".pagination .pagination li:last-of-type a"));
        nextPage.click();


        while (!jsWaiter.waitForJQueryLoad()) {
            Thread.sleep(100);
        }


        List<WebElement> resultCountNextPage = browser.findElements(By.cssSelector("div.product_item.ajax-item"));
        System.out.println(result + "\n (" + (resultCount.size() +  resultCountNextPage.size()) + ")");

//        Assert.assertTrue();


    }

}
