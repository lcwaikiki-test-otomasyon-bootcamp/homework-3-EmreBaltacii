package util;

import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import java.util.Properties;

public class Hooks {

    WebDriver driver;
    Properties properties;
    @Before
    public void before() {
        properties = ConfigReader.initialize_Properties();
        driver = DriverFactory.initialize_Driver("Chrome");
    }

    @BeforeStep
    public void beforeStep() {
    }

    @AfterStep
    public void afterStep() {
    }

    @After
    public void after() {
        driver.quit();
    }
}
