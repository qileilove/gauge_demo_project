package PageObjects;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
import java.util.Calendar;
import java.util.regex.*;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;

/**
 * Created by gauge on 6/8/15.
 */
public class BasePage {
    static String URL = "http://localhost:4000";


    public  void ScreenShot(WebDriver dr, String dir,String name){
        File screenShot = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenShot, new File(dir+"_"+name+".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
