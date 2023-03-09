package com.bits.pilani.devops.framework.listeners;

import com.aventstack.extentreports.Status;
import com.bits.pilani.devops.framework.core.ExtentManager;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtentReportListener implements IInvokedMethodListener, ITestListener {

  private static String getTestMethodName(ITestResult iTestResult) {
    System.err.println("Working #1");
    return iTestResult.getMethod().getConstructorOrMethod().getName();
  }

  @Override
  public void onStart(ITestContext iTestContext) {
    System.err.println("Working #2");
    System.err.println("I am in onStart method " + iTestContext.getName());
  }

  @Override
  public void onFinish(ITestContext iTestContext) {
    System.err.println("Working #3");
    System.err.println("I am in onFinish method " + iTestContext.getName());
    //Do tier down operations for ExtentReports reporting!
    ExtentManager.extentReports.flush();
  }

  @Override
  public void onTestStart(ITestResult iTestResult) {
    System.err.println("Working #4");
    System.err.println(getTestMethodName(iTestResult) + " test is starting.");
    ExtentTestManager.startTest(iTestResult.getTestName(), iTestResult.getName());
  }

  @Override
  public void onTestSuccess(ITestResult iTestResult) {
    System.err.println("Working #5");
    System.err.println(getTestMethodName(iTestResult) + " test is succeed.");
    ExtentTestManager.getTest().log(Status.PASS, "Test passed");
    //ExtentReports log operation for passed tests.
    //getTest().log(Status.PASS, "Test passed");
  }

  @Override
  public void onTestFailure(ITestResult iTestResult) {
    System.err.println("Working #6");
    System.err.println(getTestMethodName(iTestResult) + " test is failed.");
    //Get driver from BaseTest and assign to local webdriver variable.
    Object testClass = iTestResult.getInstance();
    System.err.println("onTestFailure : [" + testClass.toString() + "]");
    ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");
  }

  @Override
  public void onTestSkipped(ITestResult iTestResult) {
    System.err.println("Working #7");
    System.err.println(getTestMethodName(iTestResult) + " test is skipped.");
    //ExtentReports log operation for skipped tests.
    ExtentTestManager.getTest().log(Status.SKIP, "Test Skipped");
  }

  @Override
  public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
    System.err.println("Working #8");
    System.err.println(
        "Test failed but it is in defined success ratio " + getTestMethodName(iTestResult));
  }

  @Override
  public void onTestFailedWithTimeout(ITestResult result) {
    System.err.println("Working #9");
  }

  @Override
  public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
    System.err.println("Working #10 -> [" + method.getTestMethod().getMethodName() + "]");
    ExtentTestManager.startTest(method.getTestMethod().getMethodName(),
        "Name : [" + method.getTestMethod().getMethodName() + "] - [" + method.getTestMethod()
            .getQualifiedName() + "]");
  }

  @Override
  public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
    System.err.println(
        "Working #11 -> [" + method.getTestMethod().getMethodName() + "] - Status - [" + testResult
            .getStatus() + "]");
    if (testResult.getStatus() == 1) {
      ExtentTestManager.getTest().log(Status.PASS, "Test Passed");
    } else if (testResult.getStatus() == 2) {
      ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");
    } else if (testResult.getStatus() == 3) {
      ExtentTestManager.getTest().log(Status.SKIP, "Test Skipped");
    }
  }

  @Override
  public void beforeInvocation(IInvokedMethod method, ITestResult testResult,
      ITestContext context) {
    System.err.println("Working #12");
  }

  @Override
  public void afterInvocation(IInvokedMethod method, ITestResult testResult, ITestContext context) {
    IInvokedMethodListener.super.afterInvocation(method, testResult, context);
  }
}
