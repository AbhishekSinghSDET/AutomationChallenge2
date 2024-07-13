package com.testing.tests;

import com.testing.pages.HomePage;
import org.testng.annotations.Test;

public class TestCase1 extends BaseTest{
    HomePage homePage = null;

    @Test
    public void getData(){
    homePage = new HomePage();
    homePage.scrollBy();
    homePage.clickOnEditIcon(3);
    homePage.enterFirstName("Rohan");
    homePage.enterLastName("Singh");
    homePage.clickOnSubmitButton();
    homePage.verifyData("Rohan");
    }
}
