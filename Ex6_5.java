import java.util.Scanner;

class Ex6_5 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("—v‘f”F");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.print("a = {");
			
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i]);
				System.out.print((i + 1 == a.length) ? "" : ", ");
			}
			
			System.out.print("}");
		
	}
}
