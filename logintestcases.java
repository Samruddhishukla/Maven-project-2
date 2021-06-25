package Pages;

import java.io.IOException;

import org.testng.annotations.Test;

public class logintestcases extends Base {
	
		@Test
		public void abc() throws IOException, InterruptedException
		{
			Thread.sleep(5000);
			loginhrm ls = new loginhrm(driver);
			ls.loginbutton();
			
		
		}

}
