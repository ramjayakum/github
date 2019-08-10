package org.hcl.test.looping;

public class Address {

	public static void main(String[] args) {
		
		
		
		//for (int i=0; i < s.length(); i++ ) {
		//	boolean a=s.contains(s);
		//}
	
		String n="Ram 23 kollangari";
		if(n=="Ram 23 kollangari ") {
			System.out.println("Vaild");
		}
		else {
			System.out.println("invaild");
		}
		
		String s1="909542134522333";
		int count=0;
		for (int i=0; i<10;i++) {
			char c=s1.charAt(i);
			if(Character.isAlphabetic(c)) {
				count++;
			}
		}
		
		if(count>0) {
			System.out.println("invalid mobile number");
		}
		else {
			System.out.println("vaild");
		}
		
		String s2="Welcome to india ";
		String a1=s2.replace(" ", "#");
				System.out.println(a1);
				
			String a2=s2.toLowerCase();
			System.out.println(a2);
				
				
	}
}
