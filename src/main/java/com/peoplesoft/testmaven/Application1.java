package com.peoplesoft.testmaven;

import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class Application1 {
	
	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("please provide a numeric string");
		if (isNumeric(scanner.nextLine()))
			System.out.println("Right");
		
		else 
			System.out.println("Wrong");
		
		scanner.close();

	}
	
	private static boolean isNumeric(String line) {
		return StringUtils.isNumeric(line);
	}

}
