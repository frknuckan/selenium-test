package day11_faker_file;

import org.apache.hc.core5.util.Asserts;
import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C04_FileDownload extends TestBase {
    @Test
    public void Test01 () throws InterruptedException {
        //1. Tests packagenin altina bir class oluşturalim

        //2. https://the-internet.herokuapp.com/download adresine gidelim.
        driver.get("https://the-internet.herokuapp.com/download");

        //3. dummy.txt dosyasını indirelim

       WebElement dummylinki= driver.findElement(By.xpath("//a[text()='dummy.txt']"));
       dummylinki.click();
       Thread.sleep(5000);

        //4. dosyanın başarıyla indirilip indirilmediğini test edelim
        String farklikısım=System.getProperty("user.home");
        String ortakkısım="\\Download\\dummy.txt";
        String aranandosyayolu=farklikısım+ortakkısım;
        Assert.assertTrue((Files.exists(Paths.get(aranandosyayolu))));


    }

}
