package dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data {

	@Test
	public void banana() {
		
		System.out.println("parameter-" );
	}
	@Test
	public void carrot() {
		System.out.println("parameter-");
	}
	@Test
	public void apple() {
		System.out.println("parameter-");
	}
	@Test(dataProviderClass=DtaProviderDemo.class,dataProvider="TestData1")
	public void guava(String a) {
		System.out.println("Data Provider: "+a);
	}
	@DataProvider(name="TestData")
	public Object[][]getvalue(){
		
		return new Object[][] {
			{"mumbai"},
			{"pune"},
			{"nanded"},
			{"nashik"}
		};
		
	}
}
