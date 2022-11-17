import java.util.Scanner;

public class ArrayToBigNumber {
	public static Scanner scanner = new Scanner(System.in);

	public static double tinhLog(long a) {
		return Math.log(a) / Math.log(2);
	}

	public static void main(String[] args) {
		int m, W, t, i;
		long p, a;
		a = 0;
		W = 8;
		p = 2147483647;
		m = (int) tinhLog(p) + 1;
		t = m / W + 1;
		System.out.println("m: " + m);
		System.out.println("\nt: " + t);
		int[] mang = new int[t];
		for (i = 0; i < t; i++) {
			System.out.print("\nGia tri mang[" + i + "]: ");
			mang[i] = scanner.nextInt();
		}
		scanner.close();
		for (i = t - 1; i >= 0; i--) {
			a = (long) (a + (mang[i] * Math.pow(2, i * W)));
		}
		System.out.println("\nSo a la: " + a);
	}
}
