package com.cleverbo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Workbook;
import org.jxls.area.Area;
import org.jxls.builder.AreaBuilder;
import org.jxls.builder.xls.XlsCommentAreaBuilder;
import org.jxls.common.CellRef;
import org.jxls.common.Context;
import org.jxls.formula.FastFormulaProcessor;
import org.jxls.formula.FormulaProcessor;
import org.jxls.formula.StandardFormulaProcessor;
import org.jxls.transform.Transformer;
import org.jxls.util.JxlsHelper;

import net.sf.jxls.transformer.XLSTransformer;

public class DemoMain {
	private static String template = "C:\\Users\\cleverbo\\Desktop\\template.xls";
	private static String out_template = "E:\\template_out.xls";
	private AreaBuilder areaBuilder = new XlsCommentAreaBuilder();
	
	public static void main(String[] args) {
		List<Dept> list = MockData.create();
		try(InputStream is= new FileInputStream(template)) {
			try(OutputStream os = new FileOutputStream(out_template)){
				 Context context = new Context();
				 //Context context = PoiTransformer.createInitialContext();
		         context.putVar("depts", list);
		         context.putVar("sheetNames", Arrays.asList("财务","销售","工程师"));
		         JxlsHelper helper = JxlsHelper.getInstance();
		      	 helper.setDeleteTemplateSheet(true);
		         helper.setHideTemplateSheet(true);
		         helper.processTemplate(is, os, context);
//		         Transformer transformer = helper.createTransformer(is, os);
//		         helper.getAreaBuilder().setTransformer(transformer);
//		         List<Area> xlsAreaList = helper.getAreaBuilder().build();
//		         for (Area xlsArea : xlsAreaList) {
//		           xlsArea.applyAt(new CellRef(xlsArea.getStartCellRef().getCellName()), context);
//		         }
//		           for (Area xlsArea : xlsAreaList) {
//		        	 xlsArea.setFormulaProcessor(new StandardFormulaProcessor());
//		             xlsArea.processFormulas();
//		         }
//		         transformer.deleteSheet("sheet1");
//		         transformer.write();
//		         
		         
		         //XLSTransformer transformer = new XLSTransformer();  
		         //Workbook workbook = transformer.transformMultipleSheetsList(is, list, Arrays.asList("财务","销售","工程师"), "depts", new HashMap(), 0);
		         //workbook.write(os);
			}
		} catch (Exception e) {
		}
	}
}
