
public class Ex02_variable {

	public static void main(String[] args) {
		
		//변수(Variable) : 데이터를 저장할 수 있는 기억공간

		// 기본형 타입 8가지 제공
		// 정수형 : byte(1), short(2), "int(4)", long(8)
		// 실수형 : float(4), "double(8)"
		// 논리형 : boolean(1)
		// 문자형 : char(2)

		// 참조형 변수 : (기본형이 아닌 변수) - 주소를 저장(4byte)

		int a; // 변수 선언
		a = 10; // 변수의 초기화 : 값을 처음 할당
		a = 20; // 마지막으로 저장된 값만 기억

		System.out.println(a);

		int b = 30; // 변수의 선언, 초기화를 한번에
		byte by = 6;
		short sh = 7;
		long lo = 100L; // 리터럴 접미사 : L or l
		float fl = 3.14f; // 리터럴 접미사 : F or f
		double d = 3.14; // 리터럴 접미사 : D or d or 생략가능

		// 소수의 여러가지 표현법
		d = 3.0;
		d = 3.;
		d = 0.15;
		d = .15;
		d = 3d;

		// 논리형
		boolean bbb = false; // true of false 만 저장 가능

		// 문자형
		char c = 'x'; // 한 글자만 저장 가능, 아스키코드 120
		System.out.println(c);

		// 상수 : 일정한 수, 프로그램 종료시까지 같은 값을 유지한다.
		final int AGE = 25; // 상수, 상수명은 대문자로

		// 문자열 : String
		String str = "안녕하세요";
		System.out.println(str);

		// 문자열의 덧셈 연산 : 이어붙여줌
		str = "a" + "bcd";
		str = "a" + 3; // 문자열, 비 문자열 => 문자열로 변환 후 덧셈연산
		str = 3 + 4 + "a" + 3 + 4; // 결과 : 7a34
		// 7 + "a" + 3 + 4
		System.out.println(str);

		// 변수명의 규칙
		// 1. 대소문자를 가린다. 길이의 제한이 없다.
		// 2. 숫자로 시작하면 안된다. top10(o), 7up(x)
		// 3. 예약어를 변수명으로 사용하면 안된다.
		// 4. 특수문자는 _, $ 만 사용가능
		// 5. 변수는 소문자로 시작, 단어구분을 위해 새 단어의 첫글자는 대문자

		int indexOfArray;
		int h = 99; // 10진수
		h = 077; // 8진수 0으로 시작
		h = 0x12; // 16진수 0x로 시작

		char xx = '1';
		xx = '\n'; // 줄바꿈
		xx = '\t'; // tab
		xx = '\u0041'; // A
		System.out.println(xx);

		// 형변환 Casting
		// 작은 데이터 => 큰 그릇에 저장하는 것 : 자동형변환(묵시적형변환)
		// 데이터 손실이 발생하지 않으므로 컴파일러가 해줌
		// 큰 데이터 => 작은 그릇에 저장 : 명시적 형변환
		// 데이터의 손실이 발생하므로 개발자가 명시해야함

		int x = 3;
		long y = x; // (long)x 자동형변환
		int w = (int) y; // 명시적 형변환을 해야함

		double ddd = 3.14;
		int iii = (int) ddd; // 명시적 형변환
		ddd = (double) 3;

		// 자신의 이름을 저장할 상수에 이름 저장
		// 자신의 나이를 저장할 변수에 나이 저장 후 출력

		final String NAME = "쏭알";
		int age = 25;

		System.out.println("이름 : " + NAME + ", 나이: " + age);

		int aa = 3;
		int bb = 4;
		int cc = 5;
		System.out.println("aa = " + aa + ", bb = " + bb + ", cc= " + cc);

		// 값의 교환 swap
		int temp = aa;
		aa = bb;
		bb = cc;
		cc = temp;

		System.out.println("aa = " + aa + ", bb = " + bb + ", cc= " + cc);

	}

}
