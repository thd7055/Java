
public class Ex17_staticVariable {

	public static void main(String[] args) {
		
		//static : ��ü�� ������ �ʰ� (��������) ����� �� �ִ� �ڿ�
		
		ABC abc = new ABC();
		abc.printABC();

	}

}

class ABC{	// ����� ��ġ�� ���� ����
	int a;	// �������� : Ŭ���� ���� && �޼��� �ٱ���
			// �� Ÿ���� �ʱⰪ�� ����ȴ�.
				
	static int c;	// static ���� , ���뺯��, ��������, Ŭ���� ����
					// Ŭ������ ������ ó�� �ε� �� ��
	int d; 	// non - static ����, �ν��Ͻ� ����
			// ��ü ������ �޸𸮿� �ε�, ���������� �������� ���Ұ�
	
	void printABC(){
		int b;	// �������� : �޼��� ���ʿ� ����
				// �ʱ�ȭ�� �� �� �����ؾ� �Ѵ�.
				// ������ �������� ~} �� ���������� ������ ��밡��
				// ������������ static�� ���̸� �ȵȴ�.
		
		System.out.println(a);
	}
}
