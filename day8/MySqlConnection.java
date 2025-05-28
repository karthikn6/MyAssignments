package week3.day8;

public abstract class MySqlConnection implements DatabseConnectionAbst {

	@Override
	public void connect() {
		System.out.println("Abstract connect");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Abstract disconnect");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Abstract executeupdate");
		
	}

	public abstract void executeQuery();
	
}
