package multithread;

public class MultiThread extends Thread {
	private int notstatic = 0;
	private static int isstatic = 0;
	private static final Object syn = new Object();
	
/**************************************************************************
 * ʹ��synchronized���δ����ʵ��ͬ����
 * 1.����ʹ��static�������ݻ���Thread.class,��������Thread��Ķ���ʵ������
 * 2.����ʹ��this,����������ָ��ö���ʵ���������á�
 * �ܽ᣺���ͬ�����������ж�������磺��̬�������࣬��ôͬ�����÷�Χ�ڸ�����
 * �ж������ã���������������ж�������һ����������Ƕ���˽���磺��synchronized
 * ���η������������ã���ôͬ�����÷�Χ��ָ��ö�����������á�
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
