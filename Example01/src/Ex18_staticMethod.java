
public class Ex18_staticMethod {

	public static void main(String[] args) {

		TTT t = new TTT();
		t.a1++;
		t.a4++; // static ����
		t.print();
		t.ssP(); // static �޼���

		TTT.a4++; // static ����� Ŭ������ �̸����� ���� �� �� �ִ�.
		TTT.ssP(); // ��ü ���� ���� �ٷ� ����� �� �ִ�.

	}

}

class TTT {

	// static ����� non-static ����� ���� �� �� ����. (�޸� �������� ����)
	int a1;
	// static int a3 = a1; // ����
	static int a4;
	int a2 = a1;
	int a3 = a4;
	static int b = a4;

	// � �޼��忡 static �� �ٿ��� �Ǵ°�??
	// static ����鸸 ����ϴ� �޼���� static ���� ���� �� ���� ����Ѵ�.
	static void ssP2() {
	}

	static void ssP() { // static �޼���, class �޼���
		b++;
		a4++;
//		a1++; a2++;	// ����
		ssP();
//		print();  ����
	}

	void print2() {
	}

	void print() { // non - static �޼���, �ν��Ͻ� �޼���
		b++;
		a4++;
		a1++;
		a2++;
		ssP();
		print2();
	}

}
