package lambda.examples;
//Lambda Example with no params
public class NoArgument {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread 1 in execution!");
			}
			
		});
		
		t1.start();
		
		//Lambda expression without params
		Thread t2 = new Thread( () -> System.out.println("Thread 2 in execution!"));
		t2.start();
	}

}
