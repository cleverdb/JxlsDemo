# JxlsDemo
Jxls多sheet页demo

1.解决了多sheet页导出时候模板定义页无法删除，无法隐藏
2.新增冻结窗口接口

example：
//JxlsHelper helper = JxlsHelper.getInstance();
//helper.setSourceSheetName("template");
//helper.setFreezePane(0, 1, 0, 1).setDeleteTemplateSheet(true).processTemplate(is, os, context);

helper.setSourceSheetName("template");
* 定义模板页名称，默认是创建excel时指定的sheet1,若修改，需通过setSourceSheetName("template")设置；
helper.setFreezePane(0, 1, 0, 1)
* 设置冻结窗口，参数见poi设置
setDeleteTemplateSheet(true)
* 删除模板，官方版本设置无效果
