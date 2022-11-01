import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automation_practic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:5500/indexx.html");
		String myTitle = driver.getTitle();
		System.out.println(myTitle);
		//String myOptiontag = driver.findElement(By.tagName("option")).getText();
		//System.out.println(myOptiontag);
		//String myOptiontag=driver.findElements(By.tagName("option")).get(2).getText();
		//System.out.println(myOptiontag);
		List <WebElement> myListOfOptions = driver.findElements(By.tagName("option"));
		for(int i =0;i<myListOfOptions.size();i++){
			System.out.println(myListOfOptions.get(i).getText());
			
		}
		

	}

}
