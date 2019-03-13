
public class Ex20_overloading {

	public static void main(String[] args) {
		/**
		 * Overloading(�����ε�) : ���� class ������ �޼������ �����ϰ� ����ϴ� ���
		 * ���� - �Ű������� ���� or Ÿ�� or ������ �޶�� �Ѵ�. 
		 * ��ȯ Ÿ���� �����ε��� �����ϴµ� �ƹ��� ������ ���� ���Ѵ�.
		*/
		
		MyMath  m = new MyMath();
		m.sum(6);
		m.sum(2, 4);
		m.sum(3, 9, 7);
		m.sum(true);
		
		// ���� ����ߴ� �����ε��� ��
		System.out.println();
		System.out.println(1);
		System.out.println(3.14);
		System.out.println(3.14f);
		System.out.println(true);
		System.out.println("�ȳ�");


	}

}


class MyMath{
	
	int x;
	int y;
	
	public MyMath() {	// �⺻ ������
		
	}
		
	public MyMath(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// �����ε�
	void sum(boolean a) { }
	void sum (boolean a, int b){ }
	void sum(int a, boolean b){ }
	
	void sum(int a){	// a�� + 3 �� ���
		System.out.println(a+3);
	}
	
	void sum(int a, int b){
		System.out.println(a+b);
	}
	
	void sum(int a, int b, int c){
		System.out.println(a+b+c);
	}
}
