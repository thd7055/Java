
public class Ex22_overriding {

	public static void main(String[] args) {
		/**
		 * 오버라이딩 Overriding
		 * : ('상속')부모클래스에서 가지고 있는 멤버 '메서드'의 내용을 
		 *   자식클래스에서 '재정의' 해서 사용하는 기법
		 */
		
		Point_1 pp = new Point_1(2, 3);
		pp.print_1();
		
		Point3D_1 ppp= new Point3D_1(10, 20, 30);
		ppp.print_1();

	}

}


class Point_1{	// 2차원 좌표를 추상화한 클래스
	int x, y;
	
	public Point_1() {
		
	}

	public Point_1(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	void print_1(){
		System.out.println(x + ", " + y);
	}
	
	
}

class Point3D_1 extends Point_1{	// 3차원 좌표를 추상화한 클래스
	int z; 
	
	public Point3D_1() {
		
	}

	public Point3D_1(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	// 부모 클래스에 있는 메서드의 선언부를 동일하게 사용
	void print_1(){
		// 오버라이딩
		System.out.println(x + ", " + y + ", " + z);
	}
	
	
}
