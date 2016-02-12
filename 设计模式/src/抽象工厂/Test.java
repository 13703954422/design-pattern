package 抽象工厂;

public class Test {
	
	public static void main(String[] args) {
		IabstractFactory f = new MagicFactory();
		f.createVehicle(1).run();
		f.createWeapon(1).attack();
	}

}
