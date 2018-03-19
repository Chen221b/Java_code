package multithread;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*******使用Runnable接口实现子线程调用过程*******/
/*		Runnable runnable = new MultiThread();
		Thread thread = new Thread(runnable);
		thread.start();*/
		
/*******使用继承Thread类实现子线程调用过程*******/
		MultiThread multithread = new MultiThread();
		MultiThread multithread2 = new MultiThread();
		Thread thread = new Thread(multithread, "thread1");
		Thread thread2 = new Thread(multithread2, "thread2");
		thread.start();
		thread2.start();
	}
}

