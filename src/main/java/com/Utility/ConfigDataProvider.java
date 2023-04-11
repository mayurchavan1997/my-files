package com.Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

	
	 Properties pro;
		public ConfigDataProvider() throws Exception {
			String path="/home/mahesh/eclipse-workspace/New_Project/ConfigData/Config.properties";
			
			FileInputStream fis=new FileInputStream(path);
			
			 pro=new Properties();
			pro.load(fis);
		}
			
public String  userid() {
	return pro.getProperty("url1");
	
}
public String password() {
	return pro.getProperty("url2");
}
public String website() {
	return pro.getProperty("website");
}
public String getuid() {
	return pro.getProperty("uid");
}
public String getpassword() {
	return pro.getProperty("password");
}


}
