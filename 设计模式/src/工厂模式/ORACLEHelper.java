package 工厂模式;

public class ORACLEHelper implements Ihelper{

	@Override
	public void open() {
		System.out.println("ORACLEHelper open.....");
	}

	@Override
	public void close() {
		System.out.println("ORACLEHelper close.....");
	}

}
