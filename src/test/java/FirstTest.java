import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FirstTest extends BaseTest {

@Test
    public void zipCode4DigestCheck() {
        browser.get("https://www.sharelane.com/cgi-bin/register.py");
        browser.findElement(By.name("zip_code")).sendKeys("1234");
        browser.findElement(By.xpath("//input[@value='Continue']")).click();
        String errorMessage = browser.findElement(By.cssSelector("[class=error_message]")).getText();
        assertEquals(errorMessage, "Oops, error on page. ZIP code should have 5 digits");
}
    @Test
    public void zipCode5DigestCheck() {
        browser.get("https://www.sharelane.com/cgi-bin/register.py");
        browser.findElement(By.name("zip_code")).sendKeys("12345");
        browser.findElement(By.xpath("//input[@value='Continue']")).click();
        boolean isPresent = browser.findElement(By.xpath( "//input[@value='Register']")).isDisplayed();
        assertTrue(isPresent, "Register is not displayed");
    }
}

