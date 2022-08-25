package com.Automation.Test;

import org.testng.annotations.BeforeMethod;

import com.Automation.GenericUtils.DriverUtils;

public class BaseTest {
	@BeforeMethod
	public void Precondition()
	{
		{
			DriverUtils.createDriver();
		}
		
	}

}