package assignments.week3;

public class ReverseOddWords {

	public static void main(String[] args) {
		String text1="I am a software tester";
		String[] words1=text1.split(" ");
		String result="";
		for(int i=0;i<words1.length;i++)
		{
			if(i%2!=0)
			{
				String reversedWord="";
				for(int j=words1[i].length()-1;j>=0;j--) 
				{
					reversedWord+=words1[i].charAt(j);
					
				}
				result+=reversedWord+" ";
				
			}
			else
			{
				result+=words1[i]+" ";
			}	
		}
		System.out.println("Output:"+ result.trim());
		
		
		

	}

}
