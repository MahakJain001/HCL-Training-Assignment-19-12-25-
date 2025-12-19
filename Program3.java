package Assignment1;

import java.util.Scanner;

//Write a program to perform addition, subtraction, multiplication, transpose, to check square 
//matrix, to check matrix is diagonal, and to check matrix is identity. 

public class Program3 {
	
	static Scanner sc = new Scanner(System.in);
	
	static void InputMatrix(int[][] m, int r, int c) {
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				m[i][j] = sc.nextInt();
			}
		}
	}
	
	static void DisplayMatrix(int[][] m, int r, int c) {
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				System.out.print(m[i][j] + " ");
			}
			
			System.out.println();
		}
	}
	
	static void Addition(int[][] a, int[][] b, int r, int c) {
		int[][] sum = new int[r][c];
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				sum[i][j] = a[i][j] + b[i][j];
			}
		}
		
		System.out.println("Addition : ");
		DisplayMatrix(sum, r, c);
	}
	
	static void Subtraction(int[][] a, int[][] b, int r, int c) {
		int[][] sub = new int[r][c];
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				sub[i][j] = a[i][j] - b[i][j];
			}
		}
		
		System.out.println("Substraction : ");
		DisplayMatrix(sub, r, c);
	}
	
	
	static void Multiplication(int[][] a, int[][] b, int r1, int c1, int c2) {
		int[][] mul = new int[r1][c2];
		for(int i = 0; i < r1; i++) {
			for(int j = 0; j < c2; j++) {
				for(int k = 0; k < c1; k++) {
					mul[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		
		System.out.println("Multiplication : ");
		DisplayMatrix(mul, r1, c2);
	}
	
	static void Transpose(int[][] a, int r, int c) {
		System.out.println("Transpose Matrix : ");
		
		for(int j = 0; j < c; j++) {
			for(int i = 0; i < r; i++) {
				System.out.print(a[i][j] +  " ");
			}
			
			System.out.println();
		}
	}
	
	static boolean isSquare(int r, int c) {
		return r == c;
	}
	
	static boolean isDiagonal(int[][] a, int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i != j && a[i][j] != 0) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	static boolean isIdentity(int[][] a, int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i == j && a[i][j] != 1) {
					return false;
				}
				if(i != j && a[i][j] != 0) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter rows and columns : " );
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		int[][] A = new int[r][c];
		int[][] B = new int[r][c];
		
		System.out.println("Enter elements of Matrix A : ");
		InputMatrix(A, r, c);
		
		System.out.println("Enter elements of Matrix B : ");
		InputMatrix(B, r, c);
		
		Addition(A, B, r, c);
		Subtraction(A, B, r, c);
		
		if(isSquare(r, c)) {
			Multiplication(A, B, r, c, c);
			Transpose(A, r, c);
			
			
			if(isDiagonal(A, r)) {
				System.out.println("Matrix A is a Diagonal Matrix ");
			}else {
				System.out.println("Matrix A is not a Diagonal Matrix ");
			}
			
			
			if(isIdentity(A, r)) {
				System.out.println("Matrix A is an Identity Matrix ");
			}else {
				System.out.println("Matrix A is not an Identity Matrix ");
			}
		}else {
			System.out.println("Matrix is not square, so multiplication/diagonal/identity check not possible.  ");
		}
	}
}
