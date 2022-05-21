package çalışmaodası;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class s4 extends TestBase {
    @Test
    public void test01() throws InterruptedException {
        //1. http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");

//2. Signin buttonuna tiklayin
        driver.findElement(By.xpath("//button[@id='signin_button']")).click();


//3. Login alanine  "username" yazdirin
        driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("username");

//4. Password alanine "password" yazdirin
        driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("password");

//5. Sign in buttonuna tiklayin (hata mesaji icin back tusuna tiklayin)
driver.findElement(By.xpath("//input[@type='submit']")).click();

driver.navigate().back();

//6. Online Banking menusunden Pay Bills sayfasina gidin
driver.findElement(By.xpath("//strong[.='Online Banking']")).click();
driver.findElement(By.xpath("(//span[@class='headers'])[4]")).click();

//7. amount kismina yatirmak istediginiz herhangi bir miktari yazin

driver.findElement(By.xpath("//input[@id='sp_amount']")).sendKeys("500");
//8. tarih kismina "2020-09-10" yazdirin
driver.findElement(By.xpath("//input[@id='sp_date']")).sendKeys("2020-09-10");

//9. Pay buttonuna tiklayin
        driver.findElement(By.id("pay_saved_payees")).click();

//10. "The payment was successfully submitted." mesajinin ciktigini kontrol edin
        driver.findElement(By.xpath("//span[.='The payment was successfully submitted.']")).isDisplayed();




    }


}
