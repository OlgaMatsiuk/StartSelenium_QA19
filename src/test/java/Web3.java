import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Web3 {

    WebDriver wd;

    public void searchWebDriverTest() {
        wd= new ChromeDriver();
        wd.findElements(By.name("q")).sendKeys("Webdriver"+ Keys.ENTER);
        wd.navigate().to("https://www.saucedemo.com/");
        wd.findElement(By.cssSelector("#user-name")).sendKeys("standart-user");
        wd.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
        wd.findElement(By.name("login-button")).click();
        System.out.println(wd.findElement());


    }
}
