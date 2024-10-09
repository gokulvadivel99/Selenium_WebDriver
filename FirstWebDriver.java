package SeleniumDay1;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstWebDriver {

	public static void main(String[] args) {
		/*
		 Test case
		-------
		1) Launch browser (chrome)
		2) Open URL  https://demo.opencart.com/
		3) Validate title should be   "Your Store"
		4) close browser

		 */
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		
		String act_title=driver.getTitle();

		if(act_title.equals("Your Store"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		driver.close();
		
		

	}

}
