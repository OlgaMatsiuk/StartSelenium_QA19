import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Start_Test {

    WebDriver wd;


    @BeforeTest
    public void precondition(){
        wd=new ChromeDriver();
        wd.get("https://telranedu.web.app/home");


    }

    @Test
    public void testMethod(){
        wd.navigate().to("https://www.leumi.co.il/");
        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement element=wd.findElement(By.xpath("//nav[@class='menuCategory']/ul/li[1]//span"));
        //System.out.println(element.getText());
       String text =  element.getText();

        System.out.println(text.charAt(0));
        //var button = document.querySelector("button");
       // var buttonText = element.inn
       //console.log(buttonText);



//        wd.findElement(By.tagName("a"));
//        wd.findElement(By.cssSelector("a"));
//        wd.findElement(By.xpath("//a"));
//
//
//
//        wd.findElement(By.id("root"));
//        wd.findElement(By.cssSelector("#root"));
//        wd.findElement(By.xpath("//*[@id='root']"));
//
//        wd.findElement(By.linkText("HOME"));
//        wd.findElement(By.xpath("//*[text()='HOME']"));
//        wd.findElement(By.xpath("//*[.='HOME']"));
//
//
//
//
//
//        wd.findElement(By.partialLinkText("HOM"));
//
//
//
//        WebElement element = wd.findElement(By.id("root"));
//        List<WebElement> list = wd.findElements(By.tagName("div"));
//        System.out.println(list.size());
//
//        wd.findElement(By.cssSelector("[href='/home']"));
//        wd.findElement(By.xpath("//*[href='/home']"));
//
//
//        wd.findElement(By.cssSelector("[href^='/ho']"));
//        wd.findElement(By.xpath("//*[start-with(href,'/ho')]"));
//
//
//        wd.findElement(By.cssSelector("[href$='me']")); //no xPath
//
//
//        wd.findElement(By.cssSelector("[href*='om']"));
//        wd.findElement(By.xpath("//*[contains(@href, 'om'])"));


    }

    @AfterTest
    public void postcondition(){

        wd.quit();

    }



}
