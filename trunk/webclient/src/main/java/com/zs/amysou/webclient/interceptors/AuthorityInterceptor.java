package com.zs.amysou.webclient.interceptors;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AuthorityInterceptor extends AbstractInterceptor{
	
	private final static Logger logger = Logger.getLogger(AuthorityInterceptor.class);

	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		logger.info("Action执行前插入 代码");      
		//执行目标方法 (调用下一个拦截器, 或执行Action)    
		final String res = invocation.invoke();    
		logger.info("Action执行后插入 代码");    
		return res;    
	}

}
