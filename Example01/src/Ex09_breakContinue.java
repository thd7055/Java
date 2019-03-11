
public class Ex09_breakContinue {

	public static void main(String[] args) {
		/*
		 * �ݺ��� ���� 
		 * break: ���� ����� switch�� or �ݺ��� 1���� ����������.
		 * continue: ���� �ݺ����� ���� ������ ����
		*/
		
		for(int i = 0; i < 10; i++){
			System.out.println(i);
			if(i == 3){
				break;
			}
		}

		// 2 4 6 8 10 12
		for(int i = 2; i < 100; i+=2){
			System.out.print(i + " ");
			if( i == 12){
				break;
			}
		}
		
		System.out.println();
		
		// 1 ~ 100 ������ ���� �����ϴٰ� 1000�� �Ѿ�� ���� �� ���
		int sum = 0;
		for(int i = 1; i <=100; i++ ){
			sum += i;
			
			if( sum > 1000){
				sum = sum - i;
				break;
			}
		}
		System.out.println(sum);
		
		// continue : �ݺ����� ���������� ����
		for(int i = 0; i< 10; i++){
			if(i%2 == 0){ // ¦���̸�
				continue;
			}
			
			System.out.println(i);
		}
		
		// 7�� ����� ���
		for(int i = 1; i < 100; i++){
			
			if(i % 7 != 0){
				continue;
			}
			System.out.print(i + " ");
		}
		
		// ������ 2 ���� ��� 
		for(int i = 0; i < 10; i++){
			System.out.printf("2 * %d = %2d\n", i , i*2);
			
			/*if(i * 2 < 10){
				System.out.println(2 + "*" +  i + "= " + 2*i);
			}else{
				System.out.println(2 + "*" +  i + "=" + 2*i);
			}*/
		}
	}

}
