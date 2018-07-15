package com.cleverbo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Workbook;

import net.sf.jxls.transformer.XLSTransformer;

public class XLSTransformerTest {

	private static String template = "C:\\Users\\cleverbo\\Desktop\\template01.xls";
	private static String out_template = "E:\\template01_out.xls";
	
	public static void main(String[] args) {
		List<List<Employee>> list = MockData.create2();
		try(InputStream is= new FileInputStream(template)) {
			try(OutputStream os = new FileOutputStream(out_template)){
	         XLSTransformer transformer = new XLSTransformer();  
	         Workbook workbook = transformer.transformMultipleSheetsList(is, list, Arrays.asList("财务","销售","工程师"), "depts", new HashMap(), 0);
	         workbook.write(os);
			}
		} catch (Exception e) {
		}
	}
}
