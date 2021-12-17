package testReport;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
//import org.testng.log4testng.Logger;

import testCases.BaseTestClass;

public class TestListener extends BaseTestClass implements ITestListener {
	public static Logger logger = Logger.getLogger(TestListener.class);

	public String getTestMethodName(ITestResult itr) {
		return itr.getMethod().getConstructorOrMethod().getName();
	}

	public void onStart(ITestContext context) {
		logger.debug("******** TEST CASE " + context.getName() + " STARTED ********");
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		logger.debug("******** Running Test Method " + result.getMethod().getMethodName() + " ********");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		logger.debug("******** Test Execution > " + result.getMethod().getMethodName() + " > PASS ********");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		logger.debug("******** Test Execution > " + result.getMethod().getMethodName() + " > FAIL ********");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		logger.debug("******** Test Execution > " + result.getMethod().getMethodName() + " > SKIP ********");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		logger.debug("******** Test Execution > " + result.getMethod().getMethodName() + " > FAIL WITH % ********");
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		logger.debug("******** TEST CASE " + context.getName() + " ENDED ********");
	}

}
