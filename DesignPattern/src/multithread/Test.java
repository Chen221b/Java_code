package multithread;

import java.util.Vector;

import innerclass.ExtrendClass;

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
		Vector<Integer> vec = new Vector();
		
/*******测试innerclass.ExtrendClass中protected访问范围******/
		ExtrendClass ext = new ExtrendClass();
		ext.public_method();
//		ext.protected_method(); 不在同一包内无法访问protected字段
		
	}
}

class TestExtrend extends ExtrendClass{
	public void method() {
		public_method();
		protected_method();		//继承可以访问protected字段
	}
}

