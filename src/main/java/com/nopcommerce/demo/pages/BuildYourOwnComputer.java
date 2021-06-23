package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BuildYourOwnComputer extends Utility {

    //Logger is class of Log4j. log is object created
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement verifyTextBuildOwnComputer;
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processorAttribute;
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ramAttribute;
    @FindBy(xpath = "//input[@id='product_attribute_3_6']")
    WebElement hddAttribute320GB;
    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement hddAttribute400GB;
    @FindBy(xpath = "//input[@id='product_attribute_4_8']")
    WebElement osAttributeVistaHome;
    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement osAttributeVistaPremium;
    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement SoftwareMicrosoftOffice;
    @FindBy(xpath = "//input[@id='product_attribute_5_11']")
    WebElement SoftwareAcrobatReader;
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement SoftwareTotalCommander;
    @FindBy(xpath = "//span[@id='price-value-1']")
    WebElement verifyPrice$1475;
    @FindBy(xpath = "//span[@id='price-value-1']")
    WebElement AddToCartButton;
    @FindBy(xpath = "//div[@id='bar-notification']/div/p") ////div[@class='bar-notification success']/p
    WebElement verifyProductAddedMsg;
    @FindBy(xpath = "//span[@class='close']")
    WebElement closeTheBarCrossButton;


    public String getTextBuildYourOwnComputer() {
        Reporter.log("Verify the Text, Build Your Own Computer" + verifyTextBuildOwnComputer.toString() + "<br>");
        log.info("Verify the Text, Build Your Own Computer : " + verifyTextBuildOwnComputer.toString());
        return getTextFromElement(verifyTextBuildOwnComputer);
    }

    public void selectProcessorAttribute(String value) {
        Reporter.log("Selection of Processor Attribute" + processorAttribute.toString() + "<br>");
        selectByValueFromDropDown(processorAttribute,
                value);
        log.info("Selection of Processor Attribute : " + processorAttribute.toString());
    }

    public void selectRamAttribute(String value) {
        Reporter.log("Selection of Ram Attribute" + ramAttribute.toString() + "<br>");
        selectByValueFromDropDown(ramAttribute,
                value);
        log.info("Selection of Ram Attribute : " + ramAttribute.toString());
    }

    public void selectHDDAttribute(String value) {
        if (value == "6") {
            Reporter.log("Selection of HDD Attribute" + hddAttribute320GB.toString() + "<br>");
            clickOnElement(hddAttribute320GB);
            log.info("Selection of HDD Attribute : " + hddAttribute320GB.toString());
        } else if (value == "7") {
            Reporter.log("Selection of HDD Attribute" + hddAttribute400GB.toString() + "<br>");
            clickOnElement(hddAttribute400GB);
            log.info("Selection of HDD Attribute : " + hddAttribute400GB.toString());
        } else {
            System.out.println("Accepts value 6 or 7 only");
        }
    }

    public void selectOSAttribute(String value) {
        if (value == "8") {
            Reporter.log("Selection of OS Attribute" + osAttributeVistaHome.toString() + "<br>");
            clickOnElement(osAttributeVistaHome);
            log.info("Selection of OS Attribute : " + osAttributeVistaHome.toString());
        } else if (value == "9") {
            Reporter.log("Selection of OS Attribute" + osAttributeVistaPremium.toString() + "<br>");
            clickOnElement(osAttributeVistaPremium);
            log.info("Selection of OS Attribute : " + osAttributeVistaPremium.toString());
        } else {
            System.out.println("Accepts value 8 or 9 only");
        }
    }

    public void selectSoftwareMicrosoftOffice() {
        Reporter.log("Selection of Software Attribute" + SoftwareMicrosoftOffice.toString() + "<br>");
        mouseHoverToElementAndClick(SoftwareMicrosoftOffice);
        log.info("Selection of Software Attribute : " + SoftwareMicrosoftOffice.toString());
    }

    public void selectSoftwareAcrobatReader() {
        Reporter.log("Selection of Software Attribute" + SoftwareAcrobatReader.toString() + "<br>");
        mouseHoverToElementAndClick(SoftwareAcrobatReader); //mouse hover method works without parameter
        log.info("Selection of Software Attribute : " + SoftwareAcrobatReader.toString());
    }

    public void selectSoftwareTotalCommander() {
        Reporter.log("Selection of Software Attribute" + SoftwareTotalCommander.toString() + "<br>");
        mouseHoverToElementAndClick(SoftwareTotalCommander);
        log.info("Selection of Software Attribute : " + SoftwareTotalCommander.toString());
    }

    public String getTextForPrice$1475() {
        Reporter.log("Verifying the Price" + verifyPrice$1475.toString() + "<br>");
        log.info("Verifying the Price : " + verifyPrice$1475.toString());
        return getTextFromElement(verifyPrice$1475);
    }

    public void clickOnAddToCartButton() {
        Reporter.log("Click on Add to Cart Button" + AddToCartButton.toString() + "<br>");
        mouseHoverToElementAndClick(AddToCartButton);
        log.info("Click on Add to Cart Button : " + AddToCartButton.toString());
    }

    public String getTextProductAddedToCart() {
        Reporter.log("Verifying the Text, Product is added to Cart" + verifyProductAddedMsg.toString() + "<br>");
        log.info("Verifying the Text, Product is added to Cart : " + verifyProductAddedMsg.toString());
        return getTextFromElement(verifyProductAddedMsg);
    }

    public void setCloseTheBarCrossButton() {
        Reporter.log("Close the Bar Cross Button" + closeTheBarCrossButton.toString() + "<br>");
        mouseHoverToElementAndClick(closeTheBarCrossButton);
        log.info("Close the Bar Cross Button : " + closeTheBarCrossButton.toString());
    }

}
