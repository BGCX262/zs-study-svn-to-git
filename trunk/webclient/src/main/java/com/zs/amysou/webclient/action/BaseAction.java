package com.zs.amysou.webclient.action;

import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@Result(name="index",location="/index.jsp")
public class BaseAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	
	public final static String INDEX = "index";
	
	public String index(){
		return INDEX;
	}
	
	public String execute(){
		index();
		return INDEX;
	}
}
