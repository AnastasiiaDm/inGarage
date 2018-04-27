import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class TestSearchHelper {
    private WebDriver browser;
    private final JSWaiter jsWaiter;

    public TestSearchHelper (WebDriver browser){
        this.browser = browser;
        jsWaiter = new JSWaiter(browser);
    }
    public void  clickPodrobnee (String podrobnee) throws InterruptedException {
        WebElement podrobneeButton = browser.findElement(By.cssSelector("[data-toggle='" + podrobnee + "']"));
       podrobneeButton.click();
       Thread.sleep(1500);

        WebElement analogNum = (WebElement) browser.findElements(By.cssSelector("[class='analog_number']  "));

        Actions actions = new Actions(browser);
        actions.moveToElement(analogNum);
        actions.perform();

        String analogNumbers = analogNum.getText();
        System.out.println(analogNumbers);

    }
}
