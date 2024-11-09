package com.DomsEpson.PropertyfileLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.DomsEpson.GenericLibrary.FrameworkConstant;


/**
 * This Class provides the Reusable Method to Read the Data from Property File.
 * 
 * 
 * @author Nagaraju*/
public class ReadPropertyFile implements FrameworkConstant {

	public FileInputStream fis = null;
	public Properties property;
	public FileOutputStream fos = null;

	public String readData(String key) {
		// 1. Convert the physical file into java Readable file
		try {
			FileInputStream fis = new FileInputStream(propertypath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// 2. Create an object for properties class
		property = new Properties();

		// 3. load all the keys/data
		try {
			property.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 4. Fetch the data

		String data = property.getProperty(key);
		return data;

	}

	public void writeData(String key, String value) {
		// 1. Convert the physical file into java Readable file
		try {
			fis = new FileInputStream(propertypath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// 2. Create an object for properties class
		property = new Properties();

		// 3. load all the keys/data
		try {
			property.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 4. Write the data
		property.put(key, value);

		// 5. Store the data

		try {
			fos = new FileOutputStream(propertypath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// 6. Convert java readable into physical file
		try {
			property.store(fos, "Latest key Updated successful");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}