
public class Ex19_this {
	int i;
	double d;

	// This_1()������ �޼��峻���� �ڱ� �ڽ��� �Ǵٸ� �����ڸ�
	// this()�� �̿��ؼ� ȣ���Ѵ�.
	public Ex19_this(int i) {
		this(3.14); // 10������ �����ڸ� ȣ��
		System.out.println(i);
	}

	public Ex19_this(double d) {
		System.out.println(d);
	}

	public static void main(String[] args) {
		Ex19_this t = new Ex19_this(100);


	}

}
