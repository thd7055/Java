
public class Ex16_constructor {

	public static void main(String[] args) {
		/**
		 * TestMart class�� main�޼��带 �ۼ��Ͽ�
		 * Mart ��ü�� �����ϰ� ȭ�鿡 ���
		 * 
		 * ������ Constructor : ��� class ���� �ݵ�� �ϳ� �̻��� �����ڰ� �־�� �Ѵ�.
		 * class �� �����ڸ� �ϳ��� ������ ������, �����Ϸ��� �⺻ �����ڸ� �߰����ش�.
		*/
		Mart m1 = new Mart();	// ()  �������� �Ұ�ȣ�� �ǹ��Ѵ�.
		m1.name = "��Ʈ1";
		m1.ball = 1000;
		m1.pen = 500;
		
		// �Ű������� 3���� �����ڰ� �ֱ� ������ �̷��Ե� �� �� �ִ�.
		Mart m2 = new Mart("��Ʈ2", 1200, 300);
		/*m2.name = "��Ʈ2";
		m2.ball = 1200;
		m2.pen = 300;*/
		
		m1.printPrice();
		m2.printPrice();
		
		m1.sale();
		m2.sale();
		
		System.out.println("===== ���ϰ��� ====");
		m1.printPrice();
		m2.printPrice();

	}

}


class Mart{
	// �Ϲ����� ���� : �������� -> ������ -> �޼���
	String name = "";
	int ball;
	int pen;
	
	// ������ - ���� �ʱ�ȭ�� ���� �����.
	// �⺻ ������ - ���ڰ��� �ϳ��� ���� ������, ����Ÿ���� ����(void�� �ȵ�)
	Mart() { // Ŭ������ �̸��� ������ �޼���(��ǻ� �޼���� ����� ��)
		
	}
	
	// � �����ڸ� ������ �����Ϸ��� �⺻ �����ڸ� ����� ���� �ʴ´�.
	// �ʿ��� ��� ���� �⺻ �����ڸ� ������ �Ѵ�.
	Mart(String n, int b, int p){ 	// ������
		// ���� ������ �� ����
		name = n;
		ball = b;
		pen = p;
	}
	
	
	void sale(){	 // 10% ����
		ball *= 0.9; 
		pen  *= 0.9; 
	}
	
	void printPrice(){
		System.out.println("<" + name + "�������� >" );
		System.out.println("�� : " + ball + ", �� : " + pen);
	}
} 
