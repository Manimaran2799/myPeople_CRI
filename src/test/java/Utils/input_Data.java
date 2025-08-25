package Utils;

import org.testng.annotations.DataProvider;

public class input_Data {
	@DataProvider(name = "Positive")
	public Object[][] inputs() {

		return new Object[][] { { "manimar.1999@gmail.com", "Manimaran@123" },
				{ "krishmanimaran11@gmail.com", "Yaathra@123" }, 
				{ "6382742517", "Manimaran@123" },
				{ "7904123951", "Yaathra@123" } };
				
	}
}
