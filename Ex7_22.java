import java.util.Scanner;

class Ex7_22 {
	
	static int[] arrayClone(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = i;
		} return a;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("—v‘f”‚ÍF");
		int n = stdIn.nextInt();
		int[] x = arrayClone(n);
		
		for (int i = 0; i < n; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}
	}
}