package com.cg.pluralsight.hackerrank;

//public class LinkedListExample {

class IntList {
	public int value;
	public IntList next;

	public static void main(String[] args) {
		Solution s = new Solution();
		IntList head = null;
		int k = 0;
		s.solution(head, k);
	}
}
class Solution {

	public int solution(IntList head, int k) {
		IntList temp = head;
		int count = 0;
		while (count != k) {
			if (temp == null) {
				return -1;
			}
			temp = temp.next;
		}

		while (temp != null) {
			head = head.next;
			temp = temp.next;
		}
		return head.value;
	}

}
