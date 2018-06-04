package main.java.com.dbyl.tests.Login;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import main.java.com.dbyl.libarary.action.ViewHomePage;
import main.java.com.dbyl.libarary.listeners.TestNGListener;
import main.java.com.dbyl.libarary.utils.DriverFactory;
import main.java.com.dbyl.libarary.utils.RemoteBrowserBean;
import main.java.com.dbyl.libarary.utils.UITest;

@Listeners({ TestNGListener.class })
public class LoginTest extends UITest {
	WebDriver driver;
	@BeforeClass(alwaysRun=true)
	public void start()
	{
		driver=DriverFactory.getInstance().getChromeDriver();
	}

	@BeforeMethod(alwaysRun = true)
	public void init() {
		super.init(driver);
		ViewHomePage.setDriver(driver);
	}

	@Test(groups = "loginTest")
	public void loginByUerName() throws Exception {
		ViewHomePage.viewMyProfile();
		Assert.fail("Failed test");
	}

 
}
