
public class Ex04_ifElse {

	public static void main(String[] args) {
		
		// 자바의 흐름제어 : 삼항연산자, if ~ else, switch ~ case
		
		//		if(조건식) { // true or false
		//			참일 경우 수행
		//		}else{
		//			거짓일 경우 수행	
		//		}
		
		int num = 30;
		if(num > 30){
			System.out.println("num은 30보다 크다.");
		}else{
			System.out.println("30보다 안큼 else문");
		}
		
		//	    if(조건식1){
		//			참일경우 수행
		//		}else if (조건식2){
		//			조건식 2가 참일 경우 수행
		//		}else if (조건식3){
		//			조건식 3이 참일 경우 수행
		//		}else{
		//			위 조건들이 모두 거짓일 때 
		//		}
		
		//10, 9 수 8 우  7미 6양 나머지 가
		num = 8;
		if (num == 10 || num ==9) {
			System.out.println("수");
		} else if ( num == 8 ) {
			System.out.println("우");
		} else if (num == 7) {
			System.out.println("미");
		} else {
			System.out.println("가");
		}
		
		//100이하~90 이상 수, 90미만~80이상 우, 80미만~70이상 미, 70미만~60이상 양, 나머지 가
		num = 78;
		if (num <= 100 && num >= 90) {
			System.out.println("수");
		} else if ( num < 90 && num >= 80 ) {
			System.out.println("우");
		} else if (num < 80 && num >= 70) {
			System.out.println("미");
		} else if (num < 70 && num >= 60) {
			System.out.println("양");
		}else {
			System.out.println("가");
		}
		
		//짝수 홀수 판단해서 출력하기
		num = 7;
		if(num % 2 == 0){
			System.out.println("짝수");
		}else{
			System.out.println("홀수");
		}
		
		
		// 양수인지 0인지 음수인지 판단해서 출력
		num = -3;
		if( num > 0 ){
			System.out.println("양수");
		}else if( num == 0){
			System.out.println(0);
		}else{
			System.out.println("음수");
		}


	}

}
