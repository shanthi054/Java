class TickectBooking{
	boolean booked = false;
	public synchronized void bookTicket(String name) {
		if (booked ==false) {
		System.out.println(name+ " selected");
		System.out.println(name+ " Paid");
		System.out.println(name+ " Completed");
		booked= true;
		}else
		{
			System.out.println("already booked sorry");
		}
	}
}

class threadclass extends Thread{
	TickectBooking tkt;
	String name;
	public threadclass(TickectBooking obj, String s) {
		tkt =obj;
		name =s;
	}
	public void run() {
		tkt.bookTicket(name);
	}
}
public class SyncTest {
public static void main (String arp[]) {
	
	TickectBooking seat7 = new TickectBooking();
	threadclass san = new threadclass(seat7, "san");
	Thread tc = new Thread(san);
	tc.start();
	/*try {
		tc.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	threadclass shan = new threadclass(seat7, "Shan");
	Thread tc1 = new Thread(shan);
	tc1.start();
	
	
}
}
