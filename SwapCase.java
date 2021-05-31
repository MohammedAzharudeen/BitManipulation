package BitManipulation;

import java.util.*;

public class SwapCase {
	static int x=32;    //global variable
    
    public static String toggleCase(char[] a)
    {
        for (int i=0; i<a.length; i++) {
            a[i]^=32;
        }
        return new String(a);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		System.out.println(toggleCase(str.toCharArray()));
	}

}
