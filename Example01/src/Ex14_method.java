
public class Ex14_method {
	// ���� Ÿ�� �޼����(���ڰ�){
	// ���๮...
	// }

	// �޼����
	// 1. �ڹ��� ������ ���Ұ� (ex) int, byte, char....,)
	// 2. ���ڷ� �����ϸ� �ȵȴ�.
	// 3. _, $ �� Ư������ ��밡��
	// 4. �ҹ��ڷ� ����

	static void a() { // static -> ���߿� ����
		System.out.println(" a �޼��� �Դϴ�.");
	}

	static void b(int x) { // ���ڰ�, �Ķ����, �Ű�����
		System.out.println("�޼���� �޾ƿ� ��:" + x);
	}

	static void c(int x, int y) { // ���ڰ� 2�� ����, ���ڰ��� ���� ���Ѿ���.
		System.out.println("��: " + x + y);
		return; // �޼��带 �������ϰ� ȣ���� ������ �ǵ��ư�
	}

	static int d() { // ���ϰ�, ��ȯ��(������ 0~1�� ������ ����)
		int age = 26;
		return age; // ���� �Ǿ ���� �� �ִ�.
	}
	
	static int f(int x, int y){
		int t = x * y;
		return t; 	// ���� ��� ����
	}
	

	public static void main(String[] args) {
		/**
		 * �޼��� Method : ���๮�� ����
		 */

		System.out.println("main ����");
		a(); // a method ȣ��
		b(100);
		c(7, 2); // �� ���� ���ļ� ������ִ� �޼��� (���ڰ� �� ��ġ)
		int num = d(); // ���� ���̸� (����)�������� �޼���
		System.out.println("d�޼��忡�� ���� ��: " + num);
		System.out.println("main ��");

		int num2 = f(3, 7); // ���ڰ� �ΰ��� ������ ���� ����� ���Ϲ���
		System.out.println(num2);

	}

}
