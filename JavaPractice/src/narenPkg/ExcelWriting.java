package narenPkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import jxl.*;
import jxl.read.biff.BiffException;
import jxl.write.*;
import jxl.write.Boolean;
import jxl.write.Number;



public class ExcelWriting {

	
	    public static void main(String[] args) throws Exception {
	         
	        try {
	             
	            //Create a workbook object from the file at specified location.
	        	 File exlFile = new File("c:\\JavaJXL.xls");
	             WritableWorkbook writableWorkbook = Workbook.createWorkbook(exlFile);
	             
           		 WritableSheet writableSheet = writableWorkbook.createSheet(
                         "Sheet1", 0);
      
                 //Create Cells with contents of different data types.
                 //Also specify the Cell coordinates in the constructor
                 Label label = new Label(0, 0, "Any String You can write");
                 DateTime date = new DateTime(1, 0, new Date());
                 Boolean bool = new Boolean(2, 0, true);
                 Number num = new Number(3, 0, 9.99);
                 
                 Label label1 = new Label(5, 4, "I can write any where");
      
                 //Add the created Cells to the sheet
                 writableSheet.addCell(label);
                 writableSheet.addCell(date);
                 writableSheet.addCell(bool);
                 writableSheet.addCell(num);
                 writableSheet.addCell(label1);
      
                 //Write and close the workbook
                 writableWorkbook.write();
                 writableWorkbook.close();
                 
                 System.out.println("Excel file is created successfully");
	             
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	 
	    }
	 
	}

