
public class Ex08_multipleFor {

	public static void main(String[] args) {
		
		// 다중for문 구구단 출력
		
		for(int i = 0; i<3; i++){		// 행
			for(int j = 0; j <2; j++){  // 열
				System.out.println(i + ", " + j);
			}
		}
		
		System.out.println();
		
		// 구구단  (가로로 출력)
		for(int i = 1; i<10; i++){
			for(int j = 2; j<10; j++){
				System.out.printf("%d * %d = %2d\t", j , i, i*j);
			}
			System.out.println("=============");
		}


	}

}
