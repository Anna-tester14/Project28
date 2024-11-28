import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class Register extends BaseTest{

   @Test
           public void CheckButtonIsDeleted() {
       browser.get("https://the-internet.herokuapp.com/add_remove_elements/");
       browser.findElement(By.xpath("//button[text()='Add Element']")).click();
       browser.findElement(By.xpath("//button[text()='Add Element']")).click();
       browser.findElement(By.xpath("//button[text()='Delete']")).click();
       assertEquals(browser.findElements(By.xpath("//button[text()='Delete']")).size(), 1);
   }
}
