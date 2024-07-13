package com.testing.tests;

import com.testing.driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest{

    @BeforeMethod
    protected void setUp() {
        DriverManager.init();
    }

    @AfterMethod
    protected void tearDown(){
        DriverManager.down();
    }


}
