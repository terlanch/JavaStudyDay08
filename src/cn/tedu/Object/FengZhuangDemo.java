package cn.tedu.Object;
/*	封装
 * 		封装的体现形式---方法  
 * 		在类内对属性进行私有化，
 * 		通过公共的访问方式去访问私有属性，
 * 		可以提高代码的数据安全性
 * 		右键-->source-->Generate Getters and Setters
 */

public class FengZhuangDemo {
	public static void main(String[] args) {
		Personn p = new Personn();
		//赋值
		//p.name = "lili";
		//p.age = -10
		//p.setAge(10);
		//p.gender = '女';
		System.out.println();
	}

}

//Personn类
class Personn{
	//属性
	//私有化属性
	private String name;
	private int age;
	private char gender;
	
	/*//有参构造
	public Personn(int age){
		if(age<0){
			System.out.println("数据有误");
		}else{
			this.setAge(age);
		}
	}*/

	/*//方法---公共的访问方式
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<0){
			System.out.println("数据有误");
		}else{
		this.age = age;
		}
	}*/
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
}