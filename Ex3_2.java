import java.util.Scanner;

class Ex3_2
 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数A：");
		int x = stdIn.nextInt();
		
		System.out.print("整数B：");
		int y = stdIn.nextInt();
		
		if (x % y == 0)
			System.out.println("BはAの約数です。");
		
		else
			System.out.println("BはAの約数ではありません。");
		
		

	}
}
