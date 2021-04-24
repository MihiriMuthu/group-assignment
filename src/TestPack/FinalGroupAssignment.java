package TestPack;

import java.awt.List;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class FinalGroupAssignment {
	 public String  baseURL= "E:\\QUALITY ASSUARANCE\\SLIIT\\Assignment\\SQA Assignment Batch 17.html";
	 String driverPath="E:\\QUALITY ASSUARANCE\\ECLIPSprojects\\testNG project\\ChromeDrivers\\V90.exe";
	 public WebDriver driver;

  @Test(priority=0) 
  public void loadAssignment() {
		//arrange the system properties for chrome browser
	  System.setProperty("webdriver.chrome.driver", "D:\\SQA Lectures\\SQABatch17AssignmentGroup\\New_Chrome\\V90.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get(baseURL);
	  
  }
  
  @Test(priority=1) // Pass values for the fields and Checking of Mandatory Fields
  public void passValuesAndCheckMandatoryFields() throws InterruptedException {
	  
	  //Pass Values to Text Boxes
	  WebElement txt_FirstName = driver.findElement(By.xpath("/html/body/div/form/div[4]/div[1]/input"));
	  txt_FirstName.sendKeys("Ruchith");
	  WebElement txt_MiddleName = driver.findElement(By.xpath("/html/body/div/form/div[4]/div[2]/input"));
	  txt_MiddleName.sendKeys("Gerard");
	  WebElement txt_LastName = driver.findElement(By.xpath("/html/body/div/form/div[4]/div[3]/input"));
	  txt_LastName.sendKeys("");
	  WebElement txt_EmailAddress = driver.findElement(By.xpath("/html/body/div/form/div[5]/div/input"));
	  txt_EmailAddress.sendKeys("c.ruchith.g.fernando@gmail.com");
	  WebElement txt_SSN = driver.findElement(By.xpath("/html/body/div/form/div[6]/div/input"));
	  txt_SSN.sendKeys("");
	  Select SelectGender = new Select(driver.findElement(By.xpath("/html/body/div/form/div[7]/div/select")));
	  SelectGender.selectByVisibleText("Male");
	  Select SelectDOBMonth = new Select(driver.findElement(By.xpath("/html/body/div/form/div[8]/div[1]/select")));
	  SelectDOBMonth.selectByVisibleText("July");
	  Select SelectDOBDate = new Select(driver.findElement(By.xpath("/html/body/div/form/div[8]/div[2]/select")));
	  SelectDOBDate.selectByVisibleText("4");
	  Select SelectDOBYear = new Select(driver.findElement(By.xpath("/html/body/div/form/div[8]/div[3]/select")));
	  SelectDOBYear.selectByVisibleText("1979");
	  WebElement txt_Height = driver.findElement(By.xpath("/html/body/div/form/div[9]/div/input"));
	  txt_Height.sendKeys("75");
	  WebElement txt_Weight = driver.findElement(By.xpath("/html/body/div/form/div[10]/div/input"));
	  txt_Weight.sendKeys("199");
	  WebElement txt_ContactNumberAreaCode = driver.findElement(By.xpath("/html/body/div/form/div[12]/div[1]/input"));
	  txt_ContactNumberAreaCode.sendKeys("+94");
	  WebElement txt_ContactNumber = driver.findElement(By.xpath("/html/body/div/form/div[12]/div[2]/input"));
	  txt_ContactNumber.sendKeys("765455585");
	  Select SelectMarital = new Select(driver.findElement(By.xpath("/html/body/div/form/div[13]/div/select")));
	  SelectMarital.selectByVisibleText("Maried");
	  WebElement txt_AddressLine1 = driver.findElement(By.xpath("//*[@id=\"inputAddress2\"]"));
	  txt_AddressLine1.sendKeys("# 13");
	  WebElement txt_AddressLine2 = driver.findElement(By.xpath("/html/body/div/form/div[15]/input"));
	  txt_AddressLine2.sendKeys("Templers Road");
	  WebElement txt_AddressCity = driver.findElement(By.xpath("//*[@id=\"inputCity\"]"));
	  txt_AddressCity.sendKeys("Mount Lavinia");
	  WebElement txt_EmergencyFirstName = driver.findElement(By.xpath("/html/body/div/form/div[19]/div[1]/input"));
	  txt_EmergencyFirstName.sendKeys("Dineli");
	  WebElement txt_EmergencyLastName = driver.findElement(By.xpath("/html/body/div/form/div[19]/div[2]/input"));
	  txt_EmergencyLastName.sendKeys("Fernando");
	  WebElement txt_Relationship = driver.findElement(By.xpath("/html/body/div/form/div[20]/div/input"));
	  txt_Relationship.sendKeys("Spouse");
	  WebElement txt_ContactNumberAreaCodeE = driver.findElement(By.xpath("/html/body/div/form/div[21]/div[1]/input"));
	  txt_ContactNumberAreaCodeE.sendKeys("+94");
	  WebElement txt_ContactNumberE = driver.findElement(By.xpath("/html/body/div/form/div[21]/div[2]/input"));
	  txt_ContactNumberE.sendKeys("765455585");
	  Thread.sleep(100);
	  
	  //Click Submit
	  driver.findElement(By.xpath("/html/body/div/form/button")).click();
	  
	  //Checking of Mandatory Fields
	  
	  // check First Name field
	  String FirstName = txt_FirstName.getAttribute("value");
	  if(!FirstName.isEmpty()){
		  System.out.println("PASSED : First Name is Not Empty, User Has Entered A Value - " +FirstName);
		  
	  }else {
		  System.out.println("FAILED : User Has Not Entered A Value To The First Name Feild. "
			  		+ "Therefore It Is Empty And Gives An Error As It Is A Mandatory Feild");
	  }
	  
	  // check Last Name field
	  String LastName = txt_LastName.getAttribute("value");
	  if(!LastName.isEmpty()){
	  System.out.println("PASSED : Last Name is Not Empty, User Has Entered A Value - " +LastName);
	  }else {
		  System.out.println("FAILED : User Has Not Entered A Value To The Last Name Feild. "
		  		+ "Therefore It Is Empty And Gives An Error As It Is A Mandatory Feild");
	  }
	  
	  // check SSN field
	  String SSN = txt_SSN.getAttribute("value");
	  if(!SSN.isEmpty()){
		  System.out.println("PASSED SSN is Not Empty, User Has Entered A Value - " +SSN);
	  }else {
		  System.out.println("FAILED : User Has Not Entered A Value To The SSN Feild. "
					+ "Therefore It Is Empty And Gives An Error As It Is A Mandatory Feild");
	  }
	  
	  // check Height field
	  String Height = txt_Height.getAttribute("value");
	  if(!Height.isEmpty()) {
		  System.out.println("PASSED : Height is Not Empty, User Has Entered A Value - " +Height);
	  }else {
		  System.out.println("FAILED : User Has Not Entered A Value To The Height Feild. "
			  		+ "Therefore It Is Empty And Gives An Error As It Is A Mandatory Feild");
	  }
	  
	  // check Weight field
	  String Weight = txt_Weight.getAttribute("value");
	  if(!Weight.isEmpty()) {
		  System.out.println("PASSED : Weight is Not Empty, User Has Entered A Value - "+Weight);
	  }else {
		  System.out.println("FAILED : User Has Not Entered A Value To The Weight Feild. "
			  		+ "Therefore It Is Empty And Gives An Error As It Is A Mandatory Feild");
	  }
	  
	  // check Area field
	  String ContactNumber_Area = txt_ContactNumberAreaCode.getAttribute("value");
	  if(!ContactNumber_Area.isEmpty()) {
		  System.out.println("PASSED : Area Code is Not Empty, User Has Entered A Value - " +ContactNumber_Area);
	  }else {
		  System.out.println("FAILED : User Has Not Entered A Value To The Area Code Feild. "
			  		+ "Therefore It Is Empty And Gives An Error As It Is A Mandatory Feild");
	  }
	  
	  // check Contact Number field
	  String ContactNumber = txt_ContactNumber.getAttribute("value");
	  if(!ContactNumber.isEmpty()) {
		  System.out.println("PASSED : Contact Number is Not Empty, User Has Entered A Value - " +ContactNumber);
	  }else {
		  System.out.println("FAILED : User Has Not Entered A Value To The Contact Number Feild. "
			  		+ "Therefore It Is Empty And Gives An Error As It Is A Mandatory Feild");
	  }
	  
	  // check Address Line 1 field 
	  String AddressLine_1 = txt_AddressLine1.getAttribute("value");
	  if(!AddressLine_1.isEmpty()) {
		  System.out.println("PASSED : Address Line 1 is Not Empty, User Has Entered A Value - " +AddressLine_1);
	  }else {
		  System.out.println("FAILED : User Has Not Entered A Value To The Address Line 1 Feild. "
			  		+ "Therefore It Is Empty And Gives An Error As It Is A Mandatory Feild");
	  }
	  
	  // check Address Line 2 field 
	  String AddressLine_2 = txt_AddressLine2.getAttribute("value");
	  if(!AddressLine_2.isEmpty()) {
		  System.out.println("PASSED : Address Line 2 is Not Empty, User Has Entered A Value - " +AddressLine_2);
	  }else {
		  System.out.println("FAILED : User Has Not Entered A Value To The Address Line 2 Feild. "
			  		+ "Therefore It Is Empty And Gives An Error As It Is A Mandatory Feild");
	  }
	  
	  // check City field 
	  String City = txt_AddressCity.getAttribute("value");
	  if(!City.isEmpty()) {
		  System.out.println("PASSED : City is Not Empty, User Has Entered A Value - " +City);
	  }else {
		  System.out.println("FAILED : User Has Not Entered A Value To The City Feild. "
			  		+ "Therefore It Is Empty And Gives An Error As It Is A Mandatory Feild");
	  }
	  
	  // check Emergency First Name field 
	  String EFirstName = txt_EmergencyFirstName.getAttribute("value");
	  if(!EFirstName.isEmpty()) {
		  System.out.println("PASSED : First Name Of Emergency Contact is Not Empty, User Has Entered A Value - " +EFirstName);
	  }else {
		  System.out.println("FAILED : User Has Not Entered A Value To The First Name Of Emergency "
			  		+ "Contact Feild. Therefore It Is Empty And Gives An Error As It Is A Mandatory Feild");
	  }
	  
	  // check Emergency Last Name field 
	  String ELastName = txt_EmergencyLastName.getAttribute("value");
	  if(!ELastName.isEmpty()) {
		  System.out.println("PASSED : Last Name Of Emergency Contact is Not Empty, User Has Entered A Value - " +ELastName);
	  }else {
		  System.out.println("FAILED : User Has Not Entered A Value To The "
			  		+ "Last Name Of Emergency Contact Feild. "
			  		+ "Therefore It Is Empty And Gives An Error As It Is A Mandatory Feild");
	  }
	  
	  // check Emergency contact area field 
	  String EContactNumber_Area = txt_ContactNumberAreaCodeE.getAttribute("value");
	  if(!EContactNumber_Area.isEmpty()) {
		  System.out.println("PASSED : Emergency Contact Number's Area Code is Not Empty, User Has Entered A Value - " +EContactNumber_Area);
	  }else {
		  System.out.println("FAILED : User Has Not Entered A Value To The "
			  		+ "Emergency Contact Number's Area Code Feild. "
			  		+ "Therefore It Is Empty And Gives An Error As It Is A Mandatory Feild");
	  }
	  
	  // check Emergency contact number field 
	  String EContactNumber = txt_ContactNumberE.getAttribute("value");
	  if(!EContactNumber.isEmpty()) {
		  System.out.println("PASSED : Emergency Contact Number is Not Empty User Has Entered A Value - " +EContactNumber);
	  }else {
		  System.out.println("FAILED : User Has Not Entered A Value To The Emergency Contact Number "
			  		+ "Feild. Therefore It Is Empty And Gives An Error As It Is A Mandatory Feild");
	  }
	  
	  driver.navigate().refresh(); 
  }
  
 // Checking the Emergency details
  @Test(priority=2) 
  public void checkEmergencyDetails() {
	  
	  //Pass Values to Text Fields
	  WebElement txt_FirstName = driver.findElement(By.xpath("/html/body/div/form/div[4]/div[1]/input"));
	  txt_FirstName.sendKeys("Ruchith");
	  WebElement txt_LastName = driver.findElement(By.xpath("/html/body/div/form/div[4]/div[3]/input"));
	  txt_LastName.sendKeys("Fernando");
	  
	  String FirstName = txt_FirstName.getAttribute("value");
	  String LastName = txt_LastName.getAttribute("value");
	
	  // checking the field emptiness
	  if(!FirstName.isEmpty() && !LastName.isEmpty()){
		  WebElement txt_EmergencyFirstName = driver.findElement(By.xpath("/html/body/div/form/div[19]/div[1]/input"));
		  txt_EmergencyFirstName.sendKeys("Dineli");
		  WebElement txt_EmergencyLastName = driver.findElement(By.xpath("/html/body/div/form/div[19]/div[2]/input"));
		  txt_EmergencyLastName.sendKeys("Fernando");
		  WebElement txt_Relationship = driver.findElement(By.xpath("/html/body/div/form/div[20]/div/input"));
		  txt_Relationship.sendKeys("Spouse");
		  WebElement txt_ContactNumberAreaCodeE = driver.findElement(By.xpath("/html/body/div/form/div[21]/div[1]/input"));
		  txt_ContactNumberAreaCodeE.sendKeys("+94");
		  WebElement txt_ContactNumberE = driver.findElement(By.xpath("/html/body/div/form/div[21]/div[2]/input"));
		  txt_ContactNumberE.sendKeys("773021168");
		  System.out.println("First Name And Last Name Are Not Empty, User Has Entered A Value" );
	  }
	  else {
		  System.out.println("First Name Or Last Name Can Not Be Empty, Please Check The Values");
	  }
	  driver.navigate().refresh(); 
  }
  
  // Email validation
  @Test(priority=3) 
  public void emailValidation() {
	  
	  //Enter the Email Address to the text box
	  WebElement txt_EmailAddress = driver.findElement(By.xpath("/html/body/div/form/div[5]/div/input"));
	  txt_EmailAddress.sendKeys("c.ruchith.g.fernandogmail.com");
	  
	  String Email = txt_EmailAddress.getAttribute("value");
	  if(Email.isEmpty()) {
		  System.out.println("Email Field Can Not be Empty");
	  }
	  else {
		  //validating email with strong regular expression(regex)  
	     
	      String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
	      boolean result = Email.matches(regex);
	      if(result) {
	          System.out.println("PASSED : Given email-id is valid");
	       } else {
	          System.out.println("FAILED : Given email-id is not valid");
	       }
	  }
	  driver.navigate().refresh(); 
  }
  
// checking the existing medication, only if selected
  @Test(priority=4)
  public void checkMedication() {
	  
		WebElement radioButton_Medication = driver.findElement(By.xpath("/html/body/div/form/div[23]/div[2]/div/label/input"));
		radioButton_Medication.click();
		
		
		// if currently medication yes selected need to mention the drugs
		if(radioButton_Medication.isSelected()) // YES select
		{
			WebElement txt_List = driver.findElement(By.xpath("/html/body/div/form/div[25]/textarea"));
			String medicineText = "Medicine 1,\nMedicine 2,\nMedicine 3";
			medicineText = medicineText.replace("\n", Keys.chord(Keys.SHIFT, Keys.ENTER));
			txt_List.sendKeys(medicineText);
			String ListofMedicine = txt_List.getAttribute("value");
			System.out.println("Medicine that is been taken are " +ListofMedicine);
		}
		else // if not taking any drugs
		{
			WebElement radioButton_MedicationNo = driver.findElement(By.xpath("/html/body/div/form/div[23]/div[3]/div/label/input"));
			radioButton_MedicationNo.click();
			System.out.println("No Medicine is Taken");
		}
 
  }
  
 //Checking the main title 
  @Test(priority=5)
  public void checkIfMainTileisPresent() {
	  
	  //Get the Text to Check 
	  String TextToCheck = "New Patient Enrollment Form";
	  List<WebElement> ActualMainTitle= driver.findElements(By.xpath("/html/body/div/form/div[1]/div"));
	  
	  if ( ActualMainTitle.size() > 0){
	         System.out.println("PASSED : Text: " + TextToCheck + " is present. ");
	      } 
	  else 
	  {
	         System.out.println("FAILED : Text: " + TextToCheck + " is not present. ");
	      }
	  
  }
  // validate the main title as if it is expected
  @Test(priority = 6)
	public void validateMainTitle(){
      	String expectedHeading = "New Patient Enrollment Form";
      	
      	//Storing the text of the heading
      	String MainTitle = driver.findElement(By.xpath("/html/body/div/form/div[1]/div")).getText();
      	if(expectedHeading.equalsIgnoreCase(MainTitle)) {
      		System.out.println("PASSED : The expected main Title is same as actual Title --- "+MainTitle);
      	}
      	else
      	{
      		System.out.println("FAILED : The expected main Title doesn't match the actual Title --- "+MainTitle);
      		}
	}
  
  // validate the sub title as if it is expected
  @Test(priority = 7)
	public void validateSubTitle(){
      	
	  	//Get Expected Titles 
	  	String expectedHeading = "Please fill the information below";
	  	
      	//Storing the text of the heading
      	String SubTitle = driver.findElement(By.xpath("/html/body/div/form/div[2]/div")).getText();
      	if(expectedHeading.equalsIgnoreCase(SubTitle)) {
      		System.out.println("PASSED : The expected main Sub Title is same as actual Sub Title --- "+SubTitle);
      	}
            	
      	else 
      	{
      		System.out.println("FAILED : The expected main Sub Title doesn't match the actual Sub Title --- "+SubTitle);
      		}
	}
  
  //Checking the sub title 
  @Test(priority=8)
  public void checkIfSubTileisPresent() {
	  
	  //Get the Subtitle Text to Check 
	  String TextToCheck = "Please fill the information below";
	  List<WebElement> ActualSubTitle= driver.findElements(By.xpath("/html/body/div/form/div[2]/div"));
	  
	  if ( ActualSubTitle.size() > 0){
	         System.out.println("PASSED : Text: " + TextToCheck + " is present. ");
	      } 
	  else 
	  {
	         System.out.println("FAILED : Text: " + TextToCheck + " is not present. ");
	      }
	  }
  
  //Checking the Submit button availability 
  @Test(priority=9)
  public void checkIfSubmitButtonPresent() {
	  
	  // verify that the “Submit button” is displayed and enabled
      boolean submitButton = driver.findElement(By.xpath("/html/body/div/form/button")).isDisplayed();
	  
      //if present
      if (submitButton==true)
      {
    	  System.out.println("PASSED : Submit Button Present");
    	  }
      // if not present
      else
      {
    	  System.out.println("FAILED : Submit Button Not Present");
    	  }
	  
  }
  
  // checking the field title as needed or not
  @Test(priority=10)
  public void checkAllFeildTitlesPresent() {
	  
	  //Get ExpectedLabel Titles 
	  String ExpectedLabelName = "NameTest";
	  String ExpectedLabelEmail = "Email";
	  String ExpectedLabelGender = "Gender";
	  String ExpectedLabelSSN = "SSN";
	  String ExpectedLabelDOB = "Date of Birth";
	  String ExpectedLabelHeight = "Height (Inches)";
	  String ExpectedLabelWeight = "Weight (Pounds)";
	  String ExpectedLabelContact_Number = "Contact Number";
	  String ExpectedLabelMarital_Status = "Marital Status Testing";
	  String ExpectedLabelAddress = "Address";
	  String ExpectedLabelCity = "City";
	  String ExpectedLabelState = "State/Province";
	  String ExpectedLabelZip = "Postal/Zip Code";
	  String ExpectedLabelEmergency = "In Case of Emergency";
	  String ExpectedLabelEmergency_Contact = "Emergency Contact";
	  String ExpectedLabelRelationship = "Relationship";
	  String ExpectedLabelContact_Number_Emergency = "Contact Number";
	  String ExpectedLabelContact_Taking_Medicine = "Taking any medications, currently";
	  String ExpectedLabelMedicine_Description = "If yes please list it here";

	  //Storing the text of the heading
	  String GetActualLabelName = driver.findElement(By.xpath("/html/body/div/form/div[3]/label")).getText();
	  String GetActualLabelEmail = driver.findElement(By.xpath("/html/body/div/form/div[5]/label")).getText();
	  String GetActualLabelSSN = driver.findElement(By.xpath("/html/body/div/form/div[6]/label")).getText();
	  String GetActualLabelGender = driver.findElement(By.xpath("/html/body/div/form/div[7]/label")).getText();
	  String GetActualLabelDOB = driver.findElement(By.xpath("/html/body/div/form/div[8]/label")).getText();
	  String GetActualLabelHeight = driver.findElement(By.xpath("/html/body/div/form/div[9]/label")).getText();
	  String GetActualLabelWeight = driver.findElement(By.xpath("/html/body/div/form/div[10]/label")).getText();
	  String GetActualLabelContact_Number = driver.findElement(By.xpath("/html/body/div/form/div[12]/label")).getText();
	  String GetActualLabelMarital_Status = driver.findElement(By.xpath("/html/body/div/form/div[13]/label")).getText();
	  String GetActualLabelAddress = driver.findElement(By.xpath("/html/body/div/form/div[14]/label")).getText();
	  String GetActualLabelCity = driver.findElement(By.xpath("/html/body/div/form/div[16]/div[1]/label")).getText();
	  String GetActualLabelState = driver.findElement(By.xpath("/html/body/div/form/div[16]/div[2]/label")).getText();
	  String GetActualLabelZip = driver.findElement(By.xpath("/html/body/div/form/div[16]/div[3]/label")).getText();
	  String GetActualLabelEmergency = driver.findElement(By.xpath("/html/body/div/form/div[18]/label")).getText();
	  String GetActualLabelEmergency_Contact = driver.findElement(By.xpath("/html/body/div/form/div[19]/label")).getText();
	  String GetActualLabelRelationship = driver.findElement(By.xpath("/html/body/div/form/div[20]/label")).getText();
	  String GetActualLabelContact_Number_Emergency = driver.findElement(By.xpath("/html/body/div/form/div[21]/label")).getText();
	  String GetActualLabelContact_Taking_Medicine = driver.findElement(By.xpath("/html/body/div/form/div[23]/div[1]/label")).getText();
	  String GetActualLabelMedicine_Description = driver.findElement(By.xpath("/html/body/div/form/div[24]/div/label")).getText();
	  
	//if Name Label is Correct
	  if(ExpectedLabelName.equalsIgnoreCase(GetActualLabelName)) {
		  System.out.println("PASSED : The Expected Label for Name is "
		  		+ "Same as the Actual Label for Name --- "+GetActualLabelName);
	  }else {
		  System.out.println("FAILED : The Expected Label for Name is Not the Same "
		  		+ "as the Actual Label for Name --- Entered Label is "+ ExpectedLabelName +" Actual Label should be " +GetActualLabelName);
	  }
	//if Email Label is Correct
	  if(ExpectedLabelEmail.equalsIgnoreCase(GetActualLabelEmail)) {
		  System.out.println("PASSED : The Expected Label for Email is "
		  		+ "Same as the Actual Label for Email --- "+GetActualLabelEmail);
	  }else {
		  System.out.println("FAILED : The Expected Label for Email is Not the Same "
		  		+ "as the Actual Label for Email --- Entered Label is "+ ExpectedLabelEmail +" Actual Label should be " +GetActualLabelEmail);
	  }
	//if SSN Label is Correct
	  if(ExpectedLabelSSN.equalsIgnoreCase(GetActualLabelSSN)) {
		  System.out.println("PASSED : The Expected Label for SSN is "
		  		+ "Same as the Actual Label for SSN --- "+GetActualLabelSSN);
	  }else {
		  System.out.println("FAILED : The Expected Label for SSN is Not the Same "
		  		+ "as the Actual Label for SSN --- Entered Label is "+ ExpectedLabelSSN +" Actual Label should be " +GetActualLabelSSN);
	  }
	//if Gender Label is Correct
	  if(ExpectedLabelGender.equalsIgnoreCase(GetActualLabelGender)) {
		  System.out.println("PASSED : The Expected Label for Gender is "
		  		+ "Same as the Actual Label for Gender --- "+GetActualLabelGender);
	  }else {
		  System.out.println("FAILED : The Expected Label for Gender is Not the Same "
		  		+ "as the Actual Label for Gender --- Entered Label is "+ ExpectedLabelGender +" Actual Label should be " +GetActualLabelGender);
	  }
	//if Date of Birth Label is Correct
	  if(ExpectedLabelDOB.equalsIgnoreCase(GetActualLabelDOB)) {
		  System.out.println("PASSED : The Expected Label for Date of Birth is "
		  		+ "Same as the Actual Label for Date of Birth --- "+GetActualLabelDOB);
	  }else {
		  System.out.println("FAILED : The Expected Label for Date of Birth is Not the Same "
		  		+ "as the Actual Label for Date of Birth --- Entered Label is "+ ExpectedLabelDOB +" Actual Label should be " +GetActualLabelDOB);
	  }
	//if Height Label is Correct
	  if(ExpectedLabelHeight.equalsIgnoreCase(GetActualLabelHeight)) {
		  System.out.println("PASSED : The Expected Label for Height is "
		  		+ "Same as the Actual Label for Height --- "+GetActualLabelHeight);
	  }else {
		  System.out.println("FAILED : The Expected Label for Height is Not the Same "
		  		+ "as the Actual Label for Height --- Entered Label is "+ ExpectedLabelHeight +" Actual Label should be " +GetActualLabelHeight);
	  }
	//if Weight Label is Correct
	  if(ExpectedLabelWeight.equalsIgnoreCase(GetActualLabelWeight)) {
		  System.out.println("PASSED : The Expected Label for Weight is "
		  		+ "Same as the Actual Label for Weight --- "+GetActualLabelWeight);
	  }else {
		  System.out.println("FAILED : The Expected Label for Weight is Not the Same "
		  		+ "as the Actual Label for Weight --- Entered Label is "+ ExpectedLabelWeight +" Actual Label should be " +GetActualLabelWeight);
	  }
	//if Contact Number Label is Correct
	  if(ExpectedLabelContact_Number.equalsIgnoreCase(GetActualLabelContact_Number)) {
		  System.out.println("PASSED : The Expected Label for Contact Number is "
		  		+ "Same as the Actual Label for Contact Number --- "+GetActualLabelContact_Number);
	  }else {
		  System.out.println("FAILED : The Expected Label for Contact Number is Not the Same "
		  		+ "as the Actual Label for Contact Number --- Entered Label is "+ ExpectedLabelContact_Number +" Actual Label should be " +GetActualLabelContact_Number);
	  }
	//if Marital Status Label is Correct
	  if(ExpectedLabelMarital_Status.equalsIgnoreCase(GetActualLabelMarital_Status)) {
		  System.out.println("PASSED : The Expected Label for Marital Status is "
		  		+ "Same as the Actual Label for Marital Status --- "+GetActualLabelMarital_Status);
	  }else {
		  System.out.println("FAILED : The Expected Label for Marital Status is Not the Same "
		  		+ "as the Actual Label for Marital Status --- Entered Label is "+ ExpectedLabelMarital_Status +" Actual Label should be " +GetActualLabelMarital_Status);
	  }
	//if Address Label is Correct
	  if(ExpectedLabelAddress.equalsIgnoreCase(GetActualLabelAddress)) {
		  System.out.println("PASSED : The Expected Label for Address is "
		  		+ "Same as the Actual Label for Address --- "+GetActualLabelAddress);
	  }else {
		  System.out.println("FAILED : The Expected Label for Address is Not the Same "
		  		+ "as the Actual Label for Address --- Entered Label is "+ ExpectedLabelAddress +" Actual Label should be " +GetActualLabelAddress);
	  }
	//if City Label is Correct
	  if(ExpectedLabelCity.equalsIgnoreCase(GetActualLabelCity)) {
		  System.out.println("PASSED : The Expected Label for City is "
		  		+ "Same as the Actual Label for City --- "+GetActualLabelCity);
	  }else {
		  System.out.println("FAILED : The Expected Label for City is Not the Same "
		  		+ "as the Actual Label for City --- Entered Label is "+ ExpectedLabelCity +" Actual Label should be " +GetActualLabelCity);
	  }
	//if State/Province Label is Correct
	  if(ExpectedLabelState.equalsIgnoreCase(GetActualLabelState)) {
		  System.out.println("PASSED : The Expected Label for State/Province is "
		  		+ "Same as the Actual Label for State/Province --- "+GetActualLabelState);
	  }else {
		  System.out.println("FAILED : The Expected Label for State/Province is Not the Same "
		  		+ "as the Actual Label for State/Province --- Entered Label is "+ ExpectedLabelState +" Actual Label should be " +GetActualLabelState);
	  }
	//if Postal/Zip Code Label is Correct
	  if(ExpectedLabelZip.equalsIgnoreCase(GetActualLabelZip)) {
		  System.out.println("PASSED : The Expected Label for Postal/Zip Code is "
		  		+ "Same as the Actual Label for Postal/Zip Code --- "+GetActualLabelZip);
	  }else {
		  System.out.println("FAILED : The Expected Label for Postal/Zip Code is Not the Same "
		  		+ "as the Actual Label for Postal/Zip Code --- Entered Label is "+ ExpectedLabelZip +" Actual Label should be " +GetActualLabelZip);
	  }
	//if In Case of Emergency Label is Correct
	  if(ExpectedLabelEmergency.equalsIgnoreCase(GetActualLabelEmergency)) {
		  System.out.println("PASSED : The Expected Label for In Case of Emergency is "
		  		+ "Same as the Actual Label for In Case of Emergency --- "+GetActualLabelEmergency);
	  }else {
		  System.out.println("FAILED : The Expected Label for In Case of Emergencye is Not the Same "
		  		+ "as the Actual Label for In Case of Emergency --- Entered Label is "+ ExpectedLabelEmergency +" Actual Label should be " +GetActualLabelEmergency);
	  }
	//if Emergency Contact Label is Correct
	  if(ExpectedLabelEmergency_Contact.equalsIgnoreCase(GetActualLabelEmergency_Contact)) {
		  System.out.println("PASSED : The Expected Label for Emergency Contact is "
		  		+ "Same as the Actual Label for Emergency Contact --- "+GetActualLabelEmergency_Contact);
	  }else {
		  System.out.println("FAILED : The Expected Label for Emergency Contact is Not the Same "
		  		+ "as the Actual Label for Emergency Contact --- Entered Label is "+ ExpectedLabelEmergency_Contact +" Actual "
		  				+ "Label should be " +GetActualLabelEmergency_Contact);
	  }
	//if Relationship Label is Correct
	  if(ExpectedLabelRelationship.equalsIgnoreCase(GetActualLabelRelationship)) {
		  System.out.println("PASSED : The Expected Label for Relationship is "
		  		+ "Same as the Actual Label for Relationship --- "+GetActualLabelRelationship);
	  }else {
		  System.out.println("FAILED : The Expected Label for Relationship is Not the Same "
		  		+ "as the Actual Label for Relationship --- Entered Label is "+ ExpectedLabelRelationship +" Actual "
		  				+ "Label should be " +GetActualLabelRelationship);
	  }
	//if Contact Number Label is Correct
	  if(ExpectedLabelContact_Number_Emergency.equalsIgnoreCase(GetActualLabelContact_Number_Emergency)) {
		  System.out.println("PASSED : The Expected Label for Contact Number is "
		  		+ "Same as the Actual Label for Contact Number --- "+GetActualLabelContact_Number_Emergency);
	  }else {
		  System.out.println("FAILED : The Expected Label for Relationship is Not the Same "
		  		+ "as the Actual Label for Relationship --- Entered Label is "+ ExpectedLabelContact_Number_Emergency +" Actual "
		  				+ "Label should be " +GetActualLabelContact_Number_Emergency);
	  }
	//if Taking any medications, currently Label is Correct
	  if(ExpectedLabelContact_Taking_Medicine.equalsIgnoreCase(GetActualLabelContact_Taking_Medicine)) {
		  System.out.println("PASSED : The Expected Label for Taking any medications, currently is "
		  		+ "Same as the Actual Label for Taking any medications, currently --- "+GetActualLabelContact_Taking_Medicine);
	  }else {
		  System.out.println("FAILED : The Expected Label for Taking any medications, currently is Not the Same "
		  		+ "as the Actual Label for Taking any medications, currently --- Entered Label is "+ ExpectedLabelContact_Taking_Medicine +" Actual "
		  				+ "Label should be " +GetActualLabelContact_Taking_Medicine);
	  }
	//if If yes please list it here Label is Correct
	  if(ExpectedLabelMedicine_Description.equalsIgnoreCase(GetActualLabelMedicine_Description)) {
		  System.out.println("PASSED : The Expected Label for If yes please list it here is "
		  		+ "Same as the Actual Label for If yes please list it here --- "+GetActualLabelMedicine_Description);
	  }else {
		  System.out.println("FAILED : The Expected Label for If yes please list it here is Not the Same "
		  		+ "as the Actual Label for If yes please list it here --- Entered Label is "+ ExpectedLabelMedicine_Description +" Actual "
		  				+ "Label should be " +GetActualLabelMedicine_Description);
	  }
  }

  //validate main title 
  @Test(priority =11)
 	public void validateSpellingMainTitle(){
       	String expectedHeading = "New Patient Enrollment Former";
       	
       	//Storing the text of the heading
       	String MainTitleSpelling = driver.findElement(By.xpath("/html/body/div/form/div[1]/div")).getText();
       	if(expectedHeading.equalsIgnoreCase(MainTitleSpelling)) {
       		System.out.println("PASSED : The spelling of the expected main Title is correct --- "+MainTitleSpelling);
       	}
       	else
       	{
       		System.out.println("FAILED : The spelling of expected main Title doesn't match with the spelling of the actual Title --- "+MainTitleSpelling);
       		}
 	}
  
  @Test(priority = 12)
	public void validateSpellingSubTitle(){
      	
	  	//Get Expected Titles 
	  	String expectedHeading = "Please fill the information below";
	  	
      	//Storing the text of the heading
      	String SubTitleSpelling = driver.findElement(By.xpath("/html/body/div/form/div[2]/div")).getText();
      	if(expectedHeading.equalsIgnoreCase(SubTitleSpelling)) {
      		System.out.println("PASSED : The expected spelling of the main Sub Title is correct --- "+SubTitleSpelling);
      	}  	
      	else 
      	  {
      	System.out.println("FAILED : The spelling of the expected main Sub Title doesn't match the spelling of the actual Sub Title --- "+SubTitleSpelling);
      	}
      	driver.navigate().refresh();
	}
  
  //Check if using the tab key can move from one field to the next
  @Test(priority = 13)
	public void navigateUsingTab() throws InterruptedException{
	  
	  WebElement txt_FirstName = driver.findElement(By.xpath("/html/body/div/form/div[4]/div[1]/input"));
	  txt_FirstName.sendKeys(Keys.TAB);
	  Thread.sleep(100);
	  WebElement txt_MiddleName = driver.findElement(By.xpath("/html/body/div/form/div[4]/div[2]/input"));
	  txt_MiddleName.sendKeys(Keys.TAB);
	  Thread.sleep(100);
	  WebElement txt_LastName = driver.findElement(By.xpath("/html/body/div/form/div[4]/div[3]/input"));
	  txt_LastName.sendKeys(Keys.TAB);
	  Thread.sleep(100);
	  WebElement txt_EmailAddress = driver.findElement(By.xpath("/html/body/div/form/div[5]/div/input"));
	  txt_EmailAddress.sendKeys(Keys.TAB);
	  Thread.sleep(100);
	  WebElement txt_SSN = driver.findElement(By.xpath("/html/body/div/form/div[6]/div/input"));
	  txt_SSN.sendKeys(Keys.TAB);
	  Thread.sleep(100);
	  WebElement cmbSelectGender = driver.findElement(By.xpath("/html/body/div/form/div[7]/div/select"));
	  cmbSelectGender.sendKeys(Keys.TAB);
	  Thread.sleep(100);
	  WebElement cmb_SelectDOBMonth = driver.findElement(By.xpath("/html/body/div/form/div[7]/div/select"));
	  cmb_SelectDOBMonth.sendKeys(Keys.TAB);
	  Thread.sleep(100);
	  WebElement cmb_SelectDOBDate = driver.findElement(By.xpath("/html/body/div/form/div[8]/div[2]/select"));
	  cmb_SelectDOBDate.sendKeys(Keys.TAB);
	  Thread.sleep(100);
	  WebElement cmbSelectDOBYear = driver.findElement(By.xpath("/html/body/div/form/div[8]/div[3]/select"));
	  cmbSelectDOBYear.sendKeys(Keys.TAB);
	  Thread.sleep(100);
	  WebElement txt_Height = driver.findElement(By.xpath("/html/body/div/form/div[9]/div/input"));
	  txt_Height.sendKeys(Keys.TAB);
	  Thread.sleep(100);
	  WebElement txt_Weight = driver.findElement(By.xpath("/html/body/div/form/div[10]/div/input"));
	  txt_Weight.sendKeys(Keys.TAB);
	  Thread.sleep(100);
	  WebElement txt_ContactNumberAreaCode = driver.findElement(By.xpath("/html/body/div/form/div[12]/div[1]/input"));
	  txt_ContactNumberAreaCode.sendKeys(Keys.TAB);
	  Thread.sleep(100);
	  WebElement txt_ContactNumber = driver.findElement(By.xpath("/html/body/div/form/div[12]/div[2]/input"));
	  txt_ContactNumber.sendKeys(Keys.TAB);
	  Thread.sleep(100);
	  WebElement cmb_SelectMarital = driver.findElement(By.xpath("/html/body/div/form/div[13]/div/select"));
	  cmb_SelectMarital.sendKeys(Keys.TAB);
	  Thread.sleep(100);
	  WebElement txt_AddressLine1 = driver.findElement(By.xpath("//*[@id=\"inputAddress2\"]"));
	  txt_AddressLine1.sendKeys(Keys.TAB);
	  Thread.sleep(100);
	  WebElement txt_AddressLine2 = driver.findElement(By.xpath("/html/body/div/form/div[15]/input"));
	  txt_AddressLine2.sendKeys(Keys.TAB);
	  Thread.sleep(100);
	  WebElement txt_AddressCity = driver.findElement(By.xpath("//*[@id=\"inputCity\"]"));
	  txt_AddressCity.sendKeys(Keys.TAB);
	  Thread.sleep(100);
	  WebElement cmb_State = driver.findElement(By.xpath("/html/body/div/form/div[16]/div[2]/select"));
	  cmb_State.sendKeys(Keys.TAB);
	  Thread.sleep(100);
	  WebElement txt_Zip = driver.findElement(By.xpath("/html/body/div/form/div[16]/div[3]/input"));
	  txt_Zip.sendKeys(Keys.TAB);
	  Thread.sleep(100);
	  WebElement txt_EmergencyFirstName = driver.findElement(By.xpath("/html/body/div/form/div[19]/div[1]/input"));
	  txt_EmergencyFirstName.sendKeys(Keys.TAB);
	  Thread.sleep(100);
	  WebElement txt_EmergencyLastName = driver.findElement(By.xpath("/html/body/div/form/div[19]/div[2]/input"));
	  txt_EmergencyLastName.sendKeys(Keys.TAB);
	  Thread.sleep(100);
	  WebElement txt_Relationship = driver.findElement(By.xpath("/html/body/div/form/div[20]/div/input"));
	  txt_Relationship.sendKeys(Keys.TAB);
	  Thread.sleep(100);
	  WebElement txt_ContactNumberAreaCodeE = driver.findElement(By.xpath("/html/body/div/form/div[21]/div[1]/input"));
	  txt_ContactNumberAreaCodeE.sendKeys(Keys.TAB);
	  Thread.sleep(200);
	  WebElement txt_ContactNumberE = driver.findElement(By.xpath("/html/body/div/form/div[21]/div[2]/input"));
	  txt_ContactNumberE.sendKeys(Keys.TAB);
	  Thread.sleep(100);
	  WebElement radio_TakeMedicine = driver.findElement(By.xpath("/html/body/div/form/div[23]/div[3]/div/label/input"));
	  radio_TakeMedicine.sendKeys(Keys.TAB);
	  Thread.sleep(100);
	  WebElement txt_Medicine_Description = driver.findElement(By.xpath("/html/body/div/form/div[25]/textarea"));
	  txt_Medicine_Description.sendKeys(Keys.TAB);
	  Thread.sleep(100);
	  driver.findElement(By.xpath("/html/body/div/form/button")).click();
	  Thread.sleep(1500);
	  
	  driver.navigate().refresh();

	}
  
  //Check if Enter Key works for Submit Button
  @Test(priority = 14)
	public void keyboardEnterForSubmit() throws InterruptedException{
	  
	  WebElement btn_Submit = driver.findElement(By.xpath("/html/body/div/form/button"));
	  btn_Submit.sendKeys(Keys.ENTER);
	  Thread.sleep(1500);
	  driver.navigate().refresh();
	}
  
  // Checking the labels display name as wanted
  @Test(priority=15)
  public void checkSpellingOfTexts() {
	  
	  //Get ExpectedLabel Titles 
	String ExpectedSpellingName = "NameTest";
	  String ExpectedSpellingEmail = "Email";
	  String ExpectedSpellingGender = "Gender";
	  String ExpectedSpellingSSN = "SSN";
	  String ExpectedSpellingDOB = "Date of Birth";
	  String ExpectedSpellingHeight = "Height (Inches)";
	  String ExpectedSpellingWeight = "Weight (Pounds)";
	  String ExpectedSpellingContact_Number = "Contact Number";
	  String ExpectedSpellingMarital_Status = "Marital Status Testing";
	  String ExpectedSpellingAddress = "Address";
	  String ExpectedSpellingCity = "City";
	  String ExpectedSpellingState = "State/Province";
	  String ExpectedSpellingZip = "Postal/Zip Code";
	  String ExpectedSpellingEmergency = "In Case of Emergency";
	  String ExpectedSpellingEmergency_Contact = "Emergency Contact";
	  String ExpectedSpellingRelationship = "Relationship";
	  String ExpectedSpellingContact_Number_Emergency = "Contact Number";
	  String ExpectedSpellingContact_Taking_Medicine = "Taking any medications, currently";
	  String ExpectedSpellingMedicine_Description = "If yes please list it here";

	  //Storing the text of the heading
	  String GetActualSpellingName = driver.findElement(By.xpath("/html/body/div/form/div[3]/label")).getText();
	  String GetActualSpellingEmail = driver.findElement(By.xpath("/html/body/div/form/div[5]/label")).getText();
	  String GetActualSpellingSSN = driver.findElement(By.xpath("/html/body/div/form/div[6]/label")).getText();
	  String GetActualSpellingGender = driver.findElement(By.xpath("/html/body/div/form/div[7]/label")).getText();
	  String GetActualSpellingDOB = driver.findElement(By.xpath("/html/body/div/form/div[8]/label")).getText();
	  String GetActualSpellingHeight = driver.findElement(By.xpath("/html/body/div/form/div[9]/label")).getText();
	  String GetActualSpellingWeight = driver.findElement(By.xpath("/html/body/div/form/div[10]/label")).getText();
	  String GetActualSpellingContact_Number = driver.findElement(By.xpath("/html/body/div/form/div[12]/label")).getText();
	  String GetActualSpellingMarital_Status = driver.findElement(By.xpath("/html/body/div/form/div[13]/label")).getText();
	  String GetActualSpellingAddress = driver.findElement(By.xpath("/html/body/div/form/div[14]/label")).getText();
	  String GetActualSpellingCity = driver.findElement(By.xpath("/html/body/div/form/div[16]/div[1]/label")).getText();
	  String GetActualSpellingState = driver.findElement(By.xpath("/html/body/div/form/div[16]/div[2]/label")).getText();
	  String GetActualSpellingZip = driver.findElement(By.xpath("/html/body/div/form/div[16]/div[3]/label")).getText();
	  String GetActualSpellingEmergency = driver.findElement(By.xpath("/html/body/div/form/div[18]/label")).getText();
	  String GetActualSpellingEmergency_Contact = driver.findElement(By.xpath("/html/body/div/form/div[19]/label")).getText();
	  String GetActualSpellingRelationship = driver.findElement(By.xpath("/html/body/div/form/div[20]/label")).getText();
	  String GetActualSpellingContact_Number_Emergency = driver.findElement(By.xpath("/html/body/div/form/div[21]/label")).getText();
	  String GetActualSpellingContact_Taking_Medicine = driver.findElement(By.xpath("/html/body/div/form/div[23]/div[1]/label")).getText();
	  String GetActualSpellingMedicine_Description = driver.findElement(By.xpath("/html/body/div/form/div[24]/div/label")).getText();
	  
	 //if Name Spelling is Correct
	  if(ExpectedSpellingName.equalsIgnoreCase(GetActualSpellingName)) {
		  System.out.println("PASSED : The Expected Spelling for Name is "
		  		+ "Same as the Actual Spelling for Name --- "+GetActualSpellingName);
	  }else {
		  System.out.println("FAILED : The Expected Spelling for Name is Not the Same "
		  		+ "as the Actual Spelling for Name --- Entered Spelling is "+ ExpectedSpellingName +" Actual Spelling should be " +GetActualSpellingName);
	  }
	//if Email Spelling is Correct
	  if(ExpectedSpellingEmail.equalsIgnoreCase(GetActualSpellingEmail)) {
		  System.out.println("PASSED : The Expected Spelling for Email is "
		  		+ "Same as the Actual Spelling for Email --- "+GetActualSpellingEmail);
	  }else {
		  System.out.println("FAILED : The Expected Spelling for Email is Not the Same "
		  		+ "as the Actual Spelling for Email --- Entered Spelling is "+ ExpectedSpellingEmail +" Actual Spelling should be " +GetActualSpellingEmail);
	  }
	//if SSN Spelling is Correct
	  if(ExpectedSpellingSSN.equalsIgnoreCase(GetActualSpellingSSN)) {
		  System.out.println("PASSED : The Expected Spelling for SSN is "
		  		+ "Same as the Actual Spelling for SSN --- "+GetActualSpellingSSN);
	  }else {
		  System.out.println("FAILED : The Expected Spelling for SSN is Not the Same "
		  		+ "as the Actual Spelling for SSN --- Entered Spelling is "+ ExpectedSpellingSSN +" Actual Spelling should be " +GetActualSpellingSSN);
	  }
	//if Gender Spelling is Correct
	  if(ExpectedSpellingGender.equalsIgnoreCase(GetActualSpellingGender)) {
		  System.out.println("PASSED : The Expected Spelling for Gender is "
		  		+ "Same as the Actual Spelling for Gender --- "+GetActualSpellingGender);
	  }else {
		  System.out.println("FAILED : The Expected Spelling for Gender is Not the Same "
		  		+ "as the Actual Spelling for Gender --- Entered Spelling is "+ ExpectedSpellingGender +" Actual Spelling should be " +GetActualSpellingGender);
	  }
	//if Date of Birth Spelling is Correct
	  if(ExpectedSpellingDOB.equalsIgnoreCase(GetActualSpellingDOB)) {
		  System.out.println("PASSED : The Expected Spelling for Date of Birth is "
		  		+ "Same as the Actual Spelling for Date of Birth --- "+GetActualSpellingDOB);
	  }else {
		  System.out.println("FAILED : The Expected Spelling for Date of Birth is Not the Same "
		  		+ "as the Actual Spelling for Date of Birth --- Entered Spelling is "+ ExpectedSpellingDOB +" Actual Spelling should be " +GetActualSpellingDOB);
	  }
	//if Height Spelling is Correct
	  if(ExpectedSpellingHeight.equalsIgnoreCase(GetActualSpellingHeight)) {
		  System.out.println("PASSED : The Expected Spelling for Height is "
		  		+ "Same as the Actual Spelling for Height --- "+GetActualSpellingHeight);
	  }else {
		  System.out.println("FAILED : The Expected Spelling for Height is Not the Same "
		  		+ "as the Actual Spelling for Height --- Entered Spelling is "+ ExpectedSpellingHeight +" Actual Spelling should be " +GetActualSpellingHeight);
	  }
	//if Weight Spelling is Correct
	  if(ExpectedSpellingWeight.equalsIgnoreCase(GetActualSpellingWeight)) {
		  System.out.println("PASSED : The Expected Spelling for Weight is "
		  		+ "Same as the Actual Spelling for Weight --- "+GetActualSpellingWeight);
	  }else {
		  System.out.println("FAILED : The Expected Spelling for Weight is Not the Same "
		  		+ "as the Actual Spelling for Weight --- Entered Spelling is "+ ExpectedSpellingWeight +" Actual Spelling should be " +GetActualSpellingWeight);
	  }
	//if Contact Number Spelling is Correct
	  if(ExpectedSpellingContact_Number.equalsIgnoreCase(GetActualSpellingContact_Number)) {
		  System.out.println("PASSED : The Expected Spelling for Contact Number is "
		  		+ "Same as the Actual Spelling for Contact Number --- "+GetActualSpellingContact_Number);
	  }else {
		  System.out.println("FAILED : The Expected Spelling for Contact Number is Not the Same "
		  		+ "as the Actual Spelling for Contact Number --- Entered Spelling is "+ ExpectedSpellingContact_Number +" Actual Spelling should be " +GetActualSpellingContact_Number);
	  }
	//if Marital Status Spelling is Correct
	  if(ExpectedSpellingMarital_Status.equalsIgnoreCase(GetActualSpellingMarital_Status)) {
		  System.out.println("PASSED : The Expected Spelling for Marital Status is "
		  		+ "Same as the Actual Spelling for Marital Status --- "+GetActualSpellingMarital_Status);
	  }else {
		  System.out.println("FAILED : The Expected Spelling for Marital Status is Not the Same "
		  		+ "as the Actual Spelling for Marital Status --- Entered Spelling is "+ ExpectedSpellingMarital_Status +" Actual Spelling should be " +GetActualSpellingMarital_Status);
	  }
	//if Address Spelling is Correct
	  if(ExpectedSpellingAddress.equalsIgnoreCase(GetActualSpellingAddress)) {
		  System.out.println("PASSED : The Expected Spelling for Address is "
		  		+ "Same as the Actual Spelling for Address --- "+GetActualSpellingAddress);
	  }else {
		  System.out.println("FAILED : The Expected Spelling for Address is Not the Same "
		  		+ "as the Actual Spelling for Address --- Entered Spelling is "+ ExpectedSpellingAddress +" Actual Spelling should be " +GetActualSpellingAddress);
	  }
	//if City Spelling is Correct
	  if(ExpectedSpellingCity.equalsIgnoreCase(GetActualSpellingCity)) {
		  System.out.println("PASSED : The Expected Spelling for City is "
		  		+ "Same as the Actual Spelling for City --- "+GetActualSpellingCity);
	  }else {
		  System.out.println("FAILED : The Expected Spelling for City is Not the Same "
		  		+ "as the Actual Spelling for City --- Entered Spelling is "+ ExpectedSpellingCity +" Actual Spelling should be " +GetActualSpellingCity);
	  }
	//if State/Province Spelling is Correct
	  if(ExpectedSpellingState.equalsIgnoreCase(GetActualSpellingState)) {
		  System.out.println("PASSED : The Expected Spelling for State/Province is "
		  		+ "Same as the Actual Spelling for State/Province --- "+GetActualSpellingState);
	  }else {
		  System.out.println("FAILED : The Expected Spelling for State/Province is Not the Same "
		  		+ "as the Actual Spelling for State/Province --- Entered Spelling is "+ ExpectedSpellingState +" Actual Spelling should be " +GetActualSpellingState);
	  }
	//if Postal/Zip Code Spelling is Correct
	  if(ExpectedSpellingZip.equalsIgnoreCase(GetActualSpellingZip)) {
		  System.out.println("PASSED : The Expected Spelling for Postal/Zip Code is "
		  		+ "Same as the Actual Spelling for Postal/Zip Code --- "+GetActualSpellingZip);
	  }else {
		  System.out.println("FAILED : The Expected Spelling for Postal/Zip Code is Not the Same "
		  		+ "as the Actual Spelling for Postal/Zip Code --- Entered Spelling is "+ ExpectedSpellingZip +" Actual Spelling should be " +GetActualSpellingZip);
	  }
	//if In Case of Emergency Spelling is Correct
	  if(ExpectedSpellingEmergency.equalsIgnoreCase(GetActualSpellingEmergency)) {
		  System.out.println("PASSED : The Expected Spelling for In Case of Emergency is "
		  		+ "Same as the Actual Spelling for In Case of Emergency --- "+GetActualSpellingEmergency);
	  }else {
		  System.out.println("FAILED : The Expected Spelling for In Case of Emergencye is Not the Same "
		  		+ "as the Actual Spelling for In Case of Emergency --- Entered Spelling is "+ ExpectedSpellingEmergency +" Actual Spelling should be " +GetActualSpellingEmergency);
	  }
	//if Emergency Contact Spelling is Correct
	  if(ExpectedSpellingEmergency_Contact.equalsIgnoreCase(GetActualSpellingEmergency_Contact)) {
		  System.out.println("PASSED : The Expected Spelling for Emergency Contact is "
		  		+ "Same as the Actual Spelling for Emergency Contact --- "+GetActualSpellingEmergency_Contact);
	  }else {
		  System.out.println("FAILED : The Expected Spelling for Emergency Contact is Not the Same "
		  		+ "as the Actual Spelling for Emergency Contact --- Entered Spelling is "+ ExpectedSpellingEmergency_Contact +" Actual "
		  				+ "Spelling should be " +GetActualSpellingEmergency_Contact);
	  }
	//if Relationship Spelling is Correct
	  if(ExpectedSpellingRelationship.equalsIgnoreCase(GetActualSpellingRelationship)) {
		  System.out.println("PASSED : The Expected Spelling for Relationship is "
		  		+ "Same as the Actual Spelling for Relationship --- "+GetActualSpellingRelationship);
	  }else {
		  System.out.println("FAILED : The Expected Spelling for Relationship is Not the Same "
		  		+ "as the Actual Spelling for Relationship --- Entered Spelling is "+ ExpectedSpellingRelationship +" Actual "
		  				+ "Spelling should be " +GetActualSpellingRelationship);
	  }
	//if Contact Number Spelling is Correct
	  if(ExpectedSpellingContact_Number_Emergency.equalsIgnoreCase(GetActualSpellingContact_Number_Emergency)) {
		  System.out.println("PASSED : The Expected Spelling for Contact Number is "
		  		+ "Same as the Actual Spelling for Contact Number --- "+GetActualSpellingContact_Number_Emergency);
	  }else {
		  System.out.println("FAILED : The Expected Spelling for Relationship is Not the Same "
		  		+ "as the Actual Spelling for Relationship --- Entered Spelling is "+ ExpectedSpellingContact_Number_Emergency +" Actual "
		  				+ "Spelling should be " +GetActualSpellingContact_Number_Emergency);
	  }
	//if Taking any medications, currently Spelling is Correct
	  if(ExpectedSpellingContact_Taking_Medicine.equalsIgnoreCase(GetActualSpellingContact_Taking_Medicine)) {
		  System.out.println("PASSED : The Expected Spelling for Taking any medications, currently is "
		  		+ "Same as the Actual Spelling for Taking any medications, currently --- "+GetActualSpellingContact_Taking_Medicine);
	  }else {
		  System.out.println("FAILED : The Expected Spelling for Taking any medications, currently is Not the Same "
		  		+ "as the Actual Spelling for Taking any medications, currently --- Entered Spelling is "+ ExpectedSpellingContact_Taking_Medicine +" Actual "
		  				+ "Spelling should be " +GetActualSpellingContact_Taking_Medicine);
	  }
	//if If yes please list it here Spelling is Correct
	  if(ExpectedSpellingMedicine_Description.equalsIgnoreCase(GetActualSpellingMedicine_Description)) {
		  System.out.println("PASSED : The Expected Spelling for If yes please list it here is "
		  		+ "Same as the Actual Spelling for If yes please list it here --- "+GetActualSpellingMedicine_Description);
	  }else {
		  System.out.println("FAILED : The Expected Spelling for If yes please list it here is Not the Same "
		  		+ "as the Actual Spelling for If yes please list it here --- Entered Spelling is "+ ExpectedSpellingMedicine_Description +" Actual "
		  				+ "Spelling should be " +GetActualSpellingMedicine_Description);
	  }
	  driver.navigate().refresh(); //  performing page refresh
  }
  
  
  //Get the placeholders of the elements 
  @Test(priority=16)
  public void getPlaceHolder() {
	  
	  WebElement txt_FirstName = driver.findElement(By.xpath("/html/body/div/form/div[4]/div[1]/input"));
	  WebElement txt_MiddleName = driver.findElement(By.xpath("/html/body/div/form/div[4]/div[2]/input"));
	  WebElement txt_LastName = driver.findElement(By.xpath("/html/body/div/form/div[4]/div[3]/input"));
	  WebElement txt_EmailAddress = driver.findElement(By.xpath("/html/body/div/form/div[5]/div/input"));
	  WebElement txt_SSN = driver.findElement(By.xpath("/html/body/div/form/div[6]/div/input"));
//	  WebElement cmb_Gender = driver.findElement(By.xpath("/html/body/div/form/div[7]/div/select"));
	 
	  WebElement txt_Height = driver.findElement(By.xpath("/html/body/div/form/div[9]/div/input"));
	  WebElement txt_Weight = driver.findElement(By.xpath("/html/body/div/form/div[10]/div/input"));
	  WebElement txt_ContactNumberAreaCode = driver.findElement(By.xpath("/html/body/div/form/div[12]/div[1]/input"));
	  WebElement txt_ContactNumber = driver.findElement(By.xpath("/html/body/div/form/div[12]/div[2]/input"));
//	  WebElement SelectMarital = driver.findElement(By.xpath("/html/body/div/form/div[13]/div/select"));
	  WebElement txt_AddressLine1 = driver.findElement(By.xpath("//*[@id=\"inputAddress2\"]"));
	  WebElement txt_AddressLine2 = driver.findElement(By.xpath("/html/body/div/form/div[15]/input"));
	  WebElement txt_AddressCity = driver.findElement(By.xpath("//*[@id=\"inputCity\"]"));
	  WebElement txt_Zip = driver.findElement(By.xpath("/html/body/div/form/div[16]/div[3]/input"));
	  WebElement txt_EmergencyFirstName = driver.findElement(By.xpath("/html/body/div/form/div[19]/div[1]/input"));
	  WebElement txt_EmergencyLastName = driver.findElement(By.xpath("/html/body/div/form/div[19]/div[2]/input"));
	  WebElement txt_Relationship = driver.findElement(By.xpath("/html/body/div/form/div[20]/div/input"));
	  WebElement txt_ContactNumberAreaCodeE = driver.findElement(By.xpath("/html/body/div/form/div[21]/div[1]/input"));;
	  WebElement txt_ContactNumberE = driver.findElement(By.xpath("/html/body/div/form/div[21]/div[2]/input"));
	  
	  
	  
	  String FirstName = txt_FirstName.getAttribute("placeholder");
	  if(!FirstName.isEmpty()){
		  System.out.println("PASSED : First Name Feild has a placeholder - " +FirstName);
	  }else {
		  System.out.println("FAILED : First Name Feild dose not have a placeholder");
	  }
	  
	  String MiddleName = txt_MiddleName.getAttribute("placeholder");
	  if(!MiddleName.isEmpty()){
		  System.out.println("PASSED : Middle Name Feild has a placeholder - " +MiddleName);
	  }else {
		  System.out.println("FAILED : Middle Name Feild dose not have a placeholder");
	  }
	  
	  String LastName = txt_LastName.getAttribute("placeholder");
	  if(!LastName.isEmpty()){
		  System.out.println("PASSED : Last Name Feild has a placeholder - " +LastName);
	  }else {
		  System.out.println("FAILED : Last Name Feild dose not have a placeholder");
	  }
	  
	  String Email = txt_EmailAddress.getAttribute("placeholder");
	  if(!LastName.isEmpty()){
		  System.out.println("PASSED : Email Feild has a placeholder - " +Email);
	  }else {
		  System.out.println("FAILED : email Feild dose not have a placeholder");
	  }
	  
	  String SSN = txt_SSN.getAttribute("placeholder");
	  if(!SSN.isEmpty()){
		  System.out.println("PASSED : SSN Feild has a placeholder - " +SSN);
	  }else {
		  System.out.println("FAILED : SSN Feild dose not have a placeholder");
	  }
	  //Check if Select Gender Option is Available 
//	  int count = 0;
//	    String[] exp = {"Select Gender", "Male", "Female"};
//	    Select selectGender = new Select(cmb_Gender);
//
//	    List<WebElement> GenderOptions = selectGender.getOptions();
//	    for (WebElement we : GenderOptions) {
//	        for (int i = 0; i < exp.length; i++) {
//	            if (we.getText().equals(exp[i])) {
//	                count++;
//	            }
//	        }
//	    }
//	    if (count == exp.length) {
//	        System.out.println("Passed : Select Gender Element is available");
//	    } else {
//	        System.out.println("Failed : Select Gender Element is not available");
//	    }
//	
//	  //
//	  
//	    WebElement cmb_DOBMonth = driver.findElement(By.xpath("/html/body/div/form/div[8]/div[1]/select"));
//	    int countMonth = 0;
//	    String[] expMonth = {"Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
//	    Select selectMonth = new Select(cmb_DOBMonth);
//
//	    List<WebElement> optionsMonths = selectMonth.getOptions();
//	    for (WebElement Checkmonth : optionsMonths) {
//	        for (int n = 0; n < expMonth.length; n++) {
//	            if (Checkmonth) {
//	            	countMonth++;
//	            }
//	        }
//	    }
//	    if (countMonth == expMonth.length) {
//	        System.out.println("Passed : Month Element is available");
//	    } else {
//	        System.out.println("Failed : Month Element is not available");
//	    }
	  
	  
	    
	  String Height = txt_Height.getAttribute("placeholder");
	  if(!Height.isEmpty()){
		  System.out.println("PASSED : Height Feild has a placeholder - " +Height);
	  }else {
		  System.out.println("FAILED : Height Feild dose not have a placeholder");
	  }
	  
	  String Weight = txt_Weight.getAttribute("placeholder");
	  if(!Weight.isEmpty()){
		  System.out.println("PASSED : Weight Feild has a placeholder - " +Weight);
	  }else {
		  System.out.println("FAILED : Weight Feild dose not have a placeholder");
	  }
	  
	  String Contact_Number_Area_Code = txt_ContactNumberAreaCode.getAttribute("placeholder");
	  if(!Contact_Number_Area_Code.isEmpty()){
		  System.out.println("PASSED : Contact Number Area Code Feild has a placeholder - " +Contact_Number_Area_Code);
	  }else {
		  System.out.println("FAILED : Contact Number Area Code Feild dose not have a placeholder");
	  }
	  
	  String Contact_Number = txt_ContactNumber.getAttribute("placeholder");
	  if(!Contact_Number.isEmpty()){
		  System.out.println("PASSED : Contact Number Feild has a placeholder - " +Contact_Number);
	  }else {
		  System.out.println("FAILED : Contact Number Feild dose not have a placeholder");
	  }
	  
	  String AddressLine1 = txt_AddressLine1.getAttribute("placeholder");
	  if(!AddressLine1.isEmpty()){
		  System.out.println("PASSED : Address Line 1 Feild has a placeholder - " +AddressLine1);
	  }else {
		  System.out.println("FAILED : Address Line 1 Feild dose not have a placeholder");
	  }
	  
	  String AddressLine2 = txt_AddressLine2.getAttribute("placeholder");
	  if(!AddressLine2.isEmpty()){
		  System.out.println("PASSED : Address Line 2 Feild has a placeholder - " +AddressLine2);
	  }else {
		  System.out.println("FAILED : Address Line 2 Feild dose not have a placeholder");
	  }
	  
	  String City = txt_AddressCity.getAttribute("placeholder");
	  if(!City.isEmpty()){
		  System.out.println("PASSED : City Feild has a placeholder - " +AddressLine2);
	  }else {
		  System.out.println("FAILED : City Feild dose not have a placeholder");
	  }
	  
	  String Zip = txt_Zip.getAttribute("placeholder");
	  if(!Zip.isEmpty()){
		  System.out.println("PASSED : Postal/Zip Code Feild has a placeholder - " +Zip);
	  }else {
		  System.out.println("FAILED : Postal/Zip Code Feild dose not have a placeholder");
	  }
	  
	  String EmergencyFirstName = txt_EmergencyFirstName.getAttribute("placeholder");
	  if(!EmergencyFirstName.isEmpty()){
		  System.out.println("PASSED : Emergency First Name Feild has a placeholder - " +EmergencyFirstName);
	  }else {
		  System.out.println("FAILED : Emergency First Name Feild dose not have a placeholder");
	  }
	  
	  String EmergencyLastName = txt_EmergencyLastName.getAttribute("placeholder");
	  if(!EmergencyLastName.isEmpty()){
		  System.out.println("PASSED : Emergency Last Name Feild has a placeholder - " +EmergencyLastName);
	  }else {
		  System.out.println("FAILED : Emergency Last Name Feild dose not have a placeholder");
	  }
	  
	  String Relationship = txt_Relationship.getAttribute("placeholder");
	  if(!Relationship.isEmpty()){
		  System.out.println("PASSED : Relationship Feild has a placeholder - " +Relationship);
	  }else {
		  System.out.println("FAILED : Relationship Feild dose not have a placeholder");
	  }
	  
	  String Emergency_Contact_Number_Area_Code = txt_ContactNumberAreaCodeE.getAttribute("placeholder");
	  if(!Contact_Number_Area_Code.isEmpty()){
		  System.out.println("PASSED : Emergency Contact Number Area Code Feild has a placeholder - " +Emergency_Contact_Number_Area_Code);
	  }else {
		  System.out.println("FAILED : Emergency Contact Number Area Code Feild dose not have a placeholder");
	  }
	  
	  String Emergency_Contact_Number = txt_ContactNumberE.getAttribute("placeholder");
	  if(!Emergency_Contact_Number.isEmpty()){
		  System.out.println("PASSED : Emergency Contact Number Feild has a placeholder - " +Emergency_Contact_Number);
	  }else {
		  System.out.println("FAILED : Emergency Contact Number Feild dose not have a placeholder");
	  }
	  
	  driver.navigate().refresh();
  }
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
