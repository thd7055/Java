
public class Ex02_variable {

	public static void main(String[] args) {
		
		//����(Variable) : �����͸� ������ �� �ִ� ������

		// �⺻�� Ÿ�� 8���� ����
		// ������ : byte(1), short(2), "int(4)", long(8)
		// �Ǽ��� : float(4), "double(8)"
		// ���� : boolean(1)
		// ������ : char(2)

		// ������ ���� : (�⺻���� �ƴ� ����) - �ּҸ� ����(4byte)

		int a; // ���� ����
		a = 10; // ������ �ʱ�ȭ : ���� ó�� �Ҵ�
		a = 20; // ���������� ����� ���� ���

		System.out.println(a);

		int b = 30; // ������ ����, �ʱ�ȭ�� �ѹ���
		byte by = 6;
		short sh = 7;
		long lo = 100L; // ���ͷ� ���̻� : L or l
		float fl = 3.14f; // ���ͷ� ���̻� : F or f
		double d = 3.14; // ���ͷ� ���̻� : D or d or ��������

		// �Ҽ��� �������� ǥ����
		d = 3.0;
		d = 3.;
		d = 0.15;
		d = .15;
		d = 3d;

		// ����
		boolean bbb = false; // true of false �� ���� ����

		// ������
		char c = 'x'; // �� ���ڸ� ���� ����, �ƽ�Ű�ڵ� 120
		System.out.println(c);

		// ��� : ������ ��, ���α׷� ����ñ��� ���� ���� �����Ѵ�.
		final int AGE = 25; // ���, ������� �빮�ڷ�

		// ���ڿ� : String
		String str = "�ȳ��ϼ���";
		System.out.println(str);

		// ���ڿ��� ���� ���� : �̾�ٿ���
		str = "a" + "bcd";
		str = "a" + 3; // ���ڿ�, �� ���ڿ� => ���ڿ��� ��ȯ �� ��������
		str = 3 + 4 + "a" + 3 + 4; // ��� : 7a34
		// 7 + "a" + 3 + 4
		System.out.println(str);

		// �������� ��Ģ
		// 1. ��ҹ��ڸ� ������. ������ ������ ����.
		// 2. ���ڷ� �����ϸ� �ȵȴ�. top10(o), 7up(x)
		// 3. ���� ���������� ����ϸ� �ȵȴ�.
		// 4. Ư�����ڴ� _, $ �� ��밡��
		// 5. ������ �ҹ��ڷ� ����, �ܾ���� ���� �� �ܾ��� ù���ڴ� �빮��

		int indexOfArray;
		int h = 99; // 10����
		h = 077; // 8���� 0���� ����
		h = 0x12; // 16���� 0x�� ����

		char xx = '1';
		xx = '\n'; // �ٹٲ�
		xx = '\t'; // tab
		xx = '\u0041'; // A
		System.out.println(xx);

		// ����ȯ Casting
		// ���� ������ => ū �׸��� �����ϴ� �� : �ڵ�����ȯ(����������ȯ)
		// ������ �ս��� �߻����� �����Ƿ� �����Ϸ��� ����
		// ū ������ => ���� �׸��� ���� : ����� ����ȯ
		// �������� �ս��� �߻��ϹǷ� �����ڰ� ����ؾ���

		int x = 3;
		long y = x; // (long)x �ڵ�����ȯ
		int w = (int) y; // ����� ����ȯ�� �ؾ���

		double ddd = 3.14;
		int iii = (int) ddd; // ����� ����ȯ
		ddd = (double) 3;

		// �ڽ��� �̸��� ������ ����� �̸� ����
		// �ڽ��� ���̸� ������ ������ ���� ���� �� ���

		final String NAME = "����";
		int age = 25;

		System.out.println("�̸� : " + NAME + ", ����: " + age);

		int aa = 3;
		int bb = 4;
		int cc = 5;
		System.out.println("aa = " + aa + ", bb = " + bb + ", cc= " + cc);

		// ���� ��ȯ swap
		int temp = aa;
		aa = bb;
		bb = cc;
		cc = temp;

		System.out.println("aa = " + aa + ", bb = " + bb + ", cc= " + cc);

	}

}
