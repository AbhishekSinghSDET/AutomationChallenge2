package com.testing.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

public class DriverManager {

    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void setDriver(WebDriver driverRef){
        driver.set(driverRef);
    }

    public static WebDriver getDriver(){
        return driver.get();
    }

    public static void unload(){
        driver.remove();
    }

    public static void init() {
        if (Objects.isNull(DriverManager.getDriver())){
            WebDriver driver = new ChromeDriver();
            driver.get("https://demoqa.com/webtables");
            driver.manage().window().maximize();
            setDriver(driver);

        }
    }

    public static void down() {
        if (Objects.nonNull(DriverManager.getDriver())) {
            getDriver().quit();
            unload();
        }
    }
}
