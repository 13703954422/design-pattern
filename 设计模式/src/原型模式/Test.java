package 原型模式;

public class Test {
	
	
	public static void main(String[] args) {
		HomeWork homework = new HomeWork();
		HomeWork xiaobai = homework.Clone();
		xiaobai.setInfo("xiaobai", 10);
		xiaobai.show();
		System.out.println();
		HomeWork xiaohei = homework.Clone();
		xiaohei.setInfo("xiaohei", 20);
		xiaohei.show();
		
	}
}
