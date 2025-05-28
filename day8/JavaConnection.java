package week3.day8;

public class JavaConnection extends MySqlConnection{

	public static void main(String[] args) {
		
		JavaConnection JC = new JavaConnection();
		JC.connect();
		JC.disconnect();
		JC.executeUpdate();
		JC.executeQuery();
		
	}

	@Override
	public void executeQuery() {
		System.out.println("Extend executeQuery");
		
	}

}
