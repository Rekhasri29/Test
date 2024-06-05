package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver = null;

	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.udemy.com/join/login");
	}

	public static void inputData(WebElement element, String data) {
		element.sendKeys(data);
	}

	public static void clickButton(WebElement element) {
		element.click();
	}

	public static void clearData(WebElement element) {
		element.clear();
	}
	
	public static void threadSleep(int seconds) {
		try {
			Thread.sleep(seconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String reuseExcel(int i, int j) {

		String value = null;
		try {
			File file = new File(
					"C:\\Users\\Rekha M\\eclipse-workspace\\new\\Cucumber1\\src\\test\\resources\\TestData\\TestExcel.xlsx");
			FileInputStream fis = new FileInputStream(file);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("Sheet1");
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(j);
			int cellType = cell.getCellType();
			if (cellType == 1) {
				value = cell.getStringCellValue();
				System.out.println(value);
			} else if (cellType == 0) {
				if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat sm = new SimpleDateFormat();
					value = sm.format("dd/MM/yyyy");
					System.out.println(value);
				} else {
					double numericCellValue = cell.getNumericCellValue();
					long l = (long) numericCellValue;
					value = String.valueOf(l);
					System.out.println(value);
				}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return value;

	}
}
