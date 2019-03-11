
public class Ex03_operator {

	public static void main(String[] args) {
		// ������(Operator) : ��ȣ, �ǿ����ڸ� ����
		// 					�ǿ������� ������ ���� ����: ��Ȳ������, ���׿�����, ���׿�����, ���Կ�����

		//���� ������ : + - ++ -- ! ~
		int a = 3;
		System.out.println(-a); // ��ȣ ������ + -
		
		a = 3;
		// ���� ������
		a++; // a = a + 1;
		System.out.println(a);
		
		a = 3;
		System.out.println(++a);	// 4  ��ġ ���� ������ : ���� �� ����
		System.out.println(a);		// 4		
		
		a = 3; 
		System.out.println(a++);	// 3 ��ġ ���� ������ : ���� �� ����
		System.out.println(a);		// 4
		
		a = 3;
		// a = ++a + a++ ++a + a++; �����ڵ�
		System.out.println(a);
		
		// �� ���� ������ !
		boolean b = true;
		System.out.println(!b);		//�� ���� �ݴ밪
		
		// ��Ʈ ���� ������ ~
		int c = 3;
		System.out.println(~c);		// -4

		// ���� ������ : ���������, ��Ʈ������, ��������, �񱳿�����
		// ��Ģ : �� �ǿ������� Ÿ���� ���� ���ƾ� �Ѵ�.
		// 		Ÿ���� �ٸ��� �����Ϸ��� ����ȯ���ش�. (������ ����ȯ)
		//		����� ���� Ÿ���� ���´�.
		System.out.println(7 + 3);	//10
		System.out.println(7 - 3);	//4
		System.out.println(7 * 3);	//21
		System.out.println((double)7 / 3);	//2.3333
		System.out.println(7 % 3);	//1 (������ ������, ���� ������)
		
		// ��Ʈ ������ | & ^
		System.out.println(13 & 5);	// 5
		System.out.println(13 | 5);	// 13 
		System.out.println(13 ^ 5);	// 8  �ٸ��� ��
		
		System.out.println( true & true ); // true
		System.out.println( true & false ); // false
		System.out.println( false & true ); // false
		System.out.println( false & false ); // false
		
		System.out.println( true | true ); // true
		System.out.println( true | false ); // true
		System.out.println( false | true ); // true
		System.out.println( false | false ); // false
		
		// �� ������ && || (ȿ������ ����)
		System.out.println( true && true ); // true
		System.out.println( true && false ); // false
		System.out.println( false && true ); // false
		System.out.println( false && false ); // false
		
		System.out.println( true || true ); // true
		System.out.println( true || false ); // true
		System.out.println( false || true ); // true
		System.out.println( false || false ); // false

		//�񱳿����� < > <= >= ==(����) !=(�ٸ���)
		System.out.println( 3 < 5 );	// true
		System.out.println( 3 >= 5 );	// false
		System.out.println( 3 == 5 );	// false
		System.out.println( 3 != 5 );	// true
		
		// ����Ʈ ������ <<  >>
		System.out.println(1 << 3);		// 8 = 1 *2 *2 *2
		System.out.println(16 >> 3); 	// 2 = 16 /2 /2 /2
		
		
		//���� ������ (���ǽ�) ? (���� ���) : (������ ���)
		int num = 3 < 5 ? 100 : -100;
		System.out.println(num);
		System.out.println( 3 == 5 ? "��" : 3.14);
		
		
		//���Կ�����  =�� ���׿������� ����
		num = 3;
		num += 3;	// num = num + 3;
		num -= 3;	// num = num - 3;
		num *= 3;	// num = num * 3;
		num /= 3;	// num = num / 3;
		num %= 3;	// num = num % 3;
		num |= 3;	// num = num | 3;
		num &= 3;	// num = num & 3;
		num ^= 3;	// num = num ^ 3;
		
		int d = 3, f, e = 4;	// �޸� ������ : ���� Ÿ���� �ϳҤ��� ���� �� �� �ִ�.
		f = d = e = 5; 			// ���Կ�����  ( �� -> �� )
		
		d = 3 + 4 + 2 + 1 + 1;
		
		System.out.println(3 * 4 == 12 && 2 + 1 < 4);	// true
		
		
		/////////////////////////////////////////////////////////////////////
		
		
		
		// �ﰢ���� ���̸� ����ϴ� �ڵ� �ۼ�
		// (����) �ﰢ���� ���� = �غ� * ���� / 2
		int w = 10, h = 5;
		System.out.println("�ﰢ���� ���� :" + w * h / 2);
		
		
		// ����� ��µ� �ʿ��� �ٱ����� ���� ���ϴ� �ڵ��ۼ�
		// ���� ����� ���� 123���̰� �ϳ��� �ٱ��Ͽ��� 10���� ����� ���� �� �ִٸ�
		// 13���� �ٱ��ϰ� �ʿ��� ���̴�.
		int numOfApples = 123;	// ����� ����
		int sizeOfBucket = 10;	// �ٱ����� ũ��(�ٱ��Ͽ� ���� �� �ִ� ����� ��)
		int numOfBucket = (numOfApples / sizeOfBucket) + (numOfApples%sizeOfBucket == 0? 0 : 1) ;
		System.out.println("�ʿ��� �ٱ����� �� :" + numOfBucket); 	// 13
		
		// �Ž�����
		int coin = 3780;
		System.out.println("500�� ¥�� : " + coin/500 + "��");			// 7��
		System.out.println("100�� ¥�� : " + (coin%500)/100 + "��");	// 2��
		System.out.println(" 50�� ¥�� : " + (coin%100)/50 + "��");	// 1��
		System.out.println(" 10�� ¥�� : " + (coin%50)/10 + "��");		// 3��	

	}

}
