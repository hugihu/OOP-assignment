package com.ca.test;

import java.io.FileInputStream; 
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FileManager implements ActionListener
{
	public static int hot, cool, normal = 0;
	public static int y1, n1, y2, n2, y3, n3, y4, n4, y5, n5 = 0;
			
	@SuppressWarnings("unused")
	@Override
	public void actionPerformed(ActionEvent event) 
	{
	    if 	(event.getSource() == CA.b1)
	   	{	    
			   XSSFWorkbook wb = null; //creating new workbook for the excel file
				try 
				{
					wb = new XSSFWorkbook(new FileInputStream("C:\\Users\\Hugh\\Dropbox\\Year 2 Sem 2\\oop\\MLdata.xlsx"));
				} 
				catch (IOException e) 
				{
					e.printStackTrace();
				}
				
				XSSFSheet sheet = wb.getSheetAt(0);
			    String value;
			    XSSFRow row;
					    
			    for (int rowIndex = 0; rowIndex <= sheet.getLastRowNum(); rowIndex++) //for loop to scan all rows of the file
			    {
			    	
			    	  row = sheet.getRow(rowIndex);
			    	  Cell cell = row.getCell(0);
			    	  
			    	  if (row != null) 
			    	  {
			    	    

			    			value = cell.getStringCellValue();  
			    			
			    			if (value.equals("hot"))
			    			{			    				
			    				hot ++;			    				
			    			}
			    			else if(value.equals("cool"))
			    			{
			    				cool ++;			    				
			    			}
			    			else if (value.equals("normal"))
			    			{
			    				normal ++;		    				
			    			}

			    		}  
			    	  
			    	  row = sheet.getRow(rowIndex);
			    	  Cell cell1 = row.getCell(1);
			    	  
			    	  if (row != null) 
			    	  {
			    	    

			    			value = cell1.getStringCellValue();  
			    			
			    			if (value.equals("yes"))
			    			{			    				
			    				y1 ++;			    				
			    			}
			    			else if(value.equals("no"))
			    			{
			    				n1 ++;			    				
			    			}
			    	  
			    	}
			    	  
			    	  row = sheet.getRow(rowIndex);
			    	  Cell cell2 = row.getCell(2);
			    	  
			    	  if (row != null) 
			    	  {
			    	    

			    			value = cell2.getStringCellValue();  
			    			
			    			if (value.equals("yes"))
			    			{			    				
			    				y2 ++;			    				
			    			}
			    			else if(value.equals("no"))
			    			{
			    				n2 ++;			    				
			    			}
			    			
			    	  
			    	}
			    	  
			    	  row = sheet.getRow(rowIndex);
			    	  Cell cell3 = row.getCell(3);
			    	  
			    	  if (row != null) 
			    	  {
			    	    

			    			value = cell3.getStringCellValue();  
			    			
			    			if (value.equals("yes"))
			    			{			    				
			    				y3 ++;			    				
			    			}
			    			else if(value.equals("no"))
			    			{
			    				n3 ++;			    				
			    			}
			    	  
			    	}
			    	  
			    	  row = sheet.getRow(rowIndex);
			    	  Cell cell4 = row.getCell(4);
			    	  
			    	  if (row != null) 
			    	  {
			    	    

			    			value = cell4.getStringCellValue();  
			    			
			    			if (value.equals("yes"))
			    			{			    				
			    				y4 ++;			    				
			    			}
			    			else if(value.equals("no"))
			    			{
			    				n4 ++;			    				
			    			}
			    	  
			    	}
			    	  row = sheet.getRow(rowIndex);
			    	  Cell cell5 = row.getCell(5);
			    	  
			    	  if (row != null) 
			    	  {
			    	    

			    			value = cell5.getStringCellValue();  
			    			
			    			if (value.equals("yes"))
			    			{			    				
			    				y5 ++;			    				
			    			}
			    			else if(value.equals("no"))
			    			{
			    				n5 ++;			    				
			    			}
			    	  
		    	}
			   
	
		      
		    }
 
			    
		}
		
	}
	
}



