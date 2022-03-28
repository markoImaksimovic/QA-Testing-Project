package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyManager {

    private static String filePath = "src/main/resources/data.properties";
    private static String url;
    private static String validUserName;
    private static String validPassword;
    private static String invalidUserName;
    private static String invalidPassword;
    private static String firstName;
    private static String lastName;
    private static String postalCode;

        public static PropertyManager getInstance(){
            Properties properties = new Properties();
            PropertyManager instance = new PropertyManager();

            try {
                FileInputStream fi = new FileInputStream(filePath);
                properties.load(fi);
            } catch (Exception e) {
                e.printStackTrace();
            }
            url = properties.getProperty("url");
            firstName = properties.getProperty("firstName");
            lastName = properties.getProperty("lastName");
            postalCode = properties.getProperty("postalCode");
            validUserName = properties.getProperty("validUserName");
            validPassword = properties.getProperty("validPassword");
            invalidUserName = properties.getProperty("invalidUserName");
            invalidPassword = properties.getProperty("invalidPassword");

            return instance;
        }


    public String getUrl(){
        return url;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getPostalCode(){return postalCode;}
    public String getValidUserName(){return validUserName;}
    public String getValidPassword(){return validPassword;}
    public String getInvalidUserName(){return invalidUserName;}
    public String getInvalidPassword(){return invalidPassword;}

}
