import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeoutException;

public class LoaderWaiter {
    public static void waitForLoad(WebDriver browser) {
//        ExpectedCondition<Boolean> pageLoadCondition = browser1 -> ((JavascriptExecutor) browser1).executeScript("return document.readyState").equals("complete");
//        WebDriverWait wait = new WebDriverWait(browser, 30);
//        wait.until(pageLoadCondition);

        WebDriverWait waitUntil = new WebDriverWait(browser, 10);
//        waitUntil.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".preloader[style='display: none;']")));
        waitUntil.until(ExpectedConditions.attributeContains(By.cssSelector(".preloader"), "style", "display: none;"));







    }












//    WebDriverWait wait = new WebDriverWait(browser, 15);
//wait.until(
//
//    waitForAjaxCalls());
//
//    public static ExpectedCondition<Boolean> waitForAjaxCalls() {
//        return new ExpectedCondition<Boolean>() {
//            @Override
//            public Boolean apply(WebDriver driver) {
//                return Boolean.valueOf(((JavascriptExecutor) driver).executeScript("return (window.angular !== undefined) && (angular.element(document).injector() !== undefined) && (angular.element(document).injector().get('$http').pendingRequests.length === 0)").toString());
//            }
//        };
//    }







//public static String waitForElementNotVisible(int timeOutInSeconds, WebDriver driver, String elementXPath) {
//    if ((driver == null) || (elementXPath == null) || elementXPath.isEmpty()) {
//
//        return "Wrong usage of WaitforElementNotVisible()";
//    }
//    try {
//        (new WebDriverWait(driver, timeOutInSeconds)).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(elementXPath)));
//        return null;
//    } catch (org.openqa.selenium.TimeoutException e) {
//        return "Build your own errormessage...";
//    }
//}
}



