package rotLeft;

public class RotLeft {
	public static void main(String[] agrs) {
		int[] a = { 1, 2, 3, 4, 5 };
		int d = 2;
		int z = 0;

		while (z < d) {
			int temp = a[0];
			for (int i = 0; i < a.length-1; i++) {
				a[i] = a[i + 1];
			}
			a[a.length - 1] = temp;
			z++;
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
