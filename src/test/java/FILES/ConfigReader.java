package FILES;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static void main(String[] args) throws IOException {
        //String path="C:\\Users\\35269\\Desktop\\GIT\\Javadocs\\PersonalSelenium\\Files\\Files.properties";
        String path= System.getProperty("user.dir")+"\\Files\\Files.properties";
        FileInputStream fis= new FileInputStream(path);
        Properties properties= new Properties();
        properties.load(fis);
        System.out.println(properties.getProperty("userName"));
        System.out.println(properties.getProperty("password"));
        System.out.println(properties.getProperty("URL"));
        System.out.println(path);

    }

    public static String getProperty(String propertyKey)throws IOException{
        String path= System.getProperty("user.dir")+"\\Files\\Files.properties";
        FileInputStream fis= new FileInputStream(path);
        Properties properties= new Properties();
        properties.load(fis);
        String value=properties.getProperty(propertyKey);
        return value;

    }
    public static String getProperty(String path, String propertyKey)throws IOException{

        FileInputStream fis= new FileInputStream(path);
        Properties properties= new Properties();
        properties.load(fis);
        String value=properties.getProperty(propertyKey);
        return value;

    }
}
