package string;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int times[] = new int[10];
		System.out.println(input);
		for(int i = 0; i < input.length(); i++) {
			int num = Integer.parseInt(input.substring(i, i+1));
			System.out.println(num);
			times[num]++;
		}
		int min = 0;
		while(true) {
			int strtimes[] = new int[10];
			String str = Integer.toString(min);
			for(int i = 0; i < str.length(); i++) {
				int num = Integer.parseInt(str.substring(i, i+1));
				strtimes[num]++;
				if(strtimes[num] > times[num]) {
					System.out.println(min);
					return;
				}
			}
			min++;
		}
	}

}
