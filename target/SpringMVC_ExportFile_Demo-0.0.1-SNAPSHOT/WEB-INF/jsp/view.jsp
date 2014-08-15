<%@ page language="java" pageEncoding="UTF-8"%>  
<a href="<%=request.getContextPath()%>/view.form?method=pdftest" target="blank">保存pdf</a>
<input name="button" type="button" id="button" value="保存excel"
onclick="javascript:window.open('<%=request.getContextPath()%>/view.form?method=exceltest');"/>