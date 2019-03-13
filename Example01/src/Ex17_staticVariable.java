
public class Ex17_staticVariable {

	public static void main(String[] args) {
		
		//static : 객체를 만들지 않고 (생성없이) 사용할 수 있는 자원
		
		ABC abc = new ABC();
		abc.printABC();

	}

}

class ABC{	// 선언된 위치에 따라 구분
	int a;	// 전역변수 : 클래스 안쪽 && 메서드 바깥쪽
			// 각 타입의 초기값이 저장된다.
				
	static int c;	// static 변수 , 공통변수, 공유변수, 클래스 변수
					// 클래스의 정보가 처음 로딩 될 때
	int d; 	// non - static 변수, 인스턴스 변수
			// 객체 생성시 메모리에 로딩, 참조변수가 없어지면 사용불가
	
	void printABC(){
		int b;	// 지역변수 : 메서드 안쪽에 선언
				// 초기화를 한 후 참조해야 한다.
				// 선언한 시점부터 ~} 를 빠져나가기 전까지 사용가능
				// 지역변수에는 static을 붙이면 안된다.
		
		System.out.println(a);
	}
}
