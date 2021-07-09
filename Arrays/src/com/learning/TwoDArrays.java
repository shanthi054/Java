package com.learning;

import java.awt.List;
import java.util.ArrayList;

public class TwoDArrays {
	public static void main (String[] ar) {
		
		/*
		 * 2D array is similar to matrix
		 * datatype arrayname = new datatype [row][coloumn]
		 * two dimentional elements are collection of 1 diementional arrays
		 */
		
		int marks[][] = new int[3][5];
		
		marks[0][0] = 10;
		marks[0][1] = 20;
		marks[0][2] = 30;
		marks[0][3] = 40;
		marks[1][0] = 50;
		marks[1][1] = 60;
		marks[1][2] = 70;
		marks[1][3] = 80;
		marks[2][0] = 90;
		marks[2][1] = 100;
		marks[2][2] = 110;
		marks[2][3] = 120;
		
	// other way
		
		List s = new List();
		
		int[][] test = {{10,20,30,40,50,60,70},{10,20,30,40,50,60,70},{10,20,30,40,50,60,70}};
		
		for (int i=0;i<3;i++){
			
			for(int j =0; j<7;j++) {
				
			//	System.out.println("Array Element is test  ["+ i  +"] ["+ j  +"] "+test[i][j]);
				System.out.print(test[i][j] +"\t");
			}
			System.out.println();
		}
	}

}
