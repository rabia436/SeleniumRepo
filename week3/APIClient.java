package assignments.week3;

public class APIClient {
	public void sendRequest(String endpoint) 
	{
		System.out.println(endpoint);
		
	}
	public void sendRequest(String endpoint, String requestBody,boolean requestStatus)
	{
		System.out.println(endpoint);
		System.out.println(requestBody);
		System.out.println(requestStatus);
	}
	public static void main(String[] args) 
	{
		APIClient obj=new APIClient();
		obj.sendRequest("xyz");
		obj.sendRequest("abc", "abc@gmail.com" , false);	
	}

}
