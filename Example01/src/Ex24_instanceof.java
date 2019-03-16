
public class Ex24_instanceof {

	public static void main(String[] args) {
		
		/*
		 * instanceof 
		 * 어떤 타입에 대한 instanceof연산의 결과가 true라는 것은 검사한 타입으로 형변환이 가능하다는 것을 뜻한다.
		 */
		
		Human h = new Human();
		Boy b = new Boy();
		Girl g = new Girl();
		Baby ba = new Baby();

		// 배열에 여러가지 타입을 저장해보자 (배열: 같은 타입만 저장 가능)
		// Human hh = b; hh = g; hh = ba; hh = h;
		Human arrH[] = new Human[4];
		arrH[0] = h;
		arrH[1] = b;
		arrH[2] = g;
		arrH[3] = ba; // 다형성

//		Human arrH2[] = {h, b, g, ba};  이렇게도 가능
		for (int i = 0; i < arrH.length; i++) {
			// 형변환 후 멤버를 출력
			if (arrH[i] instanceof Boy) {
				Boy bb = (Boy) arrH[i];
				System.out.println(bb.name + bb.strong);
			} else if (arrH[i] instanceof Girl) {
				Girl gg = (Girl) arrH[i];
				System.out.println(gg.name + gg.money);
			} else if (arrH[i] instanceof Baby) {
				Baby bbb = (Baby) arrH[i];
				System.out.println(bbb.name + bbb.age);
			} else { // 형변환이 안되는 경우 Human
				System.out.println(arrH[i].name);
			}
		}

		print(h);
		print(b);
		print(g);
		print(ba);

	}

	// 이렇게도 가능하다
	static void print(Human h) { // 매개변수의 다형성
		// 형변환
		if (h instanceof Boy) {
			Boy bb = (Boy) h;
			System.out.println(bb.name + bb.strong);
		} else if (h instanceof Girl) {
			Girl gg = (Girl) h;
			System.out.println(gg.name + gg.money);
		} else if (h instanceof Baby) {
			Baby bbb = (Baby) h;
			System.out.println(bbb.name + bbb.age);
		} else { // 형변환이 안되는 경우 Human
			System.out.println(h.name);
		}
	} // end of print
}

class Human {
	String name = "쏭알";
}

class Boy extends Human {
	int strong = 10;
}

class Girl extends Human {
	int money = 200;
}

class Baby extends Human {
	int age = 3;
}
