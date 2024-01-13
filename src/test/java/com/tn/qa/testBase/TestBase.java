package com.tn.qa.testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.tn_part1_util.Util;

public class TestBase{
	
	public WebDriver driver;
public WebDriver initalizeBrowserAndOpenApplication() {
		
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Util.IMPLICIT_WAIT_TIME));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Util.PAGE_LOAD_TIME));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(Util.SCRIPT_TIME));
        driver.get("https://tutorialsninja.com/demo/");
        
        return driver;
	}
   
}
