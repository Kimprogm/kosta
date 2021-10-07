public class Condition {

	public static void main(String[] args) {
		
		//if(조건문 a>b){}	if(논리형){}
		int gend = 1;
		if(gend == 1 || gend == 3) {
			System.out.println("남자");
		}
		//if else(else 단독으로는 사용 불가)
		if(gend == 1 || gend == 3) {
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
		//if else if
		int hour = 16;
		if(hour >= 12 && hour <= 15) {
			System.out.println("점심");
		}else if(hour >= 6 && hour < 12) {
			System.out.println("아침");
		}else {
			System.out.println("저녁");
		}
		
		//연도에 해당하는 12지를 출력하시오.
		//나눈 나머지가 0이면 원숭이, 1닭, 2개, 3돼지, 4쥐, 5소, 6호랑이, 7토끼, 8용, 9뱀, 10말, 11양
		int year = 2021;
		int i = year % 12;
		String s = "의 해입니다.";
		if(i == 0) {
			System.out.println("원숭이" + s);
		}else if(i == 1) {
			System.out.println("닭" + s);
		}else if(i == 2) {
			System.out.println("개" + s);
		}else if(i == 3) {
			System.out.println("돼지" + s);
		}else if(i == 4) {
			System.out.println("쥐" + s);
		}else if(i == 5) {
			System.out.println("소" + s);
		}else if(i == 6) {
			System.out.println("호랑이" + s);
		}else if(i == 7) {
			System.out.println("토끼" + s);
		}else if(i == 8) {
			System.out.println("용" + s);
		}else if(i == 9) {
			System.out.println("뱀" + s);
		}else if(i == 10) {
			System.out.println("말" + s);
		}else if(i == 11) {
			System.out.println("양" + s);
		}else {
			System.out.println("잘못된 값입니다.");
		}

		//상반기 급여의 월평균을 계산하시오. 평균 급여값은 소숫점이하값을 정확히 갖는다.
		//상반기 평균급여가 15미만이면 C등급, 15~30 B, 31~45 A, 45초과는 A+등급으로 출력하시오.
		int sal1 = 41;
		int sal2 = 25;
		int sal3 = 25;
		int sal4 = 33;
		int sal5 = 44;
		int sal6 = 55;
		int total = sal1 + sal2 + sal3 + sal4 + sal5 + sal6;
		double salAver = total / 6.0;
		System.out.println("상반기 평균급여: " + salAver);
		
		String grade = "등급입니다.";
		if(salAver < 15) {
			System.out.println("C" + grade);
		}else if(salAver <= 30) {
			System.out.println("B" + grade);
		}else if(salAver <=45) {
			System.out.println("A" + grade);
		}else if(salAver > 45) {
			System.out.println("A+" + grade);
		}else {
			System.out.println("잘못된 값입니다.");
		}
		
		String s1 = new String("가나다");
		String s2 = new String("가나다");
		System.out.println(s1 == s2); //false
		System.out.println(s1.equals(s2)); //true 문자열은 .equals 메서드로 비교해야함.
		
		double r = Math.random(); //0.0 <= r < 1.0 .random 메서드는 랜덤값 생성해주는 메서드
		System.out.println(r);
		int intR = (int)(r * 3) + 1;
		System.out.println(intR);
		
		//
		double userR = Math.random();//가위, 바위, 보
		int user = (int)(userR * 3) + 1;
		System.out.println("랜덤 값: " + intR);
		System.out.println("사용자 값: " + user);
		if(intR == user) {
			System.out.println("비겼습니다.");
		}else {
//			if((intR == 1 && user == 2) || (intR == 2 && user == 3) || (intR == 3 && user == 1)) {
//				System.out.println("이겼습니다.");
//			}else {
//				System.out.println("졌습니다.");
//			} 문제 안에 숨겨진 규칙성을 발견하여 수학적 공식화하는 것이 중요하다.
			if(user - (intR%3) == 1) {
				System.out.println("이겼습니다.");
			}else {
				System.out.println("졌습니다.");
			}
		}
	
		
		//switch(표현식) {} 표현식에 들어갈 수 있는 자료형: byte, short, int, char, String만 가능하다. long, float, double은 사용불가.
		switch(i) {
		case 0:
			System.out.println("원숭이" + s);
			break; //switch를 탈출하려면 끝에 break를 넣어줘야한다. 필수!
		case 1:
			System.out.println("닭" + s);
			break;
		case 2:
			System.out.println("개" + s);
			break;
		case 5:
			System.out.println("소" + s);
			break;
		default: //if문에서 else문에 해당하는 구문
			System.out.println("그외의 동물");
		}
	}

}
