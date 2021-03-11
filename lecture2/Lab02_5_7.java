package phanguyen.lecture2;

import java.util.Scanner;

public class Lab02_5_7 {
	public static int[][] addMatrix(int[][] matrixA,int[][] matrixB,int n){
		int matrix[][] =new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				matrix[i][j]=matrixA[i][j]+matrixB[i][j];
			}
		}
		return matrix;
	}
	public static void inputMatrix(int[][] matrix,int n) {
		Scanner keyboard=new Scanner(System.in);
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				matrix[i][j]=keyboard.nextInt();
			}
		}
	}
	
	public static void outputMatrix(int[][] matrix,int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
		System.out.print("n=");
		int n=keyboard.nextInt();
	
		int[][] matrixA=new int[n][n];
		int[][] matrixB=new int[n][n];
		System.out.println("input matrix A");
		inputMatrix(matrixA, n);
		System.out.println("input matrix B");
		inputMatrix(matrixB, n);
		System.out.println("matrix A:");
		outputMatrix(matrixA, n);
		System.out.println("matrix B:");
		outputMatrix(matrixB, n);
		int[][] matrix=addMatrix(matrixA, matrixB,n);
		System.out.println("sum of A and B:");
		outputMatrix(matrix, n);
		keyboard.close();
	}

}
