package mavenpractice;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Addition {
	
	@Test
	public void additionclass()
	{
		System.out.println("SUM");
	int a =10;
	int b =20;

	Assert.assertEquals(30, a+b);
	
	}
	
	

}
