
public class Array1 { //array는 동일 자료형의 묶음이다.

	public static void main(String[] args) {
		
		int sal[] = new int[6];
		sal[0] = 41;
		sal[1] = 25;
		sal[2] = 25;
		sal[3] = 33;
		sal[4] = 44;
		sal[5] = 55;
		System.out.println("1월 급여: " + sal[0] + "0만원 입니다.");
		
		System.out.println("배열 길이: " + sal.length);
		
		int arr[] = {1, 3, 5};
		System.out.println(arr[0]);
		System.out.println(arr[2]);
		System.out.println(arr.length);
		
		int salTotal = 0;
		int monthCnt = sal.length;
		double salAver = 0.0;
		for(int index = 0 ; index < monthCnt ; index++) {
			salTotal += sal[index];
		}
		salAver = (double)salTotal / monthCnt;
		System.out.println(monthCnt + "개월의 총급여: " + salTotal);
		System.out.println(monthCnt + "개월의 평균 급여: " + salAver);
		
		int arr1[] = new int[10];
		int arrInLen = arr1.length;
		for(int index1 = 0; index1 < arrInLen; index1++) {
			arr1[index1] = index1+1;
			System.out.print(arr1[index1] + "\t");
		}
		System.out.println();
		
	}

}
