
public class Ex23_polymorphism {

	public static void main(String[] args) {
		/**
		 * 다형성(polymorphism) : 여러가지 타입으로 바꿀 수 있는 성질
		 * 						부모의 참조변수에 자신의 객체를 담을 수 있는 성질
		 */
		Parent p1 = new Parent();
		Child1 c1_1 = new Child1();
		Child2 c2_1 = new Child2();
		GrandChild g1 = new GrandChild();
		
		Parent p; 	// 참조변수
		p = p1;
		p = c1_1; 	// 다형성 : 부모의 참조변수에 자식의 객체를 저장할 수 있다
		p = c2_1;
		p = g1;
		
		Child1 c;
		c = c1_1; 	// 참조변수에 자기 자신의 변수를 저장할 수 있다.
//		c = c2_1;	// 에러 -> Child1 과 Child2는 아무 관계가 없다. 다형성 X
		c = g1;		// 다형성
		
//		double d = (double)3; 	// 자동 형변환, 무시적형변환
//		int x = (int)3.14; 		//강제 형변환 (데이터손실 발생)
		
		p = (Parent)g1; 	// Parent <- GrandChild	 자동 형변환
		
		// 형변환 해도 에러가 발생하지 않는지 체크해줘야한다. instanceOf
		if (p instanceof GrandChild) {
			GrandChild gg = (GrandChild)p; // 원래 타입으로 되돌인다. (타입변환) 강제형변환
		} // 가능하면 true, 아니면 false

	}

}

class Parent { }
class Child1 extends Parent{ }
class Child2 extends Parent{ }
class GrandChild extends Child1{ }
