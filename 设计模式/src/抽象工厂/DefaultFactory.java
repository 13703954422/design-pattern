package 抽象工厂;

public class DefaultFactory implements IabstractFactory{

	@Override
	public IVehicle createVehicle(int i) {
		return new Moto();
	}

	@Override
	public IWeapon createWeapon(int i) {
		return new AK47();
	}

}
