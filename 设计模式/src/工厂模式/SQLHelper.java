package 工厂模式;

public class SQLHelper implements Ihelper{

	@Override
	public void open() {
		System.out.println("SQL open.....");
	}

	@Override
	public void close() {
		System.out.println("SQL close....");
	}

}
