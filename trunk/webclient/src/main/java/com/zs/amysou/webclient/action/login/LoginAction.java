package com.zs.amysou.webclient.action.login;

import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.InterceptorRefs;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import com.zs.amysou.webclient.action.BaseAction;
import com.zs.amysou.webclient.control.login.LoginControl;

@ParentPackage("default")
@InterceptorRefs({@InterceptorRef("annotatedStack")})
@Results({
	@Result(name="index",location="/hello.jsp")
})
public class LoginAction extends BaseAction{
	
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private LoginControl loginControl;
	
	private String username;
	private String password;

	public String index(){
		boolean result = loginControl.validate(username,password);
		if(result){
			return INDEX;
		}else{
			return INDEX;
		}
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
