import com.thoughtworks.gauge.AfterSuite;
import com.thoughtworks.gauge.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    public static WebDriver driver;

    @BeforeSuite
    public void initializeDriver(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();

    }

    @AfterSuite
    public void closeDriver(){
        driver.close();
    }
}
