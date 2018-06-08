import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

//    @AfterTest
//    public void closeBrowser() {
//        browser.quit();
//    }


    @Test
    public void test_podrobnee() throws InterruptedException, IllegalArgumentException, StaleElementReferenceException {
        TestSearchHelper testSearchHelper = new TestSearchHelper(browser);
        testSearchHelper.getValue(browser);

    }
}

