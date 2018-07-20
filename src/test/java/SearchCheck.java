import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchCheck {
    private WebDriver browser;

    @BeforeTest
    public void openBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
        browser = new ChromeDriver();
        browser.get("https://dev.ingarage.ua/poisk.html");
        browser.manage().window().maximize();
    }
    @AfterTest
    public void closeBrowser() {
        browser.quit();
    }
    @Test
    public void origin_number() throws InterruptedException, IllegalArgumentException, StaleElementReferenceException {
        TestSearchHelper testSearchHelper = new TestSearchHelper(browser);
         testSearchHelper.testing("origin_number");
    }
    @Test
    public void analog_number() throws InterruptedException, IllegalArgumentException, StaleElementReferenceException {
        TestSearchHelper testSearchHelper = new TestSearchHelper(browser);
        testSearchHelper.testing("analog_number");
    }
    @Test
    public void marka() throws InterruptedException, IllegalArgumentException, StaleElementReferenceException {
        TestSearchHelper testSearchHelper = new TestSearchHelper(browser);
        testSearchHelper.testing("marka");
    }
    @Test
    public void model() throws InterruptedException, IllegalArgumentException, StaleElementReferenceException {
        TestSearchHelper testSearchHelper = new TestSearchHelper(browser);
        testSearchHelper.testing("model");
    }
    @Test
    public void year() throws InterruptedException, IllegalArgumentException, StaleElementReferenceException {
        TestSearchHelper testSearchHelper = new TestSearchHelper(browser);
        testSearchHelper.testing("year");
    }
    @Test
    public void spares() throws InterruptedException, IllegalArgumentException, StaleElementReferenceException {
        TestSearchHelper testSearchHelper = new TestSearchHelper(browser);
        testSearchHelper.testing("spares");
    }
    @Test
    public void condition() throws InterruptedException, IllegalArgumentException, StaleElementReferenceException {
        TestSearchHelper testSearchHelper = new TestSearchHelper(browser);
        testSearchHelper.testing("condition");
    }
}

