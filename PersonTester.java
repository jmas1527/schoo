import java.util.Scanner;

class PersonTester {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("名前：");
		String firstName = stdIn.next();
		
		System.out.print("名字：");
		String lastName = stdIn.next();
		
		System.out.print("年齢：");
		int age = stdIn.nextInt();
		
		System.out.print("身長：");
		double height = stdIn.nextDouble();
		
		System.out.print("体重：");
		double weight = stdIn.nextDouble();
		
		Person.printData(Person.fullName(firstName, lastName), age, height, weight);
	}
}