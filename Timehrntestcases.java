package Pages;

import java.io.IOException;

import org.testng.annotations.Test;

public class Timehrntestcases extends Base {
	@Test
	public void abc() throws IOException, InterruptedException
	{
		Thread.sleep(5000);
		Timehrm ts = new Timehrm(driver);
		ts.timebtn();
		
	
	}

}
