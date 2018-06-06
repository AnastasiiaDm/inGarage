import org.apache.http.util.TextUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import javax.xml.soap.Node;
import java.util.List;

public class TestSearchHelper {
    private final long TIME_SLEEP = 500;
    private WebDriver browser;
//    private final JSWaiter jsWaiter;

    public TestSearchHelper(WebDriver browser) {
        this.browser = browser;
//        jsWaiter = new JSWaiter(browser);
    }

    public void clickPodrobnee(String podrobnee) throws InterruptedException, StaleElementReferenceException {
        browser.findElement(By.cssSelector("[data-toggle='" + podrobnee + "']")).click();
        Thread.sleep(TIME_SLEEP);
    }

    public void value(WebDriver browser) throws InterruptedException, StaleElementReferenceException {
        WebElement item = browser.findElement(By.cssSelector(".origin_number"));
        String val = item.getText();
// проверка на существование и пустое значение
        if (item.isEnabled() && !TextUtils.isEmpty(val)) {
            System.out.println(val);
            browser.findElement(By.cssSelector(".close")).click();
            browser.findElement(By.cssSelector("[placeholder='Введите слово']")).sendKeys(val);
            browser.findElement(By.cssSelector("[class='search-form'] button"));

            LoaderWaiter.waitForLoad(browser);

            testCurrentPage(browser, val);

            while (browser.findElement(By.cssSelector(".pagination .pagination li:last-of-type a")).isEnabled()) {
                Thread.sleep(TIME_SLEEP);
                browser.findElement(By.cssSelector(".pagination .pagination li:last-of-type a")).click();
                LoaderWaiter.waitForLoad(browser);

                JavascriptExecutor js = (JavascriptExecutor) browser;
                js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");

                Thread.sleep(TIME_SLEEP);
                testCurrentPage(browser, val);
            }

        } else {
//            do {
                browser.findElement(By.cssSelector(".close")).click();
                System.out.println("no search value");
//                Thread.sleep(TIME_SLEEP);
//                browser.findElement(By.cssSelector("[data-toggle='modal']")).click();
//                browser.findElement(By.cssSelector(".origin_number")).getText();


//            } while (browser.findElement(By.cssSelector("[data-toggle='modal']")).isEnabled());
        }

//        }
//        проверить цифру из фильтра например марки , закинуть назввание марки в поиск и проверить количество наименований марки  в соответствии цифре из фильтра

    }



//    public void value2 (WebDriver browser) throws InterruptedException, StaleElementReferenceException {
//        WebElement item = browser.findElement(By.cssSelector(".origin_number"));
//        String val = item.getText();
//// проверка на существование и пустое значение
//        while  (item.isEnabled() && !TextUtils.isEmpty(val)) {
//            System.out.println(val);
//            browser.findElement(By.cssSelector(".close")).click();
//            browser.findElement(By.cssSelector("[placeholder='Введите слово']")).sendKeys(val);
//            browser.findElement(By.cssSelector("[class='search-form'] button"));
//
//            LoaderWaiter.waitForLoad(browser);
//
//            testCurrentPage(browser, val);
//
//            while (browser.findElement(By.cssSelector(".pagination .pagination li:last-of-type a")).isEnabled()) {
//                Thread.sleep(TIME_SLEEP);
//                browser.findElement(By.cssSelector(".pagination .pagination li:last-of-type a")).click();
//                LoaderWaiter.waitForLoad(browser);
//
//                JavascriptExecutor js = (JavascriptExecutor) browser;
//                js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
//
//                Thread.sleep(TIME_SLEEP);
//                testCurrentPage(browser, val);
//            }
//        }
//    }























    private void testCurrentPage(WebDriver browser, String val) throws InterruptedException, StaleElementReferenceException {

        java.util.List<WebElement> listItem = browser.findElements(By.cssSelector("[data-toggle='modal']"));
        System.out.println("\n" + "listItem.size = " + listItem.size());
        for (WebElement element : listItem) {
            Thread.sleep(TIME_SLEEP);
            element.click();
            Thread.sleep(TIME_SLEEP);
            String nextResults = browser.findElement(By.cssSelector(".origin_number")).getText();
            Thread.sleep(TIME_SLEEP);
            if (val.equals(nextResults)) {
                System.out.println(nextResults + " - true");
            } else {
                System.out.println(nextResults + " - false");
            }
            browser.findElement(By.cssSelector(".close")).click();
        }
    }
}

