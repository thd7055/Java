import java.util.Scanner;

public class Ex06_scanner2 {

	public static void main(String[] args) {
		
		// ������� �Է��� ���ڷ� 3�� �޾Ƽ� �ִ밪 ���
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� 3���� �Է��ϼ���.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		System.out.println("�Էµ� ����: " + num1 + ", " + num2 + ", " + num3);
		
		// 3�� �̻��� �����͸� ���ؼ� �ִ밪/�ּҰ��� ã�°�� 
		// �ִ밪�� ������ ����
		// 1. ���� ���� ���� �ϳ��� ���� ��� 
		// 2. �̼��󿡼� �����ϴ� ���� ���� �� int max = Integer.MIN_VALUE;
		int max = num1; // �ʱⰪ �߿�
//		if(max < num1) max = num1; ���� ����
		if(max < num2) max = num2;
		if(max < num3) max = num3;
		System.out.println("�ִ밪: " + max);	
				

		// ��� 2
		/*if(num1 >= num2 && num1 >= num3){
			System.out.println("�ִ밪: " + num1);
		}else if(num2 >= num1 && num2 >= num3){
			System.out.println("�ִ밪: " + num2);
		}else{
			System.out.println("�ִ밪: " + num3);
		}*/
		
		
		
		// ��� 3
		/*if(num1 > num2){
			if(num1 > num3){
				System.out.println("�ִ밪: " + num1);
			}else{
				System.out.println("�ִ밪: " + num3);
			}
		}else if(num2 > num3){
			System.out.println("�ִ밪: " + num2);
		}else{
			System.out.println("�ִ밪: " + num3);
		}*/


	}

}
