
public class Ex01_numberString {

	public static void main(String[] args) {
		
		// 자바에서는 따옴표가 없는 숫자는 숫자로 인식한다.
		System.out.println(1+2);
		System.out.println(1.2+1.3);
		
		// 곱하기를 할 때는 *(에스터리스크, Asterisk, 키보드 자판상으로 숫자 8 위)를 사용한다.
		System.out.println(2*5);
		
		// 나누기를 할 때는 /(슬래쉬, slash, 키보드 자판상으로 오른쪽 shift 키 왼쪽)를 사용한다.
		System.out.println(6/2);
		
		// 문자열은 "(큰따옴표)로 감싸야 한다.
		System.out.println("Hello Wold");
		
		// 문자와 문자를 더할 때
		System.out.println("Hello" + "Wold");
		
		// 문자열 안에 큰 따옴표를 넣을 때 "앞에 \추가
		System.out.println("egoing said \"Welcome programming world\"");
		
	}

}
