package Parameterization;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
	
	@Test(dataProvider="dp1")
	public void testData(String username , String password) {
		
		System.out.println(username+"--------"+password);
	}
	
	@DataProvider(name="dp1")
	public static Object[][] getData(Method m){
		Object[][] data = null;
		
		if(m.getName().equals("testLogin")) {
		
		
		data = new Object[2][2];
		
		data[0][0] = "raman";
		data[0][1] = "sdfdsfdilf";
		
		data[1][0] = "Rahul";
		data[1][1] = "asdfhsdlkfjls";
		return data;
		}else if(m.getName().equals("testUserReg")) {
			
			data = new Object[2][3];
			
			data[0][0] = "raman";
			data[0][1] = "sdfdsfdilf";
			data[0][2] = "sdfds@gmail.com";
			
			data[1][0] = "Rahul";
			data[1][1] = "Arora";
			data[1][2] = "asdfhsdlkfjls";
			return data;
			
		}
		return data;
		
	}
}



//	@DataProvider(name="dp2")
//	public static Object[][] getData2(){
//		
//		Object[][] data = new Object[2][3];
//		
//		data[0][0] = "raman";
//		data[0][1] = "sdfdsfdilf";
//		data[0][2] = "sdfds@gmail.com";
//		
//		data[1][0] = "Rahul";
//		data[1][1] = "Arora";
//		data[1][2] = "asdfhsdlkfjls";
//		return data;
//	
//	}	
//}
