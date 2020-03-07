package EXCEL_UTILITY;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class excel_io_arr {
	WebDriver dr;
	public static String filename="C:\\Users\\BLTuser.BLT0210\\Desktop\\r\\Book4.xlsx",
            sheetname="Sheet1",act_res;
public static String[][] testdata;
public static int r_no,c_no;

public static String[][] get_Test_data(){
testdata=new String[1][3];
int c;String s=null,s1=null,s2=null;
for(r_no=0;r_no<=0;r_no++)
{
try
{
System.out.println("in get test data row="+ r_no);
File f= new File(filename);
FileInputStream fis=new FileInputStream(f);
XSSFWorkbook wb=new XSSFWorkbook(fis);
XSSFSheet sheet =wb.getSheet(sheetname);
XSSFRow row=sheet.getRow(r_no);
XSSFCell cell1=row.getCell(0);
testdata[r_no][0]=cell1.getStringCellValue();
System.out.println("row 1:"+testdata[r_no][0]);
XSSFCell cell2=row.getCell(1);
testdata[r_no][1]=cell2.getStringCellValue();
System.out.println("row 1:"+testdata[r_no][1]);
XSSFCell cell3=row.getCell(2);
testdata[r_no][2]=cell3.getStringCellValue();
System.out.println("row 1:"+testdata[r_no][2]);


		
}
catch(FileNotFoundException e){
	e.printStackTrace();
	}
catch(IOException e)
{
	e.printStackTrace();
}
}
return testdata;


}
/*public static void main(String[] args) {
excel_io_arr ex=new excel_io_arr();
String[][] testdata=ex.get_Test_data();
}*/
}
