package com.base.demo.plugin;

import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.Document;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;

import java.util.List;

/** 
 * @author pan.wei 
 * @date 2011-11-30 下午08:36:11 
 */  
public class MysqlPaginationPlugin extends PluginAdapter {  
  
    @Override  
    public boolean modelExampleClassGenerated(TopLevelClass topLevelClass,  
            IntrospectedTable introspectedTable) {  
        // add field, getter, setter for limit clause  
        addPage(topLevelClass, introspectedTable, "page");  
        return super.modelExampleClassGenerated(topLevelClass,  
                introspectedTable);  
    }  
  
    @Override  
    public boolean sqlMapDocumentGenerated(Document document,  
            IntrospectedTable introspectedTable) {  
        XmlElement parentElement = document.getRootElement();  
        // 产生分页语句前半部分  
        /*XmlElement paginationPrefixElement = new XmlElement("sql");  
        paginationPrefixElement.addAttribute(new Attribute("id",  
                "MysqlDialectPrefix"));  
        XmlElement pageStart = new XmlElement("if");  
        pageStart.addAttribute(new Attribute("test", "page != null"));  
        pageStart.addElement(new TextElement(  
                "  "));  
        paginationPrefixElement.addElement(pageStart);  
        parentElement.addElement(paginationPrefixElement);  */
  
        // 产生分页语句后半部分  
        XmlElement paginationSuffixElement = new XmlElement("sql");  
        paginationSuffixElement.addAttribute(new Attribute("id",  
                "MysqlDialectSuffix"));  
        XmlElement pageEnd = new XmlElement("if");  
        pageEnd.addAttribute(new Attribute("test", "page != null"));  
        pageEnd.addElement(new TextElement("<![CDATA[ limit #{page.begin} , #{page.length} ]]>"));  
        paginationSuffixElement.addElement(pageEnd);  
        parentElement.addElement(paginationSuffixElement);  
  
        return super.sqlMapDocumentGenerated(document, introspectedTable);  
    }  
  
    @Override  
    public boolean sqlMapSelectByExampleWithoutBLOBsElementGenerated(  
            XmlElement element, IntrospectedTable introspectedTable) {  
  
        XmlElement pageStart = new XmlElement("include"); //$NON-NLS-1$     
        pageStart.addAttribute(new Attribute("refid", "MysqlDialectPrefix"));  
        //element.getElements().add(0, pageStart);  
  
        XmlElement isNotNullElement = new XmlElement("include"); //$NON-NLS-1$     
        isNotNullElement.addAttribute(new Attribute("refid",  
                "MysqlDialectSuffix"));  
        element.getElements().add(isNotNullElement);  
  
        return super.sqlMapUpdateByExampleWithoutBLOBsElementGenerated(element,  
                introspectedTable);  
    }  
  
    /** 
     * @param topLevelClass 
     * @param introspectedTable 
     * @param name 
     */  
    private void addPage(TopLevelClass topLevelClass,  
            IntrospectedTable introspectedTable, String name) {  
        topLevelClass.addImportedType(new FullyQualifiedJavaType(  
                "com.vrdete.pojo.Page"));  
        CommentGenerator commentGenerator = context.getCommentGenerator();  
        Field field = new Field();  
        field.setVisibility(JavaVisibility.PROTECTED);  
        field.setType(new FullyQualifiedJavaType("com.vrdete.pojo.Page"));  
        field.setName(name);  
        commentGenerator.addFieldComment(field, introspectedTable);  
        topLevelClass.addField(field);  
        char c = name.charAt(0);  
        String camel = Character.toUpperCase(c) + name.substring(1);  
        Method method = new Method();  
        method.setVisibility(JavaVisibility.PUBLIC);  
        method.setName("set" + camel);  
        method.addParameter(new Parameter(new FullyQualifiedJavaType(  
                "com.vrdete.pojo.Page"), name));  
        method.addBodyLine("this." + name + "=" + name + ";");  
        commentGenerator.addGeneralMethodComment(method, introspectedTable);  
        topLevelClass.addMethod(method);  
        method = new Method();  
        method.setVisibility(JavaVisibility.PUBLIC);  
        method.setReturnType(new FullyQualifiedJavaType(  
                "com.vrdete.pojo.Page"));  
        method.setName("get" + camel);  
        method.addBodyLine("return " + name + ";");  
        commentGenerator.addGeneralMethodComment(method, introspectedTable);  
        topLevelClass.addMethod(method);  
    }

	@Override
	public boolean validate(List<String> arg0) {
		return true;
	}  
  
}  
