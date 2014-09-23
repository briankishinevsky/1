package brian;

public class Hello {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		foo();
		System.out.println("Hello, Brian!");
	}

	private static void foo() {
		int a = 5;
		int b = 3 + a;
		System.out.println("b = "+b);
	}

}
