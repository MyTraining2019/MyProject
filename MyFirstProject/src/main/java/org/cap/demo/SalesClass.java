package org.cap.demo;

public class SalesClass {
	
	private int[] arr= {1,34,56,7};
	
	public int show() {
		int sum=0;
		for(int num:arr) {
			sum+=num;
			System.out.println(num);
		}
		return sum;
	}

}
