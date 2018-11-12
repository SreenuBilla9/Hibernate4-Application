package com.banking.retail.util;

public class HelloLogger {

	public static void trace(String message) {
		System.out.println(message);
	}

	public static void info(String message) {
		System.out.println(message);
	}

	public static void debug(String message) {
		System.out.println(message);
	}

	public static void warn(String message) {
		System.out.println(message);
	}

	public static void error(String message) {
		System.out.println(message);
	}

	public static void error(Throwable t) {
		System.err.println(t);
	}

	public static void error(Exception e) {
		System.err.println(e);
	}
}
