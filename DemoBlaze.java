package Assessment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlaze {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.demoblaze.com/");
       driver.manage().window().maximize();
       driver.findElement(By.xpath("//a[@id='login2']")).click();
       Thread.sleep(2000);

       driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys("palak_mangal20");
       driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("palak1234");
       Thread.sleep(2000);

       driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
       
       Thread.sleep(4000);

       driver.findElement(By.xpath("//div[@id='tbodyid']//div[1]//div[1]//a[1]//img[1]")).click();
       Thread.sleep(2000);

       driver.findElement(By.xpath("//a[text()='Add to cart']")).click();

       Thread.sleep(2000);

       Alert alert = driver.switchTo().alert();
       System.out.println("Alert Text :" + alert.getText());
       alert.accept();
       driver.findElement(By.xpath("//a[@id='cartur']")).click();
       
       Thread.sleep(2000);
      WebElement product =  driver.findElement(By.xpath("//td[text()='Samsung galaxy s6']"));
      if(product.isDisplayed()) {
    	  System.out.println("samsung galaxy s6 is in the cart");
      }else {
    	  System.out.println("samsung galaxy s6 is not in the cart");
    }
     driver.quit();
	}

}
