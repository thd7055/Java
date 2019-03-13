import java.util.Scanner;

public class Ex12_array {

	public static void main(String[] args) {
		/**
		 * 배열 : 같은 Type 변수들의 묶음
		 * 		배열명 - 배열이 저장되어 있는 주소를 저장한다. 
		 * 		배열 객체 생성 동시에 각 타입의 기본값으로 초기화된다.
		 */

		int arr[]; // 배열 변수 선언
		arr = new int[3]; // 배열 변수의 객체 생성
		arr[0] = 2;		// 배열 변수의 초기화
		arr[1] = 3;
		arr[2] = 4; 
//		arr[3] = 4; // ArrayIndecOutOfBoundsException
		
		int brr[] = new int[3]; // 배열 변수 선언, 객체생성
		brr[0] = 2;
		brr[1] = 3;
		brr[2] = 4;
		System.out.println(brr[1]);
		
		// 배열 변수 선언, 객체생성, 초기화를 한번에 
		// 처음 선언시에만 가능
		int crr[] = {2, 3, 4};
		
		// 배열 변수 선언, 객체생성, 초기화를 한번에  
		// 익명배열을 사용하는 경우
		int drr[] = new int[] {2, 3, 4};
		
		int err[] = new int[3];
//		err = {2, 3, 4};  선언 후 이런 방법 초기화는 불가능
		
		// 배열 3개짜리 방을 선언 후 
		// 사용자의 입력을 숫자로 3개 받아서 저장
		// 저장된 배열의 각 값을 출력, 총점, 평균 출력
		int frr[] = new int[3];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 3개 입력하세요");
		
		for (int i = 0; i < frr.length; i++) {
			frr[i] = sc.nextInt();
		}
		
		//System.out.println("입력한 숫자: " +  frr[0] + "," + frr[1] + "," + frr[2]);
		for (int i = 0; i < frr.length; i++) {
			System.out.print("[" + frr[i]+ "]");
		}
		System.out.println();
		
		
		// int sum = frr[0] + frr[1] + frr[2];
		int sum = 0;
		for (int i = 0; i < frr.length; i++) {
			sum += frr[i];
		}
		
		double avg = sum/3;
		
		System.out.println("총점: " + sum + ", 평균: " + avg);


	}

}
