package org.task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\eclipse\\Manish\\WebTable\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.toolsqa.com/automation-practice-table");
	List<WebElement> Trows = driver.findElements(By.tagName("tr"));
for (int i = 0; i < Trows.size(); i++) {
	WebElement row = Trows.get(i);
	
	List<WebElement> tcell = row.findElements(By.tagName("td"));
	for (int j = 0; j < tcell.size(); j++) {
		WebElement cell = tcell.get(j);
	
	String text = cell.getText();
	
	if (text.equals("China")) {
     WebElement rank = tcell.get(4);
     String is = rank.getText();
                      
	System.out.println(is);
	}
	
	}
	}




 {
	
}
}
}