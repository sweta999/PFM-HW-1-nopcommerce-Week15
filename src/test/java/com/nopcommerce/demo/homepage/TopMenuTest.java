package com.nopcommerce.demo.homepage;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {

    HomePage homepage;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        homepage = new HomePage();
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyPageNavigation()  {
        homepage.selectMenu("Apparel");
        verifyMessage(By.xpath("//div[@class='page-title']/h1"),30,"Apparel","Not Valid Message");

    }
}
