package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = scan.nextInt();
		}
		int counter = 0;
		int zero = 0;
		int n;
		while(counter < size) {
			n = input[counter];
			if(n != 0) {
				input[zero] = input[counter];
				input[counter] = 0;
				zero++;
			}
			counter++;
		}
		for(int i = 0; i < size; i++) {
			System.out.println(input[i]);
		}
		
			
	}

}
