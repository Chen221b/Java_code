package innerclass;

public class ExtrendClass {
	
	private void private_method() {
		System.out.println("private_method");
	}
	
/********同一包内 or 继承 - 可以访问protected*********/
	protected void protected_method() {
		System.out.println("protected_method");
	}
	
	public void public_method() {
		System.out.println("ExtrendClass");
	}
}
