package Exception;

public class Test3 {
	public static void main(String[] args) {
		try{
			System.out.println(10/0);
			
		}
		catch (Exception e) {
		System.out.println(e);
		
		}
//		catch (ArithmeticException t) {
//	           System.out.println(t);
//		}
	}

}
