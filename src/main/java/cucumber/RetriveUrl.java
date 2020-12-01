package cucumber;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class RetriveUrl {

    public static String retriveTheUrl(String urlName) {

        Properties prop = new Properties();
        FileInputStream ip;
        try {
            ip = new FileInputStream("./src/main/resources/testData.properties");
            try {
                prop.load(ip);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (prop.getProperty(urlName));
    }
}
