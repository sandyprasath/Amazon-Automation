package com.amazon.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties pr;
	
public Configuration_Reader() throws Throwable {
	
	File file = new File("C:\\Users\\latha\\eclipse-workspace\\Amazon_Automation\\src\\test\\java\\com\\amazon\\helper\\Configuration.properties");
	FileInputStream fis = new FileInputStream(file);
	pr= new Properties();
pr.load(fis);

}
	
public String getUrl() {
String url = pr.getProperty("url");
return url;
}

public String getBrowser() {
String browser = pr.getProperty("browser");
return browser;
}
}

