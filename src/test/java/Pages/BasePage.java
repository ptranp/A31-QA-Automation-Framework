package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    WebDriver driver;
    WebDriverWait wait;
    Actions action;

    public BasePage(WebDriver dvr){
        driver= dvr;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void findElement(By locator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public void click(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

}