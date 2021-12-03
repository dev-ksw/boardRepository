package org.zerock.service;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@Log4j
@ContextConfiguration({ "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class SampleServiceTests {
	
	@Setter(onMethod_ = @Autowired)
	private SampleService service;

	@Test
	public void test01_CheckInstance() {
		
		log.info(service);
		log.info(service.getClass().getName());
	}
	
	@Test
	public void test02_doAddMethod() throws Exception{
		
		log.info(service.doAdd("123", "456"));
	}
	
	@Test
	public void test03_doAddError() throws Exception{
		
		log.info(service.doAdd("123", "ABC"));
	}
}
