package assignments.week3;

public class ChangeOddIndex {

	public static void main(String[] args) {
		String test="changeme";
		char[] chars=test.toCharArray();
		for(int i=0;i<chars.length;i++) 
		{
			if(i%2==0)
			{
				chars[i]=Character.toUpperCase(chars[i]);
					
			}
			
			
		}
		String result=new String(chars);
		System.out.println("Modified String:"+result);
		

	}

}
