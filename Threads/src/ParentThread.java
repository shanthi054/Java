
class Test extends Thread  {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=1; i<0;i++) {
			try {
				currentThread();
				Thread.sleep(1000);
				System.out.println(currentThread());
			}catch(Exception e) {}
		}
	}
	


}
public class ParentThread extends Test{
	

	public static void main(String ar[]) {
		
		Test r = new Test();
		r.run();
		Thread s = new Thread(r);
		s.setName("test");
		System.out.println(s);
		s.start();
		s.setPriority(s.MAX_PRIORITY);
		System.out.println(s);
		try {
			s.sleep(1000);
		//	s.suspend();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(s);
	}
}
