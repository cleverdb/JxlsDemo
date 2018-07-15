package com.cleverbo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;

import org.jxls.area.Area;
import org.jxls.common.CellRef;
import org.jxls.common.Context;
import org.jxls.formula.StandardFormulaProcessor;
import org.jxls.transform.Transformer;
import org.jxls.util.JxlsHelper;;

public class JxlshelperTest {
	

	//private static String template = "C:\\Users\\cleverbo\\Desktop\\template.xls";
	private static String template = "/template.xls";
	private static String out_template = "E:\\template_out.xls";
	
	
	public static void main(String[] args) {
		List<Dept> list = MockData.create();
		try(InputStream is= JxlshelperTest.class.getResourceAsStream(template)) {
			try(OutputStream os = new FileOutputStream(out_template)){
				System.out.println(System.getProperty("user.dir") );
				 Context context = new Context();
				 //Context context = PoiTransformer.createInitialContext();
		         context.putVar("depts", list);
		         context.putVar("sheetNames", Arrays.asList("财务","销售","工程师"));
		         JxlsHelper helper = JxlsHelper.getInstance();
		       /*-------------------start--原始的导出设 置，无法hide，delete模板---------------------------*/
//		      	 helper.setDeleteTemplateSheet(true);
//		         helper.setHideTemplateSheet(true);
//		         helper.processTemplate(is, os, context);
		         /*--------------------end----------------------------*/
		         
		         Transformer transformer = helper.createTransformer(is, os);
		         helper.getAreaBuilder().setTransformer(transformer);
		         List<Area> xlsAreaList = helper.getAreaBuilder().build();
		         for (Area xlsArea : xlsAreaList) {
		           xlsArea.applyAt(new CellRef(xlsArea.getStartCellRef().getCellName()), context);
		         }
		           for (Area xlsArea : xlsAreaList) {
		        	 xlsArea.setFormulaProcessor(new StandardFormulaProcessor());
		             xlsArea.processFormulas();
		         }
		         transformer.deleteSheet("template");
		         transformer.write();
		         
		         
		         //XLSTransformer transformer = new XLSTransformer();  
		         //Workbook workbook = transformer.transformMultipleSheetsList(is, list, Arrays.asList("财务","销售","工程师"), "depts", new HashMap(), 0);
		         //workbook.write(os);
			}
		} catch (Exception e) {
		}
	}

}
