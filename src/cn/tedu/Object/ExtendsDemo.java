package cn.tedu.Object;
/*
 * 继承
 * 	多个类中存在相同的内容，就把相同的内容抽取到一个新类中，
 * 	新类和原来的类就通过extends产生了关联关系---继承
 * 	新类---父类，超类，基类	原来的类---子类，派生类
 * 	子类可以拿到父类部分信息
 * 	
 * 	继承形式
 * 		java支持 类的 单继承（父类只能有一个，子类可以有多个）
 * 		c语言支持 类的 多继承
 * 	方法的重写
 * 		在父子类中出现了方法签名一致的方法，要遵守方法
 * 		重写的原则：两等两小（一小异常讲）一大
 * 		
 * 		父子类的方法签名一致
 * 		
 * 		如果父类的方法返回值是基本类型或者void，那么子类
 * 		的方法的返回值类型和父类一致  （基本类型的数据级别一致）
 * 		
 * 		如果父类的方法返回值类型是应用数据类型，那么子类的
 * 		方法返回值的类型要么和父类一致，要么是父类的子类
 * 
 * 		父类的方法被访问权限修饰符修饰，那么子类的方法的访问权限修饰符
 * 		就要么和父类一致，要么比父类的范围大
 * 
 */

public class ExtendsDemo {
	public static void main(String[] args) {
		//创建医生类对象
		Doctor d = new Doctor();
		d.age = 10;
		d.treat();
	}
}

//医疗人员類---父類、超類、基類
class 医疗人员 {
	// 属性
	String name;
	int age;
	char gender;
	// 工号
	String nu;

	// 方法
	public void treat() {
		System.out.println("在治病救人。。。");
	}

}
//医生类---子类、派生类
//繼承----通過extends使得醫生類和醫療人員產生了關聯關係
class Doctor extends 医疗人员{
	//方法的重写--在父子类中出现了方法签名一样的方法
	public void treat(){
		System.out.println("拿着手术刀在治病救人。。。");
	}
	
}

//护士类
class Nurse{
	
	//属性
	String name;
	int age;
	char gender;
	
	//方法
	public void treat(){
		System.out.println("在治病救人。。。");
	}

}
