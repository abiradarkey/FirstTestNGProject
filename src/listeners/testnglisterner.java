package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class testnglisterner {
	@Test
	public void test4() {
		System.out.println("I am inside Test 4");
		}
	@Test
	public void test5() {
		System.out.println("I am inside Test 5");
	}
	@Test
	public void test6() {
		System.out.println("I am inside Test 6");
		throw new SkipException("This test is skipped");
	}

	}


