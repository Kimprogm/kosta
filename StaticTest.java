class B{
	int iv;
	static int sv;
	
	void im() {
		sm();//this.sm()
		System.out.println(iv);//this.iv
		System.out.println(sv);//this.sv
	}
	static void sm() {
		//im();//this.im();static메서드 안에서는 this사용 불가능
		//System.out.println(iv);
	}
}
/**
 * static변수: 객체와 무관한 객체들간의 공유변수로 사용됨
 * 			  클래스로드 후 자동 초기화된다.
 * 			  사용법 - 객체참조변수.static변수
 * 					 클래스명.static변수
 * static메서드: 객체와 무관한 기능제공
 * 			   static메서드 내부에서는 this사용못함, 인스턴스메서드 사용못함, 인스턴스 변수 사용못함.
 * ex)Math.random();
 * @author ASUS H310M-E
 *
 */

public class StaticTest {

	public static void main(String[] args) {
		B b1 = new B();
		B b2 = new B();
		b1.iv =  10;
		System.out.println(b1.iv);//10
		System.out.println(b2.iv);//0
		
		System.out.println(b1.sv);//0
		System.out.println(B.sv);//0
	}

}
