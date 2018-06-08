import org.apache.http.util.TextUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.interactions.Actions;

import javax.xml.soap.Node;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class TestSearchHelper {
    private final long TIME_SLEEP = 500;
    private WebDriver browser;
    //    private JSWaiter jsWaiter;
    private HashMap<String, String> hashMapValue = new HashMap<String, String>();
    private String val = null; //изначально значение val является null
    private JavascriptExecutor js;

    public TestSearchHelper(WebDriver browser) {
        this.browser = browser;
//        jsWaiter = new JSWaiter(browser);
        js = (JavascriptExecutor) browser;
    }


    public void getValue() throws InterruptedException, StaleElementReferenceException, NoSuchElementException {

        while (hashMapValue.size() < 2) {
            findUniqueValue(browser);

            makeSearch(browser);

            LoaderWaiter.waitForLoad(browser);

            testAllPages(browser);

            browser.findElement(By.cssSelector(".header_block [href='poisk.html']")).click();
        }
    }

//        проверить цифру из фильтра например марки , закинуть назввание марки в поиск и проверить количество наименований марки  в соответствии цифре из фильтра

    private void testCurrenPage(WebDriver browser, String val) throws InterruptedException, StaleElementReferenceException {

        java.util.List<WebElement> listItem = browser.findElements(By.cssSelector("[data-toggle='modal']"));
        System.out.println("\n" + "listItem.size = " + listItem.size());
        for (WebElement element : listItem) {
            Thread.sleep(TIME_SLEEP);
            element.click();
            Thread.sleep(TIME_SLEEP);
            String nextResults = browser.findElement(By.cssSelector(".origin_number")).getText();
            Thread.sleep(TIME_SLEEP);
            if (val.equals(nextResults)) {
                System.out.println("testCurrentPage: - true - " + nextResults);
            } else {
                System.out.println("testCurrentPage: - false - " + nextResults);
            }
            browser.findElement(By.cssSelector(".close")).click();
        }
    }

    private void findUniqueValue(WebDriver browser) throws InterruptedException {
        val = null;
        List<WebElement> listItems = browser.findElements(By.cssSelector("[data-toggle='modal']"));
        System.out.println("listItems = " + listItems.size());

        for (WebElement buttonDetails : listItems) {
            buttonDetails.click();
            Thread.sleep(TIME_SLEEP);
            WebElement item = browser.findElement(By.cssSelector(".origin_number"));
            val = item.getText();

            if (TextUtils.isEmpty(val)) {
                System.out.println("no such element value");
//                нашел значение
            } else {
                System.out.println("val = " + val);
                Thread.sleep(TIME_SLEEP);
                if (!hashMapValue.containsKey(val)) {
                    System.out.println("new value found");
                    hashMapValue.put(val, ".origin_number");
                    browser.findElement(By.cssSelector(".close")).click();
                    break;
                }

            }
            browser.findElement(By.cssSelector(".close")).click();
            Thread.sleep(TIME_SLEEP);
        }

    }

    private void makeSearch(WebDriver browser) {

        js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
        browser.findElement(By.cssSelector("[placeholder='Введите слово']")).sendKeys(val);
        browser.findElement(By.cssSelector("[class='search-form'] button")).click();
    }

    private void testAllPages(WebDriver browser) throws InterruptedException {
        testCurrenPage(browser, val);

        while (browser.findElements(By.cssSelector(".pagination .pagination li:last-of-type a")).size() > 0 && browser.findElement(By.cssSelector(".pagination .pagination li:last-of-type a")).isEnabled()) {
            Thread.sleep(TIME_SLEEP);
            browser.findElement(By.cssSelector(".pagination .pagination li:last-of-type a")).click();
            LoaderWaiter.waitForLoad(browser);

            js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
            Thread.sleep(TIME_SLEEP);

            testCurrenPage(browser, val);
        }
        Thread.sleep(TIME_SLEEP);
    }
}

