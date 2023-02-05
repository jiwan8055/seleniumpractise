package dataprovider;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	
	@Test
	@Parameters("apple")
		public void apple(int s) {
			System.out.println("Parameter-"+s);
		}
	
	@Test
    @Parameters("apple")
	public void banana(String a) {
		System.out.println("Parameter-"+a);
	}
	
	@Test
	@Parameters("banana")
	public void carrot(String o) {
		System.out.println("Parameter-"+o);	}
	
	@Test
	@Parameters("guava")
	public void guava(String n) {
		System.out.println("Parameter-"+n);
	}
		
	

}
