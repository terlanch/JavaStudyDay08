package cn.tedu.Object;
/*	this
 * 		关键字---代表的是当前类的（虚拟）对象  
 * 		可以指带类还没创建出来的对象
 * 		指代的是当前“活动”的对象
 * 		可以调用类中的属性和方法
 * 		this语句--- this()只能在构造方法中调用本类中其他形式的构造方法
 * 
 */
public class ThisDemo {
	public static void main(String[] args) {
		Students s1 = new Students();
		//this指代的对象就是s1；
		System.out.println("s1:"+s1);
		
		Students s2 = new Students(12);
		//this指代的对象就是s2；
		System.out.println("s2:"+s2);
		s1.study();
	}

}

//学生类
class Students{
	//属性
	String name;
	int age;
	char gender;
	//学号
	String no;
	
	//
	public Students(){
		//System.out.println("this:"+this);
	}
	
	public Students(int age){
		this.age = age;
		//System.out.println("this:"+this);
		
	}
	
	public Students(int age,String name){
		//this.age = age;
		//this()---this语句---在 当前构造方法 中本类其他形式的构造方法
		//this语句一定要放在首行
		this(age);
		this.name = name;
		
	}
	
	public Students(int age,char gender,String name){
		//this.age = age;
		//this.name = name;
		this(age,name);
		this.gender = gender;
	}
	
	//方法
	public void study(){	
		//this可以代替当前类还没有创建出来的对象
		System.out.println(this.name+"在好好学习。。。");//this.可以省略
		System.out.println("this:"+this);
	}
}
