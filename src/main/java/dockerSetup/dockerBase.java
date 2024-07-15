package dockerSetup;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class dockerBase {

	@BeforeTest
	void startDockerGrid() throws IOException, InterruptedException {
		String [] cmd = {"cmd","/c", "start.bat"};
		Runtime.getRuntime().exec(cmd);
		Thread.sleep(15000);
		
	}
	
	@AfterTest
	void stopDockerGrid() throws IOException, InterruptedException {
		String [] cmd2 = {"cmd","/c", "stop.bat"};
		Runtime.getRuntime().exec(cmd2);
		Thread.sleep(15000);
	}
}
