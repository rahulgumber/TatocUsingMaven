package Keyword;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qait.automation.maven.Base;

public class MyTest {
 WebDriver driver;
 @BeforeClass
 public void calllaunchBrowser() {
  Base b = new Base();
  driver = b.getDriver();
  launchBrowser obj=new launchBrowser(driver);
  obj.openbrowser();
 }
 @Test(priority = 1)
 public void callBasicCourse() {
	 BasicCourseClick obj = new BasicCourseClick(driver);
     obj.action();
  
 }
 @Test(priority = 2)
 public void callgreenbox() {
  greenbox obj1 = new greenbox(driver);
  obj1.action();
  
 }
 @Test(priority = 3)
 public void callBoxColorMatch() {
  BoxColorMatch obj2 = new BoxColorMatch(driver);
  obj2.boxcolor(); 
 }
 @Test(priority = 4)
 public void callDragandDrop() {
  DragandDrop obj3 = new DragandDrop(driver);
  obj3.draganddropfunction();  
 }
 @Test(priority = 5)
 public void callnewTabandSearch() {
  newTabandSearch obj4 = new newTabandSearch(driver);
  obj4.action("Rahul");
  
 }
 @Test(priority = 6)
 public void callTokenGeneration() {
  TokenGeneration obj5= new TokenGeneration(driver);
  obj5.token();
  
 }
 @AfterClass
 public void callclosebrowser() {
  CloseBrowser obj6 = new CloseBrowser(driver);
  obj6.close();
 }
  
 
}