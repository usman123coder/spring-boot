package in.uk;

public class FirstThread extends Thread{
	
	public static void main(String[] args) {
		FirstThread ft = new FirstThread();
		FirstThread ft2 = new FirstThread();
		ft.start();
		ft2.start();
	}
	
	@Override
	public void run() {
		System.out.println("FirstThread.run()");
	}

}
