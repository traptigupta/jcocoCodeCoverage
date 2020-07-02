package com.jd.jacoco.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping(path = "/test/{param}")
	public String codeCoverageMethod(@PathVariable int param) {

		if (param < 10 && param > 5 ) {
			return callingThisMethodwithLessThan10(param);
		}
		else  if (param < 50 && param > 5){
			return callingAnotherMethodwithLessThan50(param);
		}
		else  if (param <100 && param > 5){
			return callingThisMethodwithLessThan100(param);
		}
		else  if (param <150 && param > 5){
			return callingAnotherMethodwithLessThan150(param);
		}
		else  if (param <200 && param > 5){
			return callingThisMethodwithLessThan200(param);
		}
		else
			return callingLowestNumberMethod(param);
		
		
	}

	private String callingThisMethodwithLessThan10(int param) {

		System.out.println("Calling this method with param Less Than 10");
		if (param > 10) {
			System.out.println("This code cannot be called..");
		}
		return "Calling this method with param LessThan 10.";
	}
	private String callingAnotherMethodwithLessThan50(int param) {

		System.out.println("Calling this method with param Less Than 50");
		if (param > 50) {
			System.out.println("This code cannot be called..");
		}
		return "Calling this method with param LessThan 50.";
	}
	private String callingThisMethodwithLessThan100(int param) {

		System.out.println("Calling this method with param Less Than 100");
		if (param > 100) {
			System.out.println("This code cannot be called..");
		}
		return "Calling this method with param LessThan 100.";
	}
	
	private String callingAnotherMethodwithLessThan150(int param) {

		System.out.println("Calling this method with param Less Than 150");
		if (param > 150) {
			System.out.println("This code cannot be called..");
		}
		return "Calling this method with param LessThan 150.";
	}
	private String callingThisMethodwithLessThan200(int param) {

		System.out.println("Calling this method with param Less Than 200");
		if (param > 200) {
			System.out.println("This code cannot be called..");
		}
		return "Calling this method with param LessThan 200.";
	}
	private String callingLowestNumberMethod(int param) {

		System.out.println("Calling lowest number method.");
		return "Calling lowest number method.";
	}

}
