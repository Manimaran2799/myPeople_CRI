package PageObjectModels;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

public class Demo {

	static LocalDate CurrentDate = LocalDate.now().minusDays(1);

	public static int getDate() {
		return CurrentDate.getDayOfMonth();
		// get current date

	}

	public static String getMonth() {
		DateTimeFormatter monFormat = DateTimeFormatter.ofPattern("MMM");

		return CurrentDate.format(monFormat);
	}

	public static int getYear() {
		return CurrentDate.getYear();

	}

	public static  String FormattedDateValues() {

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		return CurrentDate.format(formatter);

	}
	
	
	

}
