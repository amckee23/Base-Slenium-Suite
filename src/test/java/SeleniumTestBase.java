import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class SeleniumTestBase {

    /**
     * Only create one instance of this server for all the tests.
     */
    private static Selenium seleniumInstance;

    private static String browserType;
    private static String seleniumUrl;
    private static int seleniumPort;
    private static String baseUrl;

    protected static synchronized Selenium getSelenium() {
        
    	if (seleniumInstance == null) {
            seleniumInstance = new DefaultSelenium(getSeleniumUrl(), getSeleniumPort(),"*"+getBrowserType(), getBaseUrl());
            seleniumInstance.start();
    	}
    	
        return seleniumInstance;
    }

    public static synchronized void shutdown() { 
    	seleniumInstance.close();
    	seleniumInstance = null;
    }
    
    public static String getBrowserType() {
        	browserType = System.getProperty("BrowserType");
        return browserType;
    }
    
    public static String getSeleniumUrl() {
        	seleniumUrl = System.getProperty("SeleniumUrl");
        return seleniumUrl;
    }
    
    public static int getSeleniumPort() {
        	seleniumPort = Integer.parseInt(System.getProperty("SeleniumPort"));
        return seleniumPort;
    }
    
    public static String getBaseUrl() {
        	baseUrl = System.getProperty("baseUrl");
        return baseUrl;
    }

}
