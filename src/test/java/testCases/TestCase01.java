package testCases;

import base.baseTest;
import objects.loginPage;
import org.testng.annotations.Test;
import utility.ReadExcelData;

public class TestCase01 extends baseTest {


    @Test
    //(dataProviderClass = ReadExcelData.class,dataProvider = "credentials_data")
    public void valid_user_credentials() {
        loginPage objLoginpage = new loginPage(driver);
        objLoginpage.usernameInput("standard_user");
        objLoginpage.passwordInput("secret_sauce");
        objLoginpage.submitButtonClick();
    }


}
