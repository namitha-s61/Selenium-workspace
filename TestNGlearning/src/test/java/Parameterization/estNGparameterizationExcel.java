package Parameterization;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class estNGparameterizationExcel {

	public static ExcelReader excel = null;

	@Test(dataProvider = "getData")
	public void testData(Hashtable<String,String> data) {
		
		System.out.println(data.get("Username")+"------"+data.get("Password")+"------"+data.get("is_correct")+"------"+data.get("age")+"------"+data.get("gender"));

		//System.out.println(username + "-------" + password + "--------" + is_correct);

	}

	@DataProvider
	public static Object[][] getData() {

		if (excel == null) {

			excel = new ExcelReader("F:\\namitha\\selenium-workspace\\TestNGdata.xlsx");
		}

		String sheetname = "loginTest";
		int rows = excel.getRowCount(sheetname);
		int cols = excel.getColumnCount(sheetname);

		Object[][] data = new Object[rows - 1][1];
		
		Hashtable<String,String> table = null;

		for (int rowNum = 2; rowNum <= rows; rowNum++) {
			
			table = new Hashtable<String,String>();

			for (int colNum = 0; colNum < cols; colNum++) {

				//data[rowNum - 2][colNum] = excel.getCellData(sheetname, colNum, rowNum);
				
				table.put(excel.getCellData(sheetname, colNum, 1), excel.getCellData(sheetname, colNum, rowNum));
				data[rowNum-2][0]=table;
			}

		}

		return data;
	}

}
