
public class Ex20_overloading {

	public static void main(String[] args) {
		/**
		 * Overloading(오버로딩) : 같은 class 내에서 메서드명을 동일하게 사용하는 기법
		 * 조건 - 매개변수의 갯수 or 타입 or 순서가 달라야 한다. 
		 * 반환 타입은 오버로딩을 구현하는데 아무런 영향을 주지 못한다.
		*/
		
		MyMath  m = new MyMath();
		m.sum(6);
		m.sum(2, 4);
		m.sum(3, 9, 7);
		m.sum(true);
		
		// 많이 사용했던 오버로딩의 예
		System.out.println();
		System.out.println(1);
		System.out.println(3.14);
		System.out.println(3.14f);
		System.out.println(true);
		System.out.println("안녕");


	}

}


class MyMath{
	
	int x;
	int y;
	
	public MyMath() {	// 기본 생성자
		
	}
		
	public MyMath(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 오버로딩
	void sum(boolean a) { }
	void sum (boolean a, int b){ }
	void sum(int a, boolean b){ }
	
	void sum(int a){	// a값 + 3 을 출력
		System.out.println(a+3);
	}
	
	void sum(int a, int b){
		System.out.println(a+b);
	}
	
	void sum(int a, int b, int c){
		System.out.println(a+b+c);
	}
}
