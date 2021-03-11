package phanguyen.lecture2;

import java.util.Scanner;

public class Lab02_5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.print("n=");
		int iN =keyboard.nextInt();
		int space;
		for(int i=0,k=0;i<iN;i++,k=0) {
			for(space=1;space<iN-i;space++) {
				System.out.print(" ");
			}
			while(k !=(2*i+1)) {
				System.out.print("*");
				k++;
			}
			System.out.println();		}
	}

}
