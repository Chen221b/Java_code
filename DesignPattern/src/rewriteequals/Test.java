package rewriteequals;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		Test anothert = t;
		t.equals(null);
		System.out.println(t.hashCode());			//未经重写的equals实质上是对比hashcode()的结果
		System.out.println(anothert.hashCode());
		
		int para = 10;
		int anotherpara = 10;
		t.change(para);
		System.out.println(para);
		String str = "12.5";
		float f = Float.parseFloat(str);
		System.out.println(f);
		System.out.println(Float.toString(f));
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return true;
	}
	
	public void change(int para) {
		para = 100;
	}

}
