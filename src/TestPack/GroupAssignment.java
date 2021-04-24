package TestPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class GroupAssignment {
	//Converted to the testNG
	 public String  baseurl= "E:\\QUALITY ASSUARANCE\\SLIIT\\Assignment\\SQA Assignment Batch 17.html";
	 String driverPath="E:\\QUALITY ASSUARANCE\\ECLIPSprojects\\testNG project\\ChromeDrivers\\V90.exe";
	 public WebDriver driver;
	 
	  @Test(priority=0) //arrange the system properties for chrome browser
	  public void loadAssignment() {
		  System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(baseurl);
	  }
	  
	  @Test(priority=1) 
	  public void passValuesAndCheckMandatoryFields() throws InterruptedException {
		  
		  //Pass Values to Text Boxes
		  WebElement txt_FirstName = driver.findElement(By.xpath("/html/body/div/form/div[4]/div[1]/input"));
		  txt_FirstName.sendKeys("Mihiri");
		  WebElement txt_MiddleName = driver.findElement(By.xpath("/html/body/div/form/div[4]/div[2]/input"));
		  txt_MiddleName.sendKeys("Muthumali");
		  WebElement txt_LastName = driver.findElement(By.xpath("/html/body/div/form/div[4]/div[3]/input"));
		  txt_LastName.sendKeys("Jayasundara");
		  
//		  WebElement txt_EmailAddress = driver.findElement(By.xpath("/html/body/div/form/div[5]/div/input"));
//		  txt_EmailAddress.sendKeys("mihiri1988.jayasundara@gmail.com");
		  
//		  WebElement txt_SSN = driver.findElement(By.xpath("/html/body/div/form/div[6]/div/input"));
//		  txt_SSN.sendKeys("885621171V");
		  
		  Select SelectGender = new Select(driver.findElement(By.xpath("/html/body/div/form/div[7]/div/select")));
		  SelectGender.selectByVisibleText("Female");
		  Select SelectDOBMonth = new Select(driver.findElement(By.xpath("/html/body/div/form/div[8]/div[1]/select")));
		  SelectDOBMonth.selectByVisibleText("March");
		  Select SelectDOBDate = new Select(driver.findElement(By.xpath("/html/body/div/form/div[8]/div[2]/select")));
		  SelectDOBDate.selectByVisibleText("2");
		  Select SelectDOBYear = new Select(driver.findElement(By.xpath("/html/body/div/form/div[8]/div[3]/select")));
		  SelectDOBYear.selectByVisibleText("1988");
		  WebElement txt_Height = driver.findElement(By.xpath("/html/body/div/form/div[9]/div/input"));
		  txt_Height.sendKeys("120");
		  WebElement txt_Weight = driver.findElement(By.xpath("/html/body/div/form/div[10]/div/input"));
		  txt_Weight.sendKeys("64");
		  WebElement txt_ContactNumberAreaCode = driver.findElement(By.xpath("/html/body/div/form/div[12]/div[1]/input"));
		  txt_ContactNumberAreaCode.sendKeys("+94");
		  WebElement txt_ContactNumber = driver.findElement(By.xpath("/html/body/div/form/div[12]/div[2]/input"));
		  txt_ContactNumber.sendKeys("778584564");
		  Select SelectMarital = new Select(driver.findElement(By.xpath("/html/body/div/form/div[13]/div/select")));
		  SelectMarital.selectByVisibleText("Maried");
		  WebElement txt_AddressLine1 = driver.findElement(By.xpath("//*[@id=\"inputAddress2\"]"));
		  txt_AddressLine1.sendKeys("#153");
		  WebElement txt_AddressLine2 = driver.findElement(By.xpath("/html/body/div/form/div[15]/input"));
		  txt_AddressLine2.sendKeys("Palanwatta");
		  WebElement txt_AddressCity = driver.findElement(By.xpath("//*[@id=\"inputCity\"]"));
		  txt_AddressCity.sendKeys("Kottawa");
		  
//		  WebElement txt_EmergencyFirstName = driver.findElement(By.xpath("/html/body/div/form/div[19]/div[1]/input"));
//		  txt_EmergencyFirstName.sendKeys("Hasantha");
//		  WebElement txt_EmergencyLastName = driver.findElement(By.xpath("/html/body/div/form/div[19]/div[2]/input"));
//		  txt_EmergencyLastName.sendKeys("Uhanovita");
//		  WebElement txt_Relationship = driver.findElement(By.xpath("/html/body/div/form/div[20]/div/input"));
//		  txt_Relationship.sendKeys("Spouse");
//		  WebElement txt_ContactNumberAreaCodeE = driver.findElement(By.xpath("/html/body/div/form/div[21]/div[1]/input"));
//		  txt_ContactNumberAreaCodeE.sendKeys("+94");
//		  WebElement txt_ContactNumberE = driver.findElement(By.xpath("/html/body/div/form/div[21]/div[2]/input"));
//		  txt_ContactNumberE.sendKeys("778584565");
		  Thread.sleep(2000);
		  //Click Submit
		 
		  //driver.findElement(By.xpath("/html/body/div/form/button")).click();
		  
		  //TestCase 1 - Check for Mandatory Field
		  String FirstName = txt_FirstName.getAttribute("value");
		  String LastName = txt_LastName.getAttribute("value");
		
		  if(!FirstName.isEmpty() && !LastName.isEmpty()){
			  WebElement txt_EmergencyFirstName = driver.findElement(By.xpath("/html/body/div/form/div[19]/div[1]/input"));
			  txt_EmergencyFirstName.sendKeys("Kavindhu");
			  WebElement txt_EmergencyLastName = driver.findElement(By.xpath("/html/body/div/form/div[19]/div[2]/input"));
			  txt_EmergencyLastName.sendKeys("Uhanovitage");
			  WebElement txt_Relationship = driver.findElement(By.xpath("/html/body/div/form/div[20]/div/input"));
			  txt_Relationship.sendKeys("Spouse");
			  WebElement txt_ContactNumberAreaCodeE = driver.findElement(By.xpath("/html/body/div/form/div[21]/div[1]/input"));
			  txt_ContactNumberAreaCodeE.sendKeys("+94");
			  WebElement txt_ContactNumberE = driver.findElement(By.xpath("/html/body/div/form/div[21]/div[2]/input"));
			  txt_ContactNumberE.sendKeys("778584564");
			  System.out.println("First Name And Last Name Are Not Empty, User Has Entered A Value" );
		  }
		  else {
			  System.out.println("First Name Or Last Name Can Not Be Empty, Please Check The Values");
		  }

	  }
	  
	  @Test(priority=3) 
	  public void emailValidation() {
		  
		  //Enter the Email Address to the text box
		  WebElement txt_EmailAddress = driver.findElement(By.xpath("/html/body/div/form/div[5]/div/input"));
		  txt_EmailAddress.sendKeys("mihiri.jayasundara@gmail.com");
		  
		  String Email = txt_EmailAddress.getAttribute("value");
		  if(Email.isEmpty()) {
			  System.out.println("Email Field Can Not be Empty");
		  }
		  else {

		  }
	  }
	  
	  @Test(priority=4)
	  public void checkCurrentMedications() {
		  
			WebElement radioBut_Current_Medication = driver.findElement(By.xpath("/html/body/div/form/div[23]/div[2]/div/label/input"));
			radioBut_Current_Medication.click();
			
			if(radioBut_Current_Medication.isSelected()){
				
				WebElement txt_List = driver.findElement(By.xpath("/html/body/div/form/div[25]/textarea"));
				txt_List.sendKeys("Losatan , Atanlol");
				
				String MedicineList = txt_List.getAttribute("value");
				System.out.println("Taking Medicines are " + MedicineList);
			} else {
				WebElement radioButton_MedicationNo = driver.findElement(By.xpath("/html/body/div/form/div[23]/div[3]/div/label/input"));
				radioButton_MedicationNo.click();
				System.out.println("No current medication");
			}
	 
	  }
	  
	  @Test(priority = 5)
	  public void validateSSN() {
		  WebElement txt_SSN = driver.findElement(By.xpath("/html/body/div/form/div[6]/div/input"));
		  txt_SSN.sendKeys("885621171V");
		  String ssnCode = txt_SSN.getAttribute("value");
		  ssnCode.length();
		  System.out.println("SSN is Not Empty, User Has Entered A Value - " +ssnCode);
		  
		  if(ssnCode.length() <= 9) {
			  System.out.println("Incorrect SSN code Length");
		  }else {
			  System.out.println("SSN code is " + ssnCode);
			  System.out.println("SSN code LENGTH	 is " + ssnCode.length());
		  }
	  
	  }
	  
	  @Test(priority = 6)
	  public void validateContactNoText() {
		  WebElement txt_ContactNumber = driver.findElement(By.xpath("/html/body/div/form/div[12]/div[2]/input"));

		  String poneNum = txt_ContactNumber.getAttribute("value");
		  if(poneNum.length() == 10) {
		  System.out.println("Phone number length is correct");
		  }else {
		  System.out.println("Incorret Phone number length");
		  }

	  }

	  
	  @Test(priority = 7)
	  	public void validateMainHeading(){
	        	String expectedHeading = "New Patient Enrollment Form";
	        	
	        	//Storing the text of the heading
	        	String heading = driver.findElement(By.xpath("/html/body/div/form/div[1]/div")).getText();
	        	if(expectedHeading.equalsIgnoreCase(heading))
	              	System.out.println("The expected main heading is same as actual heading --- "+heading);
	        	else
	              	System.out.println("The expected main heading doesn't match the actual heading --- "+heading);
	  	}
	  
	  @Test(priority = 8)
	  	public void validateSubHeading(){
	        	String expectedHeading = "Please fill the information below";
	        	
	        	//Storing the text of the sub heading
	        	String heading = driver.findElement(By.xpath("/html/body/div/form/div[2]/div")).getText();
	        	if(expectedHeading.equalsIgnoreCase(heading)) {
	              	System.out.println("The expected sub heading is same as actual heading - "+heading);
	        	}else {
	              	System.out.println("The expected sub heading doesn't match the actual heading - "+heading);
	        	}
	  	}
	  
	  @Test(priority = 9)
	  public void headingAvailability() {
		  if(driver.findElement(By.className("t-heading"))!=null    ) {
			  System.out.println("Main heading available");
		  }else {
			  System.out.println("Main heading not available");
		  }
	  }
	  
	  @Test(priority = 10)
	  public void subHeadingAvailability() {
		  if(driver.findElement(By.className("t-sub-heading"))!=null    ) {
			  System.out.println("Sub heading available");
		  }else {
			  System.out.println("Sub heading available");
		  }
	  }
	  
	 

	  
	  @AfterTest
	  public void afterTest() throws InterruptedException {
		  WebElement submitBut = driver.findElement(By.xpath("/html/body/div/form/button"));
//  	      Thread.sleep(5000);
//		  submitBut.click();
		  
//	  	  driver.close();

	  }

	}
