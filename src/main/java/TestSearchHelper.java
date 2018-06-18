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

        System.out.println("getValue " + " start" + "\n");
        while (hashMapValue.size() < 5) {
            findUniqueValueAllPages(browser);

            makeSearch(browser);

            LoaderWaiter.waitForLoad(browser);

            testAllPages(browser);

            browser.findElement(By.cssSelector(".header_block [href='poisk.html']")).click();
        }
        System.out.println("getValue " + " fin" + "\n");

    }


//        проверить цифру из фильтра например марки , закинуть назввание марки в поиск и проверить количество наименований марки  в соответствии цифре из фильтра

    private void testCurrentPage(WebDriver browser, String val) throws InterruptedException, StaleElementReferenceException {
        System.out.println("testCurrentPage " + " start" + "\n");

        java.util.List<WebElement> listItem = browser.findElements(By.cssSelector("[data-toggle='modal']"));
        System.out.println("listItemsCurrentPage = " + listItem.size());
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
        System.out.println("testCurrentPage " + " fin" + "\n");

    }

    private void findUniqueValueCurrentPage(WebDriver browser) throws InterruptedException {
        System.out.println("findUniqueValueCurrentPage " + " start" + "\n");

        val = null;
        List<WebElement> listItems = browser.findElements(By.cssSelector("[data-toggle='modal']"));
//        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
//        Thread.sleep(TIME_SLEEP);
//        WebElement pagNum = (WebElement) browser.findElements(By.id(".pagination .pagination .active a"));
//        System.out.println("\n" + "listItems" + pagNum.getAttribute("a") + " = " + listItems.size());
        System.out.println("\n" + "listItems = " + listItems.size());
//        js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
//        Thread.sleep(TIME_SLEEP);

        for (WebElement buttonDetails : listItems) {
            buttonDetails.click();
            Thread.sleep(TIME_SLEEP);
            WebElement item = browser.findElement(By.cssSelector(".origin_number"));
            val = item.getText();

            if (TextUtils.isEmpty(val) || val.length() < 3) {
                System.out.println("no such element value");
//                нашел значение
            } else {
                System.out.println("val = " + val);
                Thread.sleep(TIME_SLEEP);
                if (!hashMapValue.containsKey(val)) {
                    System.out.println("new value found");
                    hashMapValue.put(val, ".origin_number");
                    System.out.println("hashMapValue: " + hashMapValue);
                    browser.findElement(By.cssSelector(".close")).click();
                    return;
                }
            }
            val = null;
            browser.findElement(By.cssSelector(".close")).click();
            Thread.sleep(TIME_SLEEP);

        }
        System.out.println("findUniqueValueCurrentPage " + " fin" + "\n");

    }


    private void findUniqueValueAllPages(WebDriver browser) throws InterruptedException {
        System.out.println("findUniqueValueAllPages " + " start" + "\n");

        findUniqueValueCurrentPage(browser);
        if (val != null)
            return;
        while (getPagination(browser)) {
            findUniqueValueCurrentPage(browser);
            if (val != null)
                break;
        }
        Thread.sleep(TIME_SLEEP);
        System.out.println("findUniqueValueAllPages " + " fin" + "\n");

    }


    private void makeSearch(WebDriver browser) throws InterruptedException {
        System.out.println("makeSearch " + " start" + "\n");

        Thread.sleep(TIME_SLEEP);
        js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
        browser.findElement(By.cssSelector("[placeholder='Введите слово']")).sendKeys(val);
//        js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");

        browser.findElement(By.cssSelector("[class='search-form'] button")).click();
        System.out.println("makeSearch" + "fin" + "\n");

    }

    private void testAllPages(WebDriver browser) throws InterruptedException {
        System.out.println("testAllPages " + " start" + "\n");

        testCurrentPage(browser, val);

        while (getPagination(browser)) {
            testCurrentPage(browser, val);
        }
        Thread.sleep(TIME_SLEEP);
        System.out.println("testAllPages " + " fin" + "\n");

    }

    private boolean getPagination(WebDriver browser) throws InterruptedException {
        System.out.println("getPagination " + " start");

        boolean isPagination = browser.findElements(By.cssSelector(".pagination .pagination li:last-of-type a")).size() > 0
                && browser.findElement(By.cssSelector(".pagination .pagination li:last-of-type a")).isEnabled();
        if (isPagination) {
            Thread.sleep(TIME_SLEEP);
            browser.findElement(By.cssSelector(".pagination .pagination li:last-of-type a")).click();
            LoaderWaiter.waitForLoad(browser);

            js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
            Thread.sleep(TIME_SLEEP);
        }
        System.out.println("getPagination " + " fin" + "\n");

        return isPagination;

    }

}

