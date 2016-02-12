package 工厂模式;

public class Factory implements IFactory{

	@Override
	public Ihelper create(int i) {
		if(i == 0)
			return new SQLHelper();
		else
			return new ORACLEHelper();
	}

}
