package cn.tedu.Object;
/*
 * 创建一个学生类
 * 私有化 姓名
 * 私有化 年龄
 */

public class Demo04 {
	public static void main(String[] args) {
		//创建对象
		Student student = new Student();
		//调用set方法赋值
		student.setName("xiaoxiao");
		student.setAge(18);
		
		System.out.println("姓名：" + student.getName());
		System.out.println("年龄："+student.getAge());
		student.sayHi();
	}

}
//学生类
class Student{
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

	//私有化属性
	private String name;
	private int age;
	
	//无参构造方法
	public Student(){
		
	}
	
	//有参构造方法
	public Student(String name,int age){
		this.name = name;
		this.age = age;
		
		}
	//方法
	public void sayHi(){
		System.out.println("姓名："+name);
		System.out.println("年龄："+age);
	}
}
