import java.util.Scanner;

public class Ex11_doWhile {

	public static void main(String[] args) {
		/*
		 * �ڹ��� �ݺ��� : do ~ while for : �� ȸ or �󸶱��� �ݺ����� �̸� �˰� �ִ� ��� ��� while : �ݺ� Ƚ���� ��
		 * ��� ��� do~ while : �ּ� 1�� �̻��� ������ �����Ѵ�.
		 */

//		�߰�ȣ {}�� ������ �� ����.
//		���ǽ� �ڿ�  ; �� �ٿ��� �Ѵ�.
//		���ǽĿ� ����� ������ do ~ while{} ���� ������ ���� �����ؾ��Ѵ�.
//		do{
//			�ݺ��� ���๮
//		} while(���ǽ�); 		booleanŸ��

		int num = 1;
		while (num > 3) { // ������ �����̶� ���� �ȵ�
			System.out.println(num + "(while)");
		}

		num = 1;
		do { // �� �� �̻��ڵ尡 �ݵ�� ����ȴ�.
			System.out.println(num + "(do~while)");
		} while (num > 3);

		for (int i = 0; i < 3; i++) {
			System.out.println(i);
		}
		// for�� �ȿ��� ������ ������ �ۿ��� ���Ұ�
		// i++;

		int i = 0; // do~while ���� ���ǽĿ� ����� ����
		do {
			System.out.println(i);
			i++;
		} while (i < 3);

		// ������� �Է��� ���ڷ� �޾Ƽ� ���, �ݺ�
		// 0�� �Է½� �ݺ� ����
		Scanner sc = new Scanner(System.in);

//		while(num != 0){	// �Է°��� 0�� �ƴϸ� �ݺ�
//			// �ٽ� �Է� �۾�
//			System.out.println("���ڸ� �Է��ϼ���");
//			num = sc.nextInt();
//			System.out.println(num);
//		}

		System.out.println("================");

		do {
			System.out.println("���ڸ� �Է��ϼ���");
			num = sc.nextInt();
			System.out.println(num);
		} while (num != 0);

	}

}
