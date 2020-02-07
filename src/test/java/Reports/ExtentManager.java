 package Reports;

import java.io.File;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {

	private static ExtentReports extent;
    public static String screenshotFolderPath;
    
    public static ExtentReports setUp (String reportPath) {
    	if (extent == null){
    		// generate report folder
    		Date d=new Date();
    		String fileName="Report_"+d.toString().replace(":", "_").replace(" ", "_")+".html";
    		//String fileName="Report.html";
    		//Date d = new Date();
    		String folderName="Extent Report";
    		
    		// directory of the report folder
    		new File(reportPath+folderName+"//screenshots").mkdirs();
    		
    		reportPath=reportPath+folderName+"//";
    		screenshotFolderPath=reportPath+"screenshots//";
    		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(reportPath+fileName);
            //htmlReporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);
            //htmlReporter.config().setChartVisibilityOnOpen(true);
            htmlReporter.config().setTheme(Theme.DARK);
            htmlReporter.config().setDocumentTitle("Reports");
            htmlReporter.config().setEncoding("utf-8");
            htmlReporter.config().setReportName("Reports - Automation Testing");
            
            extent = new ExtentReports();
            extent.attachReporter(htmlReporter);
    		
    	}
    	
        return extent;
    }
	
}
