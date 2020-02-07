package utils;

public class ExcelReaderWriter {
	
	static Xls_Reader xlread;
	
	public static String getData(String fileName, String colName, int rowNum) {
		xlread = new Xls_Reader("//Users//poojabhandari//Desktop//SELENIUM_TRAINING//AUTOMATION_code//TicketBooking//src//test//resources//ExcelFiles//"+fileName+".xlsx");
		return xlread.getCellData("Sheet1", colName, rowNum);
	}
	
	public static void setData(String fileName, String colName, int rowNum, String data) {
		xlread = new Xls_Reader("//Users//poojabhandari//Desktop//SELENIUM_TRAINING//AUTOMATION_code//TicketBooking//src//test//resources//ExcelFiles//"+fileName+".xlsx");
		xlread.setCellData("Sheet1", colName, rowNum, data);
	}

}
