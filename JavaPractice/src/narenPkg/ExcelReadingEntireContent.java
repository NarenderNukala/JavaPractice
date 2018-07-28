package narenPkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import jxl.*;
import jxl.read.biff.BiffException;
import jxl.write.WritableWorkbook;

public class ExcelReadingEntireContent {

	
	    public static void main(String[] args) throws Exception {
	         
	        try {
	             
	            //Create a workbook object from the file at specified location.
           		 Workbook wrk1 =  Workbook.getWorkbook(new File("C:\\StudentInfo.xls"));
	             
	            //Obtain the reference to the first sheet in the workbook
	            Sheet sheet1 = wrk1.getSheet(0);
	            
	            //Find the number of rows and columns in the excel
	            int rowCount = sheet1.getRows();
	            int colCount = sheet1.getColumns();
	            
	            for (int i=0;i<rowCount;i++)
	            {
	            	String rowValues = "";
	            	for (int j=0;j<colCount;j++)
	            	{
	            		rowValues = rowValues + sheet1.getCell(j, i).getContents() + "    ";
	            	}
	            	System.out.println(rowValues);
	            }
	             
	        } catch (BiffException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	 
	    }
	 
	}

