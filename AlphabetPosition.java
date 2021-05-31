package BitManipulation;

import java.util.*;

public class AlphabetPosition {

	public static void position(char[] ch) {
		int len = ch.length;
		for(int i=0;i<len;i++) {
			ch[i]^=32;
			System.out.print((int)(ch[i]-64));
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		str = str.toLowerCase();
		position(str.toCharArray());

	}

}
