package Resuable_methods;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utiles 
{
	public static String property_file_value() throws IOException
	{
		FileInputStream fr = new FileInputStream("D:\\Selenium_tanush\\API_FRAMEWORK_DEVELOPMENT\\globalproperty.properties");
		Properties a1 = new Properties();
		a1.load(fr);
		return a1.getProperty("baseUrl");
	}
}
