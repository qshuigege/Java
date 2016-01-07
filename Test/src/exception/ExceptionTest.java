package exception;

public class ExceptionTest {
	
	static boolean bool = true;
	public static void main(String[] args) {
		int b = -1;
		try{
			b = testException();
		}catch(Exception e){
			System.out.println(b); 
			
		}

	}

	private static int testException() throws Exception {
		int i = 1;
		if (bool==true) {
			bool = false;
			i = 2;
			throw new Exception("exception test");
		}
		System.out.println("测试抛出异常后此行代码是否会执行");
		
		return i;
	
	}
}
