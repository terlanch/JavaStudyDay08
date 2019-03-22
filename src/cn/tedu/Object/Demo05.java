package cn.tedu.Object;
/*
 * 创建10个类
 * 私有化4个属性
 * 公有化3个方法
 * 构造方法
 * set/get方法
 * 自我介绍方法
 */
public class Demo05 {
	public static void main(String[] args) {
		Animal1 animal = new Animal1();
		animal.setName("熊");
		animal.setAge(5);
		animal.setKind("gong");
		animal.setColor("hei");
		
		System.out.println(animal.getName());
		System.out.println(animal.getAge());
		System.out.println(animal.getKind());
		System.out.println(animal.getColor());
		
		animal.sayHi();
	}

}
//动物类
class Animal1{
	private String name;
	private String kind;
	private int age;
	private String color;
	
	//构造无参方法
	public Animal1(){
		
	}
	
	//构造有参方法
	public Animal1(String name,String kind,int age,String color){
		this.name = name;
		this.kind = kind;
		this.age = age;
		this.color = color;
	}
	
	//吃方法
	public void eat(){
		System.out.println("动物要吃饭");
	}
	//喝水方法
	public void drink(){
		System.out.println("动物要喝水");
	}
	//睡觉方法
	 public void sleep(){
		 System.out.println("动物要睡觉");
	 }
	 //自我介绍
	 public void sayHi(){
		 System.out.println("xingming:"+ name);
		 System.out.println("nianling:"+ age);
		 System.out.println("zhonglei:"+ kind);
		 System.out.println("yanse:"+ color);
	 }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
