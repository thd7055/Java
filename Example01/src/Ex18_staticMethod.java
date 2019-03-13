
public class Ex18_staticMethod {

	public static void main(String[] args) {

		TTT t = new TTT();
		t.a1++;
		t.a4++; // static 변수
		t.print();
		t.ssP(); // static 메서드

		TTT.a4++; // static 멤버는 클래스의 이름으로 접근 할 수 있다.
		TTT.ssP(); // 객체 생성 없이 바로 사용할 수 있다.

	}

}

class TTT {

	// static 멤버는 non-static 멤버에 접근 할 수 없다. (메모리 생성시점 차이)
	int a1;
	// static int a3 = a1; // 에러
	static int a4;
	int a2 = a1;
	int a3 = a4;
	static int b = a4;

	// 어떤 메서드에 static 을 붙여야 되는가??
	// static 멤버들만 사용하는 메서드는 static 으로 선언 할 것을 고려한다.
	static void ssP2() {
	}

	static void ssP() { // static 메서드, class 메서드
		b++;
		a4++;
//		a1++; a2++;	// 에러
		ssP();
//		print();  에러
	}

	void print2() {
	}

	void print() { // non - static 메서드, 인스턴스 메서드
		b++;
		a4++;
		a1++;
		a2++;
		ssP();
		print2();
	}

}
