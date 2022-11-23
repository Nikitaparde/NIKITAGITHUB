package nikita01;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Yogesh\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver = new  ChromeDriver();
		
		driver.get("");
		Thread.sleep(5000);
		
		
		List<WebElement>Links = driver.findElements(By.xpath(""));
		System.out.println(Links.size);
		for(WebElement element:Links) {
			element.click();
		}
		driver.close();
	}

}
