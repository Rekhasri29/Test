package com.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class LoginPage_Locator extends BaseClass {
	public static WebElement getEmailId() {
		return driver.findElement(By.xpath("//input[@type='email']"));
	}

	public static WebElement getPassword() {
		return driver.findElement(By.xpath("//input[@type='password']"));
	}

	public static WebElement getLogin() {
		return driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	}
}
