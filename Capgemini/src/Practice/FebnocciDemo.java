package Practice; //jay prakash malviya

public class FebnocciDemo {

	public static void main(String args[]) {
		int a = 0;
		int b = 1;
		int c, i;
		int Sum = 20;
		System.out.println(a + " " + b);

		for (i = 2; i < Sum; ++i) {
			c = a + b;
			System.out.println(" " + c);
			a = b;
			b = c;
		}
	}
}