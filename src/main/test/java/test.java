import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/driver/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https//seramikbayi.com");

    }
}
