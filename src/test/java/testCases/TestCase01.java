package testCases;

import base.baseTest;
import objects.loginPage;
import org.testng.annotations.Test;

public class TestCase01 extends baseTest {


    @Test
    public void valid_user_credetials(){
        loginPage objLoginpage = new loginPage(driver);
        objLoginpage.usernameInput("standard_user");
        objLoginpage.passwordInput("secret_sauce");
        objLoginpage.submitButtonClick();
    }


}
