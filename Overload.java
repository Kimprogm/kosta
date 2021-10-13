class Calculator{ //메소드 이름만 같고 매개변수가 다른 것을 메소드 오버로드라고 한다. 대표적은 메소드로 System.out.println이 있다.
	void plus(int a, int b) {
		System.out.println(a + b);
	}
	void plus(double a, double b) {
		System.out.println(a + b);
	}
	void plus(int a, int b, int c) {
		System.out.println(a + b + c);
	}
	void plus(int a, double b) {
		System.out.println(a + b);
	}
}
public class Overload {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.plus(1, 2);
		c.plus(3.5, 5.6);
		c.plus(1, 2, 3);
		
	}

}
