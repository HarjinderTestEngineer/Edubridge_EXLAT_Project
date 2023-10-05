package CoreSelenium;
import org.openqa.selenium.By;
import org.openga.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {
public static void main (String[] args) {
// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
WebDriver driver=newChromeDriver();
driver.manage().window ().maximize();
driver.get( "http://demo.automation testing.in/Register.html");
//Entering First Name
driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys ("def");
//Entering Last Name
driver.findElement(By.xpath("//input [@placeholder='Last Name']")) .sendKeys("def");
//Enter Adress
driver .findElement(By.xpath("//textarea [@ng-model='Adress']")) .sendKeys ("Enter Details");
//Enter Email
driver .findElement(By.xpath("//input[@type='email']")) .sendKeys ("abc@def.com");
//Enter Phone
driver.findElement(By.xpath("//input [@type='tel']")) .sendKeys ("1122334455");
//Select Gender
driver.findElement(By.xpath("//input [@value='Male']")).click();
//Select Hobbies
driver.findElement(By.id("checkbox1")).click();
//Select Language
driver .findElement(By.xpath("//div[@id='msdd']")).click();
driver.findElement(By.xpath("//div[@id='msdd']/../div[2]/ul/li/a[contains (text(), 'Danish')]")).click();
//Select Skills
Select skills=new Select (driver.findElement(By.id("Skills")));
skills.selectByVisibleText ("SQL");
//Select Country
Select country=new Select (driver.findElement (By.id("countries")));
country.selectByVisibleText ("India");
//Select Year
Select year=new Select (driver.findElement(By.id("yearbox")));
year.selectByVisibleText("2013");
//Select Month
Select month=new Select (driver.findElement (By.xpath("//select [ @placeholder='Month']")));
month.selectByVisibleText("May");
//Select day
Select day=new Select (driver.findElement(By.id("daybox")));
day.selectByVisibleText("15");
//Enter Password
driver.findElement(By.id("firstpassword")).sendKeys ("Abc123");
//Enter Confirm Password
driver.findElement(By.id("secondpassword")).sendKeys ("Abc123");
//Enter Submit button
driver.findElement(By.id("submitbtn")).submit();
}
}
