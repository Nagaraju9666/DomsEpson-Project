package com.DomsEpson.ProductTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MensProductTest 
{

	@Test
	public void addProduct()
	{
		Reporter.log("Product Added Successfully-Mens",true);
	}
	@Test
	public void updateProduct()
	{
		Reporter.log("Product Updated Successfully-Mens",true);
	}
	@Test
	public void removeProduct()
	{
		Reporter.log("Product Removed Successfully-Mens",true);
	}
	
}
