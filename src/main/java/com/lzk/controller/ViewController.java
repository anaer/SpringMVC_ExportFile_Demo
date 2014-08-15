package com.lzk.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lzk.common.ViewExcel;
import com.lzk.common.ViewPDF;

/**
 * 生成excel或PDF类型试图
 * 根据参数进行数据组装，并跳转到相应的视图页面
 * View Controller Bean<br>
 *
 * @author Tony Lin Created on 2008-10-22
 * @version Version 1.0
 */

@Controller
@RequestMapping("/view.form")
public class ViewController {

    @RequestMapping(params = "method=view", method = RequestMethod.GET)
    public String view(HttpServletRequest request, HttpServletResponse response) {
	return "/view";
    }

    @RequestMapping(params = "method=exceltest", method = RequestMethod.GET)
    public ModelAndView viewExcel(HttpServletRequest request, HttpServletResponse response) {
	List list = new ArrayList();
	Map model = new HashMap();
	list.add("test1");
	list.add("test2");
	model.put("list", list);
	ViewExcel viewExcel = new ViewExcel();
	return new ModelAndView(viewExcel, model);
    }

    @RequestMapping(params = "method=pdftest", method = RequestMethod.GET)
    public ModelAndView viewPDF(HttpServletRequest request, HttpServletResponse response) throws Exception {
	List list = new ArrayList();
	Map model = new HashMap();
	list.add("test1");
	list.add("test2");
	model.put("list", list);
	ViewPDF viewPDF = new ViewPDF();
	return new ModelAndView(viewPDF, model);
    }
}