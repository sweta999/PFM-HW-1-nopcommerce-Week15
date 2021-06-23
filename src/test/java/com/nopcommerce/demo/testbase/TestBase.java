package com.nopcommerce.demo.testbase;

import com.nopcommerce.demo.propertyreader.PropertyReader;
import com.nopcommerce.demo.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends Utility {

    //String browser = "chrome";
    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod(alwaysRun = true)
    public void openBrowser(){
        selectBrowser(browser);
    }

    @AfterMethod(groups = {"smoke", "sanity", "regression"})
    public void tearDown(){
        closeBrowser();
    }

}
