
public class Ex13_multipleArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3 }; // 1차원 배열
		int brr[][] = { { 1, 2, 3 }, { 2, 3, 4 } }; // 2차원 배열

		System.out.println(arr.length); // 3 배열의 크기(길이)
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
			System.out.println(); // 줄 바꿈
		}

		// 배열 선언 방법
		int[][] drr;
		int[] err[];
		int frr[][];
		int grr[];
		int[] hrr;

	}

}
