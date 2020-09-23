package com.cg.pluralsight.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayListSingleSort {

	static boolean checkSorted(int n, int arr[]) {
		// Create a sorted copy of original array
		int[] b = new int[n];
		for (int i = 0; i < n; i++)
			b[i] = arr[i];
		Arrays.sort(b, 0, n);
		//Arrays.
	//	System.out.println(b[n]);
		// Check if 0 or 1 swap required to
		// get the sorted array
		int ct = 0;
		for (int i = 0; i < n; i++)
			if (arr[i] != b[i])
				ct++;
		if (ct == 0 || ct == 2)
			return true;
		else
			return false;
	}

	// Driver Code
	public static void main(String[] args) {
		Scanner  scan  = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		for(int i =0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		
		if (checkSorted(n, arr))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
