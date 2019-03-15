
public class Ex23_polymorphism {

	public static void main(String[] args) {
		/**
		 * ������(polymorphism) : �������� Ÿ������ �ٲ� �� �ִ� ����
		 * 						�θ��� ���������� �ڽ��� ��ü�� ���� �� �ִ� ����
		 */
		Parent p1 = new Parent();
		Child1 c1_1 = new Child1();
		Child2 c2_1 = new Child2();
		GrandChild g1 = new GrandChild();
		
		Parent p; 	// ��������
		p = p1;
		p = c1_1; 	// ������ : �θ��� ���������� �ڽ��� ��ü�� ������ �� �ִ�
		p = c2_1;
		p = g1;
		
		Child1 c;
		c = c1_1; 	// ���������� �ڱ� �ڽ��� ������ ������ �� �ִ�.
//		c = c2_1;	// ���� -> Child1 �� Child2�� �ƹ� ���谡 ����. ������ X
		c = g1;		// ������
		
//		double d = (double)3; 	// �ڵ� ����ȯ, ����������ȯ
//		int x = (int)3.14; 		//���� ����ȯ (�����ͼս� �߻�)
		
		p = (Parent)g1; 	// Parent <- GrandChild	 �ڵ� ����ȯ
		
		// ����ȯ �ص� ������ �߻����� �ʴ��� üũ������Ѵ�. instanceOf
		if (p instanceof GrandChild) {
			GrandChild gg = (GrandChild)p; // ���� Ÿ������ �ǵ��δ�. (Ÿ�Ժ�ȯ) ��������ȯ
		} // �����ϸ� true, �ƴϸ� false

	}

}

class Parent { }
class Child1 extends Parent{ }
class Child2 extends Parent{ }
class GrandChild extends Child1{ }
