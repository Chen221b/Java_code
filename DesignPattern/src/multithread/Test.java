package multithread;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*******ʹ��Runnable�ӿ�ʵ�����̵߳��ù���*******/
/*		Runnable runnable = new MultiThread();
		Thread thread = new Thread(runnable);
		thread.start();*/
		
/*******ʹ�ü̳�Thread��ʵ�����̵߳��ù���*******/
		MultiThread multithread = new MultiThread();
		MultiThread multithread2 = new MultiThread();
		Thread thread = new Thread(multithread, "thread1");
		Thread thread2 = new Thread(multithread2, "thread2");
		thread.start();
		thread2.start();
	}
}

