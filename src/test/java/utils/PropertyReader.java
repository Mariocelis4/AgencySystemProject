/**
 * 
 */
package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author JoseAdrianSolisPerez
 *
 */
public class PropertyReader {
	
	Properties properties = new Properties();
	InputStream inputStream = null;
	
	public PropertyReader() {
		loadProperties();
	}
	
	private void loadProperties() {
		try {
			inputStream = new FileInputStream("src/config.properties");
			properties.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String readPrpoerty(String key) {
		return properties.getProperty(key);
	}

}
