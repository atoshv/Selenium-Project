package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class LoginStepDefinition {
	
	WebDriver driver = null;
	
	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() {
		
		System.out.println("Inside step - Browser is open");
		System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
		driver = new EdgeDriver();
		driver.navigate().to("https://qa-fake.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		/*        *//** Practice code - Should be removed later **//*
        WebDriverWait wait = new WebDriverWait(driver, 10);
        
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("a")));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("a")))).click();
        Alert alt = driver.switchTo().alert();
        alt.accept(); alt.dismiss();alt.sendKeys("ABC");
        String alertMsg = driver.switchTo().alert().getText();
        System.out.println(alertMsg);
        Alert altWait = wait.until(ExpectedConditions.alertIsPresent());
        altWait.accept();
        driver.switchTo().frame(1); driver.switchTo().frame("ifrmae");
        
        // Navigating to 2nd child window
        String parent =  driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();
        Iterator<String> it = s.iterator();
        
        while (it.hasNext())
        {
            String FirstChild = it.next();
            String SecondChild = it.next();
            if (!it.equals(parent))
            {
                driver.switchTo().window(SecondChild);
                driver.close();
            }
        }
        driver.switchTo().window(parent);
    
        // Handle HTTPS certifications
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        
        //screenshot
        File src  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C://error.png"));
        
        //data provider*/
		
		
	}
	
	@When("^title of login page is QA Fake$")
	public void title_of_login_page_is_QA_Fake() throws Throwable {
		
		String actualUrl = "https://qa-fake.herokuapp.com/";
		String expectedUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
		
	}
	
	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2) throws Throwable {
		
/*		driver.findElement(By.id("username")).sendKeys(arg1);
		driver.findElement(By.id("password")).sendKeys(arg2);*/
		
	}
	
	@Then("^user checked remember me$")
	public void user_checked_remember_me() throws Throwable {
		
/*
		driver.findElement(By.id("rememberme")).click();
*/
	}
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		
/*
		driver.findElement(By.xpath("//button[text() = 'Login']")).click();
*/
	
	}
	
	@Then("^user get the secret string on home screen$")
	public void user_get_the_secret_string_on_home_screen() throws Throwable {
/*		try {
			String str = driver.findElement(By.id("result")).getText().trim();
			File file = new File("D:/Atosh/Workspace/qa-login/result.txt");
			FileWriter fw = new FileWriter(file);
			fw.write(str);
			fw.close();
			
		} catch (IOException iox) {
			System.out.println("Secret didn't save to file");
			iox.printStackTrace();
		}*/
	}
	
	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
		
		driver.close();
		driver.quit();
	}
}
