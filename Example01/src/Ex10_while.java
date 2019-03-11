import java.util.Scanner;

public class Ex10_while {

	public static void main(String[] args) {
		/*
		 * �ڹ��� �ݺ��� : while for : �� ȸ or �󸶱��� �ݺ����� �̸� �˰� �ִ� ��� ��� while : �ݺ� Ƚ���� �� ��� ���
		 */

		// while(���ǽ�){ // ���ǽ� : boolean Ÿ��
		// �ݺ��� ���๮;
		// }

		int num = 3; // �ʱ��
		while (num > 0) { // ���ǽ�
			System.out.println(num); // �ݺ��� ���๮
			num--; // ������
		}
		System.out.println("while end");

		// �� while���� for������ ����
		for (int i = 3; i > 0; i--) {
			System.out.println(i);
		}
		System.out.println("for end");

		System.out.println("=============");

		// 1 2 3 4 5
		int num1 = 1;
		while (num1 <= 5) {
			System.out.print(num1 + " ");
			num1++;
		}

		System.out.println();
		System.out.println("=============");

		// 0,1,2,3,4,5,6
		int num2 = 0;
		while (num2 <= 6) {
			if (num2 < 6) {
				System.out.print(num2 + ", ");
			} else {
				System.out.print(num2);
			}
			num2++;
		}

		System.out.println();
		System.out.println("=============");

		// 13, 26, 39 ....., ???? ���ڸ��� �� 13�� �������
		int count = 13;
		while (count <= 9999) {
			if (count != 13) {
				System.out.print("," + count);
			} else {
				System.out.print(count);
			}
			count += 13;
		}

		System.out.println();
		System.out.println("=============");

		// ������� �Է��� ���ڷ� �޾Ƽ� ���
		// 0�� �Է��ϴ� ���� ����
		num = -1;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("���ڸ� �Է��ϼ���.");
			num = sc.nextInt();
			if (num == 0) { // �ݺ��� ����
				System.out.println("����");
				break; // switch�� or ���� ����� �ݺ��� 1���� ����������.
			}
			System.out.println("�Է��� ��:" + num);
		}

		System.out.println("=============");

	}

}
