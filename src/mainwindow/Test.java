package mainwindow;

import java.util.Scanner;

public class Test{

	public static void main(String [] args){
		System.out.print("Enter number to loop: ");
		Scanner in = new Scanner(System.in);
		String w = in.next();
		int x  = Integer.parseInt(w);
		for(int i = 0;i<=x;i+=1){
			System.out.println("Hello "+i);
		}
	}
}
