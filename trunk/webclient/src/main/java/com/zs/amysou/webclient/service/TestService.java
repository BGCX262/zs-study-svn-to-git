package com.zs.amysou.webclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zs.amysou.webclient.dao.TestMapper;
import com.zs.amysou.webclient.pojo.Test;

@Service
public class TestService {
	@Autowired
	private TestMapper testMapper;
	
	public Test findTestById(int id){
		return testMapper.findTestById(id);
	}
	
	@Transactional
	public void insertTest(Test test){
		testMapper.insertTest(test);
	}
	
	@Transactional
	public void insertTest(Test test,Test test2){
		testMapper.insertTest(test);
		testMapper.insertTest(test2);
	}
	
	@Transactional
	public void saveTest(Test test,Test test2){
		testMapper.saveTest(test);
		testMapper.saveTest(test2);
	}
	
	
}
