package 生成器模式;

public class Cup {

	private String string;    //绳子
	private String cap;       //帽子
	private String cupBody;   //杯体
	
	public void setString(String string) {
		this.string = string;
	}
	public void setCap(String cap) {
		this.cap = cap;
	}
	public void setCupBody(String cupBody) {
		this.cupBody = cupBody;
	}
	
	public void show() {
		System.out.println("杯子生产完毕");
	}
	
}
