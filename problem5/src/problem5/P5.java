package problem5;
import java.util.Scanner;
import java.util.Arrays;
public class P5 {

	public static void main(String[] args) {
		// if/else check if it's odd or even
		System.out.println("Type your number! (within 1-11 characters otherwise it won't work, thank you)");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		
		if(x%2==0) {
			System.out.println( x +" is an even number! :-D" );
		}
		else {
			System.out.println( x + " is an odd number! :^D");
		}
		

	}

}
