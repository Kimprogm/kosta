import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		//while
		int num = 0;
		/*num++; //1
		num++; //2
		num++;... //3*/
		
		//5번 num 변수값을 1증가하기
		int i = 0;
		while(i < 5) {
			num++;
			i++; //반복횟수
			System.out.println("반복횟수: " + i + ", num변수값: " + num);
		}
		
		int numf;
		System.out.println("----for.1----");
		numf = 1;
		for(i = 0; i < 5; i++) {
			System.out.println(numf);
			numf++;
		}
		System.out.println("--------");
		
		num = 1;
		i = 0;
		while(i<5) {
			num *= 3;
			i++;
			System.out.println("반복횟수: " + i + ", num변수값: " + num);
		}
		
		System.out.println("----for.2----");
		numf = 1;
		for(i = 0; i < 5; i++) {
			numf*= 3;
			System.out.println(numf);
			}
		System.out.println("--------");
		
		num = 1;
		int sum = 0;
		while(num <= 10) {
			sum += num;
			num++;
		}
		System.out.println("1~10까지의 합을 구하시오" + sum);
		
		System.out.println("----for.3----");
		sum = 0;
		for(i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println("--------");
		
		//1~10까지의 숫자를 출력하시오
		System.out.println("1~10까지의 숫자를 출력하시오");
		num = 1;
		while(num <= 10) {
//			System.out.println(num);
//			num++;
			System.out.println(num++);
		}
		
		System.out.println("----for.4----");
		for(numf = 1; numf <= 10; numf++) {
			System.out.println(numf);
		}
		System.out.println("--------");
		
		//1~10까지의 숫자 중 홀수를 출력하시오
		System.out.println("1~10까지의 숫자 중 홀수를 출력하시오");
		num = 1;
		while(num <= 10) {
			System.out.println(num);
			num += 2;
		}
		
		System.out.println("----for.5----");
		for(numf = 1; numf <= 10; numf+=2) {
			System.out.println(numf);
		}
		System.out.println("--------");
		
		
		//1~10까지의 숫자 중 홀수의 합을 구하여 출력하시오
		System.out.println("1~10까지의 숫자 중 홀수의 합을 구하여 출력하시오");
		int oddSum = 0;
		num = 1;
		while(num <= 10) {
			oddSum += num;
			num += 2;
		}
		System.out.println(oddSum);
		
		//내가 한 방법
		num = 1;
		int cnt = 0;
		while(cnt < 10) {
			if((num % 2) == 1) {
				System.out.println(num);
				cnt++;
			}
			num++;
		}
		
		//A, B, C, D, E, F, G를 출력하시오
		char c = 'A';
		while(c <= 'G') {
			System.out.println(c);
			c++;
		}
		System.out.println("for-ascii");
		for(char ca = 'A'; ca <= 'G'; ca++) {
			System.out.println(ca);
		}
		System.out.println("----------");
		
		//키보드로 값 입력하기
		Scanner sc = new Scanner(System.in);
		
//		cnt = 0;
//		while(cnt < 10) {
//			System.out.println("입력하세요: ");
//			String readValue = sc.nextLine();
//			System.out.println("입력하신 값은 " + readValue + "입니다.");
//			cnt++;
//		}
		String readValue = "";
//		while(!readValue.equals("quit")) {
//			System.out.println("입력하세요(종료하려면 quit을 입력하세요): ");
//			readValue = sc.nextLine();
//			System.out.println("입력하신 값은 " + readValue + "입니다.");
//		}
//		System.out.println("---for.6---"); //증감식이 필요없는 반복문은 for문보다 while문이 낫다.
//		for( ; !readValue.equals("quit"); ) {
//			System.out.println("입력하세요(종료하려면 quit을 입력하세요): ");
//			readValue = sc.nextLine();
//			System.out.println("입력하신 값은 " + readValue + "입니다.");
//		}
		
//		while(true) {
//			System.out.println("입력하세요(종료하려면 quit을 입력하세요): ");
//			readValue = sc.nextLine();
//			if(readValue.equals("quit")) {
//				break;
//			}
//			System.out.println("입력하신 값은 " + readValue + "입니다.");
//		}
//		System.out.println("---do while---"); //무조건 입력을 받아야 하는 경우에는 입력부터 받고 조건을 비교하는 do while문의 퍼포먼스가 제일 좋다.(최적화)
//		do {
//			System.out.println("입력하세요(종료하려면 quit을 입력하세요): ");
//			readValue = sc.nextLine();
//			System.out.println("입력하신 값은 " + readValue + "입니다.");
//		}while(!readValue.equals("quit"));
		
		//2중반복문
		//구구단 4단의 *1~*9를 출력하시오
//		int dan = 4;
//		i = 1;
//		while(i <= 9) {
//			System.out.print(dan * i + "\t");
//			i++;
//		}
		
//		int dan = 2;
//		while(dan <= 9) {
//			i = 1; //1개의 단이 끝나고 다시 1부터 곱해줘야하니 반복문 안에서 선언해줘야 초기화가 됨.
//			while(i <= 9) {
//				System.out.print(dan * i + "\t");
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}
		
		int dan = 2;
		while(dan <= 9) {
			i = 1;
			while(i <= 9) {
				///10의 배수들은 출력안함
//				if(dan * i % 10 != 0) {
//					System.out.print(dan * i + "\t");
//				}
				if(dan * i % 10 == 0) {
					i++;
					continue;
				}
				
				System.out.print(dan * i + "\t");
				i++;
			}
			System.out.println();
			dan++;
		}
		
		//피보나치 수열값을 출력하시오
		//1, 1, 2, 3, 5, 8, 13, 21....
		int fib1 = 1;
		int fib2 = 0;
		int cur = fib1 + fib2;
		cnt = 1;
		while(cnt <= 10) {
			System.out.print(cur + "\t");
			fib1 = fib2;
			fib2 = cur;
			cur = fib1 + fib2;
			cnt++;
		}
		System.out.println();
		
		//소수판별(prime number)
		
		//숫자 1부터의 합이 100미만인 최대 숫자를 출력하시오.
		System.out.println("숫자 1부터의 합이 100미만인 최대 숫자를 출력하시오.");
		int num1 = 1;
		int sumd = 0;
		do {
			sumd += num1;
			System.out.print(sumd + "\t");
			num1++;
		}while(sumd + num1 < 100);
		num1--;
		System.out.println();
		System.out.println(num1 + "입니다.");
		
		
		for(num1 = 1; sumd + num1 < 100; num1++) {
			sumd += num1;
			System.out.print(sumd + "\t");
		}
		num1--;
		System.out.println();
		System.out.println(num1 + "입니다.");
		
		
		while(sumd+num1 < 100) {
			sumd += num1;
			num1++;
			System.out.print(sumd + "\t");
		}
		num1--;
		System.out.println();
		System.out.println(num1 + "입니다.");
		
		
		
		//for
		
		
		//do while
		
		

	}

}
