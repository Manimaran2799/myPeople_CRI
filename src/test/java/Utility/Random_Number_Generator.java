package Utility;

import java.sql.Date;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import PageObjectModels.Demo;

public class Random_Number_Generator {
	private static final String month = null;
	private static final String Date = null;
	static int values;

	public static int RandomNumber() {

		int[] number = { 1, 2, 3 };

		Random rd = new Random();

		int index = rd.nextInt(number.length);

		values = number[index];
		return values;
	}

	// POM for senior citizen
	@FindBy(xpath = "//*[text()='1960']")
	WebElement SeniorCitizenYear;
	@FindBy(xpath = "//*[text()='Jan']")
	WebElement SeniorCiti_mon;

	@FindBy(xpath = "//*[text()='1']")
	WebElement Senior_Day;

	

}
