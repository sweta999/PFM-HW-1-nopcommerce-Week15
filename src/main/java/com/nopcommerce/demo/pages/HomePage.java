package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class HomePage extends Utility {

    //Logger is class of Log4j. log is object created
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//div[@class='header-menu']/ul[1]/li[1]/a")
    WebElement computerLink;

    public void selectMenu(String menu) {
        Reporter.log("clicking on computer link" + computerLink.toString() + "<br>");
        List<WebElement> elementList = driver.findElements(By.xpath("//div[@class='header-menu']/ul[1]/li/a"));
        log.info("Clicking on Computer Link : " + computerLink.toString());
        for (WebElement element : elementList) {
            if (element.getText().equalsIgnoreCase(menu)) {
                element.click();
                break;
            }
        }
    }

    public void clickOnComputerMenu() {
        Reporter.log("clicking on computer link" + computerLink.toString() + "<br>");
        mouseHoverToElementAndClick(computerLink);
        log.info(("Clicking on Computer Link : " + computerLink.toString()));
    }



}