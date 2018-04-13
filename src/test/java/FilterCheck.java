import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;


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
    public void cDChanger() throws InterruptedException, IllegalArgumentException {

        JSWaiter jsWaiter = new JSWaiter(browser);

        WebElement getCDChangerCheck = browser.findElement(By.cssSelector("input[value='CD-чейнджер'] + label"));
        getCDChangerCheck.click();
        while (!jsWaiter.waitForJQueryLoad()) {
            Thread.sleep(100);
        }

        WebElement filterResultFirstPage = browser.findElement(By.cssSelector("div.rows"));
        String firstPageResult = filterResultFirstPage.getText();
        List<WebElement> countFirstPage = browser.findElements(By.cssSelector("div.product_item.ajax-item"));


        WebElement nextPage = browser.findElement(By.cssSelector(".pagination .pagination li:last-of-type a"));
        if (nextPage != null) {

            nextPage.click();
            while (!jsWaiter.waitForJQueryLoad()) {
                Thread.sleep(100);
            }
            List<WebElement> countNextPage = browser.findElements(By.cssSelector("div.product_item.ajax-item"));

            WebElement readResultFirstPage = browser.findElement(By.cssSelector("div.rows"));
            String resultNextPage = readResultFirstPage.getText();

            System.out.println("\n" + "Test 1: filter result for CD-changer:" + "\n" + firstPageResult + "\n" + resultNextPage + "\n (" + (countFirstPage.size() + countNextPage.size()) + ")");
        } else {
            System.out.println("\n" + "Test 1: filter result for CDChanger:" + "\n" + firstPageResult + "\n (" + (countFirstPage.size() + ")"));
        }

        JavascriptExecutor js = (JavascriptExecutor)browser;
        js.executeScript("window.scrollTo(0,0)");

        getCDChangerCheck.click();
        while (!jsWaiter.waitForJQueryLoad()) {
            Thread.sleep(100);
        }
    }

    @Test
    public void webasto() throws InterruptedException, IllegalArgumentException {

        JSWaiter jsWaiter = new JSWaiter(browser);

        WebElement getWebasto = browser.findElement(By.cssSelector("input[value='Webasto (Отопитель автономный)'] + label"));
        getWebasto.click();
        while (!jsWaiter.waitForJQueryLoad()) {
            Thread.sleep(100);
        }

        WebElement filterResultFirstPage = browser.findElement(By.cssSelector("div.rows"));
        String firstPageResult = filterResultFirstPage.getText();
        List<WebElement> countFirstPage = browser.findElements(By.cssSelector("div.product_item.ajax-item"));
        WebElement nextPage = null;
        try {
            nextPage = browser.findElement(By.cssSelector(".pagination .pagination li:last-of-type a"));
        } catch (NoSuchElementException ref) {
            System.out.println(ref.getMessage());
        }
        if (nextPage != null) {

            nextPage.click();
            while (!jsWaiter.waitForJQueryLoad()) {
                Thread.sleep(100);
            }
            List<WebElement> countNextPage = browser.findElements(By.cssSelector("div.product_item.ajax-item"));

            WebElement readResultFirstPage = browser.findElement(By.cssSelector("div.rows"));
            String resultNextPage = readResultFirstPage.getText();

            System.out.println("\n" + "Test 2: filter result for Webasto:" + "\n" + firstPageResult + "\n" + resultNextPage + "\n (" + (countFirstPage.size() + countNextPage.size()) + ")");
        } else {
            System.out.println("\n" + "Test 2: filter result for Webasto:" + "\n" + firstPageResult + "\n (" + (countFirstPage.size() + ")"));
        }
//        Assert.assertTrue("Test 1 Passed" );
        JavascriptExecutor js = (JavascriptExecutor) browser;
        js.executeScript("window.scrollTo(0,0)");

        getWebasto.click();
        while (!jsWaiter.waitForJQueryLoad()) {
            Thread.sleep(100);
        }
    }
}
