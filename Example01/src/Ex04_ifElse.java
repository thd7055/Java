
public class Ex04_ifElse {

	public static void main(String[] args) {
		
		// �ڹ��� �帧���� : ���׿�����, if ~ else, switch ~ case
		
		//		if(���ǽ�) { // true or false
		//			���� ��� ����
		//		}else{
		//			������ ��� ����	
		//		}
		
		int num = 30;
		if(num > 30){
			System.out.println("num�� 30���� ũ��.");
		}else{
			System.out.println("30���� ��ŭ else��");
		}
		
		//	    if(���ǽ�1){
		//			���ϰ�� ����
		//		}else if (���ǽ�2){
		//			���ǽ� 2�� ���� ��� ����
		//		}else if (���ǽ�3){
		//			���ǽ� 3�� ���� ��� ����
		//		}else{
		//			�� ���ǵ��� ��� ������ �� 
		//		}
		
		//10, 9 �� 8 ��  7�� 6�� ������ ��
		num = 8;
		if (num == 10 || num ==9) {
			System.out.println("��");
		} else if ( num == 8 ) {
			System.out.println("��");
		} else if (num == 7) {
			System.out.println("��");
		} else {
			System.out.println("��");
		}
		
		//100����~90 �̻� ��, 90�̸�~80�̻� ��, 80�̸�~70�̻� ��, 70�̸�~60�̻� ��, ������ ��
		num = 78;
		if (num <= 100 && num >= 90) {
			System.out.println("��");
		} else if ( num < 90 && num >= 80 ) {
			System.out.println("��");
		} else if (num < 80 && num >= 70) {
			System.out.println("��");
		} else if (num < 70 && num >= 60) {
			System.out.println("��");
		}else {
			System.out.println("��");
		}
		
		//¦�� Ȧ�� �Ǵ��ؼ� ����ϱ�
		num = 7;
		if(num % 2 == 0){
			System.out.println("¦��");
		}else{
			System.out.println("Ȧ��");
		}
		
		
		// ������� 0���� �������� �Ǵ��ؼ� ���
		num = -3;
		if( num > 0 ){
			System.out.println("���");
		}else if( num == 0){
			System.out.println(0);
		}else{
			System.out.println("����");
		}


	}

}
