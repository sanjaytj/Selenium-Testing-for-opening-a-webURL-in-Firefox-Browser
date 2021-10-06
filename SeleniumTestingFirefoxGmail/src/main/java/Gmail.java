import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe"); //To execute Selenium script on Firefox (webdriver, path from content root)
        WebDriver driver = new FirefoxDriver(); //creating instance of webdriver
        driver.get("https://gmail.com");
        driver.manage().window(); //opens firefox window
        String title = driver.getTitle();
        if(title.equals("Gmail")){
            System.out.println("Title is correct");
        }
        else{
            System.out.println("Title is incorrect");
        }
        driver.quit();
    }
}
