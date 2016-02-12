package 单例;

public class Moto {
	
	
	private Moto() {}
	
	private static Moto moto;
	
	public Moto getInstance(){
		if(moto == null)
		{
			return new Moto();
		}
		return moto;
	}

}
