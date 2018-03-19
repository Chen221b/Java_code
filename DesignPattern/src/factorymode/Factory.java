package factorymode;

public class Factory {
	public static <T> T getClass(Class<? extends T> clazz) {
		T obj = null;
		try {
			obj = (T)Class.forName(clazz.getName()).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return obj;
	}
}
