
public class Ex15_class {

	public static void main(String[] args) {
		/**
		 * TestBook class�� main �޼��带 �ۼ��Ͽ� Book��ü�� �����ϰ� ����ϱ�
		 */

		// int x = 0; // �������� : �޼��� ���ʿ� ����(�ʱ�ȭ ���� ������ ����)

		Book b1 = new Book(); // �������� ���� & ��ü ����
		b1.name = "�̰��� �ڹٴ�"; // . : ��Ʈ ������ ������ٿ�����
		b1.publicher = "�ſ��"; // �������� ���� �ʱ�ȭ
		b1.price = 30000;

		// System.out.println(b1.name + ", " + b1.publicher + ", " + b1.price);
		b1.printBook(); // Book class�� printBook() �޼��� ȣ��

		Book b2 = new Book(); // ������ �ٸ��� ������ ����� �� �ִ�.
		b2.name = "�ڹ��� ����";
		b2.publicher = "���ü�";
		b2.price = 27000;

		// System.out.println(b2.name + ", " + b2.publicher + ", " + b2.price);
		b2.printBook();

	}

}

// Ŭ���� ����
class Book {
	// ���� �ٸ� Ÿ���� �ϳ��� Ŭ������ ����
	// Ŭ������ �� �� �ִ� ������ :
	// ����, �迭, �ٸ�Ÿ�� ����, �ٸ�Ÿ�� �迭, �޼��� => ���

	// �������� (�������) : �޼��� �ۿ��� ����
	// ����� ���ÿ� �ʱⰪ�� ����ȴ�.
	String name = "";
	String publicher = ""; // ���ڿ� �ʱ�ȭ�� "" �� ����
	int price;

	// �޼���
	void printBook() {
		// ��� ���� ������ ���
		System.out.println(name + ", " + publicher + ", " + price);
	}
}
