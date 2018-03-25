package innerclass;

class Class1 {
	public void class1method() {
		System.out.println("class1method");
	}
}

class Class2 {
	public void class2method() {
		System.out.println("class2method");
	}
}

public class OuterClass {
	private int attribute = 10;
	public static int staticData = 1000;
	
	public void method() {
		System.out.println(attribute);
	}
	
	public class InnerClass{
		private int innerAttribute = 100;
		
		public void innerMethod() {
			System.out.println(innerAttribute + attribute);
		}
	}
	
/***************通过内部类实现多继承*****************/
	public class Extends1 extends Class1{
		public void method() {
			class1method();
		}
	}
	
	public class Extends2 extends Class2{
		
	}
	
	public void test() {
		Extends1 ext1 = new Extends1();
		ext1.method();
		ext1.class1method();
	}
}
