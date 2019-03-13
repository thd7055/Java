
public class Ex21_inheritance {

	public static void main(String[] args) {
		/**
		 * Ŭ������ ��� (inheritance) : Ŭ��������(�θ�-�ڽ�)���踦 �ξ��ִ� �� �θ��� ����� ��ӹ��� �� �ִ�.(��������, �޼���)
		 */
		// �⺻ ������ ��ü ����
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

class Point { // 2���� ��ǥ�� �߻�ȭ�� Ŭ����

	int x;
	int y;

	public Point() {
		// �������� ù��° �ٿ��� �ٸ������ڸ� ȣ���ؾ� �Ѵ�.
		this(1, 2); // �� �ٸ� �����ڸ� ȣ���ϴ� ������
//		this.x = 1;
//		this.y = 2;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

}

//3���� ��ǥ�� �߻�ȭ�� Ŭ����
class Point3D extends Point { // point class �� Ȯ��
//	int x;   <- �ߺ��Ǵ� �ڵ� (Point class�� ��ӹޱ� ������ ���������� �ʾƵ� ��밡��)
//	int y;
	int z;
}
