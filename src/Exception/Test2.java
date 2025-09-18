package Exception;

public class Test2 {
	public static int test() {
		
	
	try {
		System.out.println("java");
		System.out.println(10/0);
		return 10/0;
	}
	catch(Throwable e) {
		System.out.println(e +"cannot divide by zero");
	}
	finally {
		return 2;
	}

}
	public static void main(String[] args) {
		//System.out.println(Test2.test());
		Test2.test();
		
	}
}