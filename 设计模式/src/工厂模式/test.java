package 工厂模式;

public class test {
	
	
	public static void main(String[] args) {
		Factory f = new Factory();
		Ihelper i = f.create(0);
		i.open();
	}
	
	

}
