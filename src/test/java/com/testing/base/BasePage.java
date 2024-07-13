package com.testing.base;

import com.testing.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BasePage {

    public BasePage() {

    }

    public void implicitWait() {
        DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public WebElement presenceOfElement(final By elementLocation) {
        return new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(elementLocation));
    }

    public WebElement elementToBeClickable(final By elementIdentier) {
        WebElement element = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(elementIdentier));
        return element;
    }

    protected void enterInput(By by, String key) {
        DriverManager.getDriver().findElement(by).clear();
        DriverManager.getDriver().findElement(by).sendKeys(key);
    }

    protected WebElement getElement(By key) {
        return DriverManager.getDriver().findElement(key);
    }

    protected void clickElement(By by) {
        implicitWait();
        DriverManager.getDriver().findElement(by).click();
    }

    public void scrollBy(){
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("window.scrollBy(0,250)", "");
    }
}
