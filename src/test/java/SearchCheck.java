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
    }

//    @AfterTest
//    public void closeBrowser() {
//        browser.quit();
//    }


    @Test
    public void test_podrobnee() throws InterruptedException, IllegalArgumentException {
        TestSearchHelper testSearchHelper = new TestSearchHelper(browser);
        testSearchHelper.clickPodrobnee("modal");
    }
}
