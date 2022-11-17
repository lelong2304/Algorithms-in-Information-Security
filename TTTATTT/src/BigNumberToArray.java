import java.util.Scanner;

public class BigNumberToArray {
	public static Scanner scanner = new Scanner(System.in);

	public static double tinhLog(long a) {
		return Math.log(a) / Math.log(2);
	}

	public static void main(String[] args) {
		int m, W, t, i;
		long p, tam;
		System.out.print("Nhap a: ");
		long a = scanner.nextLong();
		scanner.close();
		W = 8;
		p = 2147483647;
		m = (int) tinhLog(p) + 1;
		t = m / W + 1;
		System.out.println("\nm: " + m);
		System.out.println("\nt: " + t);
		int[] mang = new int[t];
		// System.out.println((int) (a / Math.pow(2, 24)));
		// System.out.println((long) (a % Math.pow(2, 24)));
		tam = a;
		System.out.print("\n");
		for (i = t - 1; i >= 0; i--) {
			mang[i] = ((int) (tam / Math.pow(2, i * W)));
			tam = (long) (tam % Math.pow(2, i * W));
			System.out.println("A[" + i + "]: " + mang[i]);
		}
	}
}
