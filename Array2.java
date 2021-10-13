
public class Array2 {

	public static void main(String[] args) {

		int arr[] = {1, 2, 3, 4};
		//arr = {0, 1}; 배열 재초기화 안됨.
		arr = new int[] {0, 1}; //배열 재초기화
		
		char alpha[] = new char[5];
//		alpha[0] = 'A';
//		alpha[1] = 'B';
//		alpha[2] = 'C';
//		alpha[3] = 'D';
//		alpha[4] = 'E';
		
		for(int i = 0; i < alpha.length; i++) {
			alpha[i] = (char) ('A' + i);
			System.out.print(alpha[i] + "\t");
		}
		System.out.println();
		
		//1~10사이의 배열
		arr = new int[] {1, 4, 3, 2, 10, 4, 2, 7, 3, 1, 1};
		//각 숫자의 출현횟수를 출력하시오.
		int cntArr[] = new int[10]; //출현횟수가 저장될 배열
									//cntArr[0]은 1의 출현횟수가 저장될 공간
		for(int j = 0; j < arr.length; j++) {
			int num = arr[j]; //i = 0, num = 1,		i = 1, num = 4
			cntArr[num - 1]++;//cntArr[1-1]++,		cntArr[4-1]++
		}
		for(int j =0; j < cntArr.length; j++) {
			System.out.println((j+1) + "의 출현횟수: " + cntArr[j]);
		} //디버그 해볼 것
		
		//로또값 출력하기
		int lotto[] = new int[6];
		int save[] = new int[6];
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			
			for(int j = 0; j < i; j++) {
				if(lotto[j] == lotto[i]) {
					i--;
					break;
				}
			}
		}
//		for(int i = 0; i < lotto.length; i++) {
//			if(lotto[i] < )
//			save[i] = lotto[i];
//			
//		} //로또값 작은 것부터 출력하는 것 만들어보기.
		
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + "\t");
		}
		System.out.println();
		
		//2차원 배열
		char star[][] = new char[5][];
		star[0] = new char [1];
		
		for(int i = 0; i < star.length; i++) {
			star[i] = new char[i +1];
			System.out.print(star[i].length + "\t");
		}
		System.out.println();
		
		for(int i = 0; i < star.length; i++) {
			for(int j = 0; j < star[i].length; j++) {
				star[i][j] = '*';
				System.out.print(star[i][j] + "\t");
			}
			System.out.println();
		}
		
		int arr2[][] = new int[3][3];
		int num = 1;
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = num;
				num++;
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println();
		}
		
		//최대값구하기, 최소값구하기, 정렬하기(종류, 특징, 구현: 선택정렬, 버블정렬)
		int arr3[] = {4, 8, 3, 7, 2, 5};
		int maxNum = 0;
		for(int i = 0; i < arr3.length; i++) {
			if(maxNum < arr3[i]) {
				maxNum = arr3[i];
			}
		}
		System.out.println("최대값: " + maxNum);
		
		java.util.Arrays.sort(arr3); //오름차순 정렬용 라이브러리
		for(int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		
		
		
	}

}
