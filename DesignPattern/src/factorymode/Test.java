package factorymode;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto = Factory.getClass(Audi.class);
		auto.getAuto();
	}

}
