package com.bits.pilani.devops.framework.core;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

  public static final ExtentReports extentReports = new ExtentReports();

  public synchronized static ExtentReports createExtentReports() {
    System.err.println("ExtentManager synchronized method invoked!!!");
    ExtentSparkReporter reporter = new ExtentSparkReporter("extent-report.html");
    reporter.config().setReportName("Extent Report");
    extentReports.attachReporter(reporter);
    extentReports.setSystemInfo("Author", "Admin");
    return extentReports;
  }
}
