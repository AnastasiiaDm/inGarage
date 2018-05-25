import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.regex.Matcher;

import org.openqa.selenium.JavascriptExecutor;


public class FilterCheck {

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
    public void test_year() throws InterruptedException, IllegalArgumentException {
        System.out.println("Test 1" + "\n" +"Год выпуска:" + "\n");
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.testCatalogFilter("year_of_issue[] ");
    }

    @Test
    public void test_region() throws InterruptedException, IllegalArgumentException {
        System.out.println("Test 2" + "\n" +"Регион:" + "\n");
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.testCatalogFilter("region[]");
    }

    @Test
    public void test_model() throws InterruptedException, IllegalArgumentException {
        System.out.println("Test 3" + "\n" +"Модель:" + "\n");
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.testCatalogFilter("model[]");
    }
    @Test
    public void test_mark() throws InterruptedException, IllegalArgumentException {
        System.out.println("Test 4" + "\n" +"Марка:" + "\n");
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.testCatalogFilter("marka[]");
    }

    @Test
    public void test_SparesType() throws InterruptedException, IllegalArgumentException {
        System.out.println("Test 5" + "\n" +"Тип запчасти:" + "\n");
        TestFilterHelper testFilterHelper = new TestFilterHelper(browser);
        testFilterHelper.testCatalogFilter("spares[]");
    }
}

