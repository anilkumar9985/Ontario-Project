package com.channelassist.datadriven;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import org.apache.poi.hssf.usermodel.HSSFFormulaEvaluator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ExcelDriven {
	
public WebDriver driver;
	
	public static DataFormatter format = new DataFormatter();
	
	public static FormulaEvaluator formulaEvaluator =  new HSSFFormulaEvaluator (null);
	
	
	public static List<HashMap<String,String>> Data(String FilePath, String SheetName)
	{
		List<HashMap<String,String>> mydata = new ArrayList<>();
		
		try 
		{ 
			FileInputStream fis = new FileInputStream(FilePath);
			
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			
			XSSFSheet sheet = workbook.getSheet(SheetName);
			
			
			Row headerRow = sheet.getRow(0);
			
		
			
			
			for(int i =1; i< sheet.getPhysicalNumberOfRows();i++)
			{
				Row currentRow = sheet.getRow(i);
				HashMap<String,String> currentHashMap = new HashMap<String,String>(); 
				
				
				
				for(int j=0 ; j< currentRow.getPhysicalNumberOfCells(); j++)
				{
					Cell currentCell = currentRow.getCell(j);
					
					String str = format.formatCellValue(currentCell,formulaEvaluator);
					currentHashMap.put(headerRow.getCell(j).getStringCellValue(), str);
					
				}
				mydata.add(currentHashMap);	
				
			}
			fis.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return mydata;
	}
	

}
