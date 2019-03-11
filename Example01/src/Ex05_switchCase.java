import java.util.Scanner;

public class Ex05_switchCase {

	public static void main(String[] args) {
		
		// �ڹ��� �帧���� : ���׿�����, if ~ else, switch ~ case
		
		/*
			switch(���ǰ�){  // int�� ���� �̳��� ���� or ���ڿ�String
			case ��1:	-> ��
				���๮;
				break; 	-> switch���� ���������� ���๮
			case ��1:
				���๮;
				break;
			default : 	-> ���ǰ��� ���� case���� �ϳ��� ���� ��� ����ȴ�. �����������.
			 	���๮;
			 	break;
			}
		*/

		int num = 2;
		switch(num){
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
			break;
		default:
			System.out.println("���� ���� ����");
			break;
		}
		
		// 10 9  ��, 8 ��, 7 ��, 6 ��, ������ �� 
		num = 8;
		switch(num){
		case 10:
		case 9:
			System.out.println("��");
			break;
		case 8:
			System.out.println("��");
			break;
		case 7:
			System.out.println("��");
			break;
		case 6:
			System.out.println("��");
			break;
		default:
			System.out.println("��");
			break;
		}

		num = 88;
		// 100 ����  90�̻� ��, 90 �̸� 80�̻� ��, 80 �̸� 70�̻� ��, 70�̸� 60�̻� �� ������ ��
		switch(num/10){
		case 10:
		case 9:
			System.out.println("��");
			break;
		case 8:
			System.out.println("��");
			break;
		case 7:
			System.out.println("��");
			break;
		case 6:
			System.out.println("��");
			break;
		default:
			System.out.println("��");
			break;
		}
		
		// ������� �Է��� ���ڷ� �� (1~12) �Է��� �޾Ƽ�
		// ���ϱ��� �ִ��� ����ϱ� ScannerȰ��, switch�� Ȱ��
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���.");
		int month = sc.nextInt();
		
		switch(month){
			case 2:
				System.out.println(month + "���� 28�ϱ��� �Դϴ�.");
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(month + "���� 31�ϱ��� �Դϴ�.");
				break;			
			default:
				System.out.println(month + "���� 31�ϱ��� �Դϴ�.");
				break;
		
		}

	}

}
