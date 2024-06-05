package com.pageexe;

import com.base.BaseClass;
import com.pageobject.LoginPage_Locator;

public class LoginPageExe extends LoginPage_Locator {

	public static void emailId(String email) {
		BaseClass.inputData(LoginPage_Locator.getEmailId(), email);
	}

	public static void password(String pass) {
		BaseClass.inputData(LoginPage_Locator.getPassword(), pass);
	}

	public static void login() {
		BaseClass.clickButton(LoginPage_Locator.getLogin());
	}

}
