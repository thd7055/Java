import java.util.Scanner;

public class Ex06_scanner {

	public static void main(String[] args) {
		// ������� �Է� �ޱ� : Scanner
		
		// ������� �Է��� �ޱ� ���� ��ü�� �غ�
		// Scanner Ŭ���� �޼��� �м�
		// 1. nextInt() : ���ڸ� �Է¹޴µ�, ���ھտ� ������ ȭ��Ʈ�����̽�(��ĭ or ����)�� �����ϰ�
		//				int ������ ���� �� �ִ� ���ڸ� �޾ư���.
		// 2. nextLine() : ���ڿ��� �Է¹���, ���͸� �Է��� �� ���� ���� �޾Ƽ��ͼ�
		//					���ʹ� �����ϰ� ���� ���� ���ڿ��� �޾ư���.
		// 3. next() : ���ڸ� �Է¹���
		//				���ڿ� ���ʿ� ������ ȭ��Ʈ �����̽��� �����ϰ�
		//				ȭ��Ʈ�����̽� �������� ���ڿ��� �޾ư���.


        Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��ϼ���.");
		String name = sc.nextLine();
		System.out.println("����� �̸��� : " + name);
		
		System.out.println("���̸� �Է��ϼ���.");
		int age = sc.nextInt();
		System.out.println("10�� ��  ���̴�: " + (age+10));


	}

}
