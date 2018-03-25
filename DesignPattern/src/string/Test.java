package string;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();
		String T = scan.nextLine();
		String substring;
		int sum = 0;
		int Ssize = S.length();
		int Tsize = T.length();
		for(int i = 0; i <= Ssize-Tsize; i++) {
			substring = S.substring(i, i+Tsize);
			for(int j = 0; j < Tsize; j++) {
				if(substring.charAt(j) != T.charAt(j))
					sum++;
			}
		}
		System.out.println(sum);
	}

}
