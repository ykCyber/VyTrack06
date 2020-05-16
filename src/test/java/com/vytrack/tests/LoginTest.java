package com.vytrack.tests;

import com.vytrack.utilities.Login;
import com.vytrack.utilities.Util;
import com.vytrack.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginTest {
    private static final String URL = "https://qa1.vytrack.com/";
    @Test
    public void test() throws Exception {
       String filePath = "C:\\Users\\mksimsir\\Documents\\testData.xlsx";
//        String[][] dataFromExcel = Util.getDataFromExcel(filePath, "Data", "Table");
        for (String[] strings : dataFromExcel) {
            System.out.println("strings = " + strings);
        }
    }
}

