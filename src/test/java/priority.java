import org.testng.annotations.Test;

public class priority {

	@Test(priority = 3)
	public void batsman() {
		System.out.println("Virat Kohli is ready for strike the Ball");
	}
	
	@Test(priority = 2)
	public void bowler() {
		System.out.println("Mitchel Starc is ready for Hunting");
	}
	
	@Test(priority = -1)
	public void pitchReport() {
		System.out.println("The wankadhe pitch seems to be greenish, it is going to be bowling paradise for 1st 30 mins");
	}
	
	@Test()
	public void tossReport() {
		System.out.println("RCB Captain Virat Kohli won the toss, he decided to bat first");
	}
	
	@Test(priority = -2)
	public void weatherReport() {
		System.out.println("huge crowd on the wankadhe, humidity is going to be plays a major role on 2nd half of the game");
	}
	
	
}
