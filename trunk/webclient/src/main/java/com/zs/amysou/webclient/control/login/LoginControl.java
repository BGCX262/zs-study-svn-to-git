package com.zs.amysou.webclient.control.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.zs.amysou.webclient.dao.TestMapper;
import com.zs.amysou.webclient.pojo.Test;

@Controller
public class LoginControl {

	@Autowired
	private TestMapper testMapper;
	
	public boolean validate(String username, String password) {
		Test test = testMapper.findTestById(2);
		System.out.println(test.getName());
		if(username.equals(password)){
			return true;
		}
		return false;
	}
	
	public Test findTestById(int id){
		return testMapper.findTestById(id);
	}
}
