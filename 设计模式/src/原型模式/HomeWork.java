 package 原型模式;

public class HomeWork implements Cloneable{
	
	
	private String name;
	
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void setInfo(String name,int age){
		this.name = name;
		this.age = age;
		
	}
	
	public HomeWork Clone(){
		HomeWork hw = null;
		try {
			hw = (HomeWork)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hw;
	}
	
	public void show(){
		System.out.println("name = " +this.name + "\n age = " +this.age);
	}

}
