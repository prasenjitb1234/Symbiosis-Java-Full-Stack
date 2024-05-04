package tryThreads;

public class RunnableDemos implements Runnable{
	public static void main(String[] args) {
		RunnableDemos ab =new RunnableDemos();
		Thread th = new Thread(ab);
		th.start();
	}
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		}
	}
}
