package com.dev.rest.angular.model;

public class HelloBoot {

	String beanName;

	public HelloBoot(String beanName) {
		super();
		this.beanName = beanName;
	}

	public String getBeanName() {
		return beanName;
	}

	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	@Override
	public String toString() {
		return "HelloBoot [beanName=" + beanName + "]";
	}
	
	
}
