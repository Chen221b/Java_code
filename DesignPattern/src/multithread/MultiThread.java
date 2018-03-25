package multithread;

public class MultiThread extends Thread {
	private int notstatic = 0;
	private static int isstatic = 0;
	private static final Object syn = new Object();
	
/**************************************************************************
 * 使用synchronized修饰代码块实现同步：
 * 1.参数使用static类型数据或者Thread.class,作用所有Thread类的对象（实例）。
 * 2.参数使用this,作用于所有指向该对象（实例）的引用。
 * 总结：如果同步参数是所有对象共享的如：静态变量、类，那么同步作用范围在该类所
 * 有对象引用，即对类加锁，所有对象公用着一把锁；如果是对象私有如：被synchronized
 * 修饰方法、对象引用，那么同步作用范围在指向该对象的所有引用。
***************************************************************************/
	public void run() {
//		synchronized (MultiThread.class) {
			for(int i = 0; i < 10000; i++) {
				notstatic++;
				isstatic++;
			}
//		}
		System.out.println(Thread.currentThread().getName() + "\t" + notstatic + "\t" + isstatic);
	}
}
