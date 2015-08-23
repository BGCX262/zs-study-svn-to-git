package com.zs.amysou.webclient.action;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

@Results({
	@Result(name="index",location="/hello.jsp")
})
public class Test2Action extends BaseAction{
	private static final long serialVersionUID = 1L;
	
	public String index(){
		System.out.println(121212);
		return INDEX;
	}
}
