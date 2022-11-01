package temp.poor;

public class Person {
    String name, sex;
    long age, phoneNumber;

    public Person(String name, String sex, long age, long phoneNumber) {
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

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void getBaseInfo() {
        System.out.print("姓名：" + name + " " + "性别" + sex + " " + "年龄" + age + " " + "联系电话" + phoneNumber + " ");
    }
}
