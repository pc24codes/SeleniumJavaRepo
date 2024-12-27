package com.sample;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentReportsManager {
    private static WebDriver driver;
    private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();
    private static ExtentReports extent;

    public static String getTimeStamp() {
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHMmmss").format(new Date());

        return timeStamp;
    }


    public static ExtentReports getExtentReport() {
        if(extent == null) {
            String reportPath = "src/test/resources/Reports "+ getTimeStamp() + ".html";
            ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportPath);
            sparkReporter.config().setDocumentTitle("Automation Test ");
            sparkReporter.config().setReportName("Cucumber test report");

            extent = new ExtentReports();
            extent.attachReporter(sparkReporter);
            extent.setSystemInfo("Tester","Parasuram");
        }
        return extent;
    }

    public static void setExtent(ExtentTest test)
    {
        extentTest.set(test);
    }

    public static ExtentTest getExtentTest(){
        return extentTest.get();
    }

    public static String takeScreenshot(WebDriver driver, Scenario scenario){
        String screenShotDir = "src/test/resources/Reports/Screenshots";
        String screenShotpath = screenShotDir + "ScreenShot_"+ getTimeStamp() + ".png";

        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        try{
            FileUtils.copyFile(screenshotFile, new File(screenShotDir));
        }
        catch (IOException e)
        {
            throw new RuntimeException("Error" + e.getMessage());
        }
        return screenShotpath;
    }

//    @BeforeStep
//    public void beforeStep(Scenario scenario) {
//        extentTest.get().info("Executing step: " + scenario.getName());
//    }
//
//    // Hook to log screenshot after each step
//    @AfterStep
//    public void afterStep(WebDriver driver, Scenario scenario) {
//        if (scenario.isFailed()) {
//            takeScreenshot(driver, scenario);
//        }
//    }
    public static void removeExtentTest() {
        extentTest.remove();
    }
}
