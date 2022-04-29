package by.eDostavka;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {

    public WebDriver driver;

    @Before
    public void open(){
        System.setProperty("webdriver.chrome.driver", "/Users/golikovyurijalexandrovich/IdeaProjects/chromedriver");
        driver = new ChromeDriver();
    }

    @After
    public void close(){

        driver.quit();
    }
}