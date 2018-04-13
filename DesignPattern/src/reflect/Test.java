package reflect;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class c = Class.forName("reflect.ReflectClass");
			ReflectClass reflect = (ReflectClass) c.newInstance();
			reflect.method();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
