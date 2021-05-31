package BitManipulation;

import java.util.*;

public class CaseConversion {

	public static char upperToLower(char ch) {
		return (char)(ch^32);
	}
	
	public static char lowerToUpper(char ch) {
		return (char)(ch & ~32);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter upper case letter :");
		char ch = sc.next().charAt(0);
		System.out.println(upperToLower(ch));
		System.out.println("Enter lower case letter :");
		char ch1 = sc.next().charAt(0);
		System.out.println(lowerToUpper(ch1));
		sc.close();
		
		
		
	}

}
