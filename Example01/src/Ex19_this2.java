
public class Ex19_this2 {
	int i;
	double d;

	// ��������� int�� i�� �Ķ������ int�� i�� �������� ����.
	// ���� �̸� �����ϱ����� ��������� i �տ� this�� �������μ� �������Ѵ�.
	public void Method1(int i) {
		this.i = i;
	}

	// ��������� double�� d�� �Ķ������ double�� d�� �������� ����.
	// ���� �̸� �����ϱ����� ��������� d �տ� this�� �������μ� �������Ѵ�.
	public void Method1(double d) {
		this.d = d;
	}

	public static void main(String[] args) {

		Ex19_this2 t = new Ex19_this2();
		t.Method1(100);
		t.Method1(3.14);
		System.out.println(t.i);
		System.out.println(t.d);

	}

}
