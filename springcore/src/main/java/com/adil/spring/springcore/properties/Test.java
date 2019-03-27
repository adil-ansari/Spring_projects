package com.adil.spring.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/adil/spring/springcore/properties/config.xml");
		CountriesAndLanguages countriesAndLanguages = (CountriesAndLanguages) context.getBean("countriesAndLang");
		System.out.println(countriesAndLanguages);
	}
}
