
public class Ex08_multipleFor {

	public static void main(String[] args) {
		
		// ����for�� ������ ���
		
		for(int i = 0; i<3; i++){		// ��
			for(int j = 0; j <2; j++){  // ��
				System.out.println(i + ", " + j);
			}
		}
		
		System.out.println();
		
		// ������  (���η� ���)
		for(int i = 1; i<10; i++){
			for(int j = 2; j<10; j++){
				System.out.printf("%d * %d = %2d\t", j , i, i*j);
			}
			System.out.println("=============");
		}


	}

}
