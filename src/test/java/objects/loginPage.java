package objects;

import base.baseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class loginPage extends baseTest {

    public loginPage(WebDriver driver) {
        baseTest.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='user-name']")
    private WebElement username_field;

    @FindBy(xpath = "//*[@id='password']")
    private WebElement password_field;

    @FindBy(xpath = "//*[@id='login-button']")
    private WebElement submitButton;


    public void usernameInput(String username) {
        username_field.sendKeys(username);
    }

    public void passwordInput(String password) {
        password_field.sendKeys(password);
    }

    public void submitButtonClick() {
        click_method(submitButton,"Submit button");
    }
}