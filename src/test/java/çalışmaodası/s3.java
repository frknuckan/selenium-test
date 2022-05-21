package çalışmaodası;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class s3 extends TestBase {


    @Test
    public void test1 () throws InterruptedException {
        //1 ) Bir class oluşturun : Locators_css
        //2 ) Main method oluşturun ve aşağıdaki görevi tamamlayın.

        //  a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        ;
        driver.get("http://a.testaddressbook.com/sign_in");
        //  b. Locate email textbox
        driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("testtechproed@gmail.com");


        //  c. Locate password textbox ve
driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("Test1234!");

        //  d. Locate signin button
driver.findElement(By.name("commit")).click();

        //  e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        //
        //      i. Username : testtechproed@gmail.com

        //      ii. Password : Test1234!

    }
}
