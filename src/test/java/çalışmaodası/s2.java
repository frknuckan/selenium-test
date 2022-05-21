package çalışmaodası;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class s2 extends TestBase {

    @Test
    public void test1 () throws InterruptedException {
        /*
         1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
2- Add Element butonuna basin
3- Delete butonu'nun gorunur oldugunu test edin
4- Delete tusuna basin
5- "Add/Remove Elements" yazisinin gorunur oldugunu test edin

         */

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();

        String actualyazı=driver.findElement(By.xpath("//button[@class='added-manually']")).getText();

String expectedyazı="Delete";
        Assert.assertTrue(actualyazı.equals(expectedyazı));
    }
}
