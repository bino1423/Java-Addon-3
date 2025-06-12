package Collection;

public class Threads extends Thread{

	public void run() {
		for(int i=1;i<=10;i++) {
		System.out.println("Hello Binoooooooooooo "+i);
		}
	}

	class Excute{
		public static void main(String[] args) {
			Threads m = new Threads();
			m.start();
		}
	}
}
