import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.regex.Matcher;

import org.openqa.selenium.JavascriptExecutor;


public class FilterCheck {

    private WebDriver browser;

    //show
    private int getCountItems(WebDriver browser) {
        List<WebElement> countItems = browser.findElements(By.cssSelector("div.product_item.ajax-item"));
        return countItems.size();
    }

    private int getCountItemAllPages(WebDriver browser, JSWaiter jsWaiter) {
        // check pagination (next page) exist
        WebElement nextPage = null;
        int count = getCountItems(browser);

        for (; true; ) {
            System.out.println("begin cycle, count = " + count);
            try {
                nextPage = browser.findElement(By.cssSelector(".pagination .pagination li:last-of-type a"));
            } catch (NoSuchElementException ref) {
                System.out.println(ref.getMessage());
                break;
            }
            if (nextPage != null) {
                nextPage.click();
                while (!jsWaiter.waitForJQueryLoad()) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int countPage = getCountItems(browser);
                count += countPage;
                System.out.println("count = " + count);
            }
        }

        return count;
    }

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

//    @Test
//    public void test_1_cDChanger() throws InterruptedException, IllegalArgumentException {
//
//        JSWaiter jsWaiter = new JSWaiter(browser);
//
//        WebElement getCDChangerCheck = browser.findElement(By.cssSelector("input[value='CD-чейнджер'] + label"));
//        getCDChangerCheck.click();
//        while (!jsWaiter.waitForJQueryLoad()) {
//            Thread.sleep(100);
//        }
//
//        WebElement filterResultFirstPage = browser.findElement(By.cssSelector("div.rows"));
//        String firstPageResult = filterResultFirstPage.getText();
//        List<WebElement> countFirstPage = browser.findElements(By.cssSelector("div.product_item.ajax-item"));
//
//
//        WebElement nextPage = browser.findElement(By.cssSelector(".pagination .pagination li:last-of-type a"));
//        if (nextPage != null) {
//
//            nextPage.click();
//            while (!jsWaiter.waitForJQueryLoad()) {
//                Thread.sleep(100);
//            }
//            List<WebElement> countNextPage = browser.findElements(By.cssSelector("div.product_item.ajax-item"));
//
//            WebElement readResultFirstPage = browser.findElement(By.cssSelector("div.rows"));
//            String resultNextPage = readResultFirstPage.getText();
//
//            System.out.println("\n" + "Test 1: filter result for CD-changer:" + "\n" + firstPageResult + "\n" + resultNextPage + "\n (" + (countFirstPage.size() + countNextPage.size()) + ")");
//        } else {
//            System.out.println("\n" + "Test 1: filter result for CDChanger:" + "\n" + firstPageResult + "\n (" + (countFirstPage.size() + ")"));
//        }
//
//        JavascriptExecutor js = (JavascriptExecutor) browser;
//        js.executeScript("window.scrollTo(0,0)");
//
//        getCDChangerCheck.click();
//        while (!jsWaiter.waitForJQueryLoad()) {
//            Thread.sleep(100);
//        }
//    }

    @Test
    public void test() throws InterruptedException, IllegalArgumentException {
        String nameValue = "Активатор замка лючка бензобака";
        JSWaiter jsWaiter = new JSWaiter(browser);
        WebElement getChecker = browser.findElement(By.cssSelector("input[value='" + nameValue + "'] + label"));
        getChecker.click();
        while (!jsWaiter.waitForJQueryLoad()) {
            Thread.sleep(100);
        }

        int countAllPages = getCountItemAllPages(browser, jsWaiter);
        System.out.println("getCountItemAllPages = " + countAllPages);

        WebElement numFromSite = browser.findElement(By.cssSelector("input[value='" + nameValue + "'] + label span"));
        int numberFromSite = Integer.parseInt(numFromSite.getText());
        System.out.println("numberFromSite = " + numberFromSite);
        if (numberFromSite == countAllPages) {
            System.out.println("\n" + "Test Passed" + "\n");
        } else {
            System.out.println("\n" + "Test Failed: numbers don't match" + "\n");
        }

// scroll browser up
        JavascriptExecutor js = (JavascriptExecutor) browser;
        js.executeScript("window.scrollTo(0,0)");
// unclick Webasto
        getChecker.click();

        while (!jsWaiter.waitForJQueryLoad()) {
            Thread.sleep(100);
        }
    }


}
