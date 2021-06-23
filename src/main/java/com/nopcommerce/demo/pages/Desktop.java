package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Desktop extends Utility {

    //Logger is class of Log4j. log is object created
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(id = "products-orderby")
    WebElement sortByZtoA;
    @FindBy(id = "products-orderby")
    WebElement descendingOrder;
    @FindBy(id = "products-orderby")
    WebElement sortByAtoZ;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]")
    WebElement addToCart;

    public void selectSortByPositionNameZToA() {
        Reporter.log("Select sort by Z to A" + sortByZtoA.toString() + "<br>");
        selectByValueFromDropDown((sortByZtoA), "6");
        //log.info("Select sort by Z to A : " + sortByZtoA.toString());
    }

    public void verifyProductArrangeInDescendingOrder() {
        Reporter.log("Verifying Product is arranged in Descending Order" + descendingOrder.toString() + "<br>");
        selectByVisibleTextFromDropDown((descendingOrder), "Name: Z to A"); ;

        //Getting list of web elements of product name
        List<WebElement> deskTopList = driver.findElements(By.xpath("//div[@class='item-grid']"));

        List<String> productName = new ArrayList<>();
        for (WebElement desktop : deskTopList) {
            productName.add(desktop.getText());

            List<String> templist = new ArrayList<>();  // temporary array list
            templist.addAll(productName);

            Collections.sort(templist, Collections.reverseOrder());  // Collections.sort(templist); for Asc only
            System.out.println(productName);
            System.out.println(templist);

            Assert.assertEquals(productName, templist);
            log.info("Verifying Product is arranged in Descending Order : " + descendingOrder.toString());
        }
    }

    public void selectSortByPositionNameAToZ() {
        Reporter.log("Select sort by A to Z" + sortByAtoZ.toString() + "<br>");
        selectByValueFromDropDown((sortByAtoZ), "5");
        //log.info("Select sort by A to Z : " + sortByAtoZ.toString());
    }

    public void clickOnAddToCart() {
        Reporter.log("Click on Add To Cart Button" + addToCart.toString() + "<br>");
        mouseHoverToElementAndClick(addToCart);
        //log.info("Click on Add to Cart Button : " + addToCart.toString());
    }

}
