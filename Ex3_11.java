import java.util.Scanner;

class Ex3_11
 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値：");
		int a = stdIn.nextInt();
		System.out.print("整数値：");
		int b = stdIn.nextInt();
		
		System.out.println(a - b <= 10 || b - a <= 10 ? "それらの差は10以下です。" : "それらの差は11以上です。");

	}
}
