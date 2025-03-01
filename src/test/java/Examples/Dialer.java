package Examples;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Dialer {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		UiAutomator2Options options = new UiAutomator2Options()
	            .setPlatformName("Android")
	            .setDeviceName("emulator-5554")  // Get from 'adb devices'
	            .setAutomationName("UiAutomator2")
	            .setAppPackage("com.google.android.dialer")  // Default Calculator package
	            .setAppActivity("com.android.dialer.app.DialtactsActivity");  // Main Activity
	            //.noReset();  // Prevents reinstalling the app
	 
	    URL appiumServerURL = new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver driver = new AndroidDriver(appiumServerURL, options);
        Thread.sleep(5000);
        
        driver.findElement(By.id("com.google.android.dialer:id/floating_action_button")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.id("com.google.android.dialer:id/digits")).sendKeys("1234567890");
        Thread.sleep(5000);
        
        driver.findElement(By.id("com.google.android.dialer:id/dialpad_floating_action_button")).click();
        
        driver.quit();
        

	}

}
