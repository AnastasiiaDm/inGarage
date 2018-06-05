import org.apache.http.util.TextUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import javax.xml.soap.Node;
import java.util.List;

public class TestSearchHelper {
    private WebDriver browser;
//    private final JSWaiter jsWaiter;

    public TestSearchHelper(WebDriver browser) {
        this.browser = browser;
//        jsWaiter = new JSWaiter(browser);
    }

    public void clickPodrobnee(String podrobnee) throws InterruptedException {
        browser.findElement(By.cssSelector("[data-toggle='" + podrobnee + "']")).click();
        Thread.sleep(1500);
    }

    public void value(WebDriver browser) throws InterruptedException {
        WebElement item = browser.findElement(By.cssSelector(".marka"));
        String val = item.getText();
// проверка на существование и пустое значение
        if (item.isEnabled() && !TextUtils.isEmpty(val)) {
            System.out.println(val);
            browser.findElement(By.cssSelector(".close")).click();
            browser.findElement(By.cssSelector("[placeholder='Введите слово']")).sendKeys(val);
            browser.findElement(By.cssSelector("[class='search-form'] button"));

            LoaderWaiter.waitForLoad(browser);

testCurrentPage(browser , val);

        } else {
            browser.findElement(By.cssSelector(".close")).click();
        }
        WebElement nextPage = browser.findElement(By.cssSelector(".pagination .pagination li:last-of-type a"));
//        for (WebElement allPages : nextPage){
        if (nextPage.isEnabled()) {
            Thread.sleep(1000);
            nextPage.click();
        }
//        }
//        проверить цифру из фильтра например марки , закинуть назввание марки в поиск и проверить количество наименований марки  в соответствии цифре из фильтра

    }
private void testCurrentPage(WebDriver browser, String val) throws InterruptedException,StaleElementReferenceException {

    java.util.List<WebElement> listItem = browser.findElements(By.cssSelector("[data-toggle='modal']"));
    System.out.println("listItem.size = " + listItem.size());
    for (WebElement element : listItem) {
        Thread.sleep(2000);
        element.click();
        Thread.sleep(1000);
        String nextResults = browser.findElement(By.cssSelector(".marka")).getText();
        Thread.sleep(1000);
        if (val.equals(nextResults)) {
            System.out.println(nextResults + " - true" + "\n");
        } else {
            System.out.println(nextResults + " - false" + "\n");
        }
        browser.findElement(By.cssSelector(".close")).click();
    }
}































    private void analogNumber(WebDriver browser, JSWaiter jsWaiter) {
        // check pagination (next page) exist
        WebElement analogNum = null;


        for (; true; ) {
//            System.out.println("begin cycle, count = " + count);
            System.out.println("analog num not exist");

            try {
//                analogNum = browser.findElement(By.cssSelector(".analog_number"));
                analogNum = browser.findElement(By.cssSelector(".marka"));

            } catch (NoSuchElementException ref) {
                System.out.println(ref.getMessage());

                WebElement closePodrobnee = browser.findElement(By.cssSelector(".close"));
                break;
            }
            if (analogNum != null) {

                Actions actions = new Actions(browser);
                actions.moveToElement(analogNum);
                actions.perform();

                analogNum.getText();
                while (!jsWaiter.waitForJQueryLoad()) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
//                    int countPage = analogNumber(browser);
//                    anNum += countPage;
                System.out.println(analogNum);
            }
        }
    }
}


//        WebElement analogNum = (WebElement) browser.findElements(By.cssSelector("[class='analog_number']  "));
//
//        Actions actions = new Actions(browser);
//        actions.moveToElement(analogNum);
//        actions.perform();
//
//        String analogNumbers = analogNum.getText();
//        System.out.println(analogNumbers);
//
//    }

