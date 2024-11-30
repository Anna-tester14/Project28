import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownTest extends BaseTest {
    @Test
    public void CheckSelectedOption() {
        browser.get("https://the-internet.herokuapp.com/dropdown");
        WebElement dropdown = browser.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);
      //select.selectByVisibleText("Option 1");
        // select.selectByValue("1");
      select.selectByIndex(1);
        assertEquals(select.getFirstSelectedOption(), "bla", "Text does not match");

    }
}
