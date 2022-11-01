package test.four.test41;

public class Person {
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
    public void speak(){
        System.out.println("我叫"+name+",今年"+age+"岁");
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("naming");
        p.setAge(18);
        p.speak();
    }
}
