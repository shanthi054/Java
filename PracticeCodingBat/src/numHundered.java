
 class numHunderedtest {
	

 void numHundered(int n){
	
}


public boolean posNeg(int a, int b, boolean negative) {
	 if (negative){
	   return (a<0 && b<0);
	   
	 }
	 else {
	   return ((a<0&&b>0)||(a>0 &&b<0));
	 }
	  
	}
}


public class numHundered
{
	
	public static void main (String ar[]) {
		int i =Math.abs(100-93);
		System.out.println(i);
		numHunderedtest t = new numHunderedtest();
		boolean test = t.posNeg(1, -1, false);
	boolean test1 =	t.posNeg(-1, 1, false);
	boolean test2= 	t.posNeg(-1, -1, true);
 
	System.out.println(1<0);
	System.out.println(-1<0);
	System.out.println(1<0 && -1<0);
	}
}