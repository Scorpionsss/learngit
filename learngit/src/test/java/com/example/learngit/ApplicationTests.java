package com.example.learngit;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void test(){

		System.out.println("第一次提交日期："+ new Date());

		System.out.println("第二次提交日期："+ "2020-03-04 21:33:03");

	}

}
