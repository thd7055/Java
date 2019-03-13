
public class Ex19_this {
	int i;
	double d;

	// This_1()생성자 메서드내에서 자기 자신의 또다른 생성자를
	// this()를 이용해서 호출한다.
	public Ex19_this(int i) {
		this(3.14); // 10라인의 생성자를 호출
		System.out.println(i);
	}

	public Ex19_this(double d) {
		System.out.println(d);
	}

	public static void main(String[] args) {
		Ex19_this t = new Ex19_this(100);


	}

}
