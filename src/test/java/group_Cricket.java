import org.testng.annotations.Test;

public class group_Cricket {

	@Test(groups = {"smoke"})
	public void ViratKohli() {
		System.out.println("King of Cricket");
	}
	
	@Test(groups = {"smoke"})
	public void ABD() {
		System.out.println("Alien");
	}
	
	@Test(groups = {"smoke"})
	public void Gayle() {
		System.out.println("Universe boss"); 
	}
	
	@Test(groups = {"sanity"})
	public void YuziChahal() {
		System.out.println("Spin wizzard");
	}
	
	@Test(groups = {"sanity"})
	public void Maxi() {
		System.out.println("Biggshow");
	}
	
	
}

