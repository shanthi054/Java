package com.learning;

public class ThreeDimensionalArrays {
	
	public static void main (String[] ar) {
		
		//int[][] test = {{10,20,30,40,50,60,70},{10,20,30,40,50,60,70},{10,20,30,40,50,60,70}};
		int collegemarks[][][]= {
				{{10,20,30,40,50,60,70},{10,20,30,40,50,60,70},{10,20,30,40,50,60,70}},
				{{10,20,30,40,50,60,70},{10,20,30,40,50,60,70},{10,20,30,40,50,60,70}},
				{{10,20,30,40,50,60,70},{10,20,30,40,50,60,70},{10,20,30,40,50,60,70}}
				};
		
		for (int i =0;i<3;i++)//no.of 2d arrays
		{
			for (int j =0;j<3;j++) //rows
			{
				for (int k =0;k<7;k++) // columns 
				{
					System.out.print(collegemarks[i][j][k] +"\t") ;
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
