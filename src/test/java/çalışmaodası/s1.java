package çalışmaodası;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class s1 extends TestBase {



    @Test
    public void test01 () throws InterruptedException {

 // 2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        //        a.google web sayfasına gidin. https://www. amazon.com/
driver.get("https://www.amazon.com/");

        // b. Search(ara) "city bike"
 WebElement elementarama= driver.findElement(By.id("twotabsearchtextbox"));
 elementarama.sendKeys("city bike"+ Keys.ENTER);

        //c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın

        WebElement aramasonucu=driver.findElement(By.xpath("//span[.='1-16 of 97 results for']"));
        System.out.println(aramasonucu.getText());

        // d. "Shopping" e tıklayın.
        //e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        driver.findElement(By.xpath("(//img[@class='s-image'])[1]")).click();


    }


}
