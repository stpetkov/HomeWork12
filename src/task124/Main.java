package task124;

public class Main {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 5, 3, 8, 12, 13, 16, 17, 23 };
		int[] odd = new int[5];
		int[] even = new int[5];
		int count0 = 0;
		int count1 = 0;
		for (int a : arr) {
			if (a % 2 == 0) {
				odd[count0] = a;
				count0++;
			} else {
				even[count1] = a;
				count1++;
			}
		}
		System.out.println("Even : ");
		for (int b : odd) {
			System.out.print(b + " ");
		}
		System.out.println("");
		System.out.println("Odd : ");
		for (int b : even) {
			System.out.print(b + " ");
		}
	}

}
