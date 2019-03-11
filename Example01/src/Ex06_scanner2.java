import java.util.Scanner;

public class Ex06_scanner2 {

	public static void main(String[] args) {
		
		// 사용자의 입력을 숫자로 3개 받아서 최대값 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 3개를 입력하세요.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		System.out.println("입력된 숫자: " + num1 + ", " + num2 + ", " + num3);
		
		// 3개 이상의 데이터를 비교해서 최대값/최소값을 찾는경우 
		// 최대값을 저장할 변수
		// 1. 비교할 원소 중의 하나의 값을 사용 
		// 2. 이세상에서 존재하는 가장 작은 값 int max = Integer.MIN_VALUE;
		int max = num1; // 초기값 중요
//		if(max < num1) max = num1; 생략 가능
		if(max < num2) max = num2;
		if(max < num3) max = num3;
		System.out.println("최대값: " + max);	
				

		// 방법 2
		/*if(num1 >= num2 && num1 >= num3){
			System.out.println("최대값: " + num1);
		}else if(num2 >= num1 && num2 >= num3){
			System.out.println("최대값: " + num2);
		}else{
			System.out.println("최대값: " + num3);
		}*/
		
		
		
		// 방법 3
		/*if(num1 > num2){
			if(num1 > num3){
				System.out.println("최대값: " + num1);
			}else{
				System.out.println("최대값: " + num3);
			}
		}else if(num2 > num3){
			System.out.println("최대값: " + num2);
		}else{
			System.out.println("최대값: " + num3);
		}*/


	}

}
