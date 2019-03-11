
public class Ex03_operator {

	public static void main(String[] args) {
		// 연산자(Operator) : 기호, 피연산자를 가공
		// 					피연산자의 개수에 따라 구분: 단황연산자, 이항연산자, 삼항연산자, 대입연산자

		//단항 연산자 : + - ++ -- ! ~
		int a = 3;
		System.out.println(-a); // 부호 연산자 + -
		
		a = 3;
		// 증감 연산자
		a++; // a = a + 1;
		System.out.println(a);
		
		a = 3;
		System.out.println(++a);	// 4  전치 증감 연산자 : 증감 후 참조
		System.out.println(a);		// 4		
		
		a = 3; 
		System.out.println(a++);	// 3 후치 증감 연산자 : 참조 후 증가
		System.out.println(a);		// 4
		
		a = 3;
		// a = ++a + a++ ++a + a++; 나쁜코드
		System.out.println(a);
		
		// 논리 부정 연산자 !
		boolean b = true;
		System.out.println(!b);		//논리 값의 반대값
		
		// 비트 부정 연산자 ~
		int c = 3;
		System.out.println(~c);		// -4

		// 이항 연산자 : 산술연산자, 비트연산자, 논리연산자, 비교연산자
		// 규칙 : 두 피연산자의 타입이 서로 같아야 한다.
		// 		타입이 다르면 컴파일러가 형변환해준다. (묵시적 형변환)
		//		결과도 같은 타입이 나온다.
		System.out.println(7 + 3);	//10
		System.out.println(7 - 3);	//4
		System.out.println(7 * 3);	//21
		System.out.println((double)7 / 3);	//2.3333
		System.out.println(7 % 3);	//1 (나머지 연산자, 정수 나눗셈)
		
		// 비트 연산자 | & ^
		System.out.println(13 & 5);	// 5
		System.out.println(13 | 5);	// 13 
		System.out.println(13 ^ 5);	// 8  다르면 참
		
		System.out.println( true & true ); // true
		System.out.println( true & false ); // false
		System.out.println( false & true ); // false
		System.out.println( false & false ); // false
		
		System.out.println( true | true ); // true
		System.out.println( true | false ); // true
		System.out.println( false | true ); // true
		System.out.println( false | false ); // false
		
		// 논리 연산자 && || (효율적인 연산)
		System.out.println( true && true ); // true
		System.out.println( true && false ); // false
		System.out.println( false && true ); // false
		System.out.println( false && false ); // false
		
		System.out.println( true || true ); // true
		System.out.println( true || false ); // true
		System.out.println( false || true ); // true
		System.out.println( false || false ); // false

		//비교연산자 < > <= >= ==(같다) !=(다르다)
		System.out.println( 3 < 5 );	// true
		System.out.println( 3 >= 5 );	// false
		System.out.println( 3 == 5 );	// false
		System.out.println( 3 != 5 );	// true
		
		// 쉬프트 연산자 <<  >>
		System.out.println(1 << 3);		// 8 = 1 *2 *2 *2
		System.out.println(16 >> 3); 	// 2 = 16 /2 /2 /2
		
		
		//삼항 연산자 (조건식) ? (참일 경우) : (거짓일 경우)
		int num = 3 < 5 ? 100 : -100;
		System.out.println(num);
		System.out.println( 3 == 5 ? "참" : 3.14);
		
		
		//대입연산자  =과 이항연산자의 조합
		num = 3;
		num += 3;	// num = num + 3;
		num -= 3;	// num = num - 3;
		num *= 3;	// num = num * 3;
		num /= 3;	// num = num / 3;
		num %= 3;	// num = num % 3;
		num |= 3;	// num = num | 3;
		num &= 3;	// num = num & 3;
		num ^= 3;	// num = num ^ 3;
		
		int d = 3, f, e = 4;	// 콤마 연산자 : 같은 타입을 하넙ㄴ에 선언 할 수 있다.
		f = d = e = 5; 			// 대입연산자  ( 우 -> 좌 )
		
		d = 3 + 4 + 2 + 1 + 1;
		
		System.out.println(3 * 4 == 12 && 2 + 1 < 4);	// true
		
		
		/////////////////////////////////////////////////////////////////////
		
		
		
		// 삼각형의 넓이를 출력하는 코드 작성
		// (참고) 삼각형의 넓이 = 밑변 * 높이 / 2
		int w = 10, h = 5;
		System.out.println("삼각형의 넓이 :" + w * h / 2);
		
		
		// 사과를 담는데 필요한 바구니의 수를 구하는 코딩작성
		// 만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면
		// 13개의 바구니가 필요할 것이다.
		int numOfApples = 123;	// 사과의 개수
		int sizeOfBucket = 10;	// 바구니의 크기(바구니에 담을 수 있는 사과의 수)
		int numOfBucket = (numOfApples / sizeOfBucket) + (numOfApples%sizeOfBucket == 0? 0 : 1) ;
		System.out.println("필요한 바구니의 수 :" + numOfBucket); 	// 13
		
		// 거스름돈
		int coin = 3780;
		System.out.println("500원 짜리 : " + coin/500 + "개");			// 7개
		System.out.println("100원 짜리 : " + (coin%500)/100 + "개");	// 2개
		System.out.println(" 50원 짜리 : " + (coin%100)/50 + "개");	// 1개
		System.out.println(" 10원 짜리 : " + (coin%50)/10 + "개");		// 3개	

	}

}
