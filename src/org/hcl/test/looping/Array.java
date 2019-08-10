package org.hcl.test.looping;

public class Array {
	
	public static void main(String[] args) {
		
		int a[]={1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		for(int num:a) {
			double avg=sum/num;
		}
		
		
		
		System.out.println("Enter the sum of values :" +sum);
		
	}

}
