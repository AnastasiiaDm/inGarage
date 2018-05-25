import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TestSearchHelper {
    private WebDriver browser;
    private final JSWaiter jsWaiter;

    public TestSearchHelper(WebDriver browser) {
        this.browser = browser;
        jsWaiter = new JSWaiter(browser);
    }

    public void clickPodrobnee(String podrobnee) throws InterruptedException {
        browser.findElement(By.cssSelector("[data-toggle='" + podrobnee + "']")).click();
        Thread.sleep(1500);
    }

    public void value (WebDriver browser) {
        WebElement find = browser.findElement(By.cssSelector(".marka"));
        String val = find.getText();
        if (find.isEnabled())
            System.out.println(val);
        browser.findElement(By.cssSelector(".close")).click();
        browser.findElement(By.cssSelector("[placeholder='Введите слово']")).sendKeys(val);
//       need to find button Найти  browser.findElement(By.cssSelector(""));








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

