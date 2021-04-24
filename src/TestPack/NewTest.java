package TestPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class NewTest{
	 public String  baseURL= "E:\\QUALITY ASSUARANCE\\SLIIT\\Assignment\\SQA Assignment Batch 17.html";
	 String driverPath="E:\\QUALITY ASSUARANCE\\ECLIPSprojects\\testNG project\\ChromeDrivers\\V90.exe";
	 public WebDriver driver;



@Test(priority=1) // Load the Assignment in Chrome
public void loadAssignment() {
  System.setProperty("webdriver.chrome.driver", driverPath);
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(baseURL);
}

@Test(priority=2)
public void checkMandatoryFields() {
  
  //Identify the "Required" Web Elements in the assignment  
  WebElement txt_FirstName = driver.findElement(By.xpath("/html/body/div/form/div[4]/div[1]/input"));
  WebElement txt_MiddleName = driver.findElement(By.xpath("/html/body/div/form/div[4]/div[2]/input"));
  WebElement txt_LastName = driver.findElement(By.xpath("/html/body/div/form/div[4]/div[3]/input"));
  WebElement txtSSN = driver.findElement(By.xpath("/html/body/div/form/div[6]/div/input"));
  WebElement txtHeight = driver.findElement(By.xpath("//*[@id=\"formGroupExampleInput2\"]"));
  WebElement txtWeight = driver.findElement(By.xpath("//*[@id=\"formGroupExampleInput2\"]"));
  WebElement txtContactNumberAreaCode = driver.findElement(By.xpath("/html/body/div/form/div[12]/div[1]/input"));
  WebElement txtContactNumber = driver.findElement(By.xpath("/html/body/div/form/div[12]/div[2]/input"));
  WebElement txtAddressLine1 = driver.findElement(By.xpath("//*[@id=\"inputAddress2\"]"));
  WebElement txtAddressLine2 = driver.findElement(By.xpath("/html/body/div/form/div[15]/input"));
  WebElement txtAddressCity = driver.findElement(By.xpath("//*[@id=\"inputCity\"]"));
  WebElement txtEmergencyFirstName = driver.findElement(By.xpath("/html/body/div/form/div[19]/div[1]/input"));
  WebElement txtEmergencyLastName = driver.findElement(By.xpath("/html/body/div/form/div[19]/div[2]/input"));
  WebElement txtRelationship = driver.findElement(By.xpath("/html/body/div/form/div[20]/div/input"));
  WebElement txtContactNumberAreaCodeE = driver.findElement(By.xpath("/html/body/div/form/div[21]/div[1]/input"));
  WebElement txtContactNumberE = driver.findElement(By.xpath("//*[@id=\"formGroupExampleInput2\"]"));
  
  // retrieving html attribute value using getAttribute() method
  
  String ValueFirstName = txt_FirstName.getAttribute("Required");
  System.out.println("Mandatory / Required Attribute for First Name : "+ValueFirstName);
  
  String ValueMiddleName = txt_MiddleName.getAttribute("Required");
  System.out.println("Mandatory / Required Attribute for Middle Name : "+ValueMiddleName);
  
  String ValueLastName = txt_LastName.getAttribute("Required");
  System.out.println("Mandatory / Required Attribute for Last Name : "+ValueLastName);
  
  String ValueSSN = txtSSN.getAttribute("Required");
  System.out.println("Mandatory / Required Attribute for SSN : "+ValueSSN);
  
  String ValueHeight = txtHeight.getAttribute("Required");
  System.out.println("Mandatory / Required Attribute for Height : "+ValueHeight);
  
  String ValueWeight = txtWeight.getAttribute("Required");
  System.out.println("Mandatory / Required Attribute for Weight : "+ValueWeight);
  
  String ValueContactNumberAreaCode = txtContactNumberAreaCode.getAttribute("Required");
  System.out.println("Mandatory / Required Attribute for Contact Number : "+ValueContactNumberAreaCode);
  
  String ValueContactNumber = txtContactNumber.getAttribute("Required");
  System.out.println("Mandatory / Required Attribute for Contact Number : "+ValueContactNumber);
  
  String ValueAddressLine1 = txtAddressLine1.getAttribute("Required");
  System.out.println("Mandatory / Required Attribute for Address Line 1 : "+ValueAddressLine1);
  
  String ValueAddressLine2 = txtAddressLine2.getAttribute("Required");
  System.out.println("Mandatory / Required Attribute for Address Line 2 : "+ValueAddressLine2);
  
  String ValueAddressCity = txtAddressCity.getAttribute("Required");
  System.out.println("Mandatory / Required Attribute for Address City : "+ValueAddressCity);
  
  String ValueEFirstName = txtEmergencyFirstName.getAttribute("Required");
  System.out.println("Mandatory / Required Attribute for Emergency Contact First Name : "+ValueEFirstName);
  
  String ValueELastName = txtEmergencyLastName.getAttribute("Required");
  System.out.println("Mandatory / Required Attribute for Emergency Contact Last Name : "+ValueELastName);
  
  String ValueRelationship = txtRelationship.getAttribute("Required");
  System.out.println("Mandatory / Required Attribute for Replationship : "+ValueRelationship);
  
  String ValueContactNumberAreaCodeE = txtContactNumberAreaCodeE.getAttribute("Required");
  System.out.println("Mandatory / Required Attribute for Replationship : "+ValueContactNumberAreaCodeE);
  
  String ValueContactNumberE = txtContactNumberE.getAttribute("Required");
  System.out.println("Mandatory / Required Attribute for Replationship : "+ValueContactNumberE);
    
}

@Test(priority=3)
public void passValuestoFields() {
  
  //Pass Values to Text Boxes
  WebElement txt_FirstName = driver.findElement(By.xpath("/html/body/div/form/div[4]/div[1]/input"));
  txt_FirstName.sendKeys("Ruchith");
  WebElement txt_MiddleName = driver.findElement(By.xpath("/html/body/div/form/div[4]/div[2]/input"));
  txt_MiddleName.sendKeys("Gerard");
  WebElement txt_LastName = driver.findElement(By.xpath("/html/body/div/form/div[4]/div[3]/input"));
  txt_LastName.sendKeys("Fernando");
  WebElement txtSSN = driver.findElement(By.xpath("/html/body/div/form/div[6]/div/input"));
  txtSSN.sendKeys("791861586V");
  WebElement txtHeight = driver.findElement(By.xpath("//*[@id=\"formGroupExampleInput2\"]"));
  txtHeight.sendKeys("100");
  WebElement txtWeight = driver.findElement(By.xpath("/html/body/div/form/div[10]/div/input"));
  txtWeight.sendKeys("90");
  WebElement txtContactNumberAreaCode = driver.findElement(By.xpath("/html/body/div/form/div[12]/div[1]/input"));
  txtContactNumberAreaCode.sendKeys("+94");
  WebElement txtContactNumber = driver.findElement(By.xpath("/html/body/div/form/div[12]/div[2]/input"));
  txtContactNumber.sendKeys("765455585");
  WebElement txtAddressLine1 = driver.findElement(By.xpath("//*[@id=\"inputAddress2\"]"));
  txtAddressLine1.sendKeys("# 13");
  WebElement txtAddressLine2 = driver.findElement(By.xpath("/html/body/div/form/div[15]/input"));
  txtAddressLine2.sendKeys("Templers Road");
  WebElement txtAddressCity = driver.findElement(By.xpath("//*[@id=\"inputCity\"]"));
  txtAddressCity.sendKeys("Mount Lavinia");
  WebElement txtEmergencyFirstName = driver.findElement(By.xpath("/html/body/div/form/div[19]/div[1]/input"));
  txtEmergencyFirstName.sendKeys("Dineli");
  WebElement txtEmergencyLastName = driver.findElement(By.xpath("/html/body/div/form/div[19]/div[2]/input"));
  txtEmergencyLastName.sendKeys("Fernando");
  WebElement txtRelationship = driver.findElement(By.xpath("/html/body/div/form/div[20]/div/input"));
  txtRelationship.sendKeys("Spouse");
  WebElement txtContactNumberAreaCodeE = driver.findElement(By.xpath("/html/body/div/form/div[21]/div[1]/input"));
  txtContactNumberAreaCodeE.sendKeys("+94");
  WebElement txtContactNumberE = driver.findElement(By.xpath("/html/body/div/form/div[21]/div[2]/input"));
  txtContactNumberE.sendKeys("773021168");
  
  //Select Values from Drop Downs
  
  
}
@Test(priority=4) // i need to finish this code
public void TestingEmailWithCorrectFormat() throws InterruptedException {
  
  //Validate Email Address 
  WebElement txtEmailAddress = driver.findElement(By.xpath("/html/body/div/form/div[5]/div/input"));
  String ValueEmailAddress = txtEmailAddress.getAttribute("type");
  System.out.println("Property of the Email Field is : "+ValueEmailAddress);
  
  //get email and pass correct value and submit form to check email
  
  txtEmailAddress.sendKeys("c.ruchith.g.fernando@gmail.com");
//  txtEmailVisibleText = driver.findElement(By.xpath("/html/body/div/form/div[5]/div/input")).getText();
  Thread.sleep(1000);
  driver.findElement(By.xpath("/html/body/div/form/button")).click();
  System.out.println("The EMail Address Format is Correct" +(driver.findElement(By.xpath("/html/body/div/form/div[5]/div/input")).getText()));
  Thread.sleep(2000);
  
  
}
@Test(priority=5)
public void TestingEmailWithInCorrectFormat() throws InterruptedException {
  
  //Navigate to the previous page and clear text field 
  driver.navigate().back();
  //Get Email txtBox
  
  driver.findElement(By.xpath("/html/body/div/form/div[5]/div/input")).clear();
  Thread.sleep(2000);
  WebElement txtEmailAddress = driver.findElement(By.xpath("/html/body/div/form/div[5]/div/input"));
  txtEmailAddress.sendKeys("ruchithgmail.com");
  
  //get email and pass correct value and submit form to check email	
  System.out.println("The EMail Address Format is Incorrect" +txtEmailAddress);
  Thread.sleep(2000);
  driver.findElement(By.xpath("/html/body/div/form/button")).click();
  
  
}
@AfterTest
public void afterTest() {
  

  
}

}
