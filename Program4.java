package Assignment1;

//Differentiate String, StringBuffer and StringBuilder. Write a program to perform String 
//related operations using length(), isEmpty(), chatAt(), toString(), equals(), compareTo(), 
//contains(), indexOf(), lastIndexOf(), startsWith(), endsWith(), matches(), substring(), 
//toLowerCase(), trim(), replace(), split(), join(), and valueOf().

public class Program4 {
	public static void main(String[] args) {
		 String s1 = " Hello World ";
		 String s2 = "Hello World";
		 
		 System.out.println("Length: " + s1.length());
		 System.out.println("Is Empty : " + s1.isEmpty());
		 System.out.println("Char at index 2 : " + s1.charAt(2));
		 System.out.println("ToString : " + s1.toString());
		 System.out.println("Equals : " + s1.equals(s2));
		 System.out.println("CompareTo() : " + s1.compareTo(s2));
		 System.out.println("contains() : " + s1.contains(s2));
		 System.out.println("startsWith() : " + s1.startsWith(" He"));
		 System.out.println("EndsWith World : " + s1.endsWith("World"));
		 System.out.println("Matches regex : " + s2.matches("[A-Za-z]+"));
		 System.out.println("Substring (2 to 7) : " + s1.substring(2, 7));
		 System.out.println("Lowercase : " + s1.toLowerCase());
		 System.out.println("Trimmed : " + s1.trim());
		 System.out.println("Replace Java with python : " + s1.replace("Java" , "Python"));
		 
		 String[] words = s2.split(" ");
		 System.out.println("Split : ");
		 
		 for(String w : words) {
			 System.out.println(w);
		 }
		 
		 String joined = String.join("-", words);
		 System.out.println("Joined : " + joined);
		
		 int num = 100;
		 String value = String.valueOf(num);
		 System.out.println("ValueOf : " + value);
	}
}
