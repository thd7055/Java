
public class Ex14_method {
	// 리턴 타입 메서드명(인자값){
	// 실행문...
	// }

	// 메서드명
	// 1. 자바의 예약어는 사용불가 (ex) int, byte, char....,)
	// 2. 숫자로 시작하면 안된다.
	// 3. _, $ 만 특수문자 사용가능
	// 4. 소문자로 시작

	static void a() { // static -> 나중에 설명
		System.out.println(" a 메서드 입니다.");
	}

	static void b(int x) { // 인자값, 파라미터, 매개변수
		System.out.println("메서드로 받아온 값:" + x);
	}

	static void c(int x, int y) { // 인자값 2개 받음, 인자값의 수는 제한없다.
		System.out.println("합: " + x + y);
		return; // 메서드를 마무리하고 호출한 곳으로 되돌아감
	}

	static int d() { // 리턴값, 반환값(갯수는 0~1개 까지만 가능)
		int age = 26;
		return age; // 값을 실어서 보낼 수 있다.
	}
	
	static int f(int x, int y){
		int t = x * y;
		return t; 	// 곱한 결과 리턴
	}
	

	public static void main(String[] args) {
		/**
		 * 메서드 Method : 실행문의 집합
		 */

		System.out.println("main 시작");
		a(); // a method 호출
		b(100);
		c(7, 2); // 두 값을 합쳐서 출력해주는 메서드 (인자값 수 일치)
		int num = d(); // 현재 나이를 (리턴)가져오는 메서드
		System.out.println("d메서드에서 받은 값: " + num);
		System.out.println("main 끝");

		int num2 = f(3, 7); // 인자값 두값을 보내서 곱한 결과를 리턴받음
		System.out.println(num2);

	}

}
