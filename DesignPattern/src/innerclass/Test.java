package innerclass;

public class Test {

	public static void main(String[] args) {
		
/************�����ڲ�������***********/
		OuterClass inner = new OuterClass() {
			private int attribute = 20;
			public void methodInMain() {
				System.out.println(attribute+2);
			}
		};
		inner.method();
		System.out.println(inner.staticData);

/*******����innerclass.ExtrendClass��protected���ʷ�Χ******/
		ExtrendClass ext = new ExtrendClass();
		ext.protected_method(); 	//ͬһ���ڿ��Է���protected�ֶ�
		
	}

}
