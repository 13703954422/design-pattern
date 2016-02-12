package 单例;

public class Recycle {
	
	private Recycle(){}
	
	private static Recycle rec;
	
	public static Recycle getInstance(){
		if(rec == null) {
			return new Recycle();
		}
		return rec;
	}
	
	public void delete(){
		System.out.println("delete....");
	}
	
	public static void main(String[] args) {
		Recycle rec = Recycle.getInstance();
		rec.delete();
	}

}
