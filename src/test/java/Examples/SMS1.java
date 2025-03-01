package Examples;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class SMS1 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		UiAutomator2Options options = new UiAutomator2Options()
		           .setPlatformName("Android")
		           .setDeviceName("emulator-5554")  // Get from 'adb devices'
		           .setAutomationName("UiAutomator2")
		           .setAppPackage("com.google.android.apps.messaging")  // Default Msg package
		           .setAppActivity("com.google.android.apps.messaging.ui.ConversationListActivity");  // Main Activity
		           //.noReset();
		

		   URL myurl= new URL("http://127.0.0.1:4723/wd/hub");
		       AndroidDriver driver = new AndroidDriver(myurl, options);
		       Thread.sleep(5000);

	}

}
