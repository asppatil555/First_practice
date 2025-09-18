package Exception;

public class Test4 {
		public void m1(int a) {
		
		try {
			
			if(a==1) {
		
			}
			else {
				throw new NullPointerException();
			}
			
		}
		catch(Exception e) {
			System.out.println(e+" not found");
		}
	}
		
		public static void main(String[] args) {
			Test4 t=new Test4();
			t.m1(5);
		}

}
