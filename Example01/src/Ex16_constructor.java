
public class Ex16_constructor {

	public static void main(String[] args) {
		/**
		 * TestMart class에 main메서드를 작성하여
		 * Mart 객체를 생성하고 화면에 출력
		 * 
		 * 생성자 Constructor : 모든 class 에는 반드시 하나 이상의 생성자가 있어야 한다.
		 * class 에 생성자를 하나도 만들지 않으면, 컴파일러가 기본 생성자를 추가해준다.
		*/
		Mart m1 = new Mart();	// ()  생성자의 소괄호를 의미한다.
		m1.name = "마트1";
		m1.ball = 1000;
		m1.pen = 500;
		
		// 매개변수가 3개인 생성자가 있기 때문에 이렇게도 쓸 수 있다.
		Mart m2 = new Mart("마트2", 1200, 300);
		/*m2.name = "마트2";
		m2.ball = 1200;
		m2.pen = 300;*/
		
		m1.printPrice();
		m2.printPrice();
		
		m1.sale();
		m2.sale();
		
		System.out.println("===== 세일가격 ====");
		m1.printPrice();
		m2.printPrice();

	}

}


class Mart{
	// 일반적인 순서 : 변수선언 -> 생성자 -> 메서드
	String name = "";
	int ball;
	int pen;
	
	// 생성자 - 값의 초기화를 위해 만든다.
	// 기본 생성자 - 인자값이 하나도 없는 생성자, 리턴타입이 없다(void도 안됨)
	Mart() { // 클래스의 이름과 동일한 메서드(사실상 메서드와 비슷한 것)
		
	}
	
	// 어떤 생성자를 만들경우 컴파일러는 기본 생성자를 만들어 주지 않는다.
	// 필요할 경우 따로 기본 생성자를 만들어야 한다.
	Mart(String n, int b, int p){ 	// 생성자
		// 전역 변수의 값 설정
		name = n;
		ball = b;
		pen = p;
	}
	
	
	void sale(){	 // 10% 할인
		ball *= 0.9; 
		pen  *= 0.9; 
	}
	
	void printPrice(){
		System.out.println("<" + name + "가격정보 >" );
		System.out.println("공 : " + ball + ", 펜 : " + pen);
	}
} 
