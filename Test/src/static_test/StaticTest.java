package static_test;

public class StaticTest {
	public static void main(String[] args) {
		StaticTest.test();
		StaticTest.test();
	}
	
	public static void test(){
		int i = 0;
		System.out.println(i++);
	}
}
