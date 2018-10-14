package com.technocredits.orangehrm.testscripts;

import org.testng.annotations.Test;

public class LoginTest extends CommonTest {

	@Test
	public void doLogin() {
		login("Admin", "admin123");
	}
}
