import java.util.Scanner;

class PersonTester {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���O�F");
		String firstName = stdIn.next();
		
		System.out.print("�����F");
		String lastName = stdIn.next();
		
		System.out.print("�N��F");
		int age = stdIn.nextInt();
		
		System.out.print("�g���F");
		double height = stdIn.nextDouble();
		
		System.out.print("�̏d�F");
		double weight = stdIn.nextDouble();
		
		Person.printData(Person.fullName(firstName, lastName), age, height, weight);
	}
}