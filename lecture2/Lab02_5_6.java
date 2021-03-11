package phanguyen.lecture2;

import java.util.Scanner;

public class Lab02_5_6 {
	public static void sortArray(int[] list) {
		int lenght=list.length;
		for(int i=0;i<lenght-1;i++) {
			for(int j=i+1;j<lenght;j++) {
				if(list[i] > list[j]) {
					int swap=list[i];
					list[i]=list[j];
					list[j]=swap;
				}
			}
		}
	}
	public static void main(String args[]) {
		Scanner keyboard=new Scanner(System.in);
		System.out.print("n=");
		int iN=keyboard.nextInt();
		int[] arrayList = new int[iN];
		for(int i=0;i<iN;i++) {
			arrayList[i]=keyboard.nextInt();
			
		}
		sortArray(arrayList);
		for(int i=0;i<iN;i++) {
			System.out.print(arrayList[i]+" ");
		}
	}
}
