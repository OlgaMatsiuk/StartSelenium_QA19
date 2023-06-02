import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Start_Test {

    WebDriver md;


    @BeforeTest
    public void precondition(){
        md=new ChromeDriver();
        md.get("https://telranedu.web.app/home");


    }

    @Test
    public void testMethod(){

    }

    @AfterTest
    public void postcondition(){

    }



}
