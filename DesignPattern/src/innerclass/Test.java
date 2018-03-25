package innerclass;

public class Test {

	public static void main(String[] args) {
		
/************匿名内部类例子***********/
		OuterClass inner = new OuterClass() {
			private int attribute = 20;
			public void methodInMain() {
				System.out.println(attribute+2);
			}
		};
		inner.method();
		System.out.println(inner.staticData);

/*******测试innerclass.ExtrendClass中protected访问范围******/
		ExtrendClass ext = new ExtrendClass();
		ext.protected_method(); 	//同一包内可以访问protected字段
		
	}

}
