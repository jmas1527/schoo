import java.util.Scanner;

class Ex3_8
 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("点数：");
		int a = stdIn.nextInt();
		
		if (a >= 80 && a <= 100)
			System.out.println("優");
		else if (a >= 70 && a <= 79)
			System.out.println("良");
		else if (a >= 60 && a <= 69)
			System.out.println("可");
		else if (a <= 59)
			System.out.println("不可");
		

	}
}
