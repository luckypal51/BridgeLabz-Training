package functionalinterface;

public class RunnableInterface {
    public static void main(String[] args) {
		Thread thread = new Thread(()->{
			System.out.println("Hello guys");
		});
		
		thread.start();
	}
}
