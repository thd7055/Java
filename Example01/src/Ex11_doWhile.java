import java.util.Scanner;

public class Ex11_doWhile {

	public static void main(String[] args) {
		/*
		 * 자바의 반복문 : do ~ while for : 몇 회 or 얼마까지 반복할지 미리 알고 있는 경우 사용 while : 반복 횟수를 모를
		 * 경우 사용 do~ while : 최소 1번 이상은 실행을 보장한다.
		 */

//		중괄호 {}를 생략할 수 없다.
//		조건식 뒤에  ; 을 붙여야 한다.
//		조건식에 사용할 변수는 do ~ while{} 블럭에 들어오기 전에 선언해야한다.
//		do{
//			반복할 실행문
//		} while(조건식); 		boolean타입

		int num = 1;
		while (num > 3) { // 조건이 거짓이라서 실행 안됨
			System.out.println(num + "(while)");
		}

		num = 1;
		do { // 한 번 이상코드가 반드시 실행된다.
			System.out.println(num + "(do~while)");
		} while (num > 3);

		for (int i = 0; i < 3; i++) {
			System.out.println(i);
		}
		// for문 안에서 선언한 변수는 밖에서 사용불가
		// i++;

		int i = 0; // do~while 문의 조건식에 사용할 변수
		do {
			System.out.println(i);
			i++;
		} while (i < 3);

		// 사용자의 입력을 숫자로 받아서 출력, 반복
		// 0을 입력시 반복 종료
		Scanner sc = new Scanner(System.in);

//		while(num != 0){	// 입력값이 0이 아니면 반복
//			// 다시 입력 작업
//			System.out.println("숫자를 입력하세요");
//			num = sc.nextInt();
//			System.out.println(num);
//		}

		System.out.println("================");

		do {
			System.out.println("숫자를 입력하세요");
			num = sc.nextInt();
			System.out.println(num);
		} while (num != 0);

	}

}
