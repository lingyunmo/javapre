package testkk;

public class Person {
	String name;
	String sex;
	long age;
	String phonenumber;
	public Person(String name, String sex, long age, String phonenumber) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.phonenumber = phonenumber;
		}
	public Person() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public long getAge() {
		return age;
	}
	public void setAge(long age) {
		this.age = age;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public void introduce() {
		System.out.println("我的名字是："+name+"性别为："+sex+"年龄为："+age+"电话号码为："+phonenumber+" ");
	}
	
	
	

}
