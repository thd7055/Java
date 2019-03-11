import java.util.Scanner;

public class Ex10_while {

	public static void main(String[] args) {
		/*
		 * 자바의 반복문 : while for : 몇 회 or 얼마까지 반복할지 미리 알고 있는 경우 사용 while : 반복 횟수를 모를 경우 사용
		 */

		// while(조건식){ // 조건식 : boolean 타입
		// 반복할 실행문;
		// }

		int num = 3; // 초기식
		while (num > 0) { // 조건식
			System.out.println(num); // 반복할 실행문
			num--; // 증감식
		}
		System.out.println("while end");

		// 위 while문을 for문으로 변경
		for (int i = 3; i > 0; i--) {
			System.out.println(i);
		}
		System.out.println("for end");

		System.out.println("=============");

		// 1 2 3 4 5
		int num1 = 1;
		while (num1 <= 5) {
			System.out.print(num1 + " ");
			num1++;
		}

		System.out.println();
		System.out.println("=============");

		// 0,1,2,3,4,5,6
		int num2 = 0;
		while (num2 <= 6) {
			if (num2 < 6) {
				System.out.print(num2 + ", ");
			} else {
				System.out.print(num2);
			}
			num2++;
		}

		System.out.println();
		System.out.println("=============");

		// 13, 26, 39 ....., ???? 네자리수 중 13의 배수까지
		int count = 13;
		while (count <= 9999) {
			if (count != 13) {
				System.out.print("," + count);
			} else {
				System.out.print(count);
			}
			count += 13;
		}

		System.out.println();
		System.out.println("=============");

		// 사용자의 입력을 숫자로 받아서 출력
		// 0을 입력하는 순간 종료
		num = -1;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("숫자를 입력하세요.");
			num = sc.nextInt();
			if (num == 0) { // 반복문 종료
				System.out.println("종료");
				break; // switch문 or 가장 가까운 반복문 1개를 빠져나간다.
			}
			System.out.println("입력한 값:" + num);
		}

		System.out.println("=============");

	}

}
