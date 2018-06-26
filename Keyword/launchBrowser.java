package Keyword;


import org.openqa.selenium.WebDriver;

import com.qait.automation.maven.Base;

public class launchBrowser extends Base {
 
 public launchBrowser(WebDriver driver) {
 this.driver =driver;
 }
 public void openbrowser() {
  driver.get("http://10.0.1.86/tatoc");
     
 } 
}