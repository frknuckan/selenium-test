package day10_actions;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.util.Set;

public class C03_MouseActions1 extends TestBase {


@Test
    public void test01() {

    //    1- Yeni bir class olusturalim: MouseActions1
//  2- https://the-internet.herokuapp.com/context_menu sitesine gidelim
    driver.get("https://the-internet.herokuapp.com/context_menu");
    //             3- Cizili alan uzerinde sag click yapalim
    Actions actions=new Actions(driver);
    WebElement cizgiliAlanElementi=driver.findElement(By.id("hot-spot"));
    actions.contextClick(cizgiliAlanElementi).perform();
//  4- Alert’te cikan yazinin “You selected a context menu” oldugunu
    //    test edelim.
    String expectedYazı="You selected a context menu";
    String actualYazı=driver.switchTo().alert().getText();
    Assert.assertEquals(expectedYazı,actualYazı);
    //         5- Tamam diyerek alert’i kapatalim
    driver.switchTo().alert().accept();
//  6- Elemental Selenium linkine tiklayalim
    String ilksayfahandDeğeri=driver.getWindowHandle();
driver.findElement(By.xpath("//*[text()='Elemental Selenium']")).click();
    Set<String> handSeti=driver.getWindowHandles();
    String ikincisayfahandDeğeri="";
    for (String each:handSeti
         ) {
        if (!each.equals(ilksayfahandDeğeri)){
            ikincisayfahandDeğeri=each;
        }
        
    }
//  7- Acilan sayfada h1 taginda “Elemental Selenium” yazdigini test edelim
driver.switchTo().window(ikincisayfahandDeğeri);
    WebElement yazıelementi=driver.findElement(By.tagName("h1"));
    String ecpectedikinciYazı="Elemental Selenium";
    String actualikinciyazı=yazıelementi.getText();
    Assert.assertEquals(ecpectedikinciYazı,actualikinciyazı);


}



}
