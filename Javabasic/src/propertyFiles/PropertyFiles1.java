package propertyFiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertyFiles1 {
	static Properties prop =new Properties();
	static String projectPath=System.getProperty("user.dir");
	public static void main(String[] args) {
		getProperties();
		setProperties();
		getProperties();
	}
	public static void getProperties() {
		//code to read property files
		try{
			// Properties prop =new Properties();
			// String projectPath=System.getProperty("user.dir");
			InputStream input=new FileInputStream(projectPath+"/src/propertyFiles/propertyFiles.properties");
			prop.load(input);
			String browser =prop.getProperty("browser");
			System.out.println(browser);
		}catch(Exception exp){
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}
	public static void setProperties() {
		//code to set property files
		try {
			OutputStream output=new FileOutputStream(projectPath+"/src/propertyFiles/propertyFiles.properties");
		    prop.setProperty("browser", "Chrome");
		    prop.store(output, null);
		}catch(Exception exp){
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}
}
