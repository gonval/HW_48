package core; import javax.json.Json;import javax.json.stream.JsonParser;import javax.json.stream.JsonParser.Event;import java.io.*;import java.math.*;import java.net.URL;import java.util.concurrent.TimeUnit;import java.util.logging.*;import org.openqa.selenium.*;import org.openqa.selenium.chrome.*; public class Main_new {	        public static void main(String[] args) throws InterruptedException, IOException {              String us_currency_symbol = "$";               @SuppressWarnings("unused")			String ip_Euro = "88.191.179.56";              @SuppressWarnings("unused")			String ip_Yuan = "61.135.248.220";              @SuppressWarnings("unused")			String ip_Pound = "92.40.254.196";              @SuppressWarnings("unused")			String ip_Hryvnia = "93.183.203.67";              String ip_Ruble = "213.87.141.36";              ////////////////////////////////////////////////////////////////////////////////               Logger logger = Logger.getLogger("");logger.setLevel(Level.OFF);             String url = "https://www.amazon.com/All-New-Amazon-Echo-Dot-Add-Alexa-To-Any-Room/dp/B01DFKC2SO";               WebDriver driver;              System.setProperty("webdriver.chrome.driver", "./src/main/resources/webdrivers/mac/chromedriver");              System.setProperty("webdriver.chrome.silentOutput", "true");              ChromeOptions option = new ChromeOptions();              option.addArguments("-start-fullscreen");              driver = new ChromeDriver(option);              driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);              driver.get(url);              // All-New Echo Dot (2nd Generation) - Black              String product_title = driver.findElement(By.id("productTitle")).getText();   double original_price = Double.parseDouble(driver.findElement(By.id("priceblock_ourprice")).getText().replace("$", "")); // 49.              driver.quit();             ////////////////////////////////////////////////////////////////////////////////               @SuppressWarnings("unused")			URL api_url = new URL("http://www.geoplugin.net/json.gp?ip=" + ip_Ruble);              ////////////////////////////////////////////////////////////////////////////////         double rate = 0;	double eur_price = new BigDecimal(original_price * rate).setScale(2, RoundingMode.HALF_UP).doubleValue();       String country_name = null;	String currency_symbol = null;	System.out.println("Item: " + product_title + "; "                                   + "US Price: " + us_currency_symbol + original_price + "; "                                   + "for country: " + country_name + "; "                                   + "Local Price: " + currency_symbol + eur_price);    }}