package Exception;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println("this is try block");
		try {
			throw new RuntimeException("runtime error");
		}
		catch (Exception e) {
			System.out.println("Catch blok");
		}
		finally {
			System.out.println("Finnaly block");
		}
		
		
	}

}
