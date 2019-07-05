package org.cap.demo;

public class SalesClass {
	
	private int[] arr= {1,34,56,7};
	
	public int show() {
		
		int ans=1;
		for(int i=0;i<arr.length;i++) {
			ans*=arr[i];
		}
		System.out.println("Multiplication Value:" + ans);
		return ans;
	}

}
