package assignments.week3;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1="stops";
		String text2="potss";
		if(text1.length()!=text2.length()) 
		{
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
			
		}
		else {
			char[]charArray1=text1.toCharArray();
			char[]charArray2=text2.toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			System.out.println("charArray1"+Arrays.toString(charArray1));
			System.out.println("charArray2"+Arrays.toString(charArray2));
		
		if(Arrays.equals(charArray1, charArray2)) 
		{
			System.out.println("The given strings are Anagram.");
		}
		else
		{
			System.out.println("The given strings are not an Anagram.");
		}
		
		}
		
	}

}
