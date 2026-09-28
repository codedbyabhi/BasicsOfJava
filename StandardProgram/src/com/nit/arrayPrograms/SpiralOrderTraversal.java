package com.nit.arrayPrograms;

public class SpiralOrderTraversal {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3}, { 4, 5, 6 }, { 7, 8, 9 } };

		int top = 0;
		int bottom = a.length - 1;
		int left = 0;
		int right = a[0].length - 1;

		while (left <= right && top <= bottom) {
			// take first loop to go from left to right
			for (int i = left; i <= right; i++) {
				System.out.println(a[top][i] + " ");
			}
			top++;
			// take a loop to go from top to bottom
			for (int j = top; j <= bottom; j++) {
				System.out.println(a[j][right] + " ");
			}
			right--;
			// check left<right or not
			if (left < right) {
				for (int i = right; i >= left; i--) {
					System.out.println(a[bottom][i] + " ");
				}
				bottom--;
			}
			if (top < bottom) {
				for (int i = bottom; i >= top; i--) {
					System.out.println(a[i][left] + " ");
				}
				left++;
			}

		}

	}
}
