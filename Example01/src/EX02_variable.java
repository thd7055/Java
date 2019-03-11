
public class EX02_variable {

	public static void main(String[] args) {
		
		/*
		 * 변수 : 데이터를 담는 상자
		 * Data Type : int 정수형, float 실수형, double 실수형, boolean 논리형, char 문자형
		 * 변수의 선언 : data type 변수명 ;
		 */
		
		
		// 정수형 a를 선언
		int a; 
		
		//a에 1을 대입
		a = 1;
		
		//선언과 대입을 한줄로 표현
		int b = 2;
		
		System.out.println(a + 1); // 2
		System.out.println(b + 1); //3
		
		
		// 실수형
		double c = 1.1; 
		System.out.println(c + 1.1); // 2.2
		 
		c = 2.1; 
		System.out.println(c + 1.1); // 3.2
		
		
		
		// 문자열
		String first = "coding"; 
		System.out.println(first+" "+"everybody"); // coding everybody
		
		
		// 여러개의 변수를 동시에 선언
		String d, e;
		d = "coding";
		e = " everybody";
		System.out.println(d+e); // coding everybody

	}

}
