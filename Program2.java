package Assignment1;

import java.util.Arrays;
import java.util.Scanner;

//Write a menu driven program in Java to perform insertion, deletion, linear search, binary 
//search, to find maximum value, to count even/ odd and to perform insertion sort operation in 
//one dimensional array.

public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int n = arr.length;
		int choice = 0;
		
		do {
			System.out.println("Here is your options ");
			System.out.println("1. Insertion");
			System.out.println("2. Deletion");
			System.out.println("3. Linear Search");
			System.out.println("4. Binary Search");
			System.out.println("5. Find Max Value");
			System.out.println("6. Count Even and Odd");
			System.out.println("7. Insertion Sort");
			System.out.println("8. Display Array ");
			System.out.println("9. Exit");
			
			
			System.out.println("Enter a Choice");
			choice = sc.nextInt();
			
			switch(choice) {
				case 1: 
					System.out.println("Enter element to insert : ");
					arr[n++] = sc.nextInt();
					break;
			
				case 2:
					System.out.println("Enter element to delete : ");
					
					int del = sc.nextInt();
					int found = 0;
					
					for(int i = 0; i < n; i++) {
						if(arr[i] == del) {
							for(int j = i; j < arr.length - 1; j++) {
								arr[j] = arr[j + 1];
							}
							
							n--;
							
							found = 1;
							break;
						}
					}
					
				case 3:
					System.out.println("Linear Search");
					int key = sc.nextInt();
					found = 0;
					
					for(int i = 0; i < arr.length; i++) {
						if(arr[i] == key) {
							System.out.println("key is found at the " + arr[i + 1] + " position ");
							found = 1;
							break;
						}
					}
					
					if(found == 0) {
						System.out.println("key is not present ");
					}
					
					break;
					
				case 4:
					Arrays.sort(arr);
					System.out.println("Enter element to search : ");
					key = sc.nextInt();
					
					int low = 0, high = n - 1;
					found = 0;
					
					while(low <= high) {
						int mid = low + (high - low) / 2;
						
						if(arr[mid] == key) {
							System.out.println("Elemetn found at index " + mid);
							found = 1;
							break;
						}else if(arr[mid] < key) {
							low = mid  + 1;
						}else {
							high = mid - 1;
						}
					}
					
					if(found == 0) {
						System.out.println("Element not found");
					}
					
					break;
					
				case 5:
					int max = arr[0];
					
					for(int i = 1; i < n; i++) {
						if(arr[i] > max) {
							max = arr[i];
						}
					}
					
					System.out.println("Maximum Element : " + max);
					break;
					
				case 6:
					int evenCount = 0, oddCount = 0;
					for(int i = 0; i < n; i++) {
						if(arr[i] % 2 == 0) {
							evenCount++;
						}else {
							oddCount++;
						}
					}
					
					System.out.println("Total even elements in array : " + evenCount);
					System.out.println("Total odd elements in array : " + oddCount);
					break;
					
				case 7:
					for(int i = 0; i < n; i++) {
						int temp = arr[i];
						int j = i - 1;
						
						while(j >= 0 && arr[j] > temp) {
							arr[j + 1] = arr[j];
							j--;
						}
						
						arr[j + 1] = temp;
					}
					
					System.out.println("Array sorted using Insertion Sort ");
					break;
					
				case 8:
					System.out.println("Array elements : ");
					
					for(int i = 0; i < n; i++) {
						System.out.println(arr[i] + " ");
					}
					
					System.out.println();
					break;
					
				case 9:
					System.out.println("Program Terminated ");
					break;
					
				default:
					System.out.println("Invalid choice ");
					
			}
			
		}
		
		while(choice != 9); 
	}	
}


