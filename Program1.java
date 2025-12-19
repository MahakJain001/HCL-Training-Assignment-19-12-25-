package Assignment1;

import java.util.*;
//A class sixth student required to solve basic mathematics problems. For this he/ she needs to
//perform operations such as addition, subtraction, multiplication, division, remainder, square,
//cube, and absolute. Write a program using methods to perform these basic operations

public class Program1 {
	public static int Sum(int a, int b) {
		return a + b;
	}
	
	public static int Substract(int a, int b) {
		return a - b;
	}
	
	public static int Multiply(int a, int b) {
		return a * b;
	}
	
	public static int Divide(int a, int b) {
		return a / b;
	}
	
	public static int Remainder(int a, int b) {
		return a % b;
	}
	
	public static int Square(int a) {
		return a * a;
	}
	
	public static int Cube(int a) {
		return a * a * a;
	}
	
	public static int Absolute(int a) {
		return Math.abs(a);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of a :");
		int a = sc.nextInt();
		
		System.out.println("Enter the value of b :");
		int b = sc.nextInt();
		

		System.out.println("Addition of a and b : " + Sum(a, b));
		System.out.println("Substraction of a and b : " + Substract(a, b));
		System.out.println("Multiplication of a and b : " + Multiply(a, b));
		System.out.println("Division of a and b : " + Divide(a, b));
		System.out.println("Remainder of a and b : " + Remainder(a, b));
		System.out.println("Square of a : " + Square(a));
		System.out.println("Cube of a : " + Cube(a));
		System.out.println("Absolute of a : " + Absolute(-a));
	}
}
