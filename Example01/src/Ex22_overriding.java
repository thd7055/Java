
public class Ex22_overriding {

	public static void main(String[] args) {
		/**
		 * �������̵� Overriding
		 * : ('���')�θ�Ŭ�������� ������ �ִ� ��� '�޼���'�� ������ 
		 *   �ڽ�Ŭ�������� '������' �ؼ� ����ϴ� ���
		 */
		
		Point_1 pp = new Point_1(2, 3);
		pp.print_1();
		
		Point3D_1 ppp= new Point3D_1(10, 20, 30);
		ppp.print_1();

	}

}


class Point_1{	// 2���� ��ǥ�� �߻�ȭ�� Ŭ����
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

class Point3D_1 extends Point_1{	// 3���� ��ǥ�� �߻�ȭ�� Ŭ����
	int z; 
	
	public Point3D_1() {
		
	}

	public Point3D_1(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	// �θ� Ŭ������ �ִ� �޼����� ����θ� �����ϰ� ���
	void print_1(){
		// �������̵�
		System.out.println(x + ", " + y + ", " + z);
	}
	
	
}
