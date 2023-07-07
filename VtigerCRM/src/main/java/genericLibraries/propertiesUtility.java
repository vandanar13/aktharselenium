package genericLibraries;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertiesUtility implements IAutoConstants {
	
	public String readDataFromProperties(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/commonData.properties");
		Properties property = new Properties();
		property.load(fis);
		return property.getProperty(key);
	}
}

		   

