package BitManipulation;

import java.util.*;

public class OddorEven {
	
	public static boolean oddoreven1(int a) {
		if((a&1)!=1) {
			return true;
		}
		return false;
	}
	
	public static boolean oddoreven2(int a) {
		if((a^1)==a+1) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		sc.close();
		System.out.println(oddoreven1(a) == true?"Even":"Odd");
		System.out.println(oddoreven2(a) == true?"Even":"Odd");
	}

}
