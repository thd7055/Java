
public class Ex24_instanceof {

	public static void main(String[] args) {
		
		/*
		 * instanceof 
		 * � Ÿ�Կ� ���� instanceof������ ����� true��� ���� �˻��� Ÿ������ ����ȯ�� �����ϴٴ� ���� ���Ѵ�.
		 */
		
		Human h = new Human();
		Boy b = new Boy();
		Girl g = new Girl();
		Baby ba = new Baby();

		// �迭�� �������� Ÿ���� �����غ��� (�迭: ���� Ÿ�Ը� ���� ����)
		// Human hh = b; hh = g; hh = ba; hh = h;
		Human arrH[] = new Human[4];
		arrH[0] = h;
		arrH[1] = b;
		arrH[2] = g;
		arrH[3] = ba; // ������

//		Human arrH2[] = {h, b, g, ba};  �̷��Ե� ����
		for (int i = 0; i < arrH.length; i++) {
			// ����ȯ �� ����� ���
			if (arrH[i] instanceof Boy) {
				Boy bb = (Boy) arrH[i];
				System.out.println(bb.name + bb.strong);
			} else if (arrH[i] instanceof Girl) {
				Girl gg = (Girl) arrH[i];
				System.out.println(gg.name + gg.money);
			} else if (arrH[i] instanceof Baby) {
				Baby bbb = (Baby) arrH[i];
				System.out.println(bbb.name + bbb.age);
			} else { // ����ȯ�� �ȵǴ� ��� Human
				System.out.println(arrH[i].name);
			}
		}

		print(h);
		print(b);
		print(g);
		print(ba);

	}

	// �̷��Ե� �����ϴ�
	static void print(Human h) { // �Ű������� ������
		// ����ȯ
		if (h instanceof Boy) {
			Boy bb = (Boy) h;
			System.out.println(bb.name + bb.strong);
		} else if (h instanceof Girl) {
			Girl gg = (Girl) h;
			System.out.println(gg.name + gg.money);
		} else if (h instanceof Baby) {
			Baby bbb = (Baby) h;
			System.out.println(bbb.name + bbb.age);
		} else { // ����ȯ�� �ȵǴ� ��� Human
			System.out.println(h.name);
		}
	} // end of print
}

class Human {
	String name = "����";
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
