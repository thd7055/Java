import java.util.Scanner;

public class Ex12_array {

	public static void main(String[] args) {
		/**
		 * �迭 : ���� Type �������� ����
		 * 		�迭�� - �迭�� ����Ǿ� �ִ� �ּҸ� �����Ѵ�. 
		 * 		�迭 ��ü ���� ���ÿ� �� Ÿ���� �⺻������ �ʱ�ȭ�ȴ�.
		 */

		int arr[]; // �迭 ���� ����
		arr = new int[3]; // �迭 ������ ��ü ����
		arr[0] = 2;		// �迭 ������ �ʱ�ȭ
		arr[1] = 3;
		arr[2] = 4; 
//		arr[3] = 4; // ArrayIndecOutOfBoundsException
		
		int brr[] = new int[3]; // �迭 ���� ����, ��ü����
		brr[0] = 2;
		brr[1] = 3;
		brr[2] = 4;
		System.out.println(brr[1]);
		
		// �迭 ���� ����, ��ü����, �ʱ�ȭ�� �ѹ��� 
		// ó�� ����ÿ��� ����
		int crr[] = {2, 3, 4};
		
		// �迭 ���� ����, ��ü����, �ʱ�ȭ�� �ѹ���  
		// �͸�迭�� ����ϴ� ���
		int drr[] = new int[] {2, 3, 4};
		
		int err[] = new int[3];
//		err = {2, 3, 4};  ���� �� �̷� ��� �ʱ�ȭ�� �Ұ���
		
		// �迭 3��¥�� ���� ���� �� 
		// ������� �Է��� ���ڷ� 3�� �޾Ƽ� ����
		// ����� �迭�� �� ���� ���, ����, ��� ���
		int frr[] = new int[3];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� 3�� �Է��ϼ���");
		
		for (int i = 0; i < frr.length; i++) {
			frr[i] = sc.nextInt();
		}
		
		//System.out.println("�Է��� ����: " +  frr[0] + "," + frr[1] + "," + frr[2]);
		for (int i = 0; i < frr.length; i++) {
			System.out.print("[" + frr[i]+ "]");
		}
		System.out.println();
		
		
		// int sum = frr[0] + frr[1] + frr[2];
		int sum = 0;
		for (int i = 0; i < frr.length; i++) {
			sum += frr[i];
		}
		
		double avg = sum/3;
		
		System.out.println("����: " + sum + ", ���: " + avg);


	}

}
