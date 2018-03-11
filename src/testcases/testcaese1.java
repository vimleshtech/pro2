package testcases;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class testcaese1 {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		//driver.findElement(By.linkText("Gmail")).click();
		
		File src = 	((TakesScreenshot)	driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\hp\\Desktop\\yaml\\out3.png"));
		
		/*
		//alert
		driver.findElement(By.id("del")).click();
		try
		{
			driver.switchTo().alert();
			
			String msg = driver.switchTo().alert().getText();
			
			//driver.switchTo().alert().accept(); //ok
			driver.switchTo().alert().dismiss(); //cancel
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
			
		///window handling 
		Set<String> wins =	driver.getWindowHandles();		
		int wc = wins.size();
		
		for(String w : wins)
		{
				driver.switchTo().window(w);
				String title = driver.getTitle();
				
				if(!title.contains("naukri"))
				{
					driver.close();
				}
				if(title.contains("accent"))
				{
					driver.findElement(By.id("")).click();
				}
				
		}
		
		
		//Events 
		Actions act = new Actions(driver);
		WebElement el = 	driver.findElement(By.id("aa"));
		
		act.moveToElement(el).click();
		
		
		//
		driver.findElement(By.xpath(".//*[@id='txtUserName']")).click();
		
		*/
		
		
		/*
		//explicit typecasting 
		int n;
		double d;
		n =1;
		d =22;
		
		//d =n; //implicit type casting
		n =(int) d;  //explicit type casting 
		*/
		
		
		
		
		
		
		

	}

}
