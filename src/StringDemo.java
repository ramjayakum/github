
public class StringDemo {

	public static void main(String[] args) {

		String s = "Ramjayakumar";
		String s1="Venkatachalam";
		
		// To find the length of String
		int l = s.length();
		System.out.println("To find the length of String :"+l);

		// To pickup Only one letter from String
		
		 char m=s.charAt(7);
		 System.out.println("To pickup Only one letter from String :" +m);
		 
		 //char a=s.charAt(13);
		 //System.out.println(a);
		 
		 // Convert all letter to uppercase 
		 
		String b= s.toUpperCase();
		System.out.println("Convert all letter to uppercase :"+b);
		
		 // Convert all letter to lowercase 
		 
		String c= s.toLowerCase();
		System.out.println("Convert all letter to lowercase :" +c);
		
		//To find the index position 
		
		int d=s.indexOf("k");
		System.out.println("To find the index position :" +d);
		
		int e=s.indexOf("v");
		System.out.println("To find the without index position :" +e);
		
		//To find out the  last index position
		
		int f=s.lastIndexOf("m");
		System.out.println( "To find out the  last index position :" +f);
		
		// To Check whether string starts with or not
		
		boolean g=s.startsWith("Ram");
		System.out.println("To Check whether string starts with or not :" + g);
		
		boolean i=s.startsWith("ram");
		System.out.println("To Check whether string starts with or not :" + i);
		
		// To Check whether string end with or not
		boolean j=s.endsWith("ar");
		System.out.println("To Check whether string end with or not :" + j);
		
		
		//Convert one letter to another
		
		 String k=s.replace("a", "&");
		System.out.println("Convert one letter to another :" + k);
		
		//check whether string contains paritcular  or not
		
		boolean m1=s.contains("Ram");
		System.out.println("check whether string contains paritcular  or not :"+m1);

		// To compare the two String 
		
		boolean o=s.equals(s1);
		System.out.println("To compare the two String :" +o);
		
		// To compare two string without case
		
	boolean q=s.equalsIgnoreCase(s1);
		System.out.println("To compare two string without case :" + q);
		
		//To Check Whether string is empty or not
		
		String c1="";
		boolean r=s.isEmpty();
		System.out.println("To Check Whether string is empty or not : " +r);
		
		// To join two String
		
	    String d1= s.concat(s1);
	    System.out.println(d1);
	    // 
	    int aa= s.compareTo(s1);
	    System.out.println(aa);
	    
	    String a=s.substring(4,11);
	    System.out.println(a);
	    String b1=s.substring(4);
	    System.out.println(b1);
	    
	    String [] b2=s.split("a");
	   for (int n=0; n < b2.length; n++) {
	    System.out.println(b2[n]);
	    
	   }    
	    
	    
	}
}
