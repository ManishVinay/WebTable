package org.task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\eclipse\\Manish\\WebTable\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table");
	
	List<WebElement> tRows = driver.findElements(By.tagName("tr"));
	for (int i = 0; i <=1; i++) {
	WebElement row = tRows.get(i);
	String text = row.getText();
		System.out.println(text);
	}
	
	
	
	
	
	
	
	
	}

}
