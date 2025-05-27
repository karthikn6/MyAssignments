package week3.day7;

public class APIClient {

	public void sendRequest(String endpoint) {
		System.out.println("endpoint");
}

	public void sendRequest(String endpoint,String requestBody,boolean requestStatus) {
	     System.out.println("endpoint");
	     
	   if(requestStatus== true) {
		  System.out.println("The request is success"); }
	   else {
		   System.out.println("The request is not success");
	   }
	}
	   public static void main(String[] args) {
		   APIClient ac = new APIClient();
		   ac.sendRequest("Text");
		   ac.sendRequest("Text1", "Text2", false);
		   
	   }
	}

