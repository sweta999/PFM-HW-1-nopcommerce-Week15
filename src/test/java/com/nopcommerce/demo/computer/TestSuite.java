package com.nopcommerce.demo.computer;

import com.nopcommerce.demo.pages.BuildYourOwnComputer;
import com.nopcommerce.demo.pages.Computers;
import com.nopcommerce.demo.pages.Desktop;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class TestSuite extends TestBase {

    HomePage homepage;
    Computers computer;
    Desktop desktop;
    BuildYourOwnComputer buildYourOwnComputer;

    @BeforeMethod(alwaysRun = true)
    public void setPage() {
        homepage = new HomePage();
        computer =  new Computers();
        desktop =  new Desktop();
        buildYourOwnComputer = new BuildYourOwnComputer();
    }

    @Test(groups = {"sanity", "regression"})
    public void verifyProductArrangeInReverseAlphabeticalOrder() throws InterruptedException {

        homepage.clickOnComputerMenu();
        computer.clickOnDesktop();
        Thread.sleep(2000);
        desktop.selectSortByPositionNameZToA();
        desktop.verifyProductArrangeInDescendingOrder();
    }

    @Test(groups = {"regression"})
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {

        homepage.clickOnComputerMenu();
        Thread.sleep(1000);
        computer.clickOnDesktop();
        desktop.selectSortByPositionNameAToZ();
        Thread.sleep(2000);
        desktop.clickOnAddToCart();
        String expectedMsg = "Build your own computer";
        String actualMsg = buildYourOwnComputer.getTextBuildYourOwnComputer();
        Assert.assertEquals(actualMsg, expectedMsg);
        buildYourOwnComputer.selectProcessorAttribute("1");  // Select value 1 or 2 here
        buildYourOwnComputer.selectRamAttribute("5");  // Select value 3,4 or 5 here
        buildYourOwnComputer.selectHDDAttribute("7");  // Select value 6 or 7 here
        buildYourOwnComputer.selectOSAttribute("9");   // Select value 8 or 9 here
        buildYourOwnComputer.selectSoftwareTotalCommander();
        Thread.sleep(20000);
        String expectedPrice = "$1,475.00";
        String actualPrice = buildYourOwnComputer.getTextForPrice$1475();
        Assert.assertEquals(actualPrice, expectedPrice);
        buildYourOwnComputer.clickOnAddToCartButton();
        //Thread.sleep(5000);
        String expectedMsg1 = "The product has been added to your shopping cart";
        String actualMsg1 = buildYourOwnComputer.getTextProductAddedToCart();
        Assert.assertEquals(actualMsg1, expectedMsg1);
        buildYourOwnComputer.setCloseTheBarCrossButton();

    }

}
