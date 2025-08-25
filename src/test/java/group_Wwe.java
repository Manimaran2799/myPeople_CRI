import org.testng.annotations.Test;

public class group_Wwe {

	@Test(groups = {"smoke"})
	public void JohnCena() {
		System.out.println("you can't see me");
	}
	
	@Test(groups = {"sanity"})
	public void ReyMysterio() {
		System.out.println("619");
	}
	
	@Test(groups = {"smoke"})
	public void RomanReigns() {
		System.out.println("Acknowledge me");
	}
	
	@Test(groups = {"smoke"})
	public void BrockLesnar() {
		System.out.println("Suplex City");
	}
	
	@Test(groups = {"Reg"})
	public void PaulHeyman() {
		System.out.println("My name is PaulHeyman");
	}
	
	@Test(groups = {"smoke"})
	public void RandyOrton() {
		System.out.println("Legend Killer");
	}
}
