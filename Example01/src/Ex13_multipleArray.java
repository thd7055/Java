
public class Ex13_multipleArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3 }; // 1���� �迭
		int brr[][] = { { 1, 2, 3 }, { 2, 3, 4 } }; // 2���� �迭

		System.out.println(arr.length); // 3 �迭�� ũ��(����)
		System.out.println(brr.length); // 2
		System.out.println(brr[0].length); // 3

		int crr[][] = new int[2][3];
		crr[0][0] = 1;
		crr[0][1] = 2;
		crr[0][2] = 3;
		crr[1][0] = 2;
		crr[1][1] = 3;
		crr[1][2] = 4;

		// 123
		// 234
		for (int i = 0; i < crr.length; i++) {
			for (int j = 0; j < crr[i].length; j++) {
				System.out.print(crr[i][j]);
			}
			System.out.println(); // �� �ٲ�
		}

		// �迭 ���� ���
		int[][] drr;
		int[] err[];
		int frr[][];
		int grr[];
		int[] hrr;

	}

}
