package com.adactin.stepdefinition;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.Runner_Class;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_definition {
	public static WebDriver driver =Runner_Class.driver;
	
	@Before
	public void beforeHooks(Scenario s) {
		String name = s.getName();
		System.out.println("Scenario Name:"+ name);
		}
	@After
	public void afterHooks(Scenario s) throws IOException {
		String status = s.getStatus();
		System.out.println("Scenario Value:"+ status);
		if (s.isFailed()) {	

		TakesScreenshot ss=(TakesScreenshot)s;
		
	File src=ss.getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\Users\\D E L L\\SeleniumWorkSpace\\AdactinCucumber1\\ScreenShot/photo1.png");
	FileUtils.copyFile(src, destination);
			
		}
	}
	
	@Given("^User Launch The Adactin Application$")
	public void user_Launch_The_Adactin_Application() throws Throwable {
		driver.get("https://adactinhotelapp.com/");
		
	 
	}

	@When("^User Enter The Username In The User Field$")
	public void user_Enter_The_Username_In_The_User_Field() throws Throwable {
	WebElement name = driver.findElement(By.id("username"));
	name.sendKeys("rajlofraj");
	    
	}

	@When("^User Enter The Password In The Password Field$")
	public void user_Enter_The_Password_In_The_Password_Field() throws Throwable {
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("pandiraj123");
	   
	}

	@Then("^User Click The Login Button And Page As Navigate's To Search Hotel Page$")
	public void user_Click_The_Login_Button_And_Page_As_Navigate_s_To_Search_Hotel_Page() throws Throwable {
		WebElement log = driver.findElement(By.id("login"));
		log.click();
	    
	}

	@When("^User Choose The Location From Location List$")
	public void user_Choose_The_Location_From_Location_List() throws Throwable {
		WebElement loc = driver.findElement(By.id("location"));
		Select loc1=new Select(loc);
		loc1.selectByValue("Melbourne");
	   
	}

	@When("^User Select The Hotel In Hotel List$")
	public void user_Select_The_Hotel_In_Hotel_List() throws Throwable {
		WebElement hotel = driver.findElement(By.name("hotels"));
		Select hotel1=new Select(hotel);
		hotel1.selectByVisibleText("Hotel Sunshine");
		
	   
	}

	@When("^User Select RoomType In RoomType List$")
	public void user_Select_RoomType_In_RoomType_List() throws Throwable {
		WebElement room = driver.findElement(By.id("room_type"));
		room.sendKeys("Double");
	    
	}

	@When("^User Select The Number Of Rooms In Number Of Rooms List$")
	public void user_Select_The_Number_Of_Rooms_In_Number_Of_Rooms_List() throws Throwable {
		WebElement findElement = driver.findElement(By.name("room_nos"));
		findElement.sendKeys("2");
	   
	}

	@When("^User Enter The Check In Date In Check In Box$")
	public void user_Enter_The_Check_In_Date_In_Check_In_Box() throws Throwable {
		driver.findElement(By.id("datepick_in")).sendKeys("29/10/2022");
	   
	}

	@When("^User Enter The Check Out Date In Check Out Box$")
	public void user_Enter_The_Check_Out_Date_In_Check_Out_Box() throws Throwable {
		driver.findElement(By.id("datepick_out")).sendKeys("31/10/2022");
		Thread.sleep(2000);
	    
	}
	

	@When("^User Select The Number Of Aduld Per Room In Aduld Per Room Field$")
	public void user_Select_The_Number_Of_Aduld_Per_Room_In_Aduld_Per_Room_Field() throws Throwable {
		WebElement Adult = driver.findElement(By.id("adult_room"));
		Select Adult1=new Select(Adult);
		Adult1.selectByValue("3");
		
		
		}

	@When("^User Select The Children Per Room In Children Per Room Field$")
	public void user_Select_The_Children_Per_Room_In_Children_Per_Room_Field() throws Throwable {
		WebElement child = driver.findElement(By.id("child_room"));
		child.sendKeys("1");
	    
	}

	@Then("^User Click Search Button And It Navigate To Select Hotel Page$")
	public void user_Click_Search_Button_And_It_Navigate_To_Select_Hotel_Page() throws Throwable {
		driver.findElement(By.id("Submit")).click();
	    
	}

	@When("^User Click The Hotel Conforming Page$")
	public void user_Click_The_Hotel_Conforming_Page() throws Throwable {
		WebElement click = driver.findElement(By.id("radiobutton_0"));
		click.click();
		Thread.sleep(2000);
	   
	}

	@Then("^User Click The Continue Button And It Navigate To Book Hotel Page$")
	public void user_Click_The_Continue_Button_And_It_Navigate_To_Book_Hotel_Page() throws Throwable {
		WebElement nxt = driver.findElement(By.id("continue"));
		nxt.click();
	    
	}

	@When("^User Enter The FirstName In FirstName Field$")
	public void user_Enter_The_FirstName_In_FirstName_Field() throws Throwable {
		driver.findElement(By.id("first_name")).sendKeys("pandi");
	   
	}

	@When("^User Enter The LastName In LastName Field$")
	public void user_Enter_The_LastName_In_LastName_Field() throws Throwable {
		driver.findElement(By.id("last_name")).sendKeys("raj");
	    
	}

	@When("^User Enter The User Billing Address In Billing Address Field$")
	public void user_Enter_The_User_Billing_Address_In_Billing_Address_Field() throws Throwable {
		WebElement add = driver.findElement(By.name("address"));
		add.sendKeys("D-block,Amaerica,los_angeles");
	    
	}

	@When("^User Enter The Credit Card No In Credit Card No Field$")
	public void user_Enter_The_Credit_Card_No_In_Credit_Card_No_Field() throws Throwable {
		driver.findElement(By.id("cc_num")).sendKeys("9876543219876543");
	   
	}

	@When("^User Select The Credit Card Type In Credit Card Type List$")
	public void user_Select_The_Credit_Card_Type_In_Credit_Card_Type_List() throws Throwable {
		WebElement type = driver.findElement(By.id("cc_type"));
		Select type1=new Select(type);
		type1.selectByValue("AMEX");
	}

	@When("^User Select The Expire Month And Expire Year In Expire Date Field$")
	public void user_Select_The_Expire_Month_And_Expire_Year_In_Expire_Date_Field() throws Throwable {
		WebElement month = driver.findElement(By.name("cc_exp_month"));
		Select month1=new Select(month);
		month1.selectByIndex(6);
		List<WebElement> allSelectedOptions = month1.getAllSelectedOptions();
		System.out.println("allSelectedOptions");
		driver.findElement(By.id("cc_exp_year")).sendKeys("2022");
	    
	}

	@When("^User Enter The CVV Number in CVV Number Field$")
	public void user_Enter_The_CVV_Number_in_CVV_Number_Field() throws Throwable {
		driver.findElement(By.id("cc_cvv")).sendKeys("234");
	} 

	@Then("^User Click The BookNow Button And It Navigate To$")
	public void user_Click_The_BookNow_Button_And_It_Navigate_To() throws Throwable {
		driver.findElement(By.id("book_now")).click();
		Thread.sleep(5000);
	    
	}

	@Then("^User Click The Logout Button And It Navigate To Logout SuccessFully Page$")
	public void user_Click_The_Logout_Button_And_It_Navigate_To_Logout_SuccessFully_Page() throws Throwable {
		driver.findElement(By.id("logout")).click();
		
	   
	}



}
