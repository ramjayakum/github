package org.hcl.test.looping;

import java.util.ArrayList;
import java.util.FormattableFlags;
import java.util.List;

public class Arra {
	
	public static void main(String[] args) {
		List<Integer> li=new ArrayList<>();
		li.add(10);
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
	
	System.out.println(li);
	int si=li.size();
	System.out.println(si);
	int l=li.get(5);
	System.out.println(l);
	li.add(3, 90);
	System.out.println(li);
	int sii=li.size();
	System.out.println(sii);
	
	li.remove(2);
	System.out.println(li);
	li.set(4, 500);
	System.out.println(li);
	int k=li.lastIndexOf(60);
	System.out.println("Latst"+k);
	int n=li.indexOf(500);
	System.out.println(n);
	boolean b=li.contains(5055);
	System.out.println(b);

	List<Integer> s=new ArrayList<>();
	s.addAll(li);
	s.add(1);
	s.add(7, 2000);
	s.add(70);
	System.out.println(s);
	System.out.println(li);
	li.retainAll(s);
	System.out.println(li);
}
}