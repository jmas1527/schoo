import java.util.Scanner;
import java.util.Random;

class Exercise7_16{
	
	
	static int minOf(int []a){
		
		int min=a[0];
		for(int i=1;i<a.length;i++){
			if(a[i]<min){
				min=a[i];
			}
		}
		return min;
	}
	
	public static void main(String[]args){
		
			System.out.print(minOf(new int[]{1,2,3}));
	}
}
