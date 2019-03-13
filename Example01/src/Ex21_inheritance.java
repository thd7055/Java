
public class Ex21_inheritance {

	public static void main(String[] args) {
		/**
		 * 클래스의 상속 (inheritance) : 클래스간의(부모-자식)관계를 맺어주는 것 부모의 멤버만 상속받을 수 있다.(전역변수, 메서드)
		 */
		// 기본 생성자 객체 생성
		Point p = new Point();

		Point p2 = new Point();
		p.x = 3;
		p.y = 4;

		Point3D pp = new Point3D();
		pp.x = 10;
		pp.y = 20;
		pp.z = 30;

	}

}

class Point { // 2차원 좌표를 추상화한 클래스

	int x;
	int y;

	public Point() {
		// 생성자의 첫번째 줄에서 다른생성자를 호출해야 한다.
		this(1, 2); // 또 다른 생성자를 호출하는 생성자
//		this.x = 1;
//		this.y = 2;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

}

//3차원 좌표를 추상화한 클래스
class Point3D extends Point { // point class 의 확장
//	int x;   <- 중복되는 코드 (Point class를 상속받기 때문에 선언해주지 않아도 사용가능)
//	int y;
	int z;
}
