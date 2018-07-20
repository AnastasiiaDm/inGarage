import org.apache.http.util.TextUtils;
import org.openqa.selenium.*;

import java.util.HashMap;
import java.util.List;

public class TestSearchHelper {
    private final long TIME_SLEEP = 500;
    private WebDriver browser;
    //    private JSWaiter jsWaiter;
    private HashMap<String, String> hashMapValue = new HashMap<String, String>();
    private String val = null; //изначально значение val является null
    private JavascriptExecutor js;
    private int passedPageForUniqueValue = 0;
    private int countTestedPages = 1;
    private String testingField;


    public TestSearchHelper(WebDriver browser) {
        this.browser = browser;
//        jsWaiter = new JSWaiter(browser);
        js = (JavascriptExecutor) browser;
    }


    public void testing(String testingField) throws InterruptedException, StaleElementReferenceException, NoSuchElementException {
        this.testingField = testingField;
//        System.out.println("testing " + " start" + "\n");

        while (!isLastPage()) {

            if (countTestedPages > 1)
                switchPage();

            findUniqueValueAllPages(browser);

            makeSearch(browser);

            LoaderWaiter.waitForLoad(browser);

            testAllPages(browser);

            browser.findElement(By.cssSelector(".header_block [href='poisk.html']")).click();
        }
//        System.out.println("testing " + " fin" + "\n");

    }

    private void switchPage() throws InterruptedException {
        System.out.println("\n" + "switchPage: countTestedPages = " + countTestedPages);
        System.out.println("active page = " + browser.findElement(By.cssSelector(".pagination .pagination .active")).getText());

        while (countTestedPages != getActivePage(browser)) {
            browser.findElement(By.cssSelector(".pagination .pagination li:last-of-type a")).click();
            LoaderWaiter.waitForLoad(browser);
        }
    }

    private boolean isLastPage() {
        return !browser.findElement(By.cssSelector(".pagination .pagination li:last-of-type a")).isEnabled();
    }


//        проверить цифру из фильтра например марки , закинуть назввание марки в поиск и проверить количество наименований марки  в соответствии цифре из фильтра

    private void testCurrentPage(WebDriver browser, String val) throws InterruptedException, StaleElementReferenceException {
//        System.out.println("testCurrentPage " + " start" + "\n");

        java.util.List<WebElement> listItem = browser.findElements(By.cssSelector("[data-toggle='modal']"));
        System.out.println("\n" + "listItemsCurrentPage = " + listItem.size());
        for (WebElement element : listItem) {
            Thread.sleep(TIME_SLEEP);
            element.click();
            Thread.sleep(TIME_SLEEP);
            String nextResults = browser.findElement(By.cssSelector("." + testingField)).getText();
            Thread.sleep(TIME_SLEEP);
            if (val.equals(nextResults)) {
                System.out.println("testCurrentPage: - true - " + nextResults);
            } else {
                System.out.println("testCurrentPage: - false - " + nextResults);
            }
            browser.findElement(By.cssSelector(".close")).click();
        }
//        System.out.println("testCurrentPage " + " fin" + "\n");

    }

    private void findUniqueValueCurrentPage(WebDriver browser) throws InterruptedException {
//        System.out.println("findUniqueValueCurrentPage " + " start" + "\n");
        passedPageForUniqueValue = getActivePage(browser) <= passedPageForUniqueValue ? passedPageForUniqueValue : getActivePage(browser);
        val = null;
        List<WebElement> listItems = browser.findElements(By.cssSelector("[data-toggle='modal']"));

//        System.out.println("\n" + "listItems" + pagNum.getAttribute("a") + " = " + listItems.size());
        System.out.println("\n" + "listItems = " + listItems.size());
        js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
        Thread.sleep(TIME_SLEEP);
        for (WebElement buttonDetails : listItems) {
            buttonDetails.click();
            Thread.sleep(TIME_SLEEP);
            WebElement item = browser.findElement(By.cssSelector("." + testingField));
            val = item.getText();

            if (TextUtils.isEmpty(val) || val.length() < 3) {
                System.out.println("no such element value");
//                нашел значение
            } else {
                System.out.println("val = " + val);
                Thread.sleep(TIME_SLEEP);
                if (!hashMapValue.containsKey(val)) {
                    System.out.println("new value found");
                    hashMapValue.put(val, "." + testingField);
                    System.out.println("hashMapValue: " + hashMapValue);
                    browser.findElement(By.cssSelector(".close")).click();
                    return;
                }
            }
            val = null;
            browser.findElement(By.cssSelector(".close")).click();
            Thread.sleep(TIME_SLEEP);

        }
//        System.out.println("findUniqueValueCurrentPage " + " fin" + "\n");

    }


    private void findUniqueValueAllPages(WebDriver browser) throws InterruptedException {
//        System.out.println("findUniqueValueAllPages " + " start" + "\n");

        findUniqueValueCurrentPage(browser);
        if (val != null)
            return;
        while (getPagination(browser, passedPageForUniqueValue)) {
            countTestedPages++;
            System.out.println("*******countTestedPages " + countTestedPages);
            findUniqueValueCurrentPage(browser);
            if (val != null)
                break;
        }
        Thread.sleep(TIME_SLEEP);
//        System.out.println("findUniqueValueAllPages " + " fin" + "\n");

    }


    private void makeSearch(WebDriver browser) throws InterruptedException {
//        System.out.println("makeSearch " + " start" + "\n");

        Thread.sleep(TIME_SLEEP);
        js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
        browser.findElement(By.cssSelector("[placeholder='Введите слово']")).sendKeys(val);
//        js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");

        browser.findElement(By.cssSelector("[class='search-form'] button")).click();
//        System.out.println("makeSearch" + "fin" + "\n");

    }

    private void testAllPages(WebDriver browser) throws InterruptedException {
//        System.out.println("testAllPages " + " start" + "\n");

        testCurrentPage(browser, val);

        while (getPagination(browser, 0)) {
            testCurrentPage(browser, val);
        }
        Thread.sleep(TIME_SLEEP);
//        System.out.println("testAllPages " + " fin" + "\n");

    }

    private boolean getPagination(WebDriver browser, int passedPage) throws InterruptedException {
//        System.out.println("getPagination: start" + "\n");
        System.out.println("\n" + "getPagination: passedPageForUniqueValue = " + passedPageForUniqueValue);
        System.out.println("getPagination: passedPage = " + passedPage + "\n");

        boolean isPagination = browser.findElements(By.cssSelector(".pagination .pagination li:last-of-type a")).size() > 0
                && browser.findElement(By.cssSelector(".pagination .pagination li:last-of-type a")).isEnabled();
        if (isPagination) {
            do {
                Thread.sleep(TIME_SLEEP);
                browser.findElement(By.cssSelector(".pagination .pagination li:last-of-type a")).click();
                LoaderWaiter.waitForLoad(browser);
            } while (passedPage != 0 && getActivePage(browser) < passedPage);


            js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
            Thread.sleep(TIME_SLEEP);
        }
//        System.out.println("getPagination " + " fin" + "\n");

        return isPagination;

    }

    private int getActivePage(WebDriver browser) throws InterruptedException {
//        System.out.println("getActivePage " + " start" + "\n");
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(TIME_SLEEP);
        WebElement activePageNum = browser.findElement(By.cssSelector(".active")).findElement(By.tagName("a"));
//        System.out.println("activePageNum: " + activePageNum.getText());

        return Integer.parseInt(activePageNum.getText());
    }
}

