package 抽象工厂;

public class MagicFactory implements IabstractFactory{

	@Override
	public IVehicle createVehicle(int i) {
		
		return 	new Broom();
		
	}

	@Override
	public IWeapon createWeapon(int i) {
		return new MagicStick();
	}

}
