package com.learning;

public class Arrays {

	
	public static void main(String[] args) {
		/* Used to store collection of similar/homogenous datatypes
		 * a variable that storre more than one element
		 * 
		 * single Dimensional or 1-D //Multi Dimensional Arrays (2-D 3-D)
		 * 1-D Single row or column 
		 * 
		 * SYNTAX: datatype arrayname[];
		 * arrayname = new dataype[size]--> memeory allocates only if the size is provided
		 * -----------------OR-----------------
		 * datatype arrayname[] = new datatype[5]
		 * index is nothing but position, array starts from 0
		 * 
		 */
		//creating an array
		int ex[];
		ex = new int[6];
		//inserting elements to array
		ex[0] =10;
		ex[1] =20;
		ex[2] =30;
		ex[3] =40;
		ex[4] =50;
		ex[5] =60;
		
		System.out.println(ex[2]);
		int a[] = {10,20,30,40,50,60,70};
		
		System.out.println(a[5]);
		for (int i = 0; i<a.length;i++)
		{
			System.out.println("all the array elements  " +a[i]);
			
		}
		

	}

}
