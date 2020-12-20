package listner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerUtil implements ITestListener {
	
   public void onTestFailure(ITestResult result) {
	System.out.println("test failed"+result.getName());
		System.out.println(result.getStatus());
	}
   public void onTestSuccess(ITestResult result) {
	System.out.println("test passed"+result.getName());
	}

	public void onTestStart(ITestResult result) {
   System.out.println("*************Execution started************** "+result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
	
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	public void onStart(ITestContext context) {
		
		
	}

	public void onFinish(ITestContext context) {
	
		System.out.println("*******Eexcution finished*************************************");
	}

}
