import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FirstTest extends BaseTest {

    @Test
    public void NegativeTest() {
        browser.get("https://www.saucedemo.com/");
        browser.findElement(By.xpath("//input [@placeholder='Username']")).sendKeys("standard_user");
        browser.findElement(By.xpath("// input [@type='submit']")).click();
        String errorMessage = browser.findElement(By.xpath("// h3[@data-test='error']")).getText();
        assertEquals(errorMessage, "Epic sadface: Password is required");
    }
    @Test
    public void PositiveTest() {
        browser.get("https://www.saucedemo.com/");
        browser.findElement(By.xpath("//input [@placeholder='Username']")).sendKeys("standard_user");
        browser.findElement(By.xpath("// input [@placeholder='Password']")).sendKeys("secret_sauce");
        browser.findElement(By.xpath("// input [@type='submit']")).click();
        boolean isPresent = browser.findElement(By.xpath( "// span[text ()='Products']")).isDisplayed();
        assertTrue(isPresent, "Products are not visible");
    }
}






