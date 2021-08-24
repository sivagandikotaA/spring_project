package com.example.books.exceptions;

public class RequirFields extends Exception {
	public RequirFields() {
		super("enter reqired fields");

	}

	public RequirFields(String value) {
		super("enter reqired fields");
	}

}
