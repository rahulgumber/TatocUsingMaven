package Keyword;

import org.openqa.selenium.WebDriver;

import com.qait.automation.maven.Base;

public class CloseBrowser extends Base{
 public CloseBrowser(WebDriver driver) {
  this.driver = driver;
 }
 public void close() {
  driver.close();
 }
}
