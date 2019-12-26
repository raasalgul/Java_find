package com.string;

public class FormatMethod {
	private static String template = "Hello, %s!";
	public static void main(String[] args) {
		template=String.format(template,"Sathish");
	System.out.println(template);
	}

}
