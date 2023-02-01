package com.app.spring.javaBased;

import org.springframework.stereotype.Component;

@Component
public class Accountant implements Employee{

	public void work() {
        System.out.println("Accountant Work Started");		
	}

}
