
public class Ex09_breakContinue {

	public static void main(String[] args) {
		/*
		 * 반복문 제어 
		 * break: 가장 가까운 switch문 or 반복문 1개를 빠져나간다.
		 * continue: 현재 반복문의 다음 차수로 진행
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
		
		// 1 ~ 100 까지의 합을 누적하다가 1000을 넘어가기 직전 값 출력
		int sum = 0;
		for(int i = 1; i <=100; i++ ){
			sum += i;
			
			if( sum > 1000){
				sum = sum - i;
				break;
			}
		}
		System.out.println(sum);
		
		// continue : 반복문의 다음차수로 진행
		for(int i = 0; i< 10; i++){
			if(i%2 == 0){ // 짝수이면
				continue;
			}
			
			System.out.println(i);
		}
		
		// 7의 배수만 출력
		for(int i = 1; i < 100; i++){
			
			if(i % 7 != 0){
				continue;
			}
			System.out.print(i + " ");
		}
		
		// 구구단 2 단을 출력 
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
