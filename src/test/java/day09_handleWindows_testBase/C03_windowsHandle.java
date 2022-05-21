package day09_handleWindows_testBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class C03_windowsHandle {

   WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @After
    public void tearDown(){
        driver.quit();
    }


    @Test
    public void test01() throws InterruptedException {
//● https://the-internet.herokuapp.com/windows adresine gidin.
        driver.get("https://the-internet.herokuapp.com/windows");

        //   ● Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
        WebElement sayfadakiyazıelementi=driver.findElement(By.xpath("//h3"));
        String expentedyazı="Opening a new window";
        String actualYazı=sayfadakiyazıelementi.getText();
        Assert.assertEquals(expentedyazı, actualYazı);
        //    ● Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
        String expectedTitle="The Internet";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
        String ilksayfanınHandDeğeri=driver.getWindowHandle();

        //    ● Click Here butonuna basın.
        driver.findElement(By.linkText("Click Here")).click();


       Set<String>WindowHandleSeti= driver.getWindowHandles();


        //      ● Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.
String expectedikinciTitle="New Window";
String actualikinciTitle=driver.getTitle();
Assert.assertEquals(expectedikinciTitle,actualikinciTitle);
        //       ● Sayfadaki textin “New Window” olduğunu doğrulayın.
        //      ● Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet” olduğunu doğrulayın.
    }


}
