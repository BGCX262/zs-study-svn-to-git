package com.zs.amysou.webclient.dao;

import com.zs.amysou.webclient.pojo.Test;

public interface TestMapper {
	
	public void insertTest(Test test);
	
	public Test findTestById(int id);
	
	public void saveTest(Test test);
}
