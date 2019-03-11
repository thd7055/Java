import java.util.Scanner;

public class Ex05_switchCase {

	public static void main(String[] args) {
		
		// 자바의 흐름제어 : 삼항연산자, if ~ else, switch ~ case
		
		/*
			switch(조건값){  // int형 범위 이내의 정수 or 문자열String
			case 값1:	-> 라벨
				실행문;
				break; 	-> switch문을 빠져나가는 실행문
			case 값1:
				실행문;
				break;
			default : 	-> 조건값과 같은 case절이 하나도 없을 경우 실행된다. 순서상관없다.
			 	실행문;
			 	break;
			}
		*/

		int num = 2;
		switch(num){
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
			break;
		default:
			System.out.println("같은 것이 없다");
			break;
		}
		
		// 10 9  수, 8 우, 7 미, 6 양, 나머지 가 
		num = 8;
		switch(num){
		case 10:
		case 9:
			System.out.println("수");
			break;
		case 8:
			System.out.println("우");
			break;
		case 7:
			System.out.println("미");
			break;
		case 6:
			System.out.println("양");
			break;
		default:
			System.out.println("가");
			break;
		}

		num = 88;
		// 100 이하  90이상 수, 90 미만 80이상 우, 80 미만 70이상 미, 70미만 60이상 양 나머지 가
		switch(num/10){
		case 10:
		case 9:
			System.out.println("수");
			break;
		case 8:
			System.out.println("우");
			break;
		case 7:
			System.out.println("미");
			break;
		case 6:
			System.out.println("양");
			break;
		default:
			System.out.println("가");
			break;
		}
		
		// 사용자의 입력을 숫자로 월 (1~12) 입력을 받아서
		// 몇일까지 있는지 출력하기 Scanner활용, switch문 활용
		
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요.");
		int month = sc.nextInt();
		
		switch(month){
			case 2:
				System.out.println(month + "월은 28일까지 입니다.");
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(month + "월은 31일까지 입니다.");
				break;			
			default:
				System.out.println(month + "월은 31일까지 입니다.");
				break;
		
		}

	}

}
