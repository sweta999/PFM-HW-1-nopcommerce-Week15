package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class Computers extends Utility {

    //Logger is class of Log4j. log is object created
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//ul[@class='sublist']/li[1]/a")
    WebElement desktopLink;

    public void clickOnDesktop() {
        Reporter.log("clicking on desktop link" + desktopLink.toString() + "<br>");
        mouseHoverToElementAndClick(desktopLink);
        log.info("Clicking on desktop link : " + desktopLink.toString());
    }

}
