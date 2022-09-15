package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import io.netty.handler.codec.http.HttpContentEncoder.Result;

public class listenertest implements ITestListener {
	
	public void onTestStart(ITestResult result) {
			System.out.println("The name of testcase is start :"+result.getName());
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("The name of testcase is Success :"+result.getName());
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("The name of testcase is Failure :"+result.getName());
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("The name of testcase is skipped :"+result.getName());
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("The name of testcase is FailedButWithinSuccessPercentage :"+result.getName());
		
	}
	public void onStart(ITestResult context) {
		
	}
	public void onFinish(ITestResult context) {
		System.out.println("The name of testcase is skipped :"+context.getName());
		
	}

}
