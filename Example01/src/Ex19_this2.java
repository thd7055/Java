
public class Ex19_this2 {
	int i;
	double d;

	// 멤버변수인 int형 i와 파라미터인 int형 i가 변수명이 같다.
	// 따라서 이를 구분하기위해 멤버변수인 i 앞에 this를 붙임으로서 구별을한다.
	public void Method1(int i) {
		this.i = i;
	}

	// 멤버변수인 double형 d와 파라미터인 double형 d가 변수명이 같다.
	// 따라서 이를 구분하기위해 멤버변수인 d 앞에 this를 붙임으로서 구별을한다.
	public void Method1(double d) {
		this.d = d;
	}

	public static void main(String[] args) {

		Ex19_this2 t = new Ex19_this2();
		t.Method1(100);
		t.Method1(3.14);
		System.out.println(t.i);
		System.out.println(t.d);

	}

}
