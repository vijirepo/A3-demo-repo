package org.cap.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {

	public static void display(List<Integer> lst) {
		long count= lst.stream()
			.count();
		System.out.println("No of elements:" + count);
	}
	
	public static void main(String[] args) {
		display(Arrays.asList(12,34,56,67,78,7823,12));
	}

}
