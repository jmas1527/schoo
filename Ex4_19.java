import java.util.Scanner;

class Ex4_19 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int retry;
		
		do {
			System.out.println("�G�߂����߂܂��B");
			int month;
			
			do {
				System.out.print("�����ł����F");
				month = stdIn.nextInt();
			} while (month <= 0 || month > 12);
			
			if (month >= 3 && month <= 5) {
				System.out.println("����͏t�ł��B");
			} else if (month >= 6 && month <= 8) {
				System.out.println("����͉Ăł��B");
			} else if (month >= 9 && month <= 11) {
				System.out.println("����͏H�ł��B");
			} else {
				System.out.println("����͓~�ł��B");
			}
			
			System.out.print("������x�H�@1�cYes�^0�cNo�F");
			retry = stdIn.nextInt();
		} while (retry == 1);
	}
}

