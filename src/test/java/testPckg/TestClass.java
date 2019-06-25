package clms.testcase;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.Test;



	public class TestClass {
		public static WebDriver driver;
		@Test
		public void browserLaunch() throws Exception {
			
	      System.setProperty("webdriver.chrome.driver","C:\\Users\\789967\\eclipse-workspace\\TestAzure\\chromedriver.exe");
	      driver=new ChromeDriver();
	      
	      driver.get("https://www.google.com/");
	      def();
	      
		}
		
		public static void def() throws Exception {
			// TODO Auto-generated method stub
			
	String j="hi";
			
			Assert.assertEquals("bye", j);
			
	Thread.sleep(4000);

	}
	}
