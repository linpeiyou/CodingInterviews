package com.peige.test;

import java.util.Arrays;

public class MyTest {

	public static void equal(int v1, int v2) {
		if(v1 == v2) {
			System.out.println("ok");
		}
		else {
			System.out.println("error");
		}
	}
	
	public static void equal(float v1, float v2) {
		if(Math.abs(v1 - v2) < 0.0000001) {
			System.out.println("ok");
		}
		else {
			System.out.println("error");
		}
	}
	
	public static void equal(double v1, double v2) {
		if(Math.abs(v1 - v2) < 0.0000001) {
			System.out.println("ok");
		}
		else {
			System.out.println("error");
		}
	}
	
	public static void equal(boolean v1, boolean v2) {
		if(v1 == v2) {
			System.out.println("ok");
		}
		else {
			System.out.println("error");
		}
	}
	
	public static void equal(String s1, String s2) {
		if(s1.equals(s2)) {
			System.out.println("ok");
		}
		else {
			System.out.println("error");
		}
	}
	
	public static void equal(int[] arr1, int[] arr2) {
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("ok");
		}
		else {
			System.out.println("error");
		}
	}
	
	public static void equal(Object o1, Object o2) {
		if(o1.equals(o2)) {
			System.out.println("ok");
		}
		else {
			System.out.println("error");
		}
	}
}















