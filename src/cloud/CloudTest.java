package cloud;

import java.net.MalformedURLException;
import java.net.URI;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.net.Urls;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import bsh.Capabilities;

public class CloudTest {
	 
	  public static final String USERNAME = "venkatesh.reddy679";
	  public static final String ACCESS_KEY = "83f603f7-ad89-4c1d-a3b8-27a0593059e1";
	  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	  


	public static void main(String args[]) throws MalformedURLException {
		
		
		  
		DesiredCapabilities caps= DesiredCapabilities.chrome();
	    caps.setCapability("platform", "Windows 8");
	    caps.setCapability("version", "80.0");
	  

		  
		   
		    WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
        driver.get("https://www.youtube.com/");
        System.out.println(driver.getTitle());
		
	}

}
