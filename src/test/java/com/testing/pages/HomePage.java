package com.testing.pages;

import com.testing.base.BasePage;
import com.testing.driver.DriverManager;
import org.openqa.selenium.By;


public class HomePage extends BasePage {

    public HomePage() {

    }

    //locators
    By tblRecords = By.xpath("(//div[@class='rt-table']//span[@title='Edit'])[3]");
    By userName   = By.id("firstName");
    By lastName   = By.id("lastName");
    By btnSubmit  = By.id("submit");


    // Page Methods
    public void clickOnEditIcon(int index) {
        //clickElement(tblRecords);
        DriverManager.getDriver().findElement(By.xpath("(//div[@class='rt-table']//span[@title='Edit'])['"+index+"']")).click();
    }

    public void enterFirstName(String name){
        enterInput(userName,name);
    }

    public void enterLastName(String name){
        enterInput(lastName,name);
    }

    public void clickOnSubmitButton(){
        clickElement(btnSubmit);
    }

    public boolean verifyData(String name){
        return DriverManager.getDriver().findElement(By.xpath("//div[@class='rt-table']//div[text()='" + name + "']")).isDisplayed();
    }

}
