import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


    public class test {
        public static void main(String[] args) {
          kullanicigiris();





           /* WebElement usarname=driver.findElement(By.name("usarname"));
            usarname.click();
            usarname.sendKeys("ibrahim balta");*/

        }
        public static void kullanicigiris(){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Win10\\Documents\\selenium1\\driver\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://app.sapiyon.com/login");
            driver.manage().window().maximize();
            WebElement namekullaniciadi=driver.findElement(By.id("login-form_email"));
            namekullaniciadi.click();
            namekullaniciadi.sendKeys("seramikbayi@gmail.com");
            WebElement namesifre=driver.findElement(By.id("login-form_password"));
            namesifre.click();
            namesifre.sendKeys("12345");
            WebElement girisbutonu=driver.findElement(new By.ByCssSelector("button.ant-btn"));
            girisbutonu.click();
        }
    }