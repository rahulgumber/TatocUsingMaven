package Keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qait.automation.maven.Base;

public class greenbox extends Base {
 public greenbox(WebDriver driver) {
  this.driver= driver;
 }
 By clickgreenbox =By.className("greenbox");
 public void action() {
  driver.findElement(clickgreenbox).click();
 }
 
}
