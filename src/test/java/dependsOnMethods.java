import javax.management.RuntimeErrorException;

import org.testng.annotations.Test;


//we can also use methods from another class pr package etc...
public class dependsOnMethods {
	
	@Test
	public void SunPictures() {
	
		System.out.println("Kalanithi Maaran is a CEO");
		throw new RuntimeErrorException(null);
	}
	
	@Test(dependsOnMethods = "Rajinikanth")
	public void Petta() {
		System.out.println("A Karthik Subbaraj Padam");
	}
	
	@Test(dependsOnMethods = "SunPictures")
	public void Enthiran() {
		System.out.println("A Shankar Film");
	}
	
	@Test(dependsOnMethods = "Rajinikanth" ,priority = -1)//here in TestNG dependsonMethod has high residence and it supress the priority attributes
	public void Jailer() {
		System.out.println("Nelson is a writter and director");
	}
	
	@Test
	public void Rajinikanth() {
		System.out.println("SuperStar of an Indian Cinema");
	}

}
