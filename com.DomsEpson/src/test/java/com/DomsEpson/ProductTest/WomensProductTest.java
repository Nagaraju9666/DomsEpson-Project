package com.DomsEpson.ProductTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class WomensProductTest 
{
	
	@Test
	public void addProduct()
	{
		Reporter.log("Product Added Successfully-Womens",true);
	}
	@Test
	public void updateProduct()
	{
		Reporter.log("Product Updated Successfully-Womens",true);
	}
	@Test
	public void removeProduct()
	{
		Reporter.log("Product Removed Successfully-Womens",true);
	}
	
}
