package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转controller
 * <p>Title: PageController</p>
 * <p>Description: </p>
 * <p>Company:</p> 
 * @author	钟欣江
 * @date	2017年9月8日上午10:50:30
 * @version 1.0
 */

@Controller
public class PageController {

	
/**
 * 打开首页	
 */

@RequestMapping("/")	
public String showIndex(){
	return "index";
}

/**
 * 展示其他界面
 */

@RequestMapping("/{page}")
public String showPage(@PathVariable String page){
	return page;
}
}
