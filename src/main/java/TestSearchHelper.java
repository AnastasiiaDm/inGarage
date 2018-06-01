import org.apache.http.util.TextUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        WebElement find = browser.findElement(By.cssSelector(".marka"));
        String val = find.getText();
// проверка на существование и пустое значение
        if (find.isEnabled() && !TextUtils.isEmpty(val)) {

            System.out.println(val);
            browser.findElement(By.cssSelector(".close")).click();
            browser.findElement(By.cssSelector("[placeholder='Введите слово']")).sendKeys(val);
            browser.findElement(By.cssSelector("[class='search-form'] button"));

            LoaderWaiter.waitForLoad(browser);

//            Thread.sleep(5000);

//            browser.findElement(By.cssSelector("[data-toggle='modal']")).click();
//            Thread.sleep(1500);
//            WebElement result = browser.findElement(By.cssSelector(".marka"));
//            String results = result.getText();
//            if (find.isEnabled())
//                System.out.println(results);
//            if (val.equals(results)) {
//                System.out.println("true" + "\n");
//            } else {
//                System.out.println("false" + "\n");
//            }
//            browser.findElement(By.cssSelector(".close")).click();

            java.util.List<WebElement> listItem = browser.findElements(By.cssSelector("[data-toggle='modal']"));
            System.out.println("listItem.size() = " + listItem.size());

//ошибка, не кликается
            for (WebElement element : listItem) {
                Thread.sleep(1500);
                element.click();
                String nextResults = browser.findElement(By.cssSelector(".marka")).getText();
                if (val.equals(nextResults)) {
                    System.out.println("true" + "\n");
                } else {
                    System.out.println("false" + "\n");
                }
                browser.findElement(By.cssSelector(".close")).click();

            }

//            for (int i = 0; i < listItem.size(); i++) {
//                WebElement element = listItem.get(i);
//
//            }
        } else {
            browser.findElement(By.cssSelector(".close")).click();
        }
//        проверить цифру из фильтра например марки , закинуть назввание марки в поиск и проверить количество наименований марки  в соответствии цифре из фильтра

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

