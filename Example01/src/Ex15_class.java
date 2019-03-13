
public class Ex15_class {

	public static void main(String[] args) {
		/**
		 * TestBook class에 main 메서드를 작성하여 Book객체를 생성하고 출력하기
		 */

		// int x = 0; // 지역변수 : 메서드 안쪽에 선언(초기화 하지 않으면 에러)

		Book b1 = new Book(); // 참조변수 선언 & 객체 생성
		b1.name = "이것이 자바다"; // . : 도트 연산자 멤버접근연산자
		b1.publicher = "신용권"; // 참조변수 값의 초기화
		b1.price = 30000;

		// System.out.println(b1.name + ", " + b1.publicher + ", " + b1.price);
		b1.printBook(); // Book class의 printBook() 메서드 호출

		Book b2 = new Book(); // 변수명 다르게 여러번 사용할 수 있다.
		b2.name = "자바의 정석";
		b2.publicher = "남궁성";
		b2.price = 27000;

		// System.out.println(b2.name + ", " + b2.publicher + ", " + b2.price);
		b2.printBook();

	}

}

// 클래스 정의
class Book {
	// 서로 다른 타입을 하나의 클래스로 묶음
	// 클래스에 들어갈 수 있는 구성물 :
	// 변수, 배열, 다른타입 변수, 다른타입 배열, 메서드 => 멤버

	// 전역변수 (멤버변수) : 메서드 밖에서 선언
	// 선언과 동시에 초기값이 저장된다.
	String name = "";
	String publicher = ""; // 문자열 초기화는 "" 로 하자
	int price;

	// 메서드
	void printBook() {
		// 멤버 변수 내용을 출력
		System.out.println(name + ", " + publicher + ", " + price);
	}
}
