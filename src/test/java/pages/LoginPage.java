package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.ElementHelper;

public class LoginPage {

    By emailRadioButton = By.cssSelector("[type=radio][value=Email]");  //e-posta radio button
    By phoneRadioButton = By.cssSelector("[type=radio][value=Phone]");  //telefon radio button
    By loginTitle = By.cssSelector("h5.login-form__title");   //"GİRİŞ YAP" başlığı
    By emailPlaceholder = By.cssSelector("name=\"email\"");  //e-posta placeholder'ı
    By passwordPlaceholder = By.cssSelector("[type=\"password\"][placeholder=\"Şifreniz\"]");  //şifre placeholder'ı
    By showPasswordIcon = By.cssSelector("span.login-form__show-password-icon");  //"Şifremi Göster" simgesi
    By rememberMeCheckbox = By.className("checkbox-span");  //"Beni Hatırla" işaret kutusu
    By forgotPasswordButton = By.cssSelector("a.login-form__forgot-password-link");  //"Şifremi Unuttum" butonu
    By phoneTextField = By.cssSelector(".login-form__phone.text-input");  //"Telefon" yazı alanı
    By loginButton = By.cssSelector("[type=\"submit\"]");  //"Giriş Yap" butonu
    By emailTextField = By.cssSelector("type=\"email\"");  //e-posta yazı alanı
    By passwordTextField = By.cssSelector("[type=\"password\"]");  //sifre yazı alanı
    By unmatchedCredentialsWarning = By.cssSelector(".login-form__header-errors .login-form__header-errors--p");  //eşleşmeyen e-posta ve sifre uyarısı

    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void clickEmailRadioButton() {
        elementHelper.click(emailRadioButton);
    }

    public void clickPhoneRadioButton() {
        elementHelper.click(phoneRadioButton);
    }

    public void checkLoginTitle() {
        elementHelper.checkElementPresence(loginTitle);
    }

    public void checkEmailPlaceholder(String arg0) {
        String degisken4 = elementHelper.getAttribute(emailPlaceholder, "placeholder");
        Assert.assertEquals(arg0, degisken4);
    }

    public void checkPasswordPlaceholder(String arg0) {
        String degisken5 = elementHelper.getAttribute(passwordPlaceholder, "placeholder");
        Assert.assertEquals(arg0, degisken5);
    }

    public void checkShowPassword() {
        elementHelper.checkElementPresence(showPasswordIcon);
    }

    public void checkEmailRadioButton() {
        elementHelper.checkElementPresence(emailRadioButton);
    }

    public void checkPhoneRadioButton() {
        elementHelper.checkElementPresence(phoneRadioButton);
    }

    public void checkEmptyEmailWarning(String arg0) {
        WebElement degisken1 = driver.findElement(By.cssSelector("input[name=\"email\"]"));
        String emptyEmailWarning = degisken1.findElement(By.xpath("../*[@class='error']")).getText();  // degiskenin bir üst elementini buluyoruz ve uyarı mesajını çekiyoruz
        Assert.assertEquals(arg0, emptyEmailWarning);  // uyarı mesajı dogru mu kontrol ediyoruz
    }

    public void checkEmptyPasswordWarning(String arg0) {
        WebElement degisken2 = driver.findElement(By.cssSelector("input[name=\"password\"]"));
        String emptyPasswordWarning = degisken2.findElement(By.xpath("../*[@class='error']")).getText();  // degiskenin bir üst elementini buluyoruz ve uyarı mesajını çekiyoruz
        Assert.assertEquals(arg0, emptyPasswordWarning);
    }

    public void checkRememberMeCheckbox() {
        elementHelper.checkElementPresence(rememberMeCheckbox);
    }

    public void checkForgotPasswordButton() {
        elementHelper.checkElementPresence(forgotPasswordButton);
    }

    public void clickLoginButton() {
        elementHelper.click(loginButton);
    }

    public void checkPhoneTextField() {
        elementHelper.checkElementPresence(phoneTextField);
    }

    public void checkLoginButton() {
        elementHelper.checkElementPresence(loginButton);
    }

    public void fillEmailField(String arg0) {
        elementHelper.sendKey(emailTextField, arg0);
    }

    public void fillPasswordField(String arg0) {
        elementHelper.sendKey(passwordTextField, arg0);
    }

    public void checkInvalidEmailWarning(String arg0) {
        WebElement degisken3 = driver.findElement(By.cssSelector("input[name=\"email\"]"));
        String emptyEmailWarning = degisken3.findElement(By.xpath("../*[@class='error']")).getText();  // degiskenin bir üst elementini buluyoruz ve uyarı mesajını çekiyoruz
        Assert.assertEquals(arg0, emptyEmailWarning);  // uyarı mesajı dogru mu kontrol ediyoruz
    }

    public void checkUnmatchedCredentialsWarning(String arg0) {
        elementHelper.checkElementPresence(unmatchedCredentialsWarning);
    }


}
