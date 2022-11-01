package temp.fupinganbu;

public class Person {
    String name;
    String sex;
    long age;
    String phoneNumber;

    public Person(String name, String sex, long age, String phoneNumber) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.phoneNumber = phoneNumber;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void introduce() {
        System.out.print("我的名字是:" + name + " 性别为:" + sex + " 年龄为:" + age + " 电话号码为:" + phoneNumber + " ");
    }
}
