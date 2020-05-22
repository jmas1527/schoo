import java.util.Scanner;

class Ex3_14
 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値：");	int a = stdIn.nextInt();
		System.out.print("整数値：");	int b = stdIn.nextInt();
		
		if (a == b) {
			System.out.println("二つの値は同じです。");
		}

	}
}
