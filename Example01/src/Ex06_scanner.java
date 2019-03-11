import java.util.Scanner;

public class Ex06_scanner {

	public static void main(String[] args) {
		// 사용자의 입력 받기 : Scanner
		
		// 사용자의 입력을 받기 위한 객체를 준비
		// Scanner 클래스 메서드 분석
		// 1. nextInt() : 숫자를 입력받는데, 숫자앞에 나오는 화이트스페이스(빈칸 or 엔터)는 제거하고
		//				int 형으로 취할 수 있는 숫자를 받아간다.
		// 2. nextLine() : 문자열을 입력받음, 엔터를 입력할 때 까지 값을 받아서와서
		//					엔터는 삭제하고 앞터 앞의 문자열만 받아간다.
		// 3. next() : 문자를 입력받음
		//				문자열 앞쪽에 나오는 화이트 스페이스는 제거하고
		//				화이트스페이스 전까지의 문자열만 받아간다.


        Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요.");
		String name = sc.nextLine();
		System.out.println("당신의 이름은 : " + name);
		
		System.out.println("나이를 입력하세요.");
		int age = sc.nextInt();
		System.out.println("10년 후  나이는: " + (age+10));


	}

}
