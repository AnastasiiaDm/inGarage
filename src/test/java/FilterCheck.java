import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
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

        WebElement filterResult = browser.findElement(By.cssSelector("div.rows"));
        String result = filterResult.getText();
        List<WebElement> resultCount = browser.findElements(By.cssSelector("div.product_item.ajax-item"));



        WebElement nextPage = browser.findElement(By.cssSelector(".pagination .pagination li:last-of-type a"));
        nextPage.click();
        Thread.sleep(5000);
        List<WebElement> resultCountnextPage = browser.findElements(By.cssSelector("div.product_item.ajax-item"));


        System.out.println(resultCount.size() + resultCountnextPage.size());

//        Assert.assertTrue();


    }

//    public boolean waitForJSandJQueryToLoad() {
//
//        WebDriverWait wait = new WebDriverWait(browser, 30);
//
//        // wait for jQuery to load
//        ExpectedCondition<Boolean> jQueryLoad = new ExpectedCondition<Boolean>() {
//            @Override
//            public Boolean apply(WebDriver driver) {
//                try {
//                    return ((Long)((JavascriptExecutor)driver).executeScript("return jQuery.active") == 0);
//                }
//                catch (Exception e) {
//                    // no jQuery present
//                    return true;
//                }
//            }
//        };
//
//        // wait for Javascript to load
//        ExpectedCondition<Boolean> jsLoad = new ExpectedCondition<Boolean>() {
//
//            @Override
//            public Boolean apply(WebDriver driver) {
//                return ((JavascriptExecutor)driver).executeScript("return document.readyState")
//                        .toString().equals("complete");
//            }
//        };
//
//        return wait.until(jQueryLoad) && wait.until(jsLoad);
//    }




}
