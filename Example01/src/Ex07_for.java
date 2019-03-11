
public class Ex07_for {

	public static void main(String[] args) {
		// 반복문 : for, while, do~while
		// 실행순서 (1->2->3->4) 
		/*
			 for( 1. 초기식; 2.조건식; 4.증감식){
			 	조건식이 true일 경우
				3.반복할 실행문
			 }
		*/

		
		// 3 4 5 6
		for(int i = 3; i <= 6 ; i++){
			System.out.println(i);
		}
		
		System.out.println();   // 줄바꿈
		
		// -2 -1 0 1 2
		for(int i = -2; i <= 2 ; i++){
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// 4 3 2 1 
		for (int i = 4; i >= 1; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// -2 -3 -4 -5
		for (int i = -2; i >= -5; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// 1 22 3 44 5 66
		for (int i = 1; i <= 6; i++) {
			if( i % 2 == 0){ // 짝수
				System.out.print("" + i + i + " ");
			}else{ // 홀수
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		// abcdefghijklmnopqrstuvwxyz
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(i);
		}
		
		System.out.println();
		
		// aBcDeFgHiJkLmNoPqRsTuVwXyZ
		for(char i = 'a'; i <= 'z'; i++){
			if(i % 2 == 0){
				System.out.print((char)(i - ('a'-'A')));
			}else{
				System.out.print(i);
			}
		}
		
		System.out.println();
		
		// 1~100 까지의 숫자, 5의 배수는 5의배수라고 출력
		for(int i = 0; i <= 100; i++){
			if(i % 5 == 0){
				System.out.println("5의 배수");
			}else{
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		
		// 2019년 2월달 달력 출력
		int rest = 5;	// 밀릴 칸수 
		System.out.println("   일   월   화   수   목   금   토");
		
		for(int i = 0; i < rest; i++) {
			System.out.print("   ");
		}
		
		for(int i = 1; i <= 28; i++){
			System.out.printf("%3d", i);
			if((i+rest) % 7 == 0){
				System.out.println();
			}
		}
		
		System.out.println();
		System.out.println();
		
		// 2 4 6 8 
		for(int i = 2; i <= 8;  i+=2){
			System.out.print((i*3)/2 + " "); // 3 6 9 12
		}
		
		System.out.println();
		System.out.println();
		
		// 1~10 곱 구하기
		int mul = 1; // 초기값 중요, + 연산자에 대한 항등원
		for(int i = 1; i <= 10; i++){
			mul = mul * i;
		}
		System.out.println(mul);
		
		// 2 4 6 8 10 의 합
		int sum = 0;
		for(int i = 2; i <= 10; i +=2){
			sum = sum + i;
		}
		
		System.out.println(sum);
		
		
		//1 3 5 7 9
		int sum2 = 0;
		for(int i = 1; i < 10; i +=2){
			sum2 = sum2 + i;
		}
		
		System.out.println(sum2);
		
		// 2 4 6 8 10 의 합 
		// 1 3 5 7 9  의 합
		int a = 0, b = 0;
		for(int i = 1; i<=10; i++) {
			if( i % 2 == 0){
				a = a + i;
			}else{
				b = b + i;
			}
		}
		
		System.out.println("짝수의 합: " + a + ", 홀수의 합: " + b);


	}

}
