package com.cg.pluralsight.hackerrank;

import java.util.*;
import java.io.*;

public class JavaMap {

	// Complete this code or write your own from scratch

	// class Solution{
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		Map<String, Integer> hm = new HashMap<String, Integer>();
		for (int i = 0; i < n; i++) {
			String name = in.nextLine();
			int phone = in.nextInt();
		
		
			hm.put(name, phone);
			in.nextLine();
		}
		while (in.hasNext()) {
			String s = in.nextLine();
			//System.out.println(hm.entrySet());
			if (hm.containsKey(s)) {
				//System.out.println(s);
				System.out.println(s+"="+hm.get(s));
			}
			else if(hm.get(s) == null){
				System.out.println(s+" = Not found");
				//goto:cas1;
			}
		}
	}
}
