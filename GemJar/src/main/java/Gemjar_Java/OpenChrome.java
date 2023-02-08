package Gemjar_Java;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {
    public static void main(String args[]) throws InterruptedException {
        System.out.println("Hie");
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\pa.puja\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://gembook.geminisolutions.com/#/dashboard");
        driver.manage().window().maximize();
       Thread.sleep(10000);

    }
}
