import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class TestFilterHelper {
    private WebDriver browser;
    private final JSWaiter jsWaiter;

    public TestFilterHelper(WebDriver browser){
        this.browser = browser;
        jsWaiter = new JSWaiter(browser);
    }

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
//            System.out.println("begin cycle, count = " + count);
            try {
                nextPage = browser.findElement(By.cssSelector(".pagination .pagination li:last-of-type a"));
            } catch (NoSuchElementException ref) {
//                System.out.println(ref.getMessage());
                break;
            }
            if (nextPage != null) {
                nextPage.click();
                while (!jsWaiter.waitForJQueryLoad()) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int countPage = getCountItems(browser);
                count += countPage;
//                System.out.println("count = " + count);
            }
        }

        return count;
    }

    public void testCatalogFilter(String catalogFilter) throws InterruptedException, IllegalArgumentException {

        while (!jsWaiter.waitForJQueryLoad()) {
            Thread.sleep(500);
        }

        List<WebElement> el = browser.findElements(By.cssSelector("input[name='" + catalogFilter + "']"));

        for (int i = 0; i < el.size(); i++) {
            WebElement input = el.get(i);


            WebElement getChecker = browser.findElement(By.cssSelector("input[id='" + input.getAttribute("id") + "'] + label"));
            WebElement getChecker2 = browser.findElement(By.cssSelector("input[id='" + input.getAttribute("id") + "'] "));
            String val = getChecker2.getAttribute("value");
            System.out.println(val + ":");
            Actions actions = new Actions(browser);
            actions.moveToElement(getChecker);
            actions.perform();

            getChecker.click();
            while (!jsWaiter.waitForJQueryLoad()) {
                Thread.sleep(500);
            }

            int countAllPages = getCountItemAllPages(browser, jsWaiter);
            System.out.println("getCountItemAllPages = " + countAllPages);

            WebElement numFromSite = browser.findElement(By.cssSelector("input[id='" + input.getAttribute("id") + "'] + label span"));
            int numberFromSite = Integer.parseInt(numFromSite.getText());
            System.out.println("numberFromSite = " + numberFromSite);
            if (numberFromSite == countAllPages) {
                System.out.println("\n" + "Test Passed" + "\n" + "\n");
            } else {
                System.out.println("\n" + "Test Failed: numbers don't match" + "\n" + "\n");
            }

// scroll browser up
            JavascriptExecutor js = (JavascriptExecutor) browser;
            js.executeScript("window.scrollTo(0,0)");

// unclick Checker
            getChecker.click();

            while (!jsWaiter.waitForJQueryLoad()) {
                Thread.sleep(500);
            }


        }


    }



}
