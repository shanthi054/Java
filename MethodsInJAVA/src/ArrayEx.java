 class ArrayEx {
	public static void main (String ar[]) {
		int p[] = {12,12,24,4,34,2};
		
		ArrayExample obj = new ArrayExample();
		obj.printArray(p);
	}

}
class ArrayExample{
	void printArray(int a[])
	{
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
}
