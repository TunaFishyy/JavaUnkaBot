package ConfigHandler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigHandler {

    public final String getToken() throws IOException {
        String configFilePath = "src/main/resources/config.properties";
        FileInputStream propsInput = new FileInputStream(configFilePath);
        Properties prop = new Properties();
        prop.load(propsInput);

        return prop.getProperty("TOKEN");
    }

    public final String getPrefix()  {
        String configFilePath = "src/main/resources/config.properties";
        FileInputStream propsInput = null;
        try {
            propsInput = new FileInputStream(configFilePath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Properties prop = new Properties();
        try {
            prop.load(propsInput);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return prop.getProperty("PREFIX");
    }

}