import java.util.Scanner;

public class TruChinhXacBoi {
	public static Scanner nhap = new Scanner(System.in);

	public static double tinhLog(long a) {
		return Math.log(a) / Math.log(2);
	}

	public static void main(String[] args) {
		int m, W, t, i, e;
		long p;
		W = 8;
		p = 2147483647;
		m = (int) tinhLog(p) + 1;
		t = m / W + 1;
		e = 0;
		int[] a = new int[t];
		int[] b = new int[t];
		int[] c = new int[t];
		for (i = 0; i < t; i++) {
			System.out.print("Gia tri a[" + i + "]: ");
			a[i] = nhap.nextInt();
		}
		System.out.print("\n");
		for (i = 0; i < t; i++) {
			System.out.print("Gia tri b[" + i + "]: ");
			b[i] = nhap.nextInt();
		}
		System.out.print("\n");
		for (i = 0; i < t; i++) {
			c[i] = a[i] - b[i];
			System.out.print("Gia tri c[" + i + "]: " + c[i]);
			System.out.print("\n");
		}
		System.out.print("\n");
		for (i = 0; i < t; i++) {
			if (c[i] < 0) {
				e = 1;
				c[i] += Math.pow(2, W);
				c[i + 1] -= e;
			} else {
				e = 0;
			}
		}
		System.out.print("\n");
		for (i = 0; i < t; i++) {
			System.out.print("Gia tri c[" + i + "] moi: " + c[i]);
			System.out.print("\n");
		}
		System.out.print("\n");
		System.out.println("Gia tri cua e: " + e);
	}
}
