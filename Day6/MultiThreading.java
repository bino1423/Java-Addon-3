package Collection;

public class MultiThreading extends Thread{
	private String name;
	public MultiThreading(String name) {
		this.name=name;
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(name);
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Execute{
	public static void main(String[] args) {
		MultiThreading m1 = new MultiThreading("Thread-1");
		MultiThreading m2 = new MultiThreading("Thread-2");
		m1.start();
		m2.start();
	}
}